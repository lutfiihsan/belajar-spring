package belajar.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoIoCSpring {
public static void main(String[] args) {
	ApplicationContext springContainer	= new ClassPathXmlApplicationContext("belajar-ioc.xml");
	
	NasabahDaoIoC nasabahDao = (NasabahDaoIoC) springContainer.getBean("nd");
	nasabahDao.simpan();
}
}
