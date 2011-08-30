package com.appspot.bootstrap4gwt.shared.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PersonTest extends AppEngineTestCase {

    private Person model = new Person();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
