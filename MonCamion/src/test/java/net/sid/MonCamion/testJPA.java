package net.sid.MonCamion;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testJPA {

	@Test
	public void test1() {
		
		try {
			ClassPathXmlApplicationContext app=
					new ClassPathXmlApplicationContext(new String[]{"ApplicationContext.xml"});
					assertTrue(true);
		} catch (Exception e) {
}
		

	}

}
