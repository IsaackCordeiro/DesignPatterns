package Command.command;

import Command.model.Lampada;

public class AcenderCommand implements Command {
    private Lampada lampada;
    public AcenderCommand (Lampada lampada){
        this.lampada = lampada;
    }

    @Override
    public void executar() {
        lampada.acender();
    }
}
