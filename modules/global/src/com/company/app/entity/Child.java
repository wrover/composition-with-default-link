package com.company.app.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|brief")
@Table(name = "APP_CHILD")
@Entity(name = "app$Child")
public class Child extends StandardEntity {
    private static final long serialVersionUID = -3239581366433097273L;

    @Column(name = "BRIEF", nullable = false)
    protected String brief;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "PARENT_ID")
    protected Parent parent;

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getBrief() {
        return brief;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }

    public Parent getParent() {
        return parent;
    }


}