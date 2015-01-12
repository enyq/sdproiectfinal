package edu.utcluj.proiect.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import javax.xml.bind.annotation.*;

import javax.persistence.*;

/**
 */

@Entity
@NamedQueries({
		@NamedQuery(name = "findAllAppuserss", query = "select myAppusers from Appusers myAppusers"),
		@NamedQuery(name = "findAppusersByAddress", query = "select myAppusers from Appusers myAppusers where myAppusers.address = ?1"),
		@NamedQuery(name = "findAppusersByAddressContaining", query = "select myAppusers from Appusers myAppusers where myAppusers.address like ?1"),
		@NamedQuery(name = "findAppusersByAppuserid", query = "select myAppusers from Appusers myAppusers where myAppusers.appuserid = ?1"),
		@NamedQuery(name = "findAppusersByBirthdate", query = "select myAppusers from Appusers myAppusers where myAppusers.birthdate = ?1"),
		@NamedQuery(name = "findAppusersByBirthdateAfter", query = "select myAppusers from Appusers myAppusers where myAppusers.birthdate > ?1"),
		@NamedQuery(name = "findAppusersByBirthdateBefore", query = "select myAppusers from Appusers myAppusers where myAppusers.birthdate < ?1"),
		@NamedQuery(name = "findAppusersByEmail", query = "select myAppusers from Appusers myAppusers where myAppusers.email = ?1"),
		@NamedQuery(name = "findAppusersByEmailContaining", query = "select myAppusers from Appusers myAppusers where myAppusers.email like ?1"),
		@NamedQuery(name = "findAppusersByName", query = "select myAppusers from Appusers myAppusers where myAppusers.name = ?1"),
		@NamedQuery(name = "findAppusersByNameContaining", query = "select myAppusers from Appusers myAppusers where myAppusers.name like ?1"),
		@NamedQuery(name = "findAppusersByPassword", query = "select myAppusers from Appusers myAppusers where myAppusers.password = ?1"),
		@NamedQuery(name = "findAppusersByPasswordContaining", query = "select myAppusers from Appusers myAppusers where myAppusers.password like ?1"),
		@NamedQuery(name = "findAppusersByPhonenr", query = "select myAppusers from Appusers myAppusers where myAppusers.phonenr = ?1"),
		@NamedQuery(name = "findAppusersByPhonenrContaining", query = "select myAppusers from Appusers myAppusers where myAppusers.phonenr like ?1"),
		@NamedQuery(name = "findAppusersByPrimaryKey", query = "select myAppusers from Appusers myAppusers where myAppusers.appuserid = ?1"),
		@NamedQuery(name = "findAppusersByUsername", query = "select myAppusers from Appusers myAppusers where myAppusers.username = ?1"),
		@NamedQuery(name = "findAppusersByUsernameContaining", query = "select myAppusers from Appusers myAppusers where myAppusers.username like ?1") })
@Table(schema = "APP", name = "APPUSERS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ProiectSD2/edu/utcluj/proiect/domain", name = "Appusers")
@XmlRootElement(namespace = "ProiectSD2/edu/utcluj/proiect/domain")
public class Appusers implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "APPUSERID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer appuserid;
	/**
	 */

	@Column(name = "NAME", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String name;
	/**
	 */

	@Column(name = "USERNAME", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String username;
	/**
	 */

	@Column(name = "PASSWORD", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String password;
	/**
	 */

	@Column(name = "ADDRESS", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String address;
	/**
	 */

	@Column(name = "EMAIL", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String email;
	/**
	 */

	@Column(name = "PHONENR", length = 45)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String phonenr;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "BIRTHDATE")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar birthdate;

	/**
	 */
	@OneToMany(mappedBy = "appusers", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.utcluj.proiect.domain.Apppic> apppics;

	/**
	 */
	public void setAppuserid(Integer appuserid) {
		this.appuserid = appuserid;
	}

	/**
	 */
	public Integer getAppuserid() {
		return this.appuserid;
	}

	/**
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 */
	public String getName() {
		return this.name;
	}

	/**
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 */
	public String getUsername() {
		return this.username;
	}

	/**
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 */
	public void setPhonenr(String phonenr) {
		this.phonenr = phonenr;
	}

	/**
	 */
	public String getPhonenr() {
		return this.phonenr;
	}

	/**
	 */
	public void setBirthdate(Calendar birthdate) {
		this.birthdate = birthdate;
	}

	/**
	 */
	public Calendar getBirthdate() {
		return this.birthdate;
	}

	/**
	 */
	public void setApppics(Set<Apppic> apppics) {
		this.apppics = apppics;
	}

	/**
	 */
	public Set<Apppic> getApppics() {
		if (apppics == null) {
			apppics = new java.util.LinkedHashSet<edu.utcluj.proiect.domain.Apppic>();
		}
		return apppics;
	}

	/**
	 */
	public Appusers() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Appusers that) {
		setAppuserid(that.getAppuserid());
		setName(that.getName());
		setUsername(that.getUsername());
		setPassword(that.getPassword());
		setAddress(that.getAddress());
		setEmail(that.getEmail());
		setPhonenr(that.getPhonenr());
		setBirthdate(that.getBirthdate());
		setApppics(new java.util.LinkedHashSet<edu.utcluj.proiect.domain.Apppic>(that.getApppics()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("appuserid=[").append(appuserid).append("] ");
		buffer.append("name=[").append(name).append("] ");
		buffer.append("username=[").append(username).append("] ");
		buffer.append("password=[").append(password).append("] ");
		buffer.append("address=[").append(address).append("] ");
		buffer.append("email=[").append(email).append("] ");
		buffer.append("phonenr=[").append(phonenr).append("] ");
		buffer.append("birthdate=[").append(birthdate).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((appuserid == null) ? 0 : appuserid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Appusers))
			return false;
		Appusers equalCheck = (Appusers) obj;
		if ((appuserid == null && equalCheck.appuserid != null) || (appuserid != null && equalCheck.appuserid == null))
			return false;
		if (appuserid != null && !appuserid.equals(equalCheck.appuserid))
			return false;
		return true;
	}
}
