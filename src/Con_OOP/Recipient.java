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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Momen
 */
@Entity
@Table(name = "RECIPIENT")
@NamedQueries({
    @NamedQuery(name = "Recipient.findAll", query = "SELECT r FROM Recipient r"),
    @NamedQuery(name = "Recipient.findByRecipientSsn", query = "SELECT r FROM Recipient r WHERE r.recipientSsn = :recipientSsn"),
    @NamedQuery(name = "Recipient.findByName", query = "SELECT r FROM Recipient r WHERE r.name = :name"),
    @NamedQuery(name = "Recipient.findByPhone", query = "SELECT r FROM Recipient r WHERE r.phone = :phone"),
    @NamedQuery(name = "Recipient.findByAddress", query = "SELECT r FROM Recipient r WHERE r.address = :address")})
public class Recipient implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "RECIPIENT_SSN")
    private Integer recipientSsn;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Basic(optional = false)
    @Column(name = "PHONE")
    private long phone;
    @Basic(optional = false)
    @Column(name = "ADDRESS")
    private String address;
    @OneToMany(mappedBy = "recipientSsn")
    private Collection<Package> packageCollection;

    public Recipient() {
    }

    public Recipient(Integer recipientSsn) {
        this.recipientSsn = recipientSsn;
    }

    public Recipient(Integer recipientSsn, String name, long phone, String address) {
        this.recipientSsn = recipientSsn;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public Integer getRecipientSsn() {
        return recipientSsn;
    }

    public void setRecipientSsn(Integer recipientSsn) {
        this.recipientSsn = recipientSsn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Collection<Package> getPackageCollection() {
        return packageCollection;
    }

    public void setPackageCollection(Collection<Package> packageCollection) {
        this.packageCollection = packageCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (recipientSsn != null ? recipientSsn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recipient)) {
            return false;
        }
        Recipient other = (Recipient) object;
        if ((this.recipientSsn == null && other.recipientSsn != null) || (this.recipientSsn != null && !this.recipientSsn.equals(other.recipientSsn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Con_OOP.Recipient[ recipientSsn=" + recipientSsn + " ]";
    }
    
}
