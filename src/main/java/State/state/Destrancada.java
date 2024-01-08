package State.state;

import State.model.Porta;

public class Destrancada extends Estado{
    public Destrancada(Porta porta){
        super(porta);
        System.out.println("Porta destrancada");
    }

    @Override
    public void abrir(){
        porta.setEstado(new Aberta(porta));
    }

    @Override
    public void trancar(){
        porta.setEstado(new Trancada(porta));
    }
}
