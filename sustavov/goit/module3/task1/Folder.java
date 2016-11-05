package sustavov.goit.module3.task1;

/**
 * Created by ukr-sustavov on 27.05.2016.
 */
public class Folder extends CommonAbstractFile
{

    public Folder(String name, String description, String caption) {
        super(name, description, caption);
        setFolder(true);
    }

    @Override
    public void open(CommonAbstractFile commonAbstractFile)
    {
        System.out.println("You've opened " + getCaption() + " " + getName());
    }

}
