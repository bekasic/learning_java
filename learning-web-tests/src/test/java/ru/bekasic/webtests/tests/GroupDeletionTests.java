package ru.bekasic.webtests.tests;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {
    @Test
    public void testGroupDelete() {
        app.getNavigationHelper().goToGropPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroups();
        app.getNavigationHelper().goToGropPage();
    }

}
