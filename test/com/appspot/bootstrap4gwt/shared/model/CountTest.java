package com.appspot.bootstrap4gwt.shared.model;

import org.slim3.tester.AppEngineTestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class CountTest extends AppEngineTestCase {

    private Count model = new Count();

    @Test
    public void test() throws Exception {
        assertThat(model, is(notNullValue()));
    }
}
