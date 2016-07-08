package com.raltd;

import com.raltd.steps.HomePageStep;
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
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"config.xml"});
//        HomePageStep bs = (HomePageStep)context.getBean("baseStep");
//        bs.homePage.go();
        System.out.println( "Hello World!" );
    }
}
