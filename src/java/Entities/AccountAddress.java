/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pollo
 */
@Entity
@Table(name = "account_address")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountAddress.findAll", query = "SELECT a FROM AccountAddress a"),
    @NamedQuery(name = "AccountAddress.findByAccAddrId", query = "SELECT a FROM AccountAddress a WHERE a.accAddrId = :accAddrId"),
    @NamedQuery(name = "AccountAddress.findByAccId", query = "SELECT a FROM AccountAddress a WHERE a.accId = :accId"),
    @NamedQuery(name = "AccountAddress.findByMainAddr", query = "SELECT a FROM AccountAddress a WHERE a.mainAddr = :mainAddr"),
    @NamedQuery(name = "AccountAddress.findByAddrTypeId", query = "SELECT a FROM AccountAddress a WHERE a.addrTypeId = :addrTypeId"),
    @NamedQuery(name = "AccountAddress.findByStreetLine1", query = "SELECT a FROM AccountAddress a WHERE a.streetLine1 = :streetLine1"),
    @NamedQuery(name = "AccountAddress.findByStreetLine2", query = "SELECT a FROM AccountAddress a WHERE a.streetLine2 = :streetLine2"),
    @NamedQuery(name = "AccountAddress.findByCity", query = "SELECT a FROM AccountAddress a WHERE a.city = :city"),
    @NamedQuery(name = "AccountAddress.findByCountry", query = "SELECT a FROM AccountAddress a WHERE a.country = :country"),
    @NamedQuery(name = "AccountAddress.findByState", query = "SELECT a FROM AccountAddress a WHERE a.state = :state"),
    @NamedQuery(name = "AccountAddress.findByZipcode", query = "SELECT a FROM AccountAddress a WHERE a.zipcode = :zipcode"),
    @NamedQuery(name = "AccountAddress.findByPlusFour", query = "SELECT a FROM AccountAddress a WHERE a.plusFour = :plusFour"),
    @NamedQuery(name = "AccountAddress.findByCreationDate", query = "SELECT a FROM AccountAddress a WHERE a.creationDate = :creationDate"),
    @NamedQuery(name = "AccountAddress.findByCreationUser", query = "SELECT a FROM AccountAddress a WHERE a.creationUser = :creationUser"),
    @NamedQuery(name = "AccountAddress.findByUpdateDate", query = "SELECT a FROM AccountAddress a WHERE a.updateDate = :updateDate"),
    @NamedQuery(name = "AccountAddress.findByUpdateUser", query = "SELECT a FROM AccountAddress a WHERE a.updateUser = :updateUser"),
    @NamedQuery(name = "AccountAddress.findByExpirationDate", query = "SELECT a FROM AccountAddress a WHERE a.expirationDate = :expirationDate")})
public class AccountAddress implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "acc_addr_id")
    private Integer accAddrId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "acc_id")
    private int accId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "main_addr")
    private boolean mainAddr;
    @Basic(optional = false)
    @NotNull
    @Column(name = "addr_type_id")
    private int addrTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "street_line_1")
    private String streetLine1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "street_line_2")
    private String streetLine2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "country")
    private String country;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 5)
    @Column(name = "zipcode")
    private String zipcode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "plus_four")
    private String plusFour;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creation_user")
    private int creationUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "update_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "update_user")
    private int updateUser;
    @Basic(optional = false)
    @NotNull
    @Column(name = "expiration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDate;

    public AccountAddress() {
    }

    public AccountAddress(Integer accAddrId) {
        this.accAddrId = accAddrId;
    }

    public AccountAddress(Integer accAddrId, int accId, boolean mainAddr, int addrTypeId, String streetLine1, String streetLine2, String city, String country, String state, String zipcode, String plusFour, Date creationDate, int creationUser, Date updateDate, int updateUser, Date expirationDate) {
        this.accAddrId = accAddrId;
        this.accId = accId;
        this.mainAddr = mainAddr;
        this.addrTypeId = addrTypeId;
        this.streetLine1 = streetLine1;
        this.streetLine2 = streetLine2;
        this.city = city;
        this.country = country;
        this.state = state;
        this.zipcode = zipcode;
        this.plusFour = plusFour;
        this.creationDate = creationDate;
        this.creationUser = creationUser;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
        this.expirationDate = expirationDate;
    }

    public Integer getAccAddrId() {
        return accAddrId;
    }

    public void setAccAddrId(Integer accAddrId) {
        this.accAddrId = accAddrId;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public boolean getMainAddr() {
        return mainAddr;
    }

    public void setMainAddr(boolean mainAddr) {
        this.mainAddr = mainAddr;
    }

    public int getAddrTypeId() {
        return addrTypeId;
    }

    public void setAddrTypeId(int addrTypeId) {
        this.addrTypeId = addrTypeId;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public void setStreetLine1(String streetLine1) {
        this.streetLine1 = streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public void setStreetLine2(String streetLine2) {
        this.streetLine2 = streetLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getPlusFour() {
        return plusFour;
    }

    public void setPlusFour(String plusFour) {
        this.plusFour = plusFour;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getCreationUser() {
        return creationUser;
    }

    public void setCreationUser(int creationUser) {
        this.creationUser = creationUser;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public int getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(int updateUser) {
        this.updateUser = updateUser;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accAddrId != null ? accAddrId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountAddress)) {
            return false;
        }
        AccountAddress other = (AccountAddress) object;
        if ((this.accAddrId == null && other.accAddrId != null) || (this.accAddrId != null && !this.accAddrId.equals(other.accAddrId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.AccountAddress[ accAddrId=" + accAddrId + " ]";
    }
    
}
