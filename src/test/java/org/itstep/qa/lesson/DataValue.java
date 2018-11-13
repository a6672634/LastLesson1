package org.itstep.qa.lesson;

import org.testng.annotations.DataProvider;

public class DataValue {
    @DataProvider(name = "testValue")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"test1", "sfrsfsfs"},
                {"test2", "121sdf"},
                {"test3", "f22"}
        };
    }
}
