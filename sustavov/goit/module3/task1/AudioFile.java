package sustavov.goit.module3.task1;

/**
 * Created by ukr-sustavov on 27.05.2016.
 */
public class AudioFile extends File
{
    public AudioFile(String name, String description, String caption) {
        super(name, description, caption);
        setFolder(false);
    }

}
