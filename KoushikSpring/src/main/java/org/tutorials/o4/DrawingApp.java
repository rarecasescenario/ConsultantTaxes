package org.tutorials.o4;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class DrawingApp {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle tr = context.getBean("triangle-tutorial", Triangle.class);
		 tr.draw();
	}
	
	
	
	
	
	
	/**
	 * beanDefinitionsTest();
	 */
	private static void beanDefinitionsTest() {
		BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
		reader.loadBeanDefinitions(new ClassPathResource("spring.xml"));

		Triangle tr = (Triangle) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("triangle");
		tr.draw();
		
	}

}
