/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Con_OOP;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Momen
 */
@Entity
@Table(name = "EMPLOYEE")
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findBySsn", query = "SELECT e FROM Employee e WHERE e.ssn = :ssn"),
    @NamedQuery(name = "Employee.findByEmpId", query = "SELECT e FROM Employee e WHERE e.empId = :empId"),
    @NamedQuery(name = "Employee.findByNameEmp", query = "SELECT e FROM Employee e WHERE e.nameEmp = :nameEmp"),
    @NamedQuery(name = "Employee.findByPhone", query = "SELECT e FROM Employee e WHERE e.phone = :phone"),
    @NamedQuery(name = "Employee.findByAddress", query = "SELECT e FROM Employee e WHERE e.address = :address"),
    @NamedQuery(name = "Employee.findByEmploymentDate", query = "SELECT e FROM Employee e WHERE e.employmentDate = :employmentDate"),
    @NamedQuery(name = "Employee.findByBirthDate", query = "SELECT e FROM Employee e WHERE e.birthDate = :birthDate"),
    @NamedQuery(name = "Employee.findByPassword", query = "SELECT e FROM Employee e WHERE e.password = :password"),
    @NamedQuery(name = "Employee.findManagerBySsn", query = "SELECT e FROM Employee e ,Manager m WHERE e.ssn = :ssn and  e.ssn = m.managerPK.managerSsn"),
    @NamedQuery(name = "Employee.findCasherBySsn", query = "SELECT e FROM Employee e ,Casher ca WHERE e.ssn = :ssn and  e.ssn = ca.casherSsn")


})
public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "SSN")
    private Integer ssn;
    @Basic(optional = false)
    @Column(name = "EMP_ID")
    private int empId;
    @Basic(optional = false)
    @Column(name = "NAME_EMP")
    private String nameEmp;
    @Basic(optional = false)
    @Column(name = "PHONE")
    private long phone;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "EMPLOYMENT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date employmentDate;
    @Column(name = "BIRTH_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDate;
    @Basic(optional = false)
    @Column(name = "PASSWORD")
    private String password;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Driver driver;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private Collection<Manager> managerCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "employee")
    private Casher casher;

    public Employee() {
    }

    public Employee(Integer ssn) {
        this.ssn = ssn;
    }

    public Employee(Integer ssn, int empId, String nameEmp, long phone, String password) {
        this.ssn = ssn;
        this.empId = empId;
        this.nameEmp = nameEmp;
        this.phone = phone;
        this.password = password;
    }

    public Integer getSsn() {
        return ssn;
    }

    public void setSsn(Integer ssn) {
        this.ssn = ssn;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getNameEmp() {
        return nameEmp;
    }

    public void setNameEmp(String nameEmp) {
        this.nameEmp = nameEmp;
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

    public Date getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(Date employmentDate) {
        this.employmentDate = employmentDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Collection<Manager> getManagerCollection() {
        return managerCollection;
    }

    public void setManagerCollection(Collection<Manager> managerCollection) {
        this.managerCollection = managerCollection;
    }

    public Casher getCasher() {
        return casher;
    }

    public void setCasher(Casher casher) {
        this.casher = casher;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ssn != null ? ssn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.ssn == null && other.ssn != null) || (this.ssn != null && !this.ssn.equals(other.ssn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Con_OOP.Employee[ ssn=" + ssn + " ]";
    }
    
}
