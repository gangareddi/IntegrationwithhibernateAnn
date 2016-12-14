package com.integrationwithhibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
	
	@SuppressWarnings("resource")
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
	Dao dao = applicationContext.getBean(Dao.class);
//	dao.insert(new Creating("sahana","demagu","sahana@gmail.com"));
//	dao.insert(new Creating("aneeksha","demagu","gangareddy@gmail.com"));
//	dao.update(new Creating("aneeksha","sahana","gangareddy@gmail.com"));
   Creating creating = new Creating();
   creating.setFirstname("aneeksha");
	dao.delete(creating);
//}
}
}