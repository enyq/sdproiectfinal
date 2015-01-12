package edu.utcluj.proiect.service;

import edu.utcluj.proiect.dao.AppcommentsDAO;
import edu.utcluj.proiect.dao.ApppicDAO;
import edu.utcluj.proiect.dao.AppusersDAO;

import edu.utcluj.proiect.domain.Appcomments;
import edu.utcluj.proiect.domain.Apppic;
import edu.utcluj.proiect.domain.Appusers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Apppic entities
 * 
 */

@Service("ApppicService")
@Transactional
public class ApppicServiceImpl implements ApppicService {

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
	 * DAO injected by Spring that manages Appusers entities
	 * 
	 */
	@Autowired
	private AppusersDAO appusersDAO;

	/**
	 * Instantiates a new ApppicServiceImpl.
	 *
	 */
	public ApppicServiceImpl() {
	}

	/**
	 * Return a count of all Apppic entity
	 * 
	 */
	@Transactional
	public Integer countApppics() {
		return ((Long) apppicDAO.createQuerySingleResult("select count(o) from Apppic o").getSingleResult()).intValue();
	}

	/**
	 * Delete an existing Appusers entity
	 * 
	 */
	@Transactional
	public Apppic deleteApppicAppusers(Integer apppic_apppicid, Integer related_appusers_appuserid) {
		Apppic apppic = apppicDAO.findApppicByPrimaryKey(apppic_apppicid, -1, -1);
		Appusers related_appusers = appusersDAO.findAppusersByPrimaryKey(related_appusers_appuserid, -1, -1);

		apppic.setAppusers(null);
		related_appusers.getApppics().remove(apppic);
		apppic = apppicDAO.store(apppic);
		apppicDAO.flush();

		related_appusers = appusersDAO.store(related_appusers);
		appusersDAO.flush();

		appusersDAO.remove(related_appusers);
		appusersDAO.flush();

		return apppic;
	}

	/**
	 * Save an existing Appcomments entity
	 * 
	 */
	@Transactional
	public Apppic saveApppicAppcommentses(Integer apppicid, Appcomments related_appcommentses) {
		Apppic apppic = apppicDAO.findApppicByPrimaryKey(apppicid, -1, -1);
		Appcomments existingappcommentses = appcommentsDAO.findAppcommentsByPrimaryKey(related_appcommentses.getAppcommentsid());

		// copy into the existing record to preserve existing relationships
		if (existingappcommentses != null) {
			existingappcommentses.setAppcommentsid(related_appcommentses.getAppcommentsid());
			existingappcommentses.setCommenttext(related_appcommentses.getCommenttext());
			existingappcommentses.setCommentsdate(related_appcommentses.getCommentsdate());
			related_appcommentses = existingappcommentses;
		} else {
			related_appcommentses = appcommentsDAO.store(related_appcommentses);
			appcommentsDAO.flush();
		}

		related_appcommentses.setApppic(apppic);
		apppic.getAppcommentses().add(related_appcommentses);
		related_appcommentses = appcommentsDAO.store(related_appcommentses);
		appcommentsDAO.flush();

		apppic = apppicDAO.store(apppic);
		apppicDAO.flush();

		return apppic;
	}

	/**
	 * Delete an existing Appcomments entity
	 * 
	 */
	@Transactional
	public Apppic deleteApppicAppcommentses(Integer apppic_apppicid, Integer related_appcommentses_appcommentsid) {
		Appcomments related_appcommentses = appcommentsDAO.findAppcommentsByPrimaryKey(related_appcommentses_appcommentsid, -1, -1);

		Apppic apppic = apppicDAO.findApppicByPrimaryKey(apppic_apppicid, -1, -1);

		related_appcommentses.setApppic(null);
		apppic.getAppcommentses().remove(related_appcommentses);

		appcommentsDAO.remove(related_appcommentses);
		appcommentsDAO.flush();

		return apppic;
	}

	/**
	 * Delete an existing Apppic entity
	 * 
	 */
	@Transactional
	public void deleteApppic(Apppic apppic) {
		apppicDAO.remove(apppic);
		apppicDAO.flush();
	}

	/**
	 * Load an existing Apppic entity
	 * 
	 */
	@Transactional
	public Set<Apppic> loadApppics() {
		return apppicDAO.findAllApppics();
	}

	/**
	 * Return all Apppic entity
	 * 
	 */
	@Transactional
	public List<Apppic> findAllApppics(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Apppic>(apppicDAO.findAllApppics(startResult, maxRows));
	}

	/**
	 */
	@Transactional
	public Apppic findApppicByPrimaryKey(Integer apppicid) {
		return apppicDAO.findApppicByPrimaryKey(apppicid);
	}

	/**
	 * Save an existing Appusers entity
	 * 
	 */
	@Transactional
	public Apppic saveApppicAppusers(Integer apppicid, Appusers related_appusers) {
		Apppic apppic = apppicDAO.findApppicByPrimaryKey(apppicid, -1, -1);
		Appusers existingappusers = appusersDAO.findAppusersByPrimaryKey(related_appusers.getAppuserid());

		// copy into the existing record to preserve existing relationships
		if (existingappusers != null) {
			existingappusers.setAppuserid(related_appusers.getAppuserid());
			existingappusers.setName(related_appusers.getName());
			existingappusers.setUsername(related_appusers.getUsername());
			existingappusers.setPassword(related_appusers.getPassword());
			existingappusers.setAddress(related_appusers.getAddress());
			existingappusers.setEmail(related_appusers.getEmail());
			existingappusers.setPhonenr(related_appusers.getPhonenr());
			existingappusers.setBirthdate(related_appusers.getBirthdate());
			related_appusers = existingappusers;
		} else {
			related_appusers = appusersDAO.store(related_appusers);
			appusersDAO.flush();
		}

		apppic.setAppusers(related_appusers);
		related_appusers.getApppics().add(apppic);
		apppic = apppicDAO.store(apppic);
		apppicDAO.flush();

		related_appusers = appusersDAO.store(related_appusers);
		appusersDAO.flush();

		return apppic;
	}

	/**
	 * Save an existing Apppic entity
	 * 
	 */
	@Transactional
	public void saveApppic(Apppic apppic) {
		Apppic existingApppic = apppicDAO.findApppicByPrimaryKey(apppic.getApppicid());

		if (existingApppic != null) {
			if (existingApppic != apppic) {
				existingApppic.setApppicid(apppic.getApppicid());
				existingApppic.setApppicField(apppic.getApppicField());
			}
			apppic = apppicDAO.store(existingApppic);
		} else {
			apppic = apppicDAO.store(apppic);
		}
		apppicDAO.flush();
	}
}
