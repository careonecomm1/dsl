package com.dsl.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dsl_actions")
public class Action implements com.dsl.core.Entity<Long> {
    private Long id;
    @Column(name = "att_name")
    private String name;
    @Column(name = "att_label")
    private String label;

    public Action() {
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
