package com.company;

public class Main {

    public static void main(String[] args) {
        Papagaio papagaio = new Papagaio();
        PassaroAdaptador papagaioDeBrinquedo = new PassaroAdaptador(papagaio);

        papagaioDeBrinquedo.emitirSomBrinquedo(); // Papagaio de brinquedo fazendo som de papagaio de verdade

        //Gravador Celular e Bem Te Vi
        Bem_te_vi bemTeVi = new Bem_te_vi();
        PassaroAdaptadorGravador gravadorDeCelular = new PassaroAdaptadorGravador(bemTeVi);

        gravadorDeCelular.emitirSomGravador();
    }
}
