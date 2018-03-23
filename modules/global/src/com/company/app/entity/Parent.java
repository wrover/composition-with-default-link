package com.company.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@NamePattern("%s|brief")
@Table(name = "APP_PARENT")
@Entity(name = "app$Parent")
public class Parent extends StandardEntity {
    private static final long serialVersionUID = 3155431266431629888L;

    @Column(name = "BRIEF", nullable = false)
    protected String brief;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "parent")
    protected List<Child> children;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEFAULT_CHILD_ID")
    protected Child defaultChild;


    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setDefaultChild(Child defaultChild) {
        this.defaultChild = defaultChild;
    }

    public Child getDefaultChild() {
        return defaultChild;
    }


    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getBrief() {
        return brief;
    }


}