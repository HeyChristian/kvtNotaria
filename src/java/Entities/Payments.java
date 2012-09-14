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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author pollo
 */
@Entity
@Table(name = "payments")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payments.findAll", query = "SELECT p FROM Payments p"),
    @NamedQuery(name = "Payments.findByPayId", query = "SELECT p FROM Payments p WHERE p.payId = :payId"),
    @NamedQuery(name = "Payments.findByAccId", query = "SELECT p FROM Payments p WHERE p.accId = :accId"),
    @NamedQuery(name = "Payments.findByProductId", query = "SELECT p FROM Payments p WHERE p.productId = :productId"),
    @NamedQuery(name = "Payments.findByAmount", query = "SELECT p FROM Payments p WHERE p.amount = :amount"),
    @NamedQuery(name = "Payments.findByPayTypeId", query = "SELECT p FROM Payments p WHERE p.payTypeId = :payTypeId"),
    @NamedQuery(name = "Payments.findByCreationDate", query = "SELECT p FROM Payments p WHERE p.creationDate = :creationDate"),
    @NamedQuery(name = "Payments.findByCreationUser", query = "SELECT p FROM Payments p WHERE p.creationUser = :creationUser"),
    @NamedQuery(name = "Payments.findByUpdateDate", query = "SELECT p FROM Payments p WHERE p.updateDate = :updateDate"),
    @NamedQuery(name = "Payments.findByUpdateUser", query = "SELECT p FROM Payments p WHERE p.updateUser = :updateUser")})
public class Payments implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pay_id")
    private Integer payId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "acc_id")
    private int accId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "product_id")
    private int productId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "amount")
    private double amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pay_type_id")
    private int payTypeId;
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

    public Payments() {
    }

    public Payments(Integer payId) {
        this.payId = payId;
    }

    public Payments(Integer payId, int accId, int productId, double amount, int payTypeId, Date creationDate, int creationUser, Date updateDate, int updateUser) {
        this.payId = payId;
        this.accId = accId;
        this.productId = productId;
        this.amount = amount;
        this.payTypeId = payTypeId;
        this.creationDate = creationDate;
        this.creationUser = creationUser;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
    }

    public Integer getPayId() {
        return payId;
    }

    public void setPayId(Integer payId) {
        this.payId = payId;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getPayTypeId() {
        return payTypeId;
    }

    public void setPayTypeId(int payTypeId) {
        this.payTypeId = payTypeId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (payId != null ? payId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Payments)) {
            return false;
        }
        Payments other = (Payments) object;
        if ((this.payId == null && other.payId != null) || (this.payId != null && !this.payId.equals(other.payId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Payments[ payId=" + payId + " ]";
    }
    
}
