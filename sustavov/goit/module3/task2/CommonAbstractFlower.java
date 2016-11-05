package sustavov.goit.module3.task2;

/**
 * Created by SUSTAVOV on 28.05.2016.
 */
public abstract class CommonAbstractFlower {
    private String name;
    private Color color;
    private int length;
    private boolean isThorns;

    public CommonAbstractFlower(String name, Color color, int length, boolean isThorns) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.isThorns = isThorns;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public int getLength() {
        return length;
    }

    public boolean isThorns() {
        return isThorns;
    }
}
