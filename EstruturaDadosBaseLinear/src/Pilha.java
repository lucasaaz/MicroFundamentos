public class Pilha {
    int [] array;
    int n;

    //CONSTRUTOR
    Pilha (){
        this(0);
    }

    Pilha (int tamanho){
        array = new int[tamanho];
        n = 0;
    }



    //Inserir 
    public void inserir(int x) throws Exception{
        if( n >= array.length){
            throw new Exception("Erro!");
        }       

        //Inserir direto no final do array
        array[n] = x;
        n++;
    }//end Inserir();





    //Remover 
    public int remover() throws Exception{
        if(n == 0){
            throw new Exception("Erro!");
        }

        int resp = array[n];
        n--;

        return resp;
    }//end Remover();





    //Mostrar
    public void mostrar(){

        System.out.print("\n [ ");
        for(int i = 0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("]\n");
    }






    public static void main(String [] args) throws Exception{
        Pilha pilha = new Pilha(6);

        pilha.inserir(2);
        pilha.inserir(1);
        pilha.inserir(3);
        pilha.inserir(5);
        pilha.inserir(4);
        pilha.mostrar();
        pilha.remover();
        pilha.remover();
        pilha.mostrar();


    }






}
