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
 * Unit test for the <code>ApppicController</code> controller.
 *
 * @see edu.utcluj.proiect.web.ApppicController
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"file:./resources/ProiectSD2-security-context.xml",
		"file:./resources/ProiectSD2-service-context.xml",
		"file:./resources/ProiectSD2-dao-context.xml",
		"file:./resources/ProiectSD2-web-context.xml" })
public class ApppicControllerTest {
	/**
	 * The Spring application context.
	 *
	 */
	private ApplicationContext context;

	/**
	 * Test <code>editApppicAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditApppicAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editApppicAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newApppicAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewApppicAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newApppicAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveApppicAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveApppicAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveApppicAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteApppicAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteApppicAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteApppicAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteApppicAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteApppicAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteApppicAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectApppicAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectApppicAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectApppicAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listApppicAppusers()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistApppicAppusers() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listApppicAppusers");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editApppicAppcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditApppicAppcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editApppicAppcommentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newApppicAppcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewApppicAppcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newApppicAppcommentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveApppicAppcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveApppicAppcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveApppicAppcommentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteApppicAppcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteApppicAppcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteApppicAppcommentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteApppicAppcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteApppicAppcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteApppicAppcommentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectApppicAppcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectApppicAppcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectApppicAppcommentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>listApppicAppcommentses()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetlistApppicAppcommentses() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/listApppicAppcommentses");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>indexApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetindexApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/indexApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>selectApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetselectApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/selectApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>editApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GeteditApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/editApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>saveApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetsaveApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/saveApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>newApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetnewApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/newApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>confirmDeleteApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetconfirmDeleteApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/confirmDeleteApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>deleteApppic()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetdeleteApppic() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/deleteApppic");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

		// TODO Invoke method and Assert return values

	}

	/**
	 * Test <code>apppicControllerbinaryaction()</code>.
	 */
	@Test
	@SuppressWarnings("unused")
	public void GetapppicControllerbinaryaction() throws Exception {
		MockHttpServletRequest request = getMockHttpServletRequest();
		request.setRequestURI("/apppicController/binary.action");
		MockHttpServletResponse response = getMockHttpServletResponse();

		// Get the singleton controller instance
		ApppicController controller = (ApppicController) context.getBean("ApppicController");

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