package br.edu.ifpb.padroes.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Central {

    @Autowired
    @Qualifier("caixa")
    private MaquinaRegistradora registradora;

    @Autowired
    public Central(MaquinaRegistradora maquina){
        super();
        this.registradora = maquina;
    }

    public MaquinaRegistradora getRegistradora() { return registradora; }
    public void setRegistradora(MaquinaRegistradora registradora) { this.registradora = registradora; }
    public void registrar() { registradora.registrar(); }

}
