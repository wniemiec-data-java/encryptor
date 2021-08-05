package wniemiec.util.data;

public class Encryptors {

    private Encryptors() {
    }

    public static Encryptor md5() {
        return MD5.getInstance();
    }
}
