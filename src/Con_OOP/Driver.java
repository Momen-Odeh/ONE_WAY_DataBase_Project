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
@Table(name = "DRIVER")
@NamedQueries({
    @NamedQuery(name = "Driver.findAll", query = "SELECT d FROM Driver d"),
    @NamedQuery(name = "Driver.findByDriverSsn", query = "SELECT d FROM Driver d WHERE d.driverSsn = :driverSsn"),
    @NamedQuery(name = "Driver.findByVehicleId", query = "SELECT d FROM Driver d WHERE d.vehicleId = :vehicleId"),
    @NamedQuery(name = "Driver.findByBrand", query = "SELECT d FROM Driver d WHERE d.brand = :brand"),
    @NamedQuery(name = "Driver.findBySizevecel", query = "SELECT d FROM Driver d WHERE d.sizevecel = :sizevecel")})
public class Driver implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "DRIVER_SSN")
    private Integer driverSsn;
    @Column(name = "VEHICLE_ID")
    private String vehicleId;
    @Column(name = "BRAND")
    private String brand;
    @Column(name = "SIZEVECEL")
    private String sizevecel;
    @OneToMany(mappedBy = "driverSsn")
    private Collection<Package> packageCollection;
    @JoinColumn(name = "DRIVER_SSN", referencedColumnName = "SSN", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Employee employee;

    public Driver() {
    }

    public Driver(Integer driverSsn) {
        this.driverSsn = driverSsn;
    }

    public Integer getDriverSsn() {
        return driverSsn;
    }

    public void setDriverSsn(Integer driverSsn) {
        this.driverSsn = driverSsn;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSizevecel() {
        return sizevecel;
    }

    public void setSizevecel(String sizevecel) {
        this.sizevecel = sizevecel;
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
        hash += (driverSsn != null ? driverSsn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) object;
        if ((this.driverSsn == null && other.driverSsn != null) || (this.driverSsn != null && !this.driverSsn.equals(other.driverSsn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Con_OOP.Driver[ driverSsn=" + driverSsn + " ]";
    }
    
}
