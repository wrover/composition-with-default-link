package com.company.app.web.parent;

import com.company.app.entity.Parent;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.components.GroupTable;

import javax.inject.Inject;

public class ParentBrowse extends AbstractLookup {
    @Inject
    private GroupTable<Parent> parentsTable;

    public void editCombined() {
        openEditor("app$Parent.editCombined", parentsTable.getSingleSelected(), WindowManager.OpenType.DIALOG);
    }
}