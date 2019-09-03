import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.harwoodjp.Crypto.KeysUtil;
import com.harwoodjp.Crypto.RSA;

public class AsymmetricKeyEncryptionTest {
	private KeyPair keyPair;
	
	@Before
	public void setup() throws NoSuchAlgorithmException, NoSuchProviderException, NoSuchPaddingException {
		keyPair = KeysUtil.getKeyPair(1024);
	}

	@Test
	public void RSA_encryptWithPrivate_decryptWithPublic() throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException {
		String strToEncrypt = "Hello, world!";
		String encryptedMessage = RSA.encrypt(strToEncrypt, keyPair.getPrivate());
		String decryptedMessage = RSA.decrypt(encryptedMessage, keyPair.getPublic());
		Assert.assertNotEquals(encryptedMessage, strToEncrypt);
		Assert.assertEquals(strToEncrypt, decryptedMessage);
	}
	
	@Test
	public void RSA_encryptWithPublic_decryptWithPrivate() throws InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException,
			NoSuchAlgorithmException, NoSuchPaddingException {
		String strToEncrypt = "Hello, world!";
		String encryptedMessage = RSA.encrypt(strToEncrypt, keyPair.getPublic());
		String decryptedMessage = RSA.decrypt(encryptedMessage, keyPair.getPrivate());
		Assert.assertNotEquals(encryptedMessage, strToEncrypt);
		Assert.assertEquals(strToEncrypt, decryptedMessage);

	}
	
}
