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
@Table(name = "TBQUESTIONS", catalog = "", schema = "ROOT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbquestions.findAll", query = "SELECT t FROM Tbquestions t"),
    @NamedQuery(name = "Tbquestions.findByQuestionid", query = "SELECT t FROM Tbquestions t WHERE t.questionid = :questionid"),
    @NamedQuery(name = "Tbquestions.findByWebtestidfk", query = "SELECT t FROM Tbquestions t WHERE t.webtestidfk = :webtestidfk"),
    @NamedQuery(name = "Tbquestions.findByQuestiondescription", query = "SELECT t FROM Tbquestions t WHERE t.questiondescription = :questiondescription")})
public class Tbquestions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "QUESTIONID")
    private Integer questionid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "WEBTESTIDFK")
    private int webtestidfk;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "QUESTIONDESCRIPTION")
    private String questiondescription;

    public Tbquestions() {
    }

    public Tbquestions(Integer questionid) {
        this.questionid = questionid;
    }

    public Tbquestions(Integer questionid, int webtestidfk, String questiondescription) {
        this.questionid = questionid;
        this.webtestidfk = webtestidfk;
        this.questiondescription = questiondescription;
    }

    public Integer getQuestionid() {
        return questionid;
    }

    public void setQuestionid(Integer questionid) {
        this.questionid = questionid;
    }

    public int getWebtestidfk() {
        return webtestidfk;
    }

    public void setWebtestidfk(int webtestidfk) {
        this.webtestidfk = webtestidfk;
    }

    public String getQuestiondescription() {
        return questiondescription;
    }

    public void setQuestiondescription(String questiondescription) {
        this.questiondescription = questiondescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (questionid != null ? questionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbquestions)) {
            return false;
        }
        Tbquestions other = (Tbquestions) object;
        if ((this.questionid == null && other.questionid != null) || (this.questionid != null && !this.questionid.equals(other.questionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.Tbquestions[ questionid=" + questionid + " ]";
    }
    
}
