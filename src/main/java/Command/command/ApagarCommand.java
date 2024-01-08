package Command.command;

import Command.model.Lampada;

public class ApagarCommand implements Command {
    private Lampada lampada;

    public ApagarCommand(Lampada lampada) {
        this.lampada = lampada;
    }

    @Override
    public void executar(){
        lampada.apagar();
    }
}
