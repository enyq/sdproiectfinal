package edu.utcluj.proiect.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

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
		@NamedQuery(name = "findAllApppics", query = "select myApppic from Apppic myApppic"),
		@NamedQuery(name = "findApppicByApppicid", query = "select myApppic from Apppic myApppic where myApppic.apppicid = ?1"),
		@NamedQuery(name = "findApppicByPrimaryKey", query = "select myApppic from Apppic myApppic where myApppic.apppicid = ?1") })
@Table(schema = "APP", name = "APPPIC")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ProiectSD2/edu/utcluj/proiect/domain", name = "Apppic")
@XmlRootElement(namespace = "ProiectSD2/edu/utcluj/proiect/domain")
public class Apppic implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "APPPICID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer apppicid;
	/**
	 */

	@Column(name = "APPPIC")
	@Basic(fetch = FetchType.EAGER)
	@Lob
	@XmlElement
	byte[] apppicField;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "OWNERID", referencedColumnName = "APPUSERID") })
	@XmlTransient
	Appusers appusers;
	/**
	 */
	@OneToMany(mappedBy = "apppic", cascade = { CascadeType.REMOVE }, fetch = FetchType.LAZY)
	@XmlElement(name = "", namespace = "")
	java.util.Set<edu.utcluj.proiect.domain.Appcomments> appcommentses;

	/**
	 */
	public void setApppicid(Integer apppicid) {
		this.apppicid = apppicid;
	}

	/**
	 */
	public Integer getApppicid() {
		return this.apppicid;
	}

	/**
	 */
	public void setApppicField(byte[] apppicField) {
		this.apppicField = apppicField;
	}

	/**
	 */
	public byte[] getApppicField() {
		return this.apppicField;
	}

	/**
	 */
	public void setAppusers(Appusers appusers) {
		this.appusers = appusers;
	}

	/**
	 */
	public Appusers getAppusers() {
		return appusers;
	}

	/**
	 */
	public void setAppcommentses(Set<Appcomments> appcommentses) {
		this.appcommentses = appcommentses;
	}

	/**
	 */
	public Set<Appcomments> getAppcommentses() {
		if (appcommentses == null) {
			appcommentses = new java.util.LinkedHashSet<edu.utcluj.proiect.domain.Appcomments>();
		}
		return appcommentses;
	}

	/**
	 */
	public Apppic() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Apppic that) {
		setApppicid(that.getApppicid());
		setApppicField(that.getApppicField());
		setAppusers(that.getAppusers());
		setAppcommentses(new java.util.LinkedHashSet<edu.utcluj.proiect.domain.Appcomments>(that.getAppcommentses()));
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("apppicid=[").append(apppicid).append("] ");
		buffer.append("apppicField=[").append(apppicField).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((apppicid == null) ? 0 : apppicid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Apppic))
			return false;
		Apppic equalCheck = (Apppic) obj;
		if ((apppicid == null && equalCheck.apppicid != null) || (apppicid != null && equalCheck.apppicid == null))
			return false;
		if (apppicid != null && !apppicid.equals(equalCheck.apppicid))
			return false;
		return true;
	}
}
