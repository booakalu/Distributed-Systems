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
@Table(name = "TBANSWERS", catalog = "", schema = "ROOT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbanswers.findAll", query = "SELECT t FROM Tbanswers t"),
    @NamedQuery(name = "Tbanswers.findByAnswerid", query = "SELECT t FROM Tbanswers t WHERE t.answerid = :answerid"),
    @NamedQuery(name = "Tbanswers.findByQuestionidfk", query = "SELECT t FROM Tbanswers t WHERE t.questionidfk = :questionidfk"),
    @NamedQuery(name = "Tbanswers.findByAnswerdescription", query = "SELECT t FROM Tbanswers t WHERE t.answerdescription = :answerdescription")})
public class Tbanswers implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ANSWERID")
    private Integer answerid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "QUESTIONIDFK")
    private int questionidfk;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "ANSWERDESCRIPTION")
    private String answerdescription;

    public Tbanswers() {
    }

    public Tbanswers(Integer answerid) {
        this.answerid = answerid;
    }

    public Tbanswers(Integer answerid, int questionidfk, String answerdescription) {
        this.answerid = answerid;
        this.questionidfk = questionidfk;
        this.answerdescription = answerdescription;
    }

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public int getQuestionidfk() {
        return questionidfk;
    }

    public void setQuestionidfk(int questionidfk) {
        this.questionidfk = questionidfk;
    }

    public String getAnswerdescription() {
        return answerdescription;
    }

    public void setAnswerdescription(String answerdescription) {
        this.answerdescription = answerdescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (answerid != null ? answerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbanswers)) {
            return false;
        }
        Tbanswers other = (Tbanswers) object;
        if ((this.answerid == null && other.answerid != null) || (this.answerid != null && !this.answerid.equals(other.answerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.Tbanswers[ answerid=" + answerid + " ]";
    }
    
}
