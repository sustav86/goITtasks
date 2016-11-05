package sustavov.goit.module10.bufferedreaderwriter;

import sustavov.goit.module10.Profiler;
import sustavov.goit.module9.*;

import java.io.*;

/**
 * Created by SUSTAVOV on 26.06.2016.
 */
public class BufferedReaderWriter {

    public static void readBuffered(File file, StringBuilder stringBuilder) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        }

    }

    public static void writeBuffered(File file, StringBuilder stringBuilder, Ciphering algorithm, boolean cipher) throws IOException {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            if (cipher) {
                bufferedWriter.write(algorithm.encrypt(stringBuilder.toString()));
            }else {
                bufferedWriter.write(algorithm.decrypt(stringBuilder.toString()));
            }
            bufferedWriter.flush();
        }

    }
}
