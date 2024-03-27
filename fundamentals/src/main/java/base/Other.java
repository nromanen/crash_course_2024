package base;

public class Other extends Base{
    private int id;

    public Other(int id, String description) {
        super(description);
        this.id = id;
    }

    public Other() {
        super();
        setDescription(this.getClass().getSimpleName());
        ++id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void display() {
        System.out.printf(
                "Other{id=%d, description='%s'}%n",
                getId(), super.getDescription());
    }
}
