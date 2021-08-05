package wniemiec.util.data;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Responsible for encrypting texts using MD5.
 * 
 * @see			https://en.wikipedia.org/wiki/MD5
 */
class MD5 implements Encryptor {

	//-------------------------------------------------------------------------
	//		Attributes
	//-------------------------------------------------------------------------
	private static Encryptor instance;

	
	//-------------------------------------------------------------------------
	//		Constructor
	//-------------------------------------------------------------------------
	private MD5() {
	}


	//-------------------------------------------------------------------------
	//		Factory
	//-------------------------------------------------------------------------
	public static Encryptor getInstance() {
		if (instance == null)
			instance = new MD5();

		return instance;
	}

	
	//-------------------------------------------------------------------------
	//		Methods
	//-------------------------------------------------------------------------
	/**
	 * Encrypts a text in MD5.
	 * 
	 * @param		text Text to be encrypted
	 * 
	 * @return		Encrypted text or empty string if an error occurs
	 * 
	 * @throws		IllegalArgumentException If text is null
	 */
	public String encrypt(String text) {
		if (text == null)
			throw new IllegalArgumentException("Text cannot be null");
		
		if (text.isBlank())
			return "";
		
		String encryptedText;
		
		try {
			MessageDigest m = MessageDigest.getInstance("MD5");
			m.update(text.getBytes(), 0, text.length());
			
			encryptedText = new BigInteger(1, m.digest()).toString(16);
		} 
		catch (NoSuchAlgorithmException e) {
			encryptedText = "";
		}
		
		return encryptedText;
	}
}
