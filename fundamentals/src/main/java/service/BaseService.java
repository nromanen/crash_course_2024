package service;

import base.Base;
import base.Other;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BaseService {

    private static final String BASE_DESC = "Base Description";
    private static final String OTHER_DESC = "Other Description";

    @Test
    public void testPrintFields(){
        Base base = new Base("");
        Other other = new Other();
        Base base1 = new Base(BASE_DESC);
        Other other1 = new Other(11, OTHER_DESC);
        base.display();
        other.display();
        base1.display();
        other1.display();
    }

    @Test
    void testOtherInheritedDescriptionAndId() {
        Base base = new Base(BASE_DESC);
        Other other = new Other(11, BASE_DESC);
        assertEquals(11, other.getId());
        assertEquals(BASE_DESC, other.getDescription());
        assertEquals(BASE_DESC, base.getDescription());
    }
}
