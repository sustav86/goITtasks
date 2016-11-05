package sustavov.goit.module10.filereaderwriter;

import org.junit.Assert;
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
public class FileReaderWriterTest {
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
    public void readFile() throws Exception {
        StringBuilder characterList = new StringBuilder();
        try {
            FileReaderWriter.readFile(mainFile, characterList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String word = characterList.toString();

        try {
            FileReaderWriter.writeFile(fileEncrypt, characterList, simpleAlgorithm, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        characterList.setLength(0);
        try {
            FileReaderWriter.readFile(fileEncrypt, characterList);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Assert.assertTrue(word.equals(simpleAlgorithm.decrypt(characterList.toString())));

    }

}