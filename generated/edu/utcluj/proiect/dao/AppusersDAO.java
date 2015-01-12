package edu.utcluj.proiect.dao;

import edu.utcluj.proiect.domain.Appusers;

import java.util.Calendar;
import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Appusers entities.
 * 
 */
public interface AppusersDAO extends JpaDao<Appusers> {

	/**
	 * JPQL Query - findAppusersByPhonenr
	 *
	 */
	public Set<Appusers> findAppusersByPhonenr(String phonenr) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByPhonenr
	 *
	 */
	public Set<Appusers> findAppusersByPhonenr(String phonenr, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByBirthdateBefore
	 *
	 */
	public Set<Appusers> findAppusersByBirthdateBefore(java.util.Calendar birthdate) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByBirthdateBefore
	 *
	 */
	public Set<Appusers> findAppusersByBirthdateBefore(Calendar birthdate, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByPassword
	 *
	 */
	public Set<Appusers> findAppusersByPassword(String password) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByPassword
	 *
	 */
	public Set<Appusers> findAppusersByPassword(String password, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByPasswordContaining
	 *
	 */
	public Set<Appusers> findAppusersByPasswordContaining(String password_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByPasswordContaining
	 *
	 */
	public Set<Appusers> findAppusersByPasswordContaining(String password_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByAppuserid
	 *
	 */
	public Appusers findAppusersByAppuserid(Integer appuserid) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByAppuserid
	 *
	 */
	public Appusers findAppusersByAppuserid(Integer appuserid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByUsername
	 *
	 */
	public Set<Appusers> findAppusersByUsername(String username) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByUsername
	 *
	 */
	public Set<Appusers> findAppusersByUsername(String username, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByEmailContaining
	 *
	 */
	public Set<Appusers> findAppusersByEmailContaining(String email) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByEmailContaining
	 *
	 */
	public Set<Appusers> findAppusersByEmailContaining(String email, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByPrimaryKey
	 *
	 */
	public Appusers findAppusersByPrimaryKey(Integer appuserid_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByPrimaryKey
	 *
	 */
	public Appusers findAppusersByPrimaryKey(Integer appuserid_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByBirthdateAfter
	 *
	 */
	public Set<Appusers> findAppusersByBirthdateAfter(java.util.Calendar birthdate_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByBirthdateAfter
	 *
	 */
	public Set<Appusers> findAppusersByBirthdateAfter(Calendar birthdate_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByPhonenrContaining
	 *
	 */
	public Set<Appusers> findAppusersByPhonenrContaining(String phonenr_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByPhonenrContaining
	 *
	 */
	public Set<Appusers> findAppusersByPhonenrContaining(String phonenr_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByAddressContaining
	 *
	 */
	public Set<Appusers> findAppusersByAddressContaining(String address) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByAddressContaining
	 *
	 */
	public Set<Appusers> findAppusersByAddressContaining(String address, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByUsernameContaining
	 *
	 */
	public Set<Appusers> findAppusersByUsernameContaining(String username_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByUsernameContaining
	 *
	 */
	public Set<Appusers> findAppusersByUsernameContaining(String username_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllAppuserss
	 *
	 */
	public Set<Appusers> findAllAppuserss() throws DataAccessException;

	/**
	 * JPQL Query - findAllAppuserss
	 *
	 */
	public Set<Appusers> findAllAppuserss(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByEmail
	 *
	 */
	public Set<Appusers> findAppusersByEmail(String email_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByEmail
	 *
	 */
	public Set<Appusers> findAppusersByEmail(String email_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByName
	 *
	 */
	public Set<Appusers> findAppusersByName(String name) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByName
	 *
	 */
	public Set<Appusers> findAppusersByName(String name, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByNameContaining
	 *
	 */
	public Set<Appusers> findAppusersByNameContaining(String name_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByNameContaining
	 *
	 */
	public Set<Appusers> findAppusersByNameContaining(String name_1, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByBirthdate
	 *
	 */
	public Set<Appusers> findAppusersByBirthdate(java.util.Calendar birthdate_2) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByBirthdate
	 *
	 */
	public Set<Appusers> findAppusersByBirthdate(Calendar birthdate_2, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByAddress
	 *
	 */
	public Set<Appusers> findAppusersByAddress(String address_1) throws DataAccessException;

	/**
	 * JPQL Query - findAppusersByAddress
	 *
	 */
	public Set<Appusers> findAppusersByAddress(String address_1, int startResult, int maxRows) throws DataAccessException;

}