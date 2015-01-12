package edu.utcluj.proiect.service;

import edu.utcluj.proiect.domain.Apppic;
import edu.utcluj.proiect.domain.Appusers;

import java.util.List;
import java.util.Set;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import org.springframework.transaction.annotation.Transactional;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Class to run the service as a JUnit test. Each operation in the service is a separate test.
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@TestExecutionListeners({
		DependencyInjectionTestExecutionListener.class,
		DirtiesContextTestExecutionListener.class,
		TransactionalTestExecutionListener.class })
@ContextConfiguration(locations = {
		"file:./resources/ProiectSD2-security-context.xml",
		"file:./resources/ProiectSD2-service-context.xml",
		"file:./resources/ProiectSD2-dao-context.xml",
		"file:./resources/ProiectSD2-web-context.xml" })
@Transactional
public class AppusersServiceTest {

	/**
	 * The Spring application context.
	 *
	 */
	@SuppressWarnings("unused")
	private ApplicationContext context;

	/**
	 * The service being tested, injected by Spring.
	 *
	 */
	@Autowired
	protected AppusersService service;

	/**
	 * Instantiates a new AppusersServiceTest.
	 *
	 */
	public AppusersServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Appusers entity
	 * 
	 */
	@Test
	public void deleteAppusers() {
		// TODO: JUnit - Populate test inputs for operation: deleteAppusers 
		Appusers appusers = new edu.utcluj.proiect.domain.Appusers();
		service.deleteAppusers(appusers);
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Apppic entity
	 * 
	 */
	@Test
	public void deleteAppusersApppics() {
		// TODO: JUnit - Populate test inputs for operation: deleteAppusersApppics 
		Integer appusers_appuserid = 0;
		Integer related_apppics_apppicid = 0;
		Appusers response = null;
		response = service.deleteAppusersApppics(appusers_appuserid, related_apppics_apppicid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAppusersApppics
	}

	/**
	 * Operation Unit Test
	 * Save an existing Apppic entity
	 * 
	 */
	@Test
	public void saveAppusersApppics() {
		// TODO: JUnit - Populate test inputs for operation: saveAppusersApppics 
		Integer appuserid = 0;
		Apppic related_apppics = new edu.utcluj.proiect.domain.Apppic();
		Appusers response = null;
		response = service.saveAppusersApppics(appuserid, related_apppics);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAppusersApppics
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Appusers entity
	 * 
	 */
	@Test
	public void countAppuserss() {
		Integer response = null;
		response = service.countAppuserss();
		// TODO: JUnit - Add assertions to test outputs of operation: countAppuserss
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findAppusersByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findAppusersByPrimaryKey 
		Integer appuserid_1 = 0;
		Appusers response = null;
		response = service.findAppusersByPrimaryKey(appuserid_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findAppusersByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Appusers entity
	 * 
	 */
	@Test
	public void saveAppusers() {
		// TODO: JUnit - Populate test inputs for operation: saveAppusers 
		Appusers appusers_1 = new edu.utcluj.proiect.domain.Appusers();
		service.saveAppusers(appusers_1);
	}

	/**
	 * Operation Unit Test
	 * Return all Appusers entity
	 * 
	 */
	@Test
	public void findAllAppuserss() {
		// TODO: JUnit - Populate test inputs for operation: findAllAppuserss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Appusers> response = null;
		response = service.findAllAppuserss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllAppuserss
	}

	/**
	 * Operation Unit Test
	 * Load an existing Appusers entity
	 * 
	 */
	@Test
	public void loadAppuserss() {
		Set<Appusers> response = null;
		response = service.loadAppuserss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadAppuserss
	}

	/**
	 * Autowired to set the Spring application context.
	 *
	 */
	@Autowired
	public void setContext(ApplicationContext context) {
		this.context = context;
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("session", new SessionScope());
		((DefaultListableBeanFactory) context.getAutowireCapableBeanFactory()).registerScope("request", new RequestScope());
	}

	/**
	 * Sets Up the Request context
	 *
	 */
	private void setupRequestContext() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
	}
}
