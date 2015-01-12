package edu.utcluj.proiect.web;

import org.junit.Test;

import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;

import org.springframework.context.ApplicationContext;

import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.RequestScope;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.SessionScope;

/**
 * Unit test for the <code>AppusersController</code> controller.
 *
 * @see edu.utcluj.proiect.web.AppusersController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/ProiectSD2-security-context.xml",
		"file:./resources/ProiectSD2-service-context.xml",
		"file:./resources/ProiectSD2-dao-context.xml",
		"file:./resources/ProiectSD2-web-context.xml" })
public class AppusersControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editAppusersApppics()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAppusersApppics() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAppusersApppics");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAppusersApppics()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAppusersApppics() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAppusersApppics");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAppusersApppics()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAppusersApppics() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAppusersApppics");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAppusersApppics()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAppusersApppics() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAppusersApppics");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAppusersApppics()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAppusersApppics() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAppusersApppics");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAppusersApppics()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAppusersApppics() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAppusersApppics");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAppusersApppics()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAppusersApppics() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAppusersApppics");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>appusersControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetappusersControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/appusersController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppusersController controller = (AppusersController) context.getBean("AppusersController");

		// TODO Invoke method and Assert return values

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
	 * Returns a mock HttpServletRequest object.
	 *
	 */
	private MockHttpServletRequest getMockHttpServletRequest() {
		MockHttpServletRequest request = new MockHttpServletRequest();
		ServletRequestAttributes attributes = new ServletRequestAttributes(request);
		RequestContextHolder.setRequestAttributes(attributes);
		return request;
	}

	/**
	 * Returns a mock HttpServletResponse object.
	 *
	 */
	private MockHttpServletResponse getMockHttpServletResponse() {
		return new MockHttpServletResponse();
	}
}