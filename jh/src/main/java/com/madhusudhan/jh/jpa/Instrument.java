/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.madhusudhan.jh.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 *
 * @author mkonda
 */
@Entity
@Table(name="JPA_INSTRUMENT")
public class Instrument {
    @Id
    @GeneratedValue (strategy= GenerationType.TABLE, generator="empTableGen")
    @TableGenerator(name = "empTableGen", table = "EMP_ID_TABLE")
    private long id;
    private String issue = null;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
}
