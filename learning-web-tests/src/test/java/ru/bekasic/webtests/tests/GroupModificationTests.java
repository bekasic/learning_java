package ru.bekasic.webtests.tests;

import org.testng.annotations.Test;
import ru.bekasic.webtests.model.GroupData;

public class GroupModificationTests extends TestBase{

    @Test
    public void testGroupModification(){
        app.getNavigationHelper().goToGropPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("testGroup1", "description1", "description2"));
        app.getGroupHelper().submitGroupModification();
        app.getNavigationHelper().goToGropPage();
    }

}
