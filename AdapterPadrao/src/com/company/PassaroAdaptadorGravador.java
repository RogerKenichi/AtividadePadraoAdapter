package com.company;

public class PassaroAdaptadorGravador implements GravadorCelular {
    Passaro passaro;
    public PassaroAdaptadorGravador(Passaro passaro)
    {
        this.passaro = passaro;
    }

    public void emitirSomGravador()
    {
        passaro.emitirSom();
    }
}
