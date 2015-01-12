package edu.utcluj.proiect.service;

import edu.utcluj.proiect.dao.ApppicDAO;
import edu.utcluj.proiect.dao.AppusersDAO;

import edu.utcluj.proiect.domain.Apppic;
import edu.utcluj.proiect.domain.Appusers;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

/**
 * Spring service that handles CRUD requests for Appusers entities
 * 
 */

@Service("AppusersService")
@Transactional
public class AppusersServiceImpl implements AppusersService {

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
	 * Instantiates a new AppusersServiceImpl.
	 *
	 */
	public AppusersServiceImpl() {
	}

	/**
	 * Delete an existing Appusers entity
	 * 
	 */
	@Transactional
	public void deleteAppusers(Appusers appusers) {
		appusersDAO.remove(appusers);
		appusersDAO.flush();
	}

	/**
	 * Delete an existing Apppic entity
	 * 
	 */
	@Transactional
	public Appusers deleteAppusersApppics(Integer appusers_appuserid, Integer related_apppics_apppicid) {
		Apppic related_apppics = apppicDAO.findApppicByPrimaryKey(related_apppics_apppicid, -1, -1);

		Appusers appusers = appusersDAO.findAppusersByPrimaryKey(appusers_appuserid, -1, -1);

		related_apppics.setAppusers(null);
		appusers.getApppics().remove(related_apppics);

		apppicDAO.remove(related_apppics);
		apppicDAO.flush();

		return appusers;
	}

	/**
	 * Save an existing Apppic entity
	 * 
	 */
	@Transactional
	public Appusers saveAppusersApppics(Integer appuserid, Apppic related_apppics) {
		Appusers appusers = appusersDAO.findAppusersByPrimaryKey(appuserid, -1, -1);
		Apppic existingapppics = apppicDAO.findApppicByPrimaryKey(related_apppics.getApppicid());

		// copy into the existing record to preserve existing relationships
		if (existingapppics != null) {
			existingapppics.setApppicid(related_apppics.getApppicid());
			existingapppics.setApppicField(related_apppics.getApppicField());
			related_apppics = existingapppics;
		} else {
			related_apppics = apppicDAO.store(related_apppics);
			apppicDAO.flush();
		}

		related_apppics.setAppusers(appusers);
		appusers.getApppics().add(related_apppics);
		related_apppics = apppicDAO.store(related_apppics);
		apppicDAO.flush();

		appusers = appusersDAO.store(appusers);
		appusersDAO.flush();

		return appusers;
	}

	/**
	 * Return a count of all Appusers entity
	 * 
	 */
	@Transactional
	public Integer countAppuserss() {
		return ((Long) appusersDAO.createQuerySingleResult("select count(o) from Appusers o").getSingleResult()).intValue();
	}

	/**
	 */
	@Transactional
	public Appusers findAppusersByPrimaryKey(Integer appuserid) {
		return appusersDAO.findAppusersByPrimaryKey(appuserid);
	}

	/**
	 * Save an existing Appusers entity
	 * 
	 */
	@Transactional
	public void saveAppusers(Appusers appusers) {
		Appusers existingAppusers = appusersDAO.findAppusersByPrimaryKey(appusers.getAppuserid());

		if (existingAppusers != null) {
			if (existingAppusers != appusers) {
				existingAppusers.setAppuserid(appusers.getAppuserid());
				existingAppusers.setName(appusers.getName());
				existingAppusers.setUsername(appusers.getUsername());
				existingAppusers.setPassword(appusers.getPassword());
				existingAppusers.setAddress(appusers.getAddress());
				existingAppusers.setEmail(appusers.getEmail());
				existingAppusers.setPhonenr(appusers.getPhonenr());
				existingAppusers.setBirthdate(appusers.getBirthdate());
			}
			appusers = appusersDAO.store(existingAppusers);
		} else {
			appusers = appusersDAO.store(appusers);
		}
		appusersDAO.flush();
	}

	/**
	 * Return all Appusers entity
	 * 
	 */
	@Transactional
	public List<Appusers> findAllAppuserss(Integer startResult, Integer maxRows) {
		return new java.util.ArrayList<Appusers>(appusersDAO.findAllAppuserss(startResult, maxRows));
	}

	/**
	 * Load an existing Appusers entity
	 * 
	 */
	@Transactional
	public Set<Appusers> loadAppuserss() {
		return appusersDAO.findAllAppuserss();
	}
}
