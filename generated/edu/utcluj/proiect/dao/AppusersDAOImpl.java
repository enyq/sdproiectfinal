package edu.utcluj.proiect.dao;

import edu.utcluj.proiect.domain.Appusers;

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
 * DAO to manage Appusers entities.
 * 
 */
@Repository("AppusersDAO")
@Transactional
public class AppusersDAOImpl extends AbstractJpaDao<Appusers> implements
		AppusersDAO {

	/**
	 * Set of entity classes managed by this DAO.  Typically a DAO manages a single entity.
	 *
	 */
	private final static Set<Class<?>> dataTypes = new HashSet<Class<?>>(Arrays.asList(new Class<?>[] { Appusers.class }));

	/**
	 * EntityManager injected by Spring for persistence unit MyEclipse_Derby
	 *
	 */
	@PersistenceContext(unitName = "MyEclipse_Derby")
	private EntityManager entityManager;

	/**
	 * Instantiates a new AppusersDAOImpl
	 *
	 */
	public AppusersDAOImpl() {
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
	 * JPQL Query - findAppusersByPhonenr
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByPhonenr(String phonenr) throws DataAccessException {

		return findAppusersByPhonenr(phonenr, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByPhonenr
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByPhonenr(String phonenr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByPhonenr", startResult, maxRows, phonenr);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByBirthdateBefore
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByBirthdateBefore(java.util.Calendar birthdate) throws DataAccessException {

		return findAppusersByBirthdateBefore(birthdate, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByBirthdateBefore
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByBirthdateBefore(java.util.Calendar birthdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByBirthdateBefore", startResult, maxRows, birthdate);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByPassword
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByPassword(String password) throws DataAccessException {

		return findAppusersByPassword(password, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByPassword
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByPassword(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByPassword", startResult, maxRows, password);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByPasswordContaining
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByPasswordContaining(String password) throws DataAccessException {

		return findAppusersByPasswordContaining(password, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByPasswordContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByPasswordContaining(String password, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByPasswordContaining", startResult, maxRows, password);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByAppuserid
	 *
	 */
	@Transactional
	public Appusers findAppusersByAppuserid(Integer appuserid) throws DataAccessException {

		return findAppusersByAppuserid(appuserid, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByAppuserid
	 *
	 */

	@Transactional
	public Appusers findAppusersByAppuserid(Integer appuserid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAppusersByAppuserid", startResult, maxRows, appuserid);
			return (edu.utcluj.proiect.domain.Appusers) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAppusersByUsername
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByUsername(String username) throws DataAccessException {

		return findAppusersByUsername(username, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByUsername
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByUsername(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByUsername", startResult, maxRows, username);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByEmailContaining
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByEmailContaining(String email) throws DataAccessException {

		return findAppusersByEmailContaining(email, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByEmailContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByEmailContaining", startResult, maxRows, email);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByPrimaryKey
	 *
	 */
	@Transactional
	public Appusers findAppusersByPrimaryKey(Integer appuserid) throws DataAccessException {

		return findAppusersByPrimaryKey(appuserid, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByPrimaryKey
	 *
	 */

	@Transactional
	public Appusers findAppusersByPrimaryKey(Integer appuserid, int startResult, int maxRows) throws DataAccessException {
		try {
			Query query = createNamedQuery("findAppusersByPrimaryKey", startResult, maxRows, appuserid);
			return (edu.utcluj.proiect.domain.Appusers) query.getSingleResult();
		} catch (NoResultException nre) {
			return null;
		}
	}

	/**
	 * JPQL Query - findAppusersByBirthdateAfter
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByBirthdateAfter(java.util.Calendar birthdate) throws DataAccessException {

		return findAppusersByBirthdateAfter(birthdate, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByBirthdateAfter
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByBirthdateAfter(java.util.Calendar birthdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByBirthdateAfter", startResult, maxRows, birthdate);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByPhonenrContaining
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByPhonenrContaining(String phonenr) throws DataAccessException {

		return findAppusersByPhonenrContaining(phonenr, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByPhonenrContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByPhonenrContaining(String phonenr, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByPhonenrContaining", startResult, maxRows, phonenr);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByAddressContaining
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByAddressContaining(String address) throws DataAccessException {

		return findAppusersByAddressContaining(address, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByAddressContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByAddressContaining", startResult, maxRows, address);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByUsernameContaining
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByUsernameContaining(String username) throws DataAccessException {

		return findAppusersByUsernameContaining(username, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByUsernameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByUsernameContaining(String username, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByUsernameContaining", startResult, maxRows, username);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAllAppuserss
	 *
	 */
	@Transactional
	public Set<Appusers> findAllAppuserss() throws DataAccessException {

		return findAllAppuserss(-1, -1);
	}

	/**
	 * JPQL Query - findAllAppuserss
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAllAppuserss(int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAllAppuserss", startResult, maxRows);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByEmail
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByEmail(String email) throws DataAccessException {

		return findAppusersByEmail(email, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByEmail
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByEmail(String email, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByEmail", startResult, maxRows, email);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByName
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByName(String name) throws DataAccessException {

		return findAppusersByName(name, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByName
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByName(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByName", startResult, maxRows, name);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByNameContaining
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByNameContaining(String name) throws DataAccessException {

		return findAppusersByNameContaining(name, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByNameContaining
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByNameContaining(String name, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByNameContaining", startResult, maxRows, name);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByBirthdate
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByBirthdate(java.util.Calendar birthdate) throws DataAccessException {

		return findAppusersByBirthdate(birthdate, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByBirthdate
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByBirthdate(java.util.Calendar birthdate, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByBirthdate", startResult, maxRows, birthdate);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * JPQL Query - findAppusersByAddress
	 *
	 */
	@Transactional
	public Set<Appusers> findAppusersByAddress(String address) throws DataAccessException {

		return findAppusersByAddress(address, -1, -1);
	}

	/**
	 * JPQL Query - findAppusersByAddress
	 *
	 */

	@SuppressWarnings("unchecked")
	@Transactional
	public Set<Appusers> findAppusersByAddress(String address, int startResult, int maxRows) throws DataAccessException {
		Query query = createNamedQuery("findAppusersByAddress", startResult, maxRows, address);
		return new LinkedHashSet<Appusers>(query.getResultList());
	}

	/**
	 * Used to determine whether or not to merge the entity or persist the entity when calling Store
	 * @see store
	 * 
	 *
	 */
	public boolean canBeMerged(Appusers entity) {
		return true;
	}
}
