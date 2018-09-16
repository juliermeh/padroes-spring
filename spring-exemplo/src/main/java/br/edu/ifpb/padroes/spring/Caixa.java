package br.edu.ifpb.padroes.spring;

import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component("caixa")
public class Caixa implements MaquinaRegistradora, Serializable {

    public void registrar() {
        System.out.println("Caixa registrado");
    }

}
