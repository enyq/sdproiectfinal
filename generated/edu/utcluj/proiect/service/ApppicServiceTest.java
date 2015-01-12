package edu.utcluj.proiect.service;

import edu.utcluj.proiect.domain.Appcomments;
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
public class ApppicServiceTest {

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
	protected ApppicService service;

	/**
	 * Instantiates a new ApppicServiceTest.
	 *
	 */
	public ApppicServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Apppic entity
	 * 
	 */
	@Test
	public void countApppics() {
		Integer response = null;
		response = service.countApppics();
		// TODO: JUnit - Add assertions to test outputs of operation: countApppics
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Appusers entity
	 * 
	 */
	@Test
	public void deleteApppicAppusers() {
		// TODO: JUnit - Populate test inputs for operation: deleteApppicAppusers 
		Integer apppic_apppicid = 0;
		Integer related_appusers_appuserid = 0;
		Apppic response = null;
		response = service.deleteApppicAppusers(apppic_apppicid, related_appusers_appuserid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteApppicAppusers
	}

	/**
	 * Operation Unit Test
	 * Save an existing Appcomments entity
	 * 
	 */
	@Test
	public void saveApppicAppcommentses() {
		// TODO: JUnit - Populate test inputs for operation: saveApppicAppcommentses 
		Integer apppicid = 0;
		Appcomments related_appcommentses = new edu.utcluj.proiect.domain.Appcomments();
		Apppic response = null;
		response = service.saveApppicAppcommentses(apppicid, related_appcommentses);
		// TODO: JUnit - Add assertions to test outputs of operation: saveApppicAppcommentses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Appcomments entity
	 * 
	 */
	@Test
	public void deleteApppicAppcommentses() {
		// TODO: JUnit - Populate test inputs for operation: deleteApppicAppcommentses 
		Integer apppic_apppicid_1 = 0;
		Integer related_appcommentses_appcommentsid = 0;
		Apppic response = null;
		response = service.deleteApppicAppcommentses(apppic_apppicid_1, related_appcommentses_appcommentsid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteApppicAppcommentses
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Apppic entity
	 * 
	 */
	@Test
	public void deleteApppic() {
		// TODO: JUnit - Populate test inputs for operation: deleteApppic 
		Apppic apppic = new edu.utcluj.proiect.domain.Apppic();
		service.deleteApppic(apppic);
	}

	/**
	 * Operation Unit Test
	 * Load an existing Apppic entity
	 * 
	 */
	@Test
	public void loadApppics() {
		Set<Apppic> response = null;
		response = service.loadApppics();
		// TODO: JUnit - Add assertions to test outputs of operation: loadApppics
	}

	/**
	 * Operation Unit Test
	 * Return all Apppic entity
	 * 
	 */
	@Test
	public void findAllApppics() {
		// TODO: JUnit - Populate test inputs for operation: findAllApppics 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Apppic> response = null;
		response = service.findAllApppics(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllApppics
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findApppicByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findApppicByPrimaryKey 
		Integer apppicid_1 = 0;
		Apppic response = null;
		response = service.findApppicByPrimaryKey(apppicid_1);
		// TODO: JUnit - Add assertions to test outputs of operation: findApppicByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Appusers entity
	 * 
	 */
	@Test
	public void saveApppicAppusers() {
		// TODO: JUnit - Populate test inputs for operation: saveApppicAppusers 
		Integer apppicid_2 = 0;
		Appusers related_appusers = new edu.utcluj.proiect.domain.Appusers();
		Apppic response = null;
		response = service.saveApppicAppusers(apppicid_2, related_appusers);
		// TODO: JUnit - Add assertions to test outputs of operation: saveApppicAppusers
	}

	/**
	 * Operation Unit Test
	 * Save an existing Apppic entity
	 * 
	 */
	@Test
	public void saveApppic() {
		// TODO: JUnit - Populate test inputs for operation: saveApppic 
		Apppic apppic_1 = new edu.utcluj.proiect.domain.Apppic();
		service.saveApppic(apppic_1);
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
