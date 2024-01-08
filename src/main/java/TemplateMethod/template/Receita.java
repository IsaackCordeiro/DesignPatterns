package TemplateMethod.template;

public abstract class Receita {
    public final void cook(){
        prepararIngredientes();
        cozinharIngredientes();
        servir();
    }

    protected abstract void prepararIngredientes();
    protected abstract void cozinharIngredientes();
    protected abstract void servir();

}
