package State.state;

import State.model.Porta;

public class Trancada extends Estado {
    public Trancada(Porta porta) {
        super(porta);
        porta.setTrancada(true);
        System.out.println("A porta está trancada");
    }

    @Override
    public void destrancar() {
        porta.setTrancada(false);
        System.out.print("Porta destrancada \n");
        porta.setEstado(new Fechada(porta));
    }

}
