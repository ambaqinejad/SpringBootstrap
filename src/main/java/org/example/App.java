package org.example;

//import org.springframework.beans.factory.BeanFactory;
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
//        BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
        Alien a = factory.getBean("alien", Alien.class);
        a.code();
        System.out.println(a.getAge());
    }
}
