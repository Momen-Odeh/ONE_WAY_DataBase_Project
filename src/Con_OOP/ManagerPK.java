/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Con_OOP;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Momen
 */
@Embeddable
public class ManagerPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "MANAGER_SSN")
    private int managerSsn;
    @Basic(optional = false)
    @Column(name = "PASSWORD_COLLECTIONS")
    private String passwordCollections;

    public ManagerPK() {
    }

    public ManagerPK(int managerSsn, String passwordCollections) {
        this.managerSsn = managerSsn;
        this.passwordCollections = passwordCollections;
    }

    public int getManagerSsn() {
        return managerSsn;
    }

    public void setManagerSsn(int managerSsn) {
        this.managerSsn = managerSsn;
    }

    public String getPasswordCollections() {
        return passwordCollections;
    }

    public void setPasswordCollections(String passwordCollections) {
        this.passwordCollections = passwordCollections;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) managerSsn;
        hash += (passwordCollections != null ? passwordCollections.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ManagerPK)) {
            return false;
        }
        ManagerPK other = (ManagerPK) object;
        if (this.managerSsn != other.managerSsn) {
            return false;
        }
        if ((this.passwordCollections == null && other.passwordCollections != null) || (this.passwordCollections != null && !this.passwordCollections.equals(other.passwordCollections))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Con_OOP.ManagerPK[ managerSsn=" + managerSsn + ", passwordCollections=" + passwordCollections + " ]";
    }
    
}
