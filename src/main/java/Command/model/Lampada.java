package Command.model;

public class Lampada {
    private boolean on;

    public Lampada(boolean on) {
        this.on = on;
    }

    public void acender(){
        if(on){
            throw new RuntimeException("Lampada já se encontra acesa");
        }

        System.out.println("A lampada foi acesa");
        this.on = true;
    }

    public void apagar(){
        if(!on){
            throw new RuntimeException("Lampada já se encontra apagada");
        }
        System.out.println("A lampada foi apagada");
        this.on = true;
        this.on = false;
    }
}
