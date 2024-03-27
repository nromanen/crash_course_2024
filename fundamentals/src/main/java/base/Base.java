package base;

public class Base {
    private int id;
    private String description;

    Base() {}

    public Base(String description) {
        this.description = description;
        setId(++id);
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public void display() {
        System.out.printf(
                "Base{id=%d, description='%s'}%n",
                id, description);
    }
}
