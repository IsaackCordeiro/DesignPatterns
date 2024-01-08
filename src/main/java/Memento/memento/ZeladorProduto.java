package Memento.memento;

import java.util.Stack;

public class ZeladorProduto {
    private final Stack<MementoProduto> elementos = new Stack<>();
    private static ZeladorProduto instancia;

    private void ZeladorProduto() {
    }

    public static ZeladorProduto getInstancia() {
        if (instancia == null) {
            instancia = new ZeladorProduto();
        }
        return instancia;
    }

    public void add(MementoProduto memento) throws Exception {
        this.elementos.push(memento);
    }

    public MementoProduto getUltimo() throws Exception {
        if (!elementos.isEmpty()) {
            return elementos.pop();
        }
        throw new Exception("São há estados salvos");
    }

}
