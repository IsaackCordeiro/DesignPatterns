package State.state;

import State.model.Porta;

public class Aberta extends Estado {
    public Aberta(Porta porta) {
        super(porta);
        System.out.println("A porta está aberta");
    }

    @Override
    public void fechar() {
        porta.setEstado(new Fechada(porta));
    }
}
