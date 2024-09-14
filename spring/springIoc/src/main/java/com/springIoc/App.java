package com.springIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext iocContainer=new ClassPathXmlApplicationContext("beans.xml");
    		Airtel airtelsim = iocContainer.getBean("airtelsim",Airtel.class);
    	airtelsim.call();
    	airtelsim.data();
    }
}
