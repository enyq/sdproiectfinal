package edu.utcluj.proiect.service;

import edu.utcluj.proiect.dao.AppcommentsDAO;
import edu.utcluj.proiect.dao.ApppicDAO;

import edu.utcluj.proiect.domain.Appcomments;
import edu.utcluj.proiect.domain.Apppic;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Appcomments entities
 * 
 */

@Service("AppcommentsService")
@Transactional
public class AppcommentsServiceImpl implements AppcommentsService {

	/**
	 * DAO injected by Spring that manages Appcomments entities
	 * 
	 */
	@Autowired
	private AppcommentsDAO appcommentsDAO;

	/**
	 * DAO injected by Spring that manages Apppic entities
	 * 
	 */
	@Autowired
	private ApppicDAO apppicDAO;

	/**
	 * Instantiates a new AppcommentsServiceImpl.
	 *
	 */
	public AppcommentsServiceImpl() {
	}

	/**
	 * Delete an existing Apppic entity
	 * 
	 */
	@Transactional
	public Appcomments deleteAppcommentsApppic(Integer appcomments_appcommentsid, Integer related_apppic_apppicid) {
		Appcomments appcomments = appcommentsDAO.findAppcommentsByPrimaryKey(appcomments_appcommentsid, -1, -1);
		Apppic related_apppic = apppicDAO.findApppicByPrimaryKey(related_apppic_apppicid, -1, -1);

		appcomments.setApppic(null);
		related_apppic.getAppcommentses().remove(appcomments);
		appcomments = appcommentsDAO.store(appcomments);
		appcommentsDAO.flush();

		related_apppic = apppicDAO.store(related_apppic);
		apppicDAO.flush();

		apppicDAO.remove(related_apppic);
		apppicDAO.flush();

		return appcomments;
	}

	/**
	 * Load an existing Appcomments entity
	 * 
	 */
	@Transactional
	public Set<Appcomments> loadAppcommentss() {
		return appcommentsDAO.findAllAppcommentss();
	}

	/**
	 * Delete an existing Appcomments entity
	 * 
	 */
	@Transactional
	public void deleteAppcomments(Appcomments appcomments) {
		appcommentsDAO.remove(appcomments);
		appcommentsDAO.flush();
	}

	/**
	 */
	@Transactional
	public Appcomments findAppcommentsByPrimaryKey(Integer appcommentsid) {
		return appcommentsDAO.findAppcommentsByPrimaryKey(appcommentsid);
	}

	/**
	 * Save an existing Appcomments entity
	 * 
	 */
	@Transactional
	public void saveAppcomments(Appcomments appcomments) {
		Appcomments existingAppcomments = appcommentsDAO.findAppcommentsByPrimaryKey(appcomments.getAppcommentsid());

		if (existingAppcomments != null) {
			if (existingAppcomments != appcomments) {
				existingAppcomments.setAppcommentsid(appcomments.getAppcommentsid());
				existingAppcomments.setCommenttext(appcomments.getCommenttext());
				existingAppcomments.setCommentsdate(appcomments.getCommentsdate());
			}
			appcomments = appcommentsDAO.store(existingAppcomments);
		} else {
			appcomments = appcommentsDAO.store(appcomments);
		}
		appcommentsDAO.flush();
	}

	/**
	 * Save an existing Apppic entity
	 * 
	 */
	@Transactional
	public Appcomments saveAppcommentsApppic(Integer appcommentsid, Apppic related_apppic) {
		Appcomments appcomments = appcommentsDAO.findAppcommentsByPrimaryKey(appcommentsid, -1, -1);
		Apppic existingapppic = apppicDAO.findApppicByPrimaryKey(related_apppic.getApppicid());

		// copy into the existing record to preserve existing relationships
		if (existingapppic != null) {
			existingapppic.setApppicid(related_apppic.getApppicid());
			existingapppic.setApppicField(related_apppic.getApppicField());
			related_apppic = existingapppic;
		} else {
			related_apppic = apppicDAO.store(related_apppic);
			apppicDAO.flush();
		}

		appcomments.setApppic(related_apppic);
		related_apppic.getAppcommentses().add(appcomments);
		appcomments = appcommentsDAO.store(appcomments);
		appcommentsDAO.flush();

		related_apppic = apppicDAO.store(related_apppic);
		apppicDAO.flush();

		return appcomments;
	}

	/**
	 * Return a count of all Appcomments entity
	 * 
	 */
	@Transactional
	public Integer countAppcommentss() {
		return ((Long) appcommentsDAO.createQuerySingleResult("select count(o) from Appcomments o").getSingleResult()).intValue();
	}

	/**
	 * Return all Appcomments entity
	 * 
	 */
	@Transactional
	public List<Appcomments> findAllAppcommentss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Appcomments>(appcommentsDAO.findAllAppcommentss(startResult, maxRows));
	}
}
