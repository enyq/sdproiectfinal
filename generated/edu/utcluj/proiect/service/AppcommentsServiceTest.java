package edu.utcluj.proiect.service;

import edu.utcluj.proiect.domain.Appcomments;
import edu.utcluj.proiect.domain.Apppic;

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
public class AppcommentsServiceTest {

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
	protected AppcommentsService service;

	/**
	 * Instantiates a new AppcommentsServiceTest.
	 *
	 */
	public AppcommentsServiceTest() {
		setupRequestContext();
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Apppic entity
	 * 
	 */
	@Test
	public void deleteAppcommentsApppic() {
		// TODO: JUnit - Populate test inputs for operation: deleteAppcommentsApppic 
		Integer appcomments_appcommentsid = 0;
		Integer related_apppic_apppicid = 0;
		Appcomments response = null;
		response = service.deleteAppcommentsApppic(appcomments_appcommentsid, related_apppic_apppicid);
		// TODO: JUnit - Add assertions to test outputs of operation: deleteAppcommentsApppic
	}

	/**
	 * Operation Unit Test
	 * Load an existing Appcomments entity
	 * 
	 */
	@Test
	public void loadAppcommentss() {
		Set<Appcomments> response = null;
		response = service.loadAppcommentss();
		// TODO: JUnit - Add assertions to test outputs of operation: loadAppcommentss
	}

	/**
	 * Operation Unit Test
	 * Delete an existing Appcomments entity
	 * 
	 */
	@Test
	public void deleteAppcomments() {
		// TODO: JUnit - Populate test inputs for operation: deleteAppcomments 
		Appcomments appcomments = new edu.utcluj.proiect.domain.Appcomments();
		service.deleteAppcomments(appcomments);
	}

	/**
	 * Operation Unit Test
	 */
	@Test
	public void findAppcommentsByPrimaryKey() {
		// TODO: JUnit - Populate test inputs for operation: findAppcommentsByPrimaryKey 
		Integer appcommentsid = 0;
		Appcomments response = null;
		response = service.findAppcommentsByPrimaryKey(appcommentsid);
		// TODO: JUnit - Add assertions to test outputs of operation: findAppcommentsByPrimaryKey
	}

	/**
	 * Operation Unit Test
	 * Save an existing Appcomments entity
	 * 
	 */
	@Test
	public void saveAppcomments() {
		// TODO: JUnit - Populate test inputs for operation: saveAppcomments 
		Appcomments appcomments_1 = new edu.utcluj.proiect.domain.Appcomments();
		service.saveAppcomments(appcomments_1);
	}

	/**
	 * Operation Unit Test
	 * Save an existing Apppic entity
	 * 
	 */
	@Test
	public void saveAppcommentsApppic() {
		// TODO: JUnit - Populate test inputs for operation: saveAppcommentsApppic 
		Integer appcommentsid_1 = 0;
		Apppic related_apppic = new edu.utcluj.proiect.domain.Apppic();
		Appcomments response = null;
		response = service.saveAppcommentsApppic(appcommentsid_1, related_apppic);
		// TODO: JUnit - Add assertions to test outputs of operation: saveAppcommentsApppic
	}

	/**
	 * Operation Unit Test
	 * Return a count of all Appcomments entity
	 * 
	 */
	@Test
	public void countAppcommentss() {
		Integer response = null;
		response = service.countAppcommentss();
		// TODO: JUnit - Add assertions to test outputs of operation: countAppcommentss
	}

	/**
	 * Operation Unit Test
	 * Return all Appcomments entity
	 * 
	 */
	@Test
	public void findAllAppcommentss() {
		// TODO: JUnit - Populate test inputs for operation: findAllAppcommentss 
		Integer startResult = 0;
		Integer maxRows = 0;
		List<Appcomments> response = null;
		response = service.findAllAppcommentss(startResult, maxRows);
		// TODO: JUnit - Add assertions to test outputs of operation: findAllAppcommentss
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
