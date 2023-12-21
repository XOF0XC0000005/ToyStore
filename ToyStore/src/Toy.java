import com.sun.source.tree.ReturnTree;

public class Toy {
    private String id;
    private String name;
    private int rate;
    public Toy(String id, String name, int rate) {
        this.id = id;
        this.name = name;
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
}
