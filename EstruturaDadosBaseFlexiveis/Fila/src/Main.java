public class Main {
    
    public static void main(String[] args) throws Exception {
        Fila fila = new Fila();

        fila.inserir(3);
        fila.inserir(5);
        fila.inserir(7);
        fila.mostar();
        fila.inserir(9);
        fila.inserir(11);
        fila.remover();
        fila.inserir(13);
        fila.mostar();
        fila.remover();
        fila.remover();
        fila.mostar();
        fila.remover();
        fila.mostar();
    }
}
