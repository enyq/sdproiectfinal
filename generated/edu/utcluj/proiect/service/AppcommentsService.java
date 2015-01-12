package edu.utcluj.proiect.service;

import edu.utcluj.proiect.domain.Appcomments;
import edu.utcluj.proiect.domain.Apppic;

import java.util.List;
import java.util.Set;

/**
 * Spring service that handles CRUD requests for Appcomments entities
 * 
 */
public interface AppcommentsService {

	/**
	 * Delete an existing Apppic entity
	 * 
	 */
	public Appcomments deleteAppcommentsApppic(Integer appcomments_appcommentsid, Integer related_apppic_apppicid);

	/**
	 * Load an existing Appcomments entity
	 * 
	 */
	public Set<Appcomments> loadAppcommentss();

	/**
	 * Delete an existing Appcomments entity
	 * 
	 */
	public void deleteAppcomments(Appcomments appcomments);

	/**
	 */
	public Appcomments findAppcommentsByPrimaryKey(Integer appcommentsid);

	/**
	 * Save an existing Appcomments entity
	 * 
	 */
	public void saveAppcomments(Appcomments appcomments_1);

	/**
	 * Save an existing Apppic entity
	 * 
	 */
	public Appcomments saveAppcommentsApppic(Integer appcommentsid_1, Apppic related_apppic);

	/**
	 * Return a count of all Appcomments entity
	 * 
	 */
	public Integer countAppcommentss();

	/**
	 * Return all Appcomments entity
	 * 
	 */
	public List<Appcomments> findAllAppcommentss(Integer startResult, Integer maxRows);
}