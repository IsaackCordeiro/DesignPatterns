package Command.main;

import Command.command.AcenderCommand;
import Command.command.ApagarCommand;
import Command.model.ControleRemoto;
import Command.model.Lampada;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controleRemoto = new ControleRemoto();
        Lampada lampada = new Lampada(true);

        controleRemoto.setCommand(new ApagarCommand(lampada));
        controleRemoto.pressionarBotao();

        controleRemoto.setCommand(new AcenderCommand(lampada));
        controleRemoto.pressionarBotao();
    }
}
