package edu.utcluj.proiect.dao;

import edu.utcluj.proiect.domain.Appcomments;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Appcomments entities.
 * 
 */
public interface AppcommentsDAO extends JpaDao<Appcomments> {

	/**
	 * JPQL Query - findAppcommentsByCommentsdateAfter
	 *
	 */
	public Set<Appcomments> findAppcommentsByCommentsdateAfter(java.util.Calendar commentsdate) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByCommentsdateAfter
	 *
	 */
	public Set<Appcomments> findAppcommentsByCommentsdateAfter(Calendar commentsdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByCommenttextContaining
	 *
	 */
	public Set<Appcomments> findAppcommentsByCommenttextContaining(String commenttext) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByCommenttextContaining
	 *
	 */
	public Set<Appcomments> findAppcommentsByCommenttextContaining(String commenttext, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByCommentsdate
	 *
	 */
	public Set<Appcomments> findAppcommentsByCommentsdate(java.util.Calendar commentsdate_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByCommentsdate
	 *
	 */
	public Set<Appcomments> findAppcommentsByCommentsdate(Calendar commentsdate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAppcommentss
	 *
	 */
	public Set<Appcomments> findAllAppcommentss() throws DataAccessException;

	/**
	 * JPQL Query - findAllAppcommentss
	 *
	 */
	public Set<Appcomments> findAllAppcommentss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByCommenttext
	 *
	 */
	public Set<Appcomments> findAppcommentsByCommenttext(String commenttext_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByCommenttext
	 *
	 */
	public Set<Appcomments> findAppcommentsByCommenttext(String commenttext_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByPrimaryKey
	 *
	 */
	public Appcomments findAppcommentsByPrimaryKey(Integer appcommentsid) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByPrimaryKey
	 *
	 */
	public Appcomments findAppcommentsByPrimaryKey(Integer appcommentsid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByCommentsdateBefore
	 *
	 */
	public Set<Appcomments> findAppcommentsByCommentsdateBefore(java.util.Calendar commentsdate_2) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByCommentsdateBefore
	 *
	 */
	public Set<Appcomments> findAppcommentsByCommentsdateBefore(Calendar commentsdate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByAppcommentsid
	 *
	 */
	public Appcomments findAppcommentsByAppcommentsid(Integer appcommentsid_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppcommentsByAppcommentsid
	 *
	 */
	public Appcomments findAppcommentsByAppcommentsid(Integer appcommentsid_1, int startResult, int maxRows) throws DataAccessException;

}