/**
 * Copyright (c) William Niemiec.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package wniemiec.data.java;

/**
 * Responsible for obtaining instances of encrypters.
 */
public class Encryptors {

    private Encryptors() {
    }

    public static Encryptor md5() {
        return MD5.getInstance();
    }
}
