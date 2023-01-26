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
//delet from Clint where CLIENT_SSN =
/**
 *
 * @author Momen
 */
@Entity
@Table(name = "CLIENT")
@NamedQueries({
    @NamedQuery(name = "Client.findAll", query = "SELECT c FROM Client c"),
    @NamedQuery(name = "Client.findByClientSsn", query = "SELECT c FROM Client c WHERE c.clientSsn = :clientSsn"),
    @NamedQuery(name = "Client.findByName", query = "SELECT c FROM Client c WHERE c.name = :name"),
    @NamedQuery(name = "Client.findByPhone", query = "SELECT c FROM Client c WHERE c.phone = :phone"),
    @NamedQuery(name = "Client.findByAddress", query = "SELECT c FROM Client c WHERE c.address = :address"),
    @NamedQuery(name = "Client.findByPassword", query = "SELECT c FROM Client c WHERE c.password = :password"),
    @NamedQuery(name = "delete.SSNClient", query = "delete from Client where name = :SSNCli")

}
)
public class Client implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "CLIENT_SSN")
    private Integer clientSsn;
    @Basic(optional = false)
    @Column(name = "NAME")
    private String name;
    @Column(name = "PHONE")
    private Long phone;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "PASSWORD")
    private String password;
    @OneToMany(mappedBy = "clientSsn")
    private Collection<Package> packageCollection;

    public Client() {
    }

    public Client(Integer clientSsn) {
        this.clientSsn = clientSsn;
    }

    public Client(Integer clientSsn, String name) {
        this.clientSsn = clientSsn;
        this.name = name;
    }

    public Integer getClientSsn() {
        return clientSsn;
    }

    public void setClientSsn(Integer clientSsn) {
        this.clientSsn = clientSsn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        hash += (clientSsn != null ? clientSsn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.clientSsn == null && other.clientSsn != null) || (this.clientSsn != null && !this.clientSsn.equals(other.clientSsn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Con_OOP.Client[ clientSsn=" + clientSsn + " ]";
    }
    
}
