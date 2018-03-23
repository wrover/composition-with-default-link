package com.company.app.web.parent;

import com.company.app.entity.Child;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.app.entity.Parent;
import com.haulmont.cuba.gui.data.Datasource;

import javax.inject.Inject;

public class ParentEdit extends AbstractEditor<Parent> {
    @Inject
    private Datasource<Parent> parentDs;

    public void createChild() {
        Child child = new Child();
        child.setParent(getItem());
        openEditor(null, child, WindowManager.OpenType.DIALOG, parentDs);
    }
}