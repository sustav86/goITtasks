package sustavov.goit.module3.task1;

/**
 * Created by ukr-sustavov on 27.05.2016.
 */
public class Solution
{
    public static void main(String[] args)
    {

        Folder rootFolder = new Folder(".", ".", "root");

        Folder audioFolder = new Folder("Music", "my favorite music", "folder");
        Folder imageFolder = new Folder("Image", "my family photo", "folder");
        Folder textFolder = new Folder("Text", "my diploma", "folder");

        File audioFile = new AudioFile("Rummstein", "du hast", "file");

        rootFolder.add(audioFolder);

        audioFolder.add(audioFile);
        rootFolder.add(imageFolder);
        rootFolder.add(textFolder);

        rootFolder.displayFileComponentInformation();

        audioFolder.open(audioFolder);
        audioFile.open(audioFile);
        audioFile.getParent();
    }
}
