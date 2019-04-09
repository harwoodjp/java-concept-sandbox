import com.harwoodjp.Classes.VendingMachine.Product;

import java.util.HashMap;

public class HashMapTest {
    public static void run() {
        HashMap<Product, Integer> inventoryMap = new HashMap<Product, Integer>();

        Product hersheyBar = new Product("A0", "Hershey's Chocolate Bar", 100);
        Product laysChips = new Product("A1", "Lay's Potato Chips", 100);
        Product doritosChips = new Product("A2", "Dorito's Cool Ranch Chips", 100);
        Product peanutBag = new Product("A3", "Bag of Peanuts", 75);

        inventoryMap.put(hersheyBar, 6);
        inventoryMap.put(laysChips, 3);
        inventoryMap.put(doritosChips, 7);
        inventoryMap.put(peanutBag, 9);

        System.out.println(inventoryMap.get(hersheyBar));

    }
}
