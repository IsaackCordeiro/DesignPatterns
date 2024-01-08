package State.state;

import State.model.Porta;

public class Fechada extends Estado {
    public Fechada(Porta porta) {
        super(porta);
        System.out.println("A porta está fechada");
    }

    @Override
    public void trancar() {
        porta.setEstado(new Trancada(porta));
    }

    @Override
    public void abrir() {
        porta.setEstado(new Aberta(porta));
    }

}
