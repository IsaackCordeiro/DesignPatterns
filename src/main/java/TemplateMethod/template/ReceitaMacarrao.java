package TemplateMethod.template;

public class ReceitaMacarrao extends Receita {
    @Override
    protected void prepararIngredientes(){
        System.out.println("Preparando ingredientes");
    }

    @Override
    protected void cozinharIngredientes(){
        System.out.println("Conzinhando a massa");
    }

    @Override
    protected void servir(){
        System.out.println("Servir macarrão");
    }
}
