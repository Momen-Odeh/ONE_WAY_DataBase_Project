/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Con_OOP;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Momen
 */
@Entity
@Table(name = "MANAGER")
@NamedQueries({
    @NamedQuery(name = "Manager.findAll", query = "SELECT m FROM Manager m"),
    @NamedQuery(name = "Manager.findByManagerSsn", query = "SELECT m FROM Manager m WHERE m.managerPK.managerSsn = :managerSsn"),
    @NamedQuery(name = "Manager.findByPasswordCollections", query = "SELECT m FROM Manager m WHERE m.managerPK.passwordCollections = :passwordCollections"),
    @NamedQuery(name = "Manager.findBySuppliercollections", query = "SELECT m FROM Manager m WHERE m.suppliercollections = :suppliercollections"),
    @NamedQuery(name = "Manager.findByTotalcash", query = "SELECT m FROM Manager m WHERE m.totalcash = :totalcash")})
public class Manager implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ManagerPK managerPK;
    @Column(name = "SUPPLIERCOLLECTIONS")
    private Integer suppliercollections;
    @Column(name = "TOTALCASH")
    private Integer totalcash;
    @JoinColumn(name = "MANAGER_SSN", referencedColumnName = "SSN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Employee employee;

    public Manager() {
    }

    public Manager(ManagerPK managerPK) {
        this.managerPK = managerPK;
    }

    public Manager(int managerSsn, String passwordCollections) {
        this.managerPK = new ManagerPK(managerSsn, passwordCollections);
    }

    public ManagerPK getManagerPK() {
        return managerPK;
    }

    public void setManagerPK(ManagerPK managerPK) {
        this.managerPK = managerPK;
    }

    public Integer getSuppliercollections() {
        return suppliercollections;
    }

    public void setSuppliercollections(Integer suppliercollections) {
        this.suppliercollections = suppliercollections;
    }

    public Integer getTotalcash() {
        return totalcash;
    }

    public void setTotalcash(Integer totalcash) {
        this.totalcash = totalcash;
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
        hash += (managerPK != null ? managerPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manager)) {
            return false;
        }
        Manager other = (Manager) object;
        if ((this.managerPK == null && other.managerPK != null) || (this.managerPK != null && !this.managerPK.equals(other.managerPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Con_OOP.Manager[ managerPK=" + managerPK + " ]";
    }
    
}
