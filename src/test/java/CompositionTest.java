import com.harwoodjp.Classes.Cat;
import com.harwoodjp.Classes.Dog;
import com.harwoodjp.Classes.PetOwner;

public class CompositionTest {
    public static void run() {
        PetOwner justin = new PetOwner();
        Cat mocha = new Cat("Mocha");
        Cat gigi = new Cat("Gigi");
        Cat bash = new Cat("Sebastian");
        justin.setCat(mocha);
        justin.setCat(gigi);
        justin.setCat(bash);
        Dog spot = new Dog("Spot");
        justin.setDog(spot);
        justin.printPetsNames();
    }
}
