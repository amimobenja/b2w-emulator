/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ke.co.telkom.www.Bank2WalletEmulator.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author baamimo
 */
@Entity
@Table(name = "B2W_RESPONSE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "B2WResponse.findAll", query = "SELECT b FROM B2WResponse b")
    , @NamedQuery(name = "B2WResponse.findByRid", query = "SELECT b FROM B2WResponse b WHERE b.rid = :rid")
    , @NamedQuery(name = "B2WResponse.findByUsername", query = "SELECT b FROM B2WResponse b WHERE b.username = :username")
    , @NamedQuery(name = "B2WResponse.findByCompletionTime", query = "SELECT b FROM B2WResponse b WHERE b.completionTime = :completionTime")
    , @NamedQuery(name = "B2WResponse.findByTerminaltype", query = "SELECT b FROM B2WResponse b WHERE b.terminaltype = :terminaltype")
    , @NamedQuery(name = "B2WResponse.findByFunction", query = "SELECT b FROM B2WResponse b WHERE b.function = :function")
    , @NamedQuery(name = "B2WResponse.findByUserid", query = "SELECT b FROM B2WResponse b WHERE b.userid = :userid")
    , @NamedQuery(name = "B2WResponse.findByPassword", query = "SELECT b FROM B2WResponse b WHERE b.password = :password")})
public class B2WResponse implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "RID")
    private BigDecimal rid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "USERNAME")
    private String username;
    @Size(max = 20)
    @Column(name = "COMPLETION_TIME")
    private String completionTime;
    @Size(max = 20)
    @Column(name = "TERMINALTYPE")
    private String terminaltype;
    @Lob
    @Column(name = "MESSAGE")
    private String message;
    @Size(max = 20)
    @Column(name = "FUNCTION")
    private String function;
    @Size(max = 20)
    @Column(name = "USERID")
    private String userid;
    @Size(max = 250)
    @Column(name = "PASSWORD")
    private String password;
    @Lob
    @Column(name = "ALLPARAM")
    private String allparam;

    public B2WResponse() {
    }

    public B2WResponse(BigDecimal rid) {
        this.rid = rid;
    }

    public B2WResponse(BigDecimal rid, String username) {
        this.rid = rid;
        this.username = username;
    }

    public BigDecimal getRid() {
        return rid;
    }

    public void setRid(BigDecimal rid) {
        this.rid = rid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompletionTime() {
        return completionTime;
    }

    public void setCompletionTime(String completionTime) {
        this.completionTime = completionTime;
    }

    public String getTerminaltype() {
        return terminaltype;
    }

    public void setTerminaltype(String terminaltype) {
        this.terminaltype = terminaltype;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAllparam() {
        return allparam;
    }

    public void setAllparam(String allparam) {
        this.allparam = allparam;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rid != null ? rid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof B2WResponse)) {
            return false;
        }
        B2WResponse other = (B2WResponse) object;
        if ((this.rid == null && other.rid != null) || (this.rid != null && !this.rid.equals(other.rid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ke.co.telkom.www.Bank2WalletEmulator.entities.B2WResponse[ rid=" + rid + " ]";
    }
    
}
