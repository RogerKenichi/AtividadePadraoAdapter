package com.company;

public class PassaroAdaptador implements Brinquedo {
    Passaro passaro;
    public PassaroAdaptador(Passaro passaro)
    {
        this.passaro = passaro;
    }

    public void emitirSomBrinquedo()
    {
        passaro.emitirSom();
    }
}
