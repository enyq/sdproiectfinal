package edu.utcluj.proiect.web;

import edu.utcluj.proiect.dao.ApppicDAO;
import edu.utcluj.proiect.dao.AppusersDAO;

import edu.utcluj.proiect.domain.Apppic;
import edu.utcluj.proiect.domain.Appusers;

import edu.utcluj.proiect.service.AppusersService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.WebDataBinder;

import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView;

/**
 * Spring MVC controller that handles CRUD requests for Appusers entities
 * 
 */

@Controller("AppusersController")
public class AppusersController {

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
	 * Service injected by Spring that provides CRUD operations for Appusers entities
	 * 
	 */
	@Autowired
	private AppusersService appusersService;

	/**
	 * Delete an existing Appusers entity
	 * 
	 */
	@RequestMapping("/deleteAppusers")
	public String deleteAppusers(@RequestParam Integer appuseridKey) {
		Appusers appusers = appusersDAO.findAppusersByPrimaryKey(appuseridKey);
		appusersService.deleteAppusers(appusers);
		return "forward:/indexAppusers";
	}

	/**
	 * Edit an existing Apppic entity
	 * 
	 */
	@RequestMapping("/editAppusersApppics")
	public ModelAndView editAppusersApppics(@RequestParam Integer appusers_appuserid, @RequestParam Integer apppics_apppicid) {
		Apppic apppic = apppicDAO.findApppicByPrimaryKey(apppics_apppicid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("appusers_appuserid", appusers_appuserid);
		mav.addObject("apppic", apppic);
		mav.setViewName("appusers/apppics/editApppics.jsp");

		return mav;
	}

	/**
	 * Save an existing Apppic entity
	 * 
	 */
	@RequestMapping("/saveAppusersApppics")
	public ModelAndView saveAppusersApppics(@RequestParam Integer appusers_appuserid, @ModelAttribute Apppic apppics) {
		Appusers parent_appusers = appusersService.saveAppusersApppics(appusers_appuserid, apppics);

		ModelAndView mav = new ModelAndView();
		mav.addObject("appusers_appuserid", appusers_appuserid);
		mav.addObject("appusers", parent_appusers);
		mav.setViewName("appusers/viewAppusers.jsp");

		return mav;
	}

	/**
	 * Select an existing Appusers entity
	 * 
	 */
	@RequestMapping("/selectAppusers")
	public ModelAndView selectAppusers(@RequestParam Integer appuseridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appusers", appusersDAO.findAppusersByPrimaryKey(appuseridKey));
		mav.setViewName("appusers/viewAppusers.jsp");

		return mav;
	}

	/**
	 * Show all Apppic entities by Appusers
	 * 
	 */
	@RequestMapping("/listAppusersApppics")
	public ModelAndView listAppusersApppics(@RequestParam Integer appuseridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appusers", appusersDAO.findAppusersByPrimaryKey(appuseridKey));
		mav.setViewName("appusers/apppics/listApppics.jsp");

		return mav;
	}

	/**
	 * Delete an existing Apppic entity
	 * 
	 */
	@RequestMapping("/deleteAppusersApppics")
	public ModelAndView deleteAppusersApppics(@RequestParam Integer appusers_appuserid, @RequestParam Integer related_apppics_apppicid) {
		ModelAndView mav = new ModelAndView();

		Appusers appusers = appusersService.deleteAppusersApppics(appusers_appuserid, related_apppics_apppicid);

		mav.addObject("appusers_appuserid", appusers_appuserid);
		mav.addObject("appusers", appusers);
		mav.setViewName("appusers/viewAppusers.jsp");

		return mav;
	}

	/**
	 * Select the child Apppic entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAppusersApppics")
	public ModelAndView confirmDeleteAppusersApppics(@RequestParam Integer appusers_appuserid, @RequestParam Integer related_apppics_apppicid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apppic", apppicDAO.findApppicByPrimaryKey(related_apppics_apppicid));
		mav.addObject("appusers_appuserid", appusers_appuserid);
		mav.setViewName("appusers/apppics/deleteApppics.jsp");

		return mav;
	}

	/**
	 * Select the Appusers entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAppusers")
	public ModelAndView confirmDeleteAppusers(@RequestParam Integer appuseridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appusers", appusersDAO.findAppusersByPrimaryKey(appuseridKey));
		mav.setViewName("appusers/deleteAppusers.jsp");

		return mav;
	}

	/**
	 * View an existing Apppic entity
	 * 
	 */
	@RequestMapping("/selectAppusersApppics")
	public ModelAndView selectAppusersApppics(@RequestParam Integer appusers_appuserid, @RequestParam Integer apppics_apppicid) {
		Apppic apppic = apppicDAO.findApppicByPrimaryKey(apppics_apppicid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("appusers_appuserid", appusers_appuserid);
		mav.addObject("apppic", apppic);
		mav.setViewName("appusers/apppics/viewApppics.jsp");

		return mav;
	}

	/**
	 * Create a new Appusers entity
	 * 
	 */
	@RequestMapping("/newAppusers")
	public ModelAndView newAppusers() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appusers", new Appusers());
		mav.addObject("newFlag", true);
		mav.setViewName("appusers/editAppusers.jsp");

		return mav;
	}

	/**
	 */
	@RequestMapping("/appusersController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Create a new Apppic entity
	 * 
	 */
	@RequestMapping("/newAppusersApppics")
	public ModelAndView newAppusersApppics(@RequestParam Integer appusers_appuserid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("appusers_appuserid", appusers_appuserid);
		mav.addObject("apppic", new Apppic());
		mav.addObject("newFlag", true);
		mav.setViewName("appusers/apppics/editApppics.jsp");

		return mav;
	}

	/**
	 * Edit an existing Appusers entity
	 * 
	 */
	@RequestMapping("/editAppusers")
	public ModelAndView editAppusers(@RequestParam Integer appuseridKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appusers", appusersDAO.findAppusersByPrimaryKey(appuseridKey));
		mav.setViewName("appusers/editAppusers.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Appusers entities
	 * 
	 */
	public String indexAppusers() {
		return "redirect:/indexAppusers";
	}

	/**
	 * Register custom, context-specific property editors
	 * 
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder, HttpServletRequest request) { // Register static property editors.
		binder.registerCustomEditor(java.util.Calendar.class, new org.skyway.spring.util.databinding.CustomCalendarEditor());
		binder.registerCustomEditor(byte[].class, new org.springframework.web.multipart.support.ByteArrayMultipartFileEditor());
		binder.registerCustomEditor(boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(false));
		binder.registerCustomEditor(Boolean.class, new org.skyway.spring.util.databinding.EnhancedBooleanEditor(true));
		binder.registerCustomEditor(java.math.BigDecimal.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(java.math.BigDecimal.class, true));
		binder.registerCustomEditor(Integer.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Integer.class, true));
		binder.registerCustomEditor(java.util.Date.class, new org.skyway.spring.util.databinding.CustomDateEditor());
		binder.registerCustomEditor(String.class, new org.skyway.spring.util.databinding.StringEditor());
		binder.registerCustomEditor(Long.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Long.class, true));
		binder.registerCustomEditor(Double.class, new org.skyway.spring.util.databinding.NaNHandlingNumberEditor(Double.class, true));
	}

	/**
	 * Show all Appusers entities
	 * 
	 */
	@RequestMapping("/indexAppusers")
	public ModelAndView listAppuserss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appuserss", appusersService.loadAppuserss());

		mav.setViewName("appusers/listAppuserss.jsp");

		return mav;
	}

	/**
	 * Save an existing Appusers entity
	 * 
	 */
	@RequestMapping("/saveAppusers")
	public String saveAppusers(@ModelAttribute Appusers appusers) {
		appusersService.saveAppusers(appusers);
		return "forward:/indexAppusers";
	}
}