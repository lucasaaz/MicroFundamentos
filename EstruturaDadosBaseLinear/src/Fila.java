public class Fila {
    int [] array;
    int primeiro, ultimo;

    //CONSTRUTORES
    Fila(){
        this(0);
    }

    Fila(int tamanho){
        array = new int[tamanho+1];
        primeiro = ultimo = 0;
    }




    //Inserir
    public void inserir(int x) throws Exception{

        if(((ultimo + 1) % array.length) == primeiro)
        throw new Exception("Erro!");

        array[ultimo] = x;
        ultimo = (ultimo + 1) % array.length;

    }//end Inserir();





    //Remover
    public int remover() throws Exception{
        if(primeiro == ultimo){
            throw new Exception("Erro!");
        }

        int resp = array[primeiro];
        primeiro = (primeiro + 1) % array.length;

        return resp;
    }//end Inserir();





    //Mostar
    public void mostar(){
        System.out.print("\n [ " );
        for(int i = primeiro; i!=ultimo; i = (i+1) % array.length){
            System.out.print(array[i] + " ");
        }
        System.out.print("]\n" );
    }





    public static void main(String [] args) throws Exception{
        Fila fila = new Fila(5);

        fila.inserir(1);
        fila.inserir(7);
        fila.inserir(2);
        fila.inserir(9);
        fila.mostar();
        fila.remover();
        fila.remover();
        fila.remover();
        fila.mostar();
        fila.inserir(10);
        fila.inserir(11);
        fila.inserir(12);
        fila.mostar();
        fila.remover();
        fila.mostar();
    }




}
