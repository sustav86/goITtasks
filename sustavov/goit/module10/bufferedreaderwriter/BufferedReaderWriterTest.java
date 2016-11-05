package sustavov.goit.module10.bufferedreaderwriter;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sustavov.goit.module10.Profiler;
import sustavov.goit.module9.Ciphering;
import sustavov.goit.module9.SimpleAlgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.*;

/**
 * Created by SUSTAVOV on 04.07.2016.
 */
public class BufferedReaderWriterTest {
    private static Ciphering simpleAlgorithm;
    private static Profiler profiler;
    private static File mainFile;
    private static File fileEncrypt;
    private static File fileDecrypt;

    @BeforeClass
    public static void setUp() throws Exception {
        simpleAlgorithm = new SimpleAlgorithm("OK");
        profiler = new Profiler();
        mainFile = new File(profiler.getDirectoryIn(), profiler.getFileMain());
        fileEncrypt = new File(profiler.getDirectoryIn(), profiler.getFileEncrypt());
        fileDecrypt = new File(profiler.getDirectoryOut(), profiler.getFileDecrypt());

    }

    @Test
    public void readBuffered() throws Exception {

        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReaderWriter.readBuffered(mainFile, stringBuilder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }

        String word = stringBuilder.toString();

        try {
            BufferedReaderWriter.writeBuffered(fileEncrypt, stringBuilder, simpleAlgorithm, true);
        } catch (IOException e) {
            e.printStackTrace();
        }

        stringBuilder.setLength(0);

        try {
            BufferedReaderWriter.readBuffered(fileEncrypt, stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(word.equals(simpleAlgorithm.decrypt(stringBuilder.toString())));

    }

}