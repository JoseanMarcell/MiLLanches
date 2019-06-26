package com.senac.millanches.Modelos;

import java.sql.SQLClientInfoException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Gerador {

    private String cliente;
    private int quantidade;
    private List<Lista> fakes;

public Gerador (String cliente, int quantidade) {

    this.cliente = cliente;
    this.quantidade = quantidade;

}

public List<Lista> geraFakes(){
    Faker faker = new Faker (new Locale("pt-BR"));
    fakes = new ArrayList<>();
    for (int = 0, i< quantidade; i++){

    switch (cliente){
        case: "Clientes":
            fakes.add(new Lista(faker.name().fullName(), "Cliente"));
            break;
        case: "Comidas":
            fakes.add(new Lista(faker.name().name(), "Comida"));
            break;

        }
    }
    return fakes;
}

    public String getCliente() {
        return cliente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public List<Lista> getFakes() {
        return fakes;
    }
}
