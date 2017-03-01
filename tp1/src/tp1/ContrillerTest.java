package tp1;

import static org.junit.Assert.*;

import org.junit.Test;


public class ContrillerTest {

	@Test
	public void TestisValidUser() {
		Controller controller = new Controller();
		User user = new User("Salwa","S123");
		
		boolean expectresult = true;
		boolean result = controller.isValidUser(user.getUsername());
		
		assertEquals(expectresult,result);
	}

	@Test
	public void TestisValidUserPassword() {
		Controller controller = new Controller();
		User user = new User("Salwa","S123");
		
		boolean expectresult = true;
		boolean result = controller.isValidUserPassword(user.getMdp());
		
		assertEquals(expectresult,result);
	}

	@Test
	public void TestisValidUserPasswordContent() {
		Controller controller = new Controller();
		User user = new User("Salwa","S123");
		
		boolean expectresult = true;
		boolean result = controller.isValidUserPasswordContent(user.getMdp());

		assertEquals(expectresult,result);
	}

	
}
