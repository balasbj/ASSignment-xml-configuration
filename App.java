package com.tcs.Assignment;

/**
 * Hello world!
 *
 */
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
Car obj=(Car) context.getBean("car");

System.out.print("Select the brand : ");
Scanner sc=new  Scanner(System.in);
obj.setBrand(sc.nextLine());

System.out.println(obj);


System.out.println("Select the color: ");
Color clr=(Color) context.getBean("color");
clr.setColor(sc.nextLine());
System.out.println(clr);

System.out.println("Tyre :");
Tyre t=(Tyre) context.getBean("tyre");

t.setTyrebrand(sc.nextLine());
System.out.println(t);

System.out.println(""+obj + clr + t);

	

}
}
