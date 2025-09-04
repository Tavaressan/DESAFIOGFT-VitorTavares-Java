package model;

import lombok.Getter;

@Getter
public class Cliente extends Pessoa{

    private final long numeroFidelidade;

    public Cliente(String nome, long numeroFidelidade) {
        super(nome);
        this.numeroFidelidade = numeroFidelidade;
    }

    @Override
    public void saudacao() {
        System.out.printf("Olá, sou " + getNome() + ", cliente número " + getNumeroFidelidade() + ".");
    }
}
