package ru.bekasic.webtests.tests;

import org.testng.annotations.Test;
import ru.bekasic.webtests.model.GroupData;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().goToGropPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("testGroup1", "description1", "description2"));
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().goToGropPage();
        app.getGroupHelper().selectGroup();
    }

}
