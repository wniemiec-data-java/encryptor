/**
 * Copyright (c) William Niemiec.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package wniemiec.data.java;

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
