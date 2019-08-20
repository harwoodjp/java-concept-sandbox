import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.util.Base64;

import org.junit.Before;
import org.junit.Test;

public class EncryptionMiscTest {
	private KeyPair keypair;

	@Before
	public void setKeypair() throws NoSuchAlgorithmException, NoSuchProviderException {
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
		SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
		keyGen.initialize(1024, random);
		keypair = keyGen.generateKeyPair();
	}
	
	@Test
	public void base64Encode() {
		Base64.Encoder encoder = Base64.getEncoder();
		String privEncoded = encoder.encodeToString(keypair.getPrivate().getEncoded());
		String pubEncoded = encoder.encodeToString(keypair.getPublic().getEncoded());
	}

}
