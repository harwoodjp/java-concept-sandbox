import com.harwoodjp.Classes.Wallet;

public class PublicPrivateTest {
    public static void run() {
        Wallet myWallet = new Wallet();
        myWallet.setColor("brown");
        myWallet.setBrand("Polo");
        myWallet.setCreditCardNumber(555);
        System.out.println(myWallet.getCreditCardNumber());

        Wallet anotherWallet = new Wallet("black", "gucci");
        System.out.println(anotherWallet.color);
        System.out.println(anotherWallet.getBrand());
    }
}
