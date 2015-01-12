package edu.utcluj.proiect.service;

import edu.utcluj.proiect.domain.Apppic;
import edu.utcluj.proiect.domain.Appusers;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Appusers entities
 * 
 */
public interface AppusersService {

	/**
	 * Delete an existing Appusers entity
	 * 
	 */
	public void deleteAppusers(Appusers appusers);

	/**
	 * Delete an existing Apppic entity
	 * 
	 */
	public Appusers deleteAppusersApppics(Integer appusers_appuserid, Integer related_apppics_apppicid);

	/**
	 * Save an existing Apppic entity
	 * 
	 */
	public Appusers saveAppusersApppics(Integer appuserid, Apppic related_apppics);

	/**
	 * Return a count of all Appusers entity
	 * 
	 */
	public Integer countAppuserss();

	/**
	 */
	public Appusers findAppusersByPrimaryKey(Integer appuserid_1);

	/**
	 * Save an existing Appusers entity
	 * 
	 */
	public void saveAppusers(Appusers appusers_1);

	/**
	 * Return all Appusers entity
	 * 
	 */
	public List<Appusers> findAllAppuserss(Integer startResult, Integer maxRows);

	/**
	 * Load an existing Appusers entity
	 * 
	 */
	public Set<Appusers> loadAppuserss();
}