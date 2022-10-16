package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld helloWorld1 = context.getBean("helloworld", HelloWorld.class);
        HelloWorld helloWorld2 = context.getBean("helloworld", HelloWorld.class);

        System.out.println(helloWorld1.getMessage());
        System.out.println(helloWorld2 == helloWorld1);

        Cat cat1 = context.getBean("cat", Cat.class);
        Cat cat2 = context.getBean("cat", Cat.class);

        System.out.println(cat1);
        System.out.println(cat1 == cat2);




    }
}
