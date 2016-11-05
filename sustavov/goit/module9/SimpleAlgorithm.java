package sustavov.goit.module9;

/**
 * Created by SUSTAVOV on 26.06.2016.
 */
public class SimpleAlgorithm implements Ciphering {
    private byte key;

    @Override
    public String encrypt(String mainString) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = mainString.toCharArray();
        for (char ch : charArray) {
            stringBuilder.append((char)Math.abs((ch^key)));
        }
        return stringBuilder.toString();
    }

    @Override
    public String decrypt(String mainString) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = mainString.toCharArray();
        for (char ch : charArray) {
            stringBuilder.append((char)Math.abs((ch^key)));
        }
        return stringBuilder.toString();
    }

    public SimpleAlgorithm(String key) {
        this.key = EncryptKey.encryptKey(key);
    }
}
