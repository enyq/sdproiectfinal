package edu.utcluj.proiect.domain;

import java.io.Serializable;

import java.lang.StringBuilder;

import java.util.Calendar;
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
		@NamedQuery(name = "findAllAppcommentss", query = "select myAppcomments from Appcomments myAppcomments"),
		@NamedQuery(name = "findAppcommentsByAppcommentsid", query = "select myAppcomments from Appcomments myAppcomments where myAppcomments.appcommentsid = ?1"),
		@NamedQuery(name = "findAppcommentsByCommentsdate", query = "select myAppcomments from Appcomments myAppcomments where myAppcomments.commentsdate = ?1"),
		@NamedQuery(name = "findAppcommentsByCommentsdateAfter", query = "select myAppcomments from Appcomments myAppcomments where myAppcomments.commentsdate > ?1"),
		@NamedQuery(name = "findAppcommentsByCommentsdateBefore", query = "select myAppcomments from Appcomments myAppcomments where myAppcomments.commentsdate < ?1"),
		@NamedQuery(name = "findAppcommentsByCommenttext", query = "select myAppcomments from Appcomments myAppcomments where myAppcomments.commenttext = ?1"),
		@NamedQuery(name = "findAppcommentsByCommenttextContaining", query = "select myAppcomments from Appcomments myAppcomments where myAppcomments.commenttext like ?1"),
		@NamedQuery(name = "findAppcommentsByPrimaryKey", query = "select myAppcomments from Appcomments myAppcomments where myAppcomments.appcommentsid = ?1") })
@Table(schema = "APP", name = "APPCOMMENTS")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "ProiectSD2/edu/utcluj/proiect/domain", name = "Appcomments")
public class Appcomments implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 */

	@Column(name = "APPCOMMENTSID", nullable = false)
	@Basic(fetch = FetchType.EAGER)
	@Id
	@XmlElement
	Integer appcommentsid;
	/**
	 */

	@Column(name = "COMMENTTEXT", length = 100)
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	String commenttext;
	/**
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "COMMENTSDATE")
	@Basic(fetch = FetchType.EAGER)
	@XmlElement
	Calendar commentsdate;

	/**
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "PICTURECOMMENTED", referencedColumnName = "APPPICID") })
	@XmlTransient
	Apppic apppic;

	/**
	 */
	public void setAppcommentsid(Integer appcommentsid) {
		this.appcommentsid = appcommentsid;
	}

	/**
	 */
	public Integer getAppcommentsid() {
		return this.appcommentsid;
	}

	/**
	 */
	public void setCommenttext(String commenttext) {
		this.commenttext = commenttext;
	}

	/**
	 */
	public String getCommenttext() {
		return this.commenttext;
	}

	/**
	 */
	public void setCommentsdate(Calendar commentsdate) {
		this.commentsdate = commentsdate;
	}

	/**
	 */
	public Calendar getCommentsdate() {
		return this.commentsdate;
	}

	/**
	 */
	public void setApppic(Apppic apppic) {
		this.apppic = apppic;
	}

	/**
	 */
	public Apppic getApppic() {
		return apppic;
	}

	/**
	 */
	public Appcomments() {
	}

	/**
	 * Copies the contents of the specified bean into this bean.
	 *
	 */
	public void copy(Appcomments that) {
		setAppcommentsid(that.getAppcommentsid());
		setCommenttext(that.getCommenttext());
		setCommentsdate(that.getCommentsdate());
		setApppic(that.getApppic());
	}

	/**
	 * Returns a textual representation of a bean.
	 *
	 */
	public String toString() {

		StringBuilder buffer = new StringBuilder();

		buffer.append("appcommentsid=[").append(appcommentsid).append("] ");
		buffer.append("commenttext=[").append(commenttext).append("] ");
		buffer.append("commentsdate=[").append(commentsdate).append("] ");

		return buffer.toString();
	}

	/**
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (int) (prime * result + ((appcommentsid == null) ? 0 : appcommentsid.hashCode()));
		return result;
	}

	/**
	 */
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!(obj instanceof Appcomments))
			return false;
		Appcomments equalCheck = (Appcomments) obj;
		if ((appcommentsid == null && equalCheck.appcommentsid != null) || (appcommentsid != null && equalCheck.appcommentsid == null))
			return false;
		if (appcommentsid != null && !appcommentsid.equals(equalCheck.appcommentsid))
			return false;
		return true;
	}
}
