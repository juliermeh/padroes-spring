package br.edu.ifpb.padroes.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Launcher {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Employee employee = (Employee) context.getBean("employee");
        System.out.println(employee);
    }

}
