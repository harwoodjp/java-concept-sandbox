import com.harwoodjp.Classes.ArrayListPlus;

public class ArrayListTest {
    public static void run() {
        ArrayListPlus al = new ArrayListPlus();
        al.printSize();
        al.add(0);
        al.printSize();
        al.add(1);
        al.add(2);
        al.printSize();
        al.remove(0);
        al.printSize();
        al.printAsString();
    }
}
