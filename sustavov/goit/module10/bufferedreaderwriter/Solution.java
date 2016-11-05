package sustavov.goit.module10.bufferedreaderwriter;

import sustavov.goit.module10.Profiler;
import sustavov.goit.module9.Ciphering;
import sustavov.goit.module9.SimpleAlgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by SUSTAVOV on 27.06.2016.
 */
public class Solution {
    public static void main(String[] args) {
        Ciphering simpleAlgorithm = new SimpleAlgorithm("OK");
        Profiler profiler = new Profiler();
        File mainFile = new File(profiler.getDirectoryIn(), profiler.getFileMain());
        File fileEncrypt = new File(profiler.getDirectoryIn(), profiler.getFileEncrypt());
        File fileDecrypt = new File(profiler.getDirectoryOut(), profiler.getFileDecrypt());

        StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReaderWriter.readBuffered(mainFile, stringBuilder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.getStackTrace();
        }

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

        try {
            BufferedReaderWriter.writeBuffered(fileDecrypt, stringBuilder, simpleAlgorithm, false);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
