package Command.model;

import Command.command.Command;

public class ControleRemoto {
    public Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void pressionarBotao(){
        command.executar();
    }
}
