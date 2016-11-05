package sustavov.goit.module10.filereaderwriter;

import sustavov.goit.module9.Ciphering;

import java.io.*;


/**
 * Created by SUSTAVOV on 26.06.2016.
 */
public class FileReaderWriter {

    public static void readFile(File file, StringBuilder characterList) throws IOException {
        try (FileReader fileReader = new FileReader(file)){
            int symbol;
            while ((symbol = fileReader.read()) != -1) {
                characterList.append(Character.valueOf((char)symbol));
            }
        }
    }

    public static void writeFile(File file, StringBuilder characterList, Ciphering algorithm, boolean cipher) throws IOException {
        try (FileWriter fileWriter = new FileWriter(file)) {
            if (cipher) {
                fileWriter.write(algorithm.encrypt(characterList.toString()));
            }else {
                fileWriter.write(algorithm.decrypt(characterList.toString()));
            }
        }
    }
}
