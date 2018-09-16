package br.edu.ifpb.padroes.spring.App;

import br.edu.ifpb.padroes.spring.Central;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launcher {

    public static void main(String [] args){
        ApplicationContext appcont = new ClassPathXmlApplicationContext("springconfiguration.xml");
        Central bean = (Central) appcont.getBean("Central");
        bean.registrar();
    }

}
