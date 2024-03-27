package base;

public class Other {
    public void accessBaseMembers() {
        Base base = new Base();

        // Доступ до полів класу Base
        // base.id та base.privateMethod() та base.description- НЕДОСТУПНО, оскільки id
        // є приватним

        base.defaultMethod(12); // Доступно, defaultMethod() має модифікатор доступу "за замовчуванням"
        base.protectedMethod(); // Доступно, protectedMethod() має модифікатор доступу "захищений"
        base.publicMethod(83); // Доступно, publicMethod() має модифікатор доступу "публічний"
    }
}
