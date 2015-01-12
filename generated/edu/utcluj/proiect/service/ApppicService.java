package edu.utcluj.proiect.service;

import edu.utcluj.proiect.domain.Appcomments;
import edu.utcluj.proiect.domain.Apppic;
import edu.utcluj.proiect.domain.Appusers;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Apppic entities
 * 
 */
public interface ApppicService {

	/**
	 * Return a count of all Apppic entity
	 * 
	 */
	public Integer countApppics();

	/**
	 * Delete an existing Appusers entity
	 * 
	 */
	public Apppic deleteApppicAppusers(Integer apppic_apppicid, Integer related_appusers_appuserid);

	/**
	 * Save an existing Appcomments entity
	 * 
	 */
	public Apppic saveApppicAppcommentses(Integer apppicid, Appcomments related_appcommentses);

	/**
	 * Delete an existing Appcomments entity
	 * 
	 */
	public Apppic deleteApppicAppcommentses(Integer apppic_apppicid_1, Integer related_appcommentses_appcommentsid);

	/**
	 * Delete an existing Apppic entity
	 * 
	 */
	public void deleteApppic(Apppic apppic);

	/**
	 * Load an existing Apppic entity
	 * 
	 */
	public Set<Apppic> loadApppics();

	/**
	 * Return all Apppic entity
	 * 
	 */
	public List<Apppic> findAllApppics(Integer startResult, Integer maxRows);

	/**
	 */
	public Apppic findApppicByPrimaryKey(Integer apppicid_1);

	/**
	 * Save an existing Appusers entity
	 * 
	 */
	public Apppic saveApppicAppusers(Integer apppicid_2, Appusers related_appusers);

	/**
	 * Save an existing Apppic entity
	 * 
	 */
	public void saveApppic(Apppic apppic_1);
}