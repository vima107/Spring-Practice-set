package com.qn.spring.spring_di;

import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext	cpx=new ClassPathXmlApplicationContext("configure.xml");
    	
    	JavaTrainer jt=(JavaTrainer)cpx.getBean("jt");
    	SqlTrainer st=(SqlTrainer)cpx.getBean("st");
    	WebTrainer wt=(WebTrainer)cpx.getBean("wt");
    	
    	System.out.println(jt.getName());
    	System.out.println(st.getName());
    	System.out.println(wt.getName());
    }
}
