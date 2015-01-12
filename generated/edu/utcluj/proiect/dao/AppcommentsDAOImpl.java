package edu.utcluj.proiect.dao;

import edu.utcluj.proiect.domain.Appcomments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.skyway.spring.util.dao.AbstractJpaDao;

import org.springframework.dao.DataAccessException;

import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;

/**
 * DAO to manage Appcomments entities.
 * 
 */
@Repository("AppcommentsDAO")
@Transactional
public class AppcommentsDAOImpl extends AbstractJpaDao<Appcomments> implements
		AppcommentsDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Appcomments.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MyEclipse_Derby
	 *
	 */
	@PersistenceContext(unitName = "MyEclipse_Derby")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AppcommentsDAOImpl
	 *
	 */
	public AppcommentsDAOImpl() {
		super();
	}

	/**
	 * Get the entity manager that manages persistence unit 
	 *
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * Returns the set of entity classes managed by this DAO.
	 *
	 */
	public Set<Class<?>> getTypes() {
		return dataTypes;
	}

	/**
	 * JPQL Query - findAppcommentsByCommentsdateAfter
	 *
	 */
	@Transactional
	public Set<Appcomments> findAppcommentsByCommentsdateAfter(java.util.Calendar commentsdate) throws DataAccessException {

		return findAppcommentsByCommentsdateAfter(commentsdate, -1, -1);
	}

	/**
	 * JPQL Query - findAppcommentsByCommentsdateAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appcomments> findAppcommentsByCommentsdateAfter(java.util.Calendar commentsdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppcommentsByCommentsdateAfter", startResult, maxRows, commentsdate);
		return new LinkedHashSet<Appcomments>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppcommentsByCommenttextContaining
	 *
	 */
	@Transactional
	public Set<Appcomments> findAppcommentsByCommenttextContaining(String commenttext) throws DataAccessException {

		return findAppcommentsByCommenttextContaining(commenttext, -1, -1);
	}

	/**
	 * JPQL Query - findAppcommentsByCommenttextContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appcomments> findAppcommentsByCommenttextContaining(String commenttext, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppcommentsByCommenttextContaining", startResult, maxRows, commenttext);
		return new LinkedHashSet<Appcomments>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppcommentsByCommentsdate
	 *
	 */
	@Transactional
	public Set<Appcomments> findAppcommentsByCommentsdate(java.util.Calendar commentsdate) throws DataAccessException {

		return findAppcommentsByCommentsdate(commentsdate, -1, -1);
	}

	/**
	 * JPQL Query - findAppcommentsByCommentsdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appcomments> findAppcommentsByCommentsdate(java.util.Calendar commentsdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppcommentsByCommentsdate", startResult, maxRows, commentsdate);
		return new LinkedHashSet<Appcomments>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllAppcommentss
	 *
	 */
	@Transactional
	public Set<Appcomments> findAllAppcommentss() throws DataAccessException {

		return findAllAppcommentss(-1, -1);
	}

	/**
	 * JPQL Query - findAllAppcommentss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appcomments> findAllAppcommentss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAppcommentss", startResult, maxRows);
		return new LinkedHashSet<Appcomments>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppcommentsByCommenttext
	 *
	 */
	@Transactional
	public Set<Appcomments> findAppcommentsByCommenttext(String commenttext) throws DataAccessException {

		return findAppcommentsByCommenttext(commenttext, -1, -1);
	}

	/**
	 * JPQL Query - findAppcommentsByCommenttext
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appcomments> findAppcommentsByCommenttext(String commenttext, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppcommentsByCommenttext", startResult, maxRows, commenttext);
		return new LinkedHashSet<Appcomments>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppcommentsByPrimaryKey
	 *
	 */
	@Transactional
	public Appcomments findAppcommentsByPrimaryKey(Integer appcommentsid) throws DataAccessException {

		return findAppcommentsByPrimaryKey(appcommentsid, -1, -1);
	}

	/**
	 * JPQL Query - findAppcommentsByPrimaryKey
	 *
	 */

	@Transactional
	public Appcomments findAppcommentsByPrimaryKey(Integer appcommentsid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAppcommentsByPrimaryKey", startResult, maxRows, appcommentsid);
			return (edu.utcluj.proiect.domain.Appcomments) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAppcommentsByCommentsdateBefore
	 *
	 */
	@Transactional
	public Set<Appcomments> findAppcommentsByCommentsdateBefore(java.util.Calendar commentsdate) throws DataAccessException {

		return findAppcommentsByCommentsdateBefore(commentsdate, -1, -1);
	}

	/**
	 * JPQL Query - findAppcommentsByCommentsdateBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appcomments> findAppcommentsByCommentsdateBefore(java.util.Calendar commentsdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppcommentsByCommentsdateBefore", startResult, maxRows, commentsdate);
		return new LinkedHashSet<Appcomments>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppcommentsByAppcommentsid
	 *
	 */
	@Transactional
	public Appcomments findAppcommentsByAppcommentsid(Integer appcommentsid) throws DataAccessException {

		return findAppcommentsByAppcommentsid(appcommentsid, -1, -1);
	}

	/**
	 * JPQL Query - findAppcommentsByAppcommentsid
	 *
	 */

	@Transactional
	public Appcomments findAppcommentsByAppcommentsid(Integer appcommentsid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAppcommentsByAppcommentsid", startResult, maxRows, appcommentsid);
			return (edu.utcluj.proiect.domain.Appcomments) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Appcomments entity) {
		return true;
	}
}
