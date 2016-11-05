package sustavov.goit.module3.task1;

/**
 * Created by ukr-sustavov on 27.05.2016.
 */
public class File extends CommonAbstractFile
{

    public File(String name, String description, String caption) {
        super(name, description, caption);
        setFolder(false);
    }

    @Override
    public void displayFileComponentInformation()
    {
        System.out.println(getName() + " " + getDescription());

    }
}
