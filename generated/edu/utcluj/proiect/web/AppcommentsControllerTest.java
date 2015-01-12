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
 * Unit test for the <code>AppcommentsController</code> controller.
 *
 * @see edu.utcluj.proiect.web.AppcommentsController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/ProiectSD2-security-context.xml",
		"file:./resources/ProiectSD2-service-context.xml",
		"file:./resources/ProiectSD2-dao-context.xml",
		"file:./resources/ProiectSD2-web-context.xml" })
public class AppcommentsControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editAppcommentsApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAppcommentsApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAppcommentsApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAppcommentsApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAppcommentsApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAppcommentsApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAppcommentsApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAppcommentsApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAppcommentsApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAppcommentsApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAppcommentsApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAppcommentsApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAppcommentsApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAppcommentsApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAppcommentsApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAppcommentsApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAppcommentsApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAppcommentsApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listAppcommentsApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistAppcommentsApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listAppcommentsApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexAppcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexAppcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexAppcomments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectAppcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectAppcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectAppcomments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editAppcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditAppcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editAppcomments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveAppcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveAppcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveAppcomments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newAppcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewAppcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newAppcomments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteAppcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteAppcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteAppcomments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteAppcomments()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteAppcomments() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteAppcomments");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>appcommentsControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetappcommentsControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/appcommentsController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		AppcommentsController controller = (AppcommentsController) context.getBean("AppcommentsController");

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