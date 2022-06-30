/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author LNdlovu
 */
@Entity
@Table(name = "TBWRITTENTESTS", catalog = "", schema = "ROOT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbwrittentests.findAll", query = "SELECT t FROM Tbwrittentests t"),
    @NamedQuery(name = "Tbwrittentests.findByWrittentestid", query = "SELECT t FROM Tbwrittentests t WHERE t.writtentestid = :writtentestid"),
    @NamedQuery(name = "Tbwrittentests.findByQuestionidfk", query = "SELECT t FROM Tbwrittentests t WHERE t.questionidfk = :questionidfk"),
    @NamedQuery(name = "Tbwrittentests.findByAnsweridfk", query = "SELECT t FROM Tbwrittentests t WHERE t.answeridfk = :answeridfk"),
    @NamedQuery(name = "Tbwrittentests.findByLearneranswerid", query = "SELECT t FROM Tbwrittentests t WHERE t.learneranswerid = :learneranswerid")})
public class Tbwrittentests implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "WRITTENTESTID")
    private Integer writtentestid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUESTIONIDFK")
    private int questionidfk;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ANSWERIDFK")
    private int answeridfk;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "LEARNERANSWERID")
    private String learneranswerid;

    public Tbwrittentests() {
    }

    public Tbwrittentests(Integer writtentestid) {
        this.writtentestid = writtentestid;
    }

    public Tbwrittentests(Integer writtentestid, int questionidfk, int answeridfk, String learneranswerid) {
        this.writtentestid = writtentestid;
        this.questionidfk = questionidfk;
        this.answeridfk = answeridfk;
        this.learneranswerid = learneranswerid;
    }

    public Integer getWrittentestid() {
        return writtentestid;
    }

    public void setWrittentestid(Integer writtentestid) {
        this.writtentestid = writtentestid;
    }

    public int getQuestionidfk() {
        return questionidfk;
    }

    public void setQuestionidfk(int questionidfk) {
        this.questionidfk = questionidfk;
    }

    public int getAnsweridfk() {
        return answeridfk;
    }

    public void setAnsweridfk(int answeridfk) {
        this.answeridfk = answeridfk;
    }

    public String getLearneranswerid() {
        return learneranswerid;
    }

    public void setLearneranswerid(String learneranswerid) {
        this.learneranswerid = learneranswerid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (writtentestid != null ? writtentestid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbwrittentests)) {
            return false;
        }
        Tbwrittentests other = (Tbwrittentests) object;
        if ((this.writtentestid == null && other.writtentestid != null) || (this.writtentestid != null && !this.writtentestid.equals(other.writtentestid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.Tbwrittentests[ writtentestid=" + writtentestid + " ]";
    }
    
}
