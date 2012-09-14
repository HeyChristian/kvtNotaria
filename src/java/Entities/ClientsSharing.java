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
@Table(name = "clients_sharing")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientsSharing.findAll", query = "SELECT c FROM ClientsSharing c")})
public class ClientsSharing implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "shared_id")
    private Integer sharedId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "client_id")
    private int clientId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "acc_id")
    private int accId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_ownership")
    private boolean isOwnership;
    @Basic(optional = false)
    @NotNull
    @Column(name = "shared_user_id")
    private int sharedUserId;
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

    public ClientsSharing() {
    }

    public ClientsSharing(Integer sharedId) {
        this.sharedId = sharedId;
    }

    public ClientsSharing(Integer sharedId, int clientId, int accId, boolean isOwnership, int sharedUserId, Date creationDate, int creationUser, Date updateDate, int updateUser, Date expirationDate) {
        this.sharedId = sharedId;
        this.clientId = clientId;
        this.accId = accId;
        this.isOwnership = isOwnership;
        this.sharedUserId = sharedUserId;
        this.creationDate = creationDate;
        this.creationUser = creationUser;
        this.updateDate = updateDate;
        this.updateUser = updateUser;
        this.expirationDate = expirationDate;
    }

    public Integer getSharedId() {
        return sharedId;
    }

    public void setSharedId(Integer sharedId) {
        this.sharedId = sharedId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getAccId() {
        return accId;
    }

    public void setAccId(int accId) {
        this.accId = accId;
    }

    public boolean getIsOwnership() {
        return isOwnership;
    }

    public void setIsOwnership(boolean isOwnership) {
        this.isOwnership = isOwnership;
    }

    public int getSharedUserId() {
        return sharedUserId;
    }

    public void setSharedUserId(int sharedUserId) {
        this.sharedUserId = sharedUserId;
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
        hash += (sharedId != null ? sharedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClientsSharing)) {
            return false;
        }
        ClientsSharing other = (ClientsSharing) object;
        if ((this.sharedId == null && other.sharedId != null) || (this.sharedId != null && !this.sharedId.equals(other.sharedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.ClientsSharing[ sharedId=" + sharedId + " ]";
    }
    
}
