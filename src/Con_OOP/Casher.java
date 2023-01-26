/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Con_OOP;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Momen
 */
@Entity
@Table(name = "CASHER")
@NamedQueries({
    @NamedQuery(name = "Casher.findAll", query = "SELECT c FROM Casher c"),
    @NamedQuery(name = "Casher.findByCasherSsn", query = "SELECT c FROM Casher c WHERE c.casherSsn = :casherSsn"),
    @NamedQuery(name = "Casher.findByScientificDegree", query = "SELECT c FROM Casher c WHERE c.scientificDegree = :scientificDegree")})
public class Casher implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CASHER_SSN")
    private Integer casherSsn;
    @Column(name = "SCIENTIFIC_DEGREE")
    private String scientificDegree;
    @OneToMany(mappedBy = "casherSsn")
    private Collection<Package> packageCollection;
    @JoinColumn(name = "CASHER_SSN", referencedColumnName = "SSN", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Employee employee;

    public Casher() {
    }

    public Casher(Integer casherSsn) {
        this.casherSsn = casherSsn;
    }

    public Integer getCasherSsn() {
        return casherSsn;
    }

    public void setCasherSsn(Integer casherSsn) {
        this.casherSsn = casherSsn;
    }

    public String getScientificDegree() {
        return scientificDegree;
    }

    public void setScientificDegree(String scientificDegree) {
        this.scientificDegree = scientificDegree;
    }

    public Collection<Package> getPackageCollection() {
        return packageCollection;
    }

    public void setPackageCollection(Collection<Package> packageCollection) {
        this.packageCollection = packageCollection;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (casherSsn != null ? casherSsn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Casher)) {
            return false;
        }
        Casher other = (Casher) object;
        if ((this.casherSsn == null && other.casherSsn != null) || (this.casherSsn != null && !this.casherSsn.equals(other.casherSsn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Con_OOP.Casher[ casherSsn=" + casherSsn + " ]";
    }
    
}
