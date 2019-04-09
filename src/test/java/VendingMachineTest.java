import com.harwoodjp.Classes.VendingMachine.VendingMachine;
import com.harwoodjp.Classes.VendingMachine.Product;

public class VendingMachineTest {

    public static void run() {
        VendingMachine myMachine = new VendingMachine();

        Product hersheyBar = new Product("A0", "Hershey's Chocolate Bar", 100, 5);
        Product laysChips = new Product("A1", "Lay's Potato Chips", 100, 8);
        Product doritosChips = new Product("A2", "Dorito's Cool Ranch Chips", 100, 2);
        Product peanutBag = new Product("A3", "Bag of Peanuts", 75, 3);

        myMachine.addInventory(hersheyBar);
        myMachine.addInventory(laysChips);
        myMachine.addInventory(doritosChips);
        myMachine.addInventory(peanutBag);

        myMachine.printInventory();

        myMachine.addCredits(10);
        myMachine.addCredits(25);
        myMachine.addCredits(25);
        myMachine.addCredits(25);
        myMachine.addCredits(5);
        myMachine.vendInventory("A1");
        myMachine.addCredits(10);
        myMachine.vendInventory("A1");
    }

}
