package State.model;

import State.state.Estado;
import State.state.Fechada;

public class Porta {
    private String nome;
    private Estado estado;
    private boolean trancada;

    public Porta(String nome) {
        this.nome = nome;
        estado = new Fechada(this);
    }

    public void abrir() {
        estado.abrir();
    }

    // o mesmo ocorre para fechar, trancar e destrancar

    //gets e sets

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTrancada(boolean trancada) {
        this.trancada = trancada;
    }
}
