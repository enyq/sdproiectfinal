package edu.utcluj.proiect.dao;

import edu.utcluj.proiect.domain.Apppic;

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
 * DAO to manage Apppic entities.
 * 
 */
@Repository("ApppicDAO")
@Transactional
public class ApppicDAOImpl extends AbstractJpaDao<Apppic> implements ApppicDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Apppic.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MyEclipse_Derby
	 *
	 */
	@PersistenceContext(unitName = "MyEclipse_Derby")
	private EntityManager entityManager;

	/**
	 * Instantiates a new ApppicDAOImpl
	 *
	 */
	public ApppicDAOImpl() {
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
	 * JPQL Query - findApppicByApppicid
	 *
	 */
	@Transactional
	public Apppic findApppicByApppicid(Integer apppicid) throws DataAccessException {

		return findApppicByApppicid(apppicid, -1, -1);
	}

	/**
	 * JPQL Query - findApppicByApppicid
	 *
	 */

	@Transactional
	public Apppic findApppicByApppicid(Integer apppicid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findApppicByApppicid", startResult, maxRows, apppicid);
			return (edu.utcluj.proiect.domain.Apppic) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAllApppics
	 *
	 */
	@Transactional
	public Set<Apppic> findAllApppics() throws DataAccessException {

		return findAllApppics(-1, -1);
	}

	/**
	 * JPQL Query - findAllApppics
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Apppic> findAllApppics(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllApppics", startResult, maxRows);
		return new LinkedHashSet<Apppic>(query.getResultList());
	}

	/**
	 * JPQL Query - findApppicByPrimaryKey
	 *
	 */
	@Transactional
	public Apppic findApppicByPrimaryKey(Integer apppicid) throws DataAccessException {

		return findApppicByPrimaryKey(apppicid, -1, -1);
	}

	/**
	 * JPQL Query - findApppicByPrimaryKey
	 *
	 */

	@Transactional
	public Apppic findApppicByPrimaryKey(Integer apppicid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findApppicByPrimaryKey", startResult, maxRows, apppicid);
			return (edu.utcluj.proiect.domain.Apppic) query.getSingleResult();
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
	public boolean canBeMerged(Apppic entity) {
		return true;
	}
}
