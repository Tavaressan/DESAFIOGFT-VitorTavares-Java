package model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class Pessoa {

    private final String nome;

    public void saudacao () {
        System.out.println("Olá, sou " + getNome() + ".");
    }
}
