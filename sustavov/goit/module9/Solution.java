package sustavov.goit.module9;

import java.io.*;

/**
 * Created by SUSTAVOV on 25.06.2016.
 */
public class Solution {
    public static void main(String[] args) throws IOException {

        Ciphering simpleAlgorithm = new SimpleAlgorithm("OK");

        String encrypt = simpleAlgorithm.encrypt("abc");
        System.out.println(encrypt);
        String decrypt = simpleAlgorithm.decrypt(encrypt);
        System.out.println(decrypt);

    }
}
