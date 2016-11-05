package sustavov.goit.module9;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by SUSTAVOV on 04.07.2016.
 */
public class SimpleAlgorithmTest {
    private static SimpleAlgorithm simpleAlgorithm;
    private static final String KEY = "OK";
    private static final String WORD = "SIRFF";

    @BeforeClass
    public static void setUp() throws Exception {
        simpleAlgorithm = new SimpleAlgorithm(KEY);

    }

    @Test
    public void encryptDecryptTest() throws Exception {
        String encryptWord = simpleAlgorithm.encrypt(WORD);
        String decryptWord = simpleAlgorithm.decrypt(encryptWord);

        Assert.assertTrue(WORD.equals(decryptWord));

    }

}