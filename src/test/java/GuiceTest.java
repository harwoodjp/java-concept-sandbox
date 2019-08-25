import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuiceTest {

    public interface InterfaceA { String getString(); }
    public static class InterfaceAImpl implements InterfaceA {
        @Override
        public String getString() {
            return "Hello!";
        }
    }
    public interface InterfaceB { InterfaceA getInterfaceA(); }
    public static class InterfaceBImpl implements InterfaceB {
        private InterfaceA interfaceA;

        @Inject
        public InterfaceBImpl(InterfaceA interfaceAImpl) {
            interfaceA = interfaceAImpl;
        }

        @Override
        public InterfaceA getInterfaceA() {
            return interfaceA;
        }
    }

    public class GuiceModule extends AbstractModule {
        @Override
        protected void configure() {
            bind(InterfaceA.class).to(InterfaceAImpl.class);
        }
    }

    private Injector injector;

    @Before
    public void setup() {
        injector = Guice.createInjector(new GuiceModule());
    }

    @Test
    public void getsDefaultImpl() {
        InterfaceA a1 = injector.getInstance(InterfaceA.class);
        Assert.assertEquals(a1.getString(), "Hello!");
    }

    @Test
    public void getsConstructorInjection() {
        InterfaceB b1 = injector.getInstance(InterfaceBImpl.class);
        Assert.assertEquals(b1.getInterfaceA().getString(), "Hello!");
    }

}
