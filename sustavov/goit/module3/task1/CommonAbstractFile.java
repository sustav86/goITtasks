package sustavov.goit.module3.task1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SUSTAVOV on 27.05.2016.
 */
public abstract class CommonAbstractFile {
    private String name;
    private String description;
    private String caption;
    private int size;
    private boolean isFolder;
    private CommonAbstractFile parent;
    private ArrayList fileTree = new ArrayList<>();

    public CommonAbstractFile(String name, String description, String caption) {
        this.name = name;
        this.description = description;
        this.caption = caption;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getCaption() {
        return caption;
    }

    public int getSize() {
        return size;
    }

    public boolean isFolder() {
        return isFolder;
    }

    public void setFolder(boolean folder) {
        isFolder = folder;
    }

    public void displayFileComponentInformation() {
        System.out.println(getName() + " " + getDescription());

        Iterator iterator = fileTree.iterator();

        while (iterator.hasNext()) {
            CommonAbstractFile fileInfo = (CommonAbstractFile) iterator.next();
            fileInfo.displayFileComponentInformation();
        }


    }

    public void getParent() {
        System.out.println(this.getName() + " location in folder: " +parent.getName());
    }

    public void add(CommonAbstractFile commonAbstractFile) {
        fileTree.add(commonAbstractFile);
        commonAbstractFile.parent = this;
    }

    public void remove(CommonAbstractFile commonAbstractFile) {
        fileTree.remove(commonAbstractFile);
    }

    public void open(CommonAbstractFile commonAbstractFile) {
        System.out.println("You've opened " + getCaption() + " " + getName());
    }

    public void close(CommonAbstractFile commonAbstractFile) {
        throw new UnsupportedOperationException();
    }

    public void execute(CommonAbstractFile commonAbstractFile) {
        throw new UnsupportedOperationException();
    }

    public CommonAbstractFile getFile(int indexOfFile) {
        return (CommonAbstractFile) fileTree.get(indexOfFile);
    }
}
