package sustavov.goit.module10;

/**
 * Created by SUSTAVOV on 26.06.2016.
 */
public class Profiler {
    private static final String DEFAULT_FILE_MAIN = "main.txt";
    private static final String DEFAULT_FILE_ENCRYPT = "encrypt.txt";
    private static final String DEFAULT_FILE_DECRYPT = "decrypt.txt";
    private final String userDir = System.getProperty("user.dir");
    private String directoryIn;
    private String directoryOut;
    private String fileEncrypt;
    private String fileDecrypt;
    private String fileMain;

    public Profiler() {
        this.directoryIn = userDir;
        this.directoryOut = userDir;
        this.fileEncrypt = DEFAULT_FILE_ENCRYPT;
        this.fileDecrypt = DEFAULT_FILE_DECRYPT;
        this.fileMain = DEFAULT_FILE_MAIN;
    }

    public String getDirectoryIn() {
        return directoryIn;
    }

    public String getDirectoryOut() {
        return directoryOut;
    }

    public String getFileEncrypt() {
        return fileEncrypt;
    }

    public String getFileDecrypt() {
        return fileDecrypt;
    }

    public void setDirectoryIn(String directoryIn) {
        this.directoryIn = directoryIn;
    }

    public void setDirectoryOut(String directoryOut) {
        this.directoryOut = directoryOut;
    }

    public void setFileEncrypt(String fileEncrypt) {
        this.fileEncrypt = fileEncrypt;
    }

    public void setFileDecrypt(String fileDecrypt) {
        this.fileDecrypt = fileDecrypt;
    }

    public String getFileMain() {
        return fileMain;
    }

    public void setFileMain(String fileMain) {
        this.fileMain = fileMain;
    }
}
