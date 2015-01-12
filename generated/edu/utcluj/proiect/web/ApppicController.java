package edu.utcluj.proiect.web;

import edu.utcluj.proiect.dao.AppcommentsDAO;
import edu.utcluj.proiect.dao.ApppicDAO;
import edu.utcluj.proiect.dao.AppusersDAO;

import edu.utcluj.proiect.domain.Appcomments;
import edu.utcluj.proiect.domain.Apppic;
import edu.utcluj.proiect.domain.Appusers;

import edu.utcluj.proiect.service.ApppicService;

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
 * Spring MVC controller that handles CRUD requests for Apppic entities
 * 
 */

@Controller("ApppicController")
public class ApppicController {

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
	 * Service injected by Spring that provides CRUD operations for Apppic entities
	 * 
	 */
	@Autowired
	private ApppicService apppicService;

	/**
	 */
	@RequestMapping("/apppicController/binary.action")
	public ModelAndView streamBinary(@ModelAttribute HttpServletRequest request, @ModelAttribute HttpServletResponse response) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("streamedBinaryContentView");
		return mav;

	}

	/**
	 * Select an existing Apppic entity
	 * 
	 */
	@RequestMapping("/selectApppic")
	public ModelAndView selectApppic(@RequestParam Integer apppicidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apppic", apppicDAO.findApppicByPrimaryKey(apppicidKey));
		mav.setViewName("apppic/viewApppic.jsp");

		return mav;
	}

	/**
	 * Delete an existing Apppic entity
	 * 
	 */
	@RequestMapping("/deleteApppic")
	public String deleteApppic(@RequestParam Integer apppicidKey) {
		Apppic apppic = apppicDAO.findApppicByPrimaryKey(apppicidKey);
		apppicService.deleteApppic(apppic);
		return "forward:/indexApppic";
	}

	/**
	 * Save an existing Appusers entity
	 * 
	 */
	@RequestMapping("/saveApppicAppusers")
	public ModelAndView saveApppicAppusers(@RequestParam Integer apppic_apppicid, @ModelAttribute Appusers appusers) {
		Apppic parent_apppic = apppicService.saveApppicAppusers(apppic_apppicid, appusers);

		ModelAndView mav = new ModelAndView();
		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.addObject("apppic", parent_apppic);
		mav.setViewName("apppic/viewApppic.jsp");

		return mav;
	}

	/**
	 * View an existing Appusers entity
	 * 
	 */
	@RequestMapping("/selectApppicAppusers")
	public ModelAndView selectApppicAppusers(@RequestParam Integer apppic_apppicid, @RequestParam Integer appusers_appuserid) {
		Appusers appusers = appusersDAO.findAppusersByPrimaryKey(appusers_appuserid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.addObject("appusers", appusers);
		mav.setViewName("apppic/appusers/viewAppusers.jsp");

		return mav;
	}

	/**
	 * Save an existing Appcomments entity
	 * 
	 */
	@RequestMapping("/saveApppicAppcommentses")
	public ModelAndView saveApppicAppcommentses(@RequestParam Integer apppic_apppicid, @ModelAttribute Appcomments appcommentses) {
		Apppic parent_apppic = apppicService.saveApppicAppcommentses(apppic_apppicid, appcommentses);

		ModelAndView mav = new ModelAndView();
		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.addObject("apppic", parent_apppic);
		mav.setViewName("apppic/viewApppic.jsp");

		return mav;
	}

	/**
	 * Create a new Appusers entity
	 * 
	 */
	@RequestMapping("/newApppicAppusers")
	public ModelAndView newApppicAppusers(@RequestParam Integer apppic_apppicid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.addObject("appusers", new Appusers());
		mav.addObject("newFlag", true);
		mav.setViewName("apppic/appusers/editAppusers.jsp");

		return mav;
	}

	/**
	 * Edit an existing Appusers entity
	 * 
	 */
	@RequestMapping("/editApppicAppusers")
	public ModelAndView editApppicAppusers(@RequestParam Integer apppic_apppicid, @RequestParam Integer appusers_appuserid) {
		Appusers appusers = appusersDAO.findAppusersByPrimaryKey(appusers_appuserid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.addObject("appusers", appusers);
		mav.setViewName("apppic/appusers/editAppusers.jsp");

		return mav;
	}

	/**
	 * Create a new Appcomments entity
	 * 
	 */
	@RequestMapping("/newApppicAppcommentses")
	public ModelAndView newApppicAppcommentses(@RequestParam Integer apppic_apppicid) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.addObject("appcomments", new Appcomments());
		mav.addObject("newFlag", true);
		mav.setViewName("apppic/appcommentses/editAppcommentses.jsp");

		return mav;
	}

	/**
	 * Create a new Apppic entity
	 * 
	 */
	@RequestMapping("/newApppic")
	public ModelAndView newApppic() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apppic", new Apppic());
		mav.addObject("newFlag", true);
		mav.setViewName("apppic/editApppic.jsp");

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
	 * Select the Apppic entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteApppic")
	public ModelAndView confirmDeleteApppic(@RequestParam Integer apppicidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apppic", apppicDAO.findApppicByPrimaryKey(apppicidKey));
		mav.setViewName("apppic/deleteApppic.jsp");

		return mav;
	}

	/**
	 * Select the child Appcomments entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteApppicAppcommentses")
	public ModelAndView confirmDeleteApppicAppcommentses(@RequestParam Integer apppic_apppicid, @RequestParam Integer related_appcommentses_appcommentsid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appcomments", appcommentsDAO.findAppcommentsByPrimaryKey(related_appcommentses_appcommentsid));
		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.setViewName("apppic/appcommentses/deleteAppcommentses.jsp");

		return mav;
	}

	/**
	 * View an existing Appcomments entity
	 * 
	 */
	@RequestMapping("/selectApppicAppcommentses")
	public ModelAndView selectApppicAppcommentses(@RequestParam Integer apppic_apppicid, @RequestParam Integer appcommentses_appcommentsid) {
		Appcomments appcomments = appcommentsDAO.findAppcommentsByPrimaryKey(appcommentses_appcommentsid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.addObject("appcomments", appcomments);
		mav.setViewName("apppic/appcommentses/viewAppcommentses.jsp");

		return mav;
	}

	/**
	 * Save an existing Apppic entity
	 * 
	 */
	@RequestMapping("/saveApppic")
	public String saveApppic(@ModelAttribute Apppic apppic) {
		apppicService.saveApppic(apppic);
		return "forward:/indexApppic";
	}

	/**
	 * Show all Appcomments entities by Apppic
	 * 
	 */
	@RequestMapping("/listApppicAppcommentses")
	public ModelAndView listApppicAppcommentses(@RequestParam Integer apppicidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apppic", apppicDAO.findApppicByPrimaryKey(apppicidKey));
		mav.setViewName("apppic/appcommentses/listAppcommentses.jsp");

		return mav;
	}

	/**
	 * Show all Appusers entities by Apppic
	 * 
	 */
	@RequestMapping("/listApppicAppusers")
	public ModelAndView listApppicAppusers(@RequestParam Integer apppicidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apppic", apppicDAO.findApppicByPrimaryKey(apppicidKey));
		mav.setViewName("apppic/appusers/listAppusers.jsp");

		return mav;
	}

	/**
	 * Edit an existing Appcomments entity
	 * 
	 */
	@RequestMapping("/editApppicAppcommentses")
	public ModelAndView editApppicAppcommentses(@RequestParam Integer apppic_apppicid, @RequestParam Integer appcommentses_appcommentsid) {
		Appcomments appcomments = appcommentsDAO.findAppcommentsByPrimaryKey(appcommentses_appcommentsid, -1, -1);

		ModelAndView mav = new ModelAndView();
		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.addObject("appcomments", appcomments);
		mav.setViewName("apppic/appcommentses/editAppcommentses.jsp");

		return mav;
	}

	/**
	 * Delete an existing Appcomments entity
	 * 
	 */
	@RequestMapping("/deleteApppicAppcommentses")
	public ModelAndView deleteApppicAppcommentses(@RequestParam Integer apppic_apppicid, @RequestParam Integer related_appcommentses_appcommentsid) {
		ModelAndView mav = new ModelAndView();

		Apppic apppic = apppicService.deleteApppicAppcommentses(apppic_apppicid, related_appcommentses_appcommentsid);

		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.addObject("apppic", apppic);
		mav.setViewName("apppic/viewApppic.jsp");

		return mav;
	}

	/**
	 * Entry point to show all Apppic entities
	 * 
	 */
	public String indexApppic() {
		return "redirect:/indexApppic";
	}

	/**
	 * Edit an existing Apppic entity
	 * 
	 */
	@RequestMapping("/editApppic")
	public ModelAndView editApppic(@RequestParam Integer apppicidKey) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apppic", apppicDAO.findApppicByPrimaryKey(apppicidKey));
		mav.setViewName("apppic/editApppic.jsp");

		return mav;
	}

	/**
	 * Show all Apppic entities
	 * 
	 */
	@RequestMapping("/indexApppic")
	public ModelAndView listApppics() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("apppics", apppicService.loadApppics());

		mav.setViewName("apppic/listApppics.jsp");

		return mav;
	}

	/**
	 * Delete an existing Appusers entity
	 * 
	 */
	@RequestMapping("/deleteApppicAppusers")
	public ModelAndView deleteApppicAppusers(@RequestParam Integer apppic_apppicid, @RequestParam Integer related_appusers_appuserid) {
		ModelAndView mav = new ModelAndView();

		Apppic apppic = apppicService.deleteApppicAppusers(apppic_apppicid, related_appusers_appuserid);

		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.addObject("apppic", apppic);
		mav.setViewName("apppic/viewApppic.jsp");

		return mav;
	}

	/**
	 * Select the child Appusers entity for display allowing the user to confirm that they would like to delete the entity
	 * 
	 */
	@RequestMapping("/confirmDeleteApppicAppusers")
	public ModelAndView confirmDeleteApppicAppusers(@RequestParam Integer apppic_apppicid, @RequestParam Integer related_appusers_appuserid) {
		ModelAndView mav = new ModelAndView();

		mav.addObject("appusers", appusersDAO.findAppusersByPrimaryKey(related_appusers_appuserid));
		mav.addObject("apppic_apppicid", apppic_apppicid);
		mav.setViewName("apppic/appusers/deleteAppusers.jsp");

		return mav;
	}
}