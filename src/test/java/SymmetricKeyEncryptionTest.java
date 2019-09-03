import org.junit.Assert;
import org.junit.Test;

import com.harwoodjp.Crypto.AES;

public class SymmetricKeyEncryptionTest {
	@Test
	public void AES_encryptDecryptString() {
		String message = "Hello, this is a message from me to you!";
		String secret = "I'm a secret used to encrypt/decrypt!";
		String encryptedMessage = AES.encrypt(message, secret);
		String decryptedMessage = AES.decrypt(encryptedMessage, secret);
		Assert.assertEquals(message, decryptedMessage);
	}
	
}
