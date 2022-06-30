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
@Table(name = "TBWEBTESTS", catalog = "", schema = "ROOT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tbwebtests.findAll", query = "SELECT t FROM Tbwebtests t"),
    @NamedQuery(name = "Tbwebtests.findByWebtestid", query = "SELECT t FROM Tbwebtests t WHERE t.webtestid = :webtestid"),
    @NamedQuery(name = "Tbwebtests.findByWebtestdescription", query = "SELECT t FROM Tbwebtests t WHERE t.webtestdescription = :webtestdescription")})
public class Tbwebtests implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "WEBTESTID")
    private Integer webtestid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "WEBTESTDESCRIPTION")
    private String webtestdescription;

    public Tbwebtests() {
    }

    public Tbwebtests(Integer webtestid) {
        this.webtestid = webtestid;
    }

    public Tbwebtests(Integer webtestid, String webtestdescription) {
        this.webtestid = webtestid;
        this.webtestdescription = webtestdescription;
    }

    public Integer getWebtestid() {
        return webtestid;
    }

    public void setWebtestid(Integer webtestid) {
        this.webtestid = webtestid;
    }

    public String getWebtestdescription() {
        return webtestdescription;
    }

    public void setWebtestdescription(String webtestdescription) {
        this.webtestdescription = webtestdescription;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (webtestid != null ? webtestid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tbwebtests)) {
            return false;
        }
        Tbwebtests other = (Tbwebtests) object;
        if ((this.webtestid == null && other.webtestid != null) || (this.webtestid != null && !this.webtestid.equals(other.webtestid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.Tbwebtests[ webtestid=" + webtestid + " ]";
    }
    
}
