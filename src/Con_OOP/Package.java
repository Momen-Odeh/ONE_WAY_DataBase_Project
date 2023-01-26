/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Con_OOP;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Momen
 */
@Entity
@Table(name = "PACKAGE")
@NamedQueries({
    @NamedQuery(name = "Package.findAll", query = "SELECT p FROM Package p"),
    @NamedQuery(name = "Package.findByPackageid", query = "SELECT p FROM Package p WHERE p.packageid = :packageid"),
    @NamedQuery(name = "Package.findBySizepackage", query = "SELECT p FROM Package p WHERE p.sizepackage = :sizepackage"),
    @NamedQuery(name = "Package.findByDescription", query = "SELECT p FROM Package p WHERE p.description = :description"),
    @NamedQuery(name = "Package.findByState", query = "SELECT p FROM Package p WHERE p.state = :state"),
    @NamedQuery(name = "Package.findByPriceProduct", query = "SELECT p FROM Package p WHERE p.priceProduct = :priceProduct"),
    @NamedQuery(name = "Package.findByDeliveryfee", query = "SELECT p FROM Package p WHERE p.deliveryfee = :deliveryfee"),
    @NamedQuery(name = "Package.findBySendingDate", query = "SELECT p FROM Package p WHERE p.sendingDate = :sendingDate"),
    @NamedQuery(name = "Package.findByDeliverydate", query = "SELECT p FROM Package p WHERE p.deliverydate = :deliverydate"),
    @NamedQuery(name = "Package.findByStatesp", query = "SELECT p FROM Package p WHERE p.state != :state"),
    @NamedQuery(name = "Package.findByCLISSN", query = "SELECT p FROM Package p WHERE p.clientSsn.clientSsn = :clissn")
})
public class Package implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "PACKAGEID")
    private BigDecimal packageid;
    @Column(name = "SIZEPACKAGE")
    private String sizepackage;
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @Column(name = "STATE")
    private String state;
    @Column(name = "PRICE_PRODUCT")
    private Integer priceProduct;
    @Column(name = "DELIVERYFEE")
    private Integer deliveryfee;
    @Column(name = "SENDING_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendingDate;
    @Column(name = "DELIVERYDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliverydate;
    @JoinColumn(name = "CASHER_SSN", referencedColumnName = "CASHER_SSN")
    @ManyToOne
    private Casher casherSsn;
    @JoinColumn(name = "CLIENT_SSN", referencedColumnName = "CLIENT_SSN")
    @ManyToOne
    private Client clientSsn;
    @JoinColumn(name = "DRIVER_SSN", referencedColumnName = "DRIVER_SSN")
    @ManyToOne
    private Driver driverSsn;
    @JoinColumn(name = "RECIPIENT_SSN", referencedColumnName = "RECIPIENT_SSN")
    @ManyToOne
    private Recipient recipientSsn;

    public Package() {
    }

    public Package(BigDecimal packageid) {
        this.packageid = packageid;
    }

    public Package(BigDecimal packageid, String state) {
        this.packageid = packageid;
        this.state = state;
    }

    public BigDecimal getPackageid() {
        return packageid;
    }

    public void setPackageid(BigDecimal packageid) {
        this.packageid = packageid;
    }

    public String getSizepackage() {
        return sizepackage;
    }

    public void setSizepackage(String sizepackage) {
        this.sizepackage = sizepackage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(Integer priceProduct) {
        this.priceProduct = priceProduct;
    }

    public Integer getDeliveryfee() {
        return deliveryfee;
    }

    public void setDeliveryfee(Integer deliveryfee) {
        this.deliveryfee = deliveryfee;
    }

    public Date getSendingDate() {
        return sendingDate;
    }

    public void setSendingDate(Date sendingDate) {
        this.sendingDate = sendingDate;
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    

    public Casher getCasherSsn() {
        return casherSsn;
    }

    public void setCasherSsn(Casher casherSsn) {
        this.casherSsn = casherSsn;
    }

    public Client getClientSsn() {
        return clientSsn;
    }

    public void setClientSsn(Client clientSsn) {
        this.clientSsn = clientSsn;
    }

    public Driver getDriverSsn() {
        return driverSsn;
    }

    public void setDriverSsn(Driver driverSsn) {
        this.driverSsn = driverSsn;
    }

    public Recipient getRecipientSsn() {
        return recipientSsn;
    }

    public void setRecipientSsn(Recipient recipientSsn) {
        this.recipientSsn = recipientSsn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (packageid != null ? packageid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Package)) {
            return false;
        }
        Package other = (Package) object;
        if ((this.packageid == null && other.packageid != null) || (this.packageid != null && !this.packageid.equals(other.packageid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Con_OOP.Package[ packageid=" + packageid + " ]";
    }
    
}
