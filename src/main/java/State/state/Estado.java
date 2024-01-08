package State.state;

import State.model.Porta;

public class Estado {
    protected Porta porta;

    public Estado(Porta porta) {
        this.porta = porta;
    }

    public void abrir() {
        throw new RuntimeException("Não é possível abrir uma porta " + getNomeEstado());
    }

    public void fechar() {
        throw new RuntimeException("Não é possível fechar uma porta " + getNomeEstado());
    }

    public void trancar() {
        throw new RuntimeException("Não é possível trancar uma porta " + getNomeEstado());
    }

    public void destrancar() {
        throw new RuntimeException("Não é possível destrancar uma porta " + getNomeEstado());
    }

    private String getNomeEstado() {
        return this.getClass().getSimpleName().toLowerCase();
    }

}
