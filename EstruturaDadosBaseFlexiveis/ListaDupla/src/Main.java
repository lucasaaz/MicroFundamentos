public class Main {
    
    public static void main(String[] args) throws Exception {
        ListaDupla lista = new ListaDupla();

        lista.inserirInicio(3);
        lista.inserirInicio(5);
        lista.inserirInicio(7);
        lista.inserirInicio(9);
        lista.inserirInicio(11);
        lista.inserirInicio(13);
        lista.inserirInicio(15);
        lista.inserirInicio(17);
        lista.mostrar();
        lista.tamanho();
        lista.removerInicio();
        lista.removerInicio();
        lista.removerInicio();
        lista.removerInicio();
        lista.mostrar();
        lista.tamanho();
        lista.inserirFim(5);
        lista.inserirFim(3);
        lista.inserirFim(1);
        lista.mostrar();
        lista.tamanho();
        lista.removerInicio();
        lista.removerInicio();
        lista.removerInicio();
        lista.mostrar();
        lista.tamanho();
        lista.inserir(2, 4);
        lista.inserir(4, 0);
        lista.inserir(6, 6);
        lista.inserir(8, 1);
        lista.mostrar();
        lista.tamanho();
        lista.remover(0);
        lista.mostrar();
        lista.tamanho();
        lista.remover(5);
        lista.mostrar();
        lista.tamanho();
        lista.remover(3);
        lista.mostrar();
        lista.tamanho();
    }
}
