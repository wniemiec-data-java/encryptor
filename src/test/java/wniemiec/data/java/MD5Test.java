package wniemiec.data.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MD5Test {

	//-------------------------------------------------------------------------
	//		Attributes
	//-------------------------------------------------------------------------
	private static Encryptor encryptor;


	//-------------------------------------------------------------------------
	//		Test hooks
	//-------------------------------------------------------------------------
	@BeforeClass
	public static void setUpClass() {
		encryptor = Encryptors.md5();
	}


	//-------------------------------------------------------------------------
	//		Tests
	//-------------------------------------------------------------------------
	@Test
	public void testHelloWorld() {
		assertEquals("5eb63bbbe01eeed093cb22bb8f5acdc3", encryptor.encrypt("hello world"));
	}

	@Test
	public void testEmpty() {
		assertEquals("", encryptor.encrypt(""));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNull() {
		encryptor.encrypt(null);

		fail();
	}
}
