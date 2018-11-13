package org.itstep.qa.lesson;

import org.testng.annotations.DataProvider;

public class DataEmail {
    @DataProvider(name = "user[email]")
    public Object[][] dataProvider() {
        return new Object[][]{
                {"eee.ee.er"},
                {"www@khj.ee"},
                {"@fs"},
                {"o9"}
        };
    }
}
