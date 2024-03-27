// Файл: BaseService.java
package service;

import base.Base;

public class BaseService extends Base{
    public void accessBaseMembers() {
        BaseService baseService = new BaseService();

        // Доступ до полів класу Base
        // base.id та base.privateMethod() та base.description- НЕДОСТУПНО, оскільки id
        // є приватним

        // Доступ до методів класу Base
        baseService.privateMethod(); //- НЕДОСТУПНО, оскільки privateMethod() є приватним
        baseService.defaultMethod(2); // НЕДОСТУПНО, defaultMethod() має модифікатор доступу "за замовчуванням"
        baseService.protectedMethod(); // Доступно, protectedMethod() має модифікатор доступу "захищений"
        baseService.publicMethod(7); // Доступно, publicMethod() має модифікатор доступу "публічний"
    }
}
