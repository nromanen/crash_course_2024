// Файл: Base.java
package base;

public class Base {
    private int id=27;
    private String description="Description about method: ";

    // Приватний метод, доступний лише у межах класу Base
    private void privateMethod() {
        System.out.println(description+"This is a private method in Base class");
        System.out.println("Default id is: "+id);
    }

    // Метод за замовчуванням, доступний у межах пакету base
    void defaultMethod(int id) {
        System.out.println(description+"This is a default method in Base class");
        this.id=id;
        System.out.println("Now id is: "+id);
    }

    // Захищений метод, доступний у межах пакету base та у підкласах
    protected void protectedMethod() {
        System.out.println(description+"This is a protected method in Base class");
        System.out.println("Default id is: "+id);
    }

    // Публічний метод, доступний всюди
    public void publicMethod(int id) {
        System.out.println(description+"This is a public method in Base class");
        this.id=id;
        System.out.println("Now id is: "+id);
    }
}
