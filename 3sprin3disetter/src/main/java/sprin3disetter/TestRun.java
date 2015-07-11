package sprin3disetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRun {

	public static void main(String[] args) {
		
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
			Helper heleprservice=	(Helper)context.getBean("serv");
			System.out.println(heleprservice.CheckValidationOFEmail("devdewance@gmail.com"));		
	}
}
