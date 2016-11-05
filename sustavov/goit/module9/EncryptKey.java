package sustavov.goit.module9;

/**
 * Created by SUSTAVOV on 25.06.2016.
 */
public class EncryptKey {
    public static byte encryptKey(String key) {
        byte result = Byte.MIN_VALUE;

        byte[] bytesArray = key.getBytes();
        for (byte byteElement : bytesArray) {
           result ^= byteElement;
        }

        return result;
    }
}
