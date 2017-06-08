package final1531;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class first {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		tv tele =new tv("String","String");
		tele.powerOn();
	    tele.powerOff();
		tele.changeChannel(2);
		tele.changeVolume(2);
		assertEquals(2,tele.getvolume());
	}

}
