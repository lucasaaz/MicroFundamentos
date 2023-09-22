
public class Main {

    public static void main(String [] args) throws Exception{

        Pilha pilha = new Pilha();

        pilha.inserir(3);
        pilha.inserir(5);
        pilha.inserir(7);
        pilha.mostar();
        pilha.inserir(9);
        pilha.inserir(11);
        pilha.inserir(13);
        pilha.mostar();
        pilha.remover();
        pilha.remover();
        pilha.mostar();
        pilha.remover();
        pilha.remover();
        pilha.remover();
        pilha.mostar();

    }
}
