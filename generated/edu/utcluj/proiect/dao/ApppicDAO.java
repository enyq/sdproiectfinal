package edu.utcluj.proiect.dao;

import edu.utcluj.proiect.domain.Apppic;

import java.util.Set;

import org.skyway.spring.util.dao.JpaDao;

import org.springframework.dao.DataAccessException;

/**
 * DAO to manage Apppic entities.
 * 
 */
public interface ApppicDAO extends JpaDao<Apppic> {

	/**
	 * JPQL Query - findApppicByApppicid
	 *
	 */
	public Apppic findApppicByApppicid(Integer apppicid) throws DataAccessException;

	/**
	 * JPQL Query - findApppicByApppicid
	 *
	 */
	public Apppic findApppicByApppicid(Integer apppicid, int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findAllApppics
	 *
	 */
	public Set<Apppic> findAllApppics() throws DataAccessException;

	/**
	 * JPQL Query - findAllApppics
	 *
	 */
	public Set<Apppic> findAllApppics(int startResult, int maxRows) throws DataAccessException;

	/**
	 * JPQL Query - findApppicByPrimaryKey
	 *
	 */
	public Apppic findApppicByPrimaryKey(Integer apppicid_1) throws DataAccessException;

	/**
	 * JPQL Query - findApppicByPrimaryKey
	 *
	 */
	public Apppic findApppicByPrimaryKey(Integer apppicid_1, int startResult, int maxRows) throws DataAccessException;

}