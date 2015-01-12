package edu.utcluj.proiect.web;

import edu.utcluj.proiect.dao.AppcommentsDAO;
import edu.utcluj.proiect.dao.ApppicDAO;

import edu.utcluj.proiect.domain.Appcomments;
import edu.utcluj.proiect.domain.Apppic;

import edu.utcluj.proiect.service.AppcommentsService;

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
 * Spring MVC controller that handles CRUD requests for Appcomments entities
 * 
 */

@Controller("AppcommentsController")
public class AppcommentsController {

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
	 * Service injected by Spring that provides CRUD operations for Appcomments entities
	 * 
	 */
	@Autowired
	private AppcommentsService appcommentsService;

	/**
	 * Select the child Apppic entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAppcommentsApppic")
	public ModelAndView confirmDeleteAppcommentsApppic(@RequestParam Integer appcomments_appcommentsid, @RequestParam Integer related_apppic_apppicid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apppic", apppicDAO.findApppicByPrimaryKey(related_apppic_apppicid));
		mav.addObject("appcomments_appcommentsid", appcomments_appcommentsid);
		mav.setViewName("appcomments/apppic/deleteApppic.jsp");

		return mav;
	}

	/**
	 * Edit an existing Appcomments entity
	 * 
	 */
	@RequestMapping("/editAppcomments")
	public ModelAndView editAppcomments(@RequestParam Integer appcommentsidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appcomments", appcommentsDAO.findAppcommentsByPrimaryKey(appcommentsidKey));
		mav.setViewName("appcomments/editAppcomments.jsp");

		return mav;
	}

	/**
	 * Create a new Appcomments entity
	 * 
	 */
	@RequestMapping("/newAppcomments")
	public ModelAndView newAppcomments() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appcomments", new Appcomments());
		mav.addObject("newFlag", true);
		mav.setViewName("appcomments/editAppcomments.jsp");

		return mav;
	}

	/**
	 * Show all Apppic entities by Appcomments
	 * 
	 */
	@RequestMapping("/listAppcommentsApppic")
	public ModelAndView listAppcommentsApppic(@RequestParam Integer appcommentsidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appcomments", appcommentsDAO.findAppcommentsByPrimaryKey(appcommentsidKey));
		mav.setViewName("appcomments/apppic/listApppic.jsp");

		return mav;
	}

	/**
	 * Select the Appcomments entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteAppcomments")
	public ModelAndView confirmDeleteAppcomments(@RequestParam Integer appcommentsidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appcomments", appcommentsDAO.findAppcommentsByPrimaryKey(appcommentsidKey));
		mav.setViewName("appcomments/deleteAppcomments.jsp");

		return mav;
	}

	/**
	 * Delete an existing Apppic entity
	 * 
	 */
	@RequestMapping("/deleteAppcommentsApppic")
	public ModelAndView deleteAppcommentsApppic(@RequestParam Integer appcomments_appcommentsid, @RequestParam Integer related_apppic_apppicid) {
		ModelAndView mav = new ModelAndView();

		Appcomments appcomments = appcommentsService.deleteAppcommentsApppic(appcomments_appcommentsid, related_apppic_apppicid);

		mav.addObject("appcomments_appcommentsid", appcomments_appcommentsid);
		mav.addObject("appcomments", appcomments);
		mav.setViewName("appcomments/viewAppcomments.jsp");

		return mav;
	}

	/**
	 * Select an existing Appcomments entity
	 * 
	 */
	@RequestMapping("/selectAppcomments")
	public ModelAndView selectAppcomments(@RequestParam Integer appcommentsidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appcomments", appcommentsDAO.findAppcommentsByPrimaryKey(appcommentsidKey));
		mav.setViewName("appcomments/viewAppcomments.jsp");

		return mav;
	}

	/**
	 * Show all Appcomments entities
	 * 
	 */
	@RequestMapping("/indexAppcomments")
	public ModelAndView listAppcommentss() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appcommentss", appcommentsService.loadAppcommentss());

		mav.setViewName("appcomments/listAppcommentss.jsp");

		return mav;
	}

	/**
	 * Edit an existing Apppic entity
	 * 
	 */
	@RequestMapping("/editAppcommentsApppic")
	public ModelAndView editAppcommentsApppic(@RequestParam Integer appcomments_appcommentsid, @RequestParam Integer apppic_apppicid) {
		Apppic apppic = apppicDAO.findApppicByPrimaryKey(apppic_apppicid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("appcomments_appcommentsid", appcomments_appcommentsid);
		mav.addObject("apppic", apppic);
		mav.setViewName("appcomments/apppic/editApppic.jsp");

		return mav;
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
	 */
	@RequestMapping("/appcommentsController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Save an existing Appcomments entity
	 * 
	 */
	@RequestMapping("/saveAppcomments")
	public String saveAppcomments(@ModelAttribute Appcomments appcomments) {
		appcommentsService.saveAppcomments(appcomments);
		return "forward:/indexAppcomments";
	}

	/**
	 * View an existing Apppic entity
	 * 
	 */
	@RequestMapping("/selectAppcommentsApppic")
	public ModelAndView selectAppcommentsApppic(@RequestParam Integer appcomments_appcommentsid, @RequestParam Integer apppic_apppicid) {
		Apppic apppic = apppicDAO.findApppicByPrimaryKey(apppic_apppicid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("appcomments_appcommentsid", appcomments_appcommentsid);
		mav.addObject("apppic", apppic);
		mav.setViewName("appcomments/apppic/viewApppic.jsp");

		return mav;
	}

	/**
	 * Create a new Apppic entity
	 * 
	 */
	@RequestMapping("/newAppcommentsApppic")
	public ModelAndView newAppcommentsApppic(@RequestParam Integer appcomments_appcommentsid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("appcomments_appcommentsid", appcomments_appcommentsid);
		mav.addObject("apppic", new Apppic());
		mav.addObject("newFlag", true);
		mav.setViewName("appcomments/apppic/editApppic.jsp");

		return mav;
	}

	/**
	 * Save an existing Apppic entity
	 * 
	 */
	@RequestMapping("/saveAppcommentsApppic")
	public ModelAndView saveAppcommentsApppic(@RequestParam Integer appcomments_appcommentsid, @ModelAttribute Apppic apppic) {
		Appcomments parent_appcomments = appcommentsService.saveAppcommentsApppic(appcomments_appcommentsid, apppic);

		ModelAndView mav = new ModelAndView();
		mav.addObject("appcomments_appcommentsid", appcomments_appcommentsid);
		mav.addObject("appcomments", parent_appcomments);
		mav.setViewName("appcomments/viewAppcomments.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Appcomments entities
	 * 
	 */
	public String indexAppcomments() {
		return "redirect:/indexAppcomments";
	}

	/**
	 * Delete an existing Appcomments entity
	 * 
	 */
	@RequestMapping("/deleteAppcomments")
	public String deleteAppcomments(@RequestParam Integer appcommentsidKey) {
		Appcomments appcomments = appcommentsDAO.findAppcommentsByPrimaryKey(appcommentsidKey);
		appcommentsService.deleteAppcomments(appcomments);
		return "forward:/indexAppcomments";
	}
}