package wniemiec.util.data;

/**
 * Responsible for encrypting texts.
 */
public interface Encryptor {

    /**
     * Encrypts a text in MD5.
     *
     * @param		text Text to be encrypted
     *
     * @return		Encrypted text or empty string if an error occurs
     *
     * @throws		IllegalArgumentException If text is null
     */
    String encrypt(String text);
}
