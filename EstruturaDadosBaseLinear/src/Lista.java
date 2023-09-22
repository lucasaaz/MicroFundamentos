public class Lista {
    int [] array;
    int n;

    //CONSTRUTOR
    Lista (){
        this(0);
    }

    Lista (int tamanho){
        array = new int[tamanho];
        n = 0;
    }





    //Inserir no INICIO
    public void inserirInicio(int x) throws Exception{
        if( n >= array.length){
            throw new Exception("Erro!");
        }

        //Levar elementos para o fim do array
        for(int i = n; i > 0; i--){
            array[i] = array[i-1];
        }

        array[0] = x;
        n++;
    }//end InserirInicio();





    //Inserir no FiM
    public void inserirFim(int x) throws Exception{
        if( n >= array.length){
            throw new Exception("Erro!");
        }       

        //Inserir direto no final do array
        array[n] = x;
        n++;
    }//end InserirFim();





    //Inserir
    public void inserir(int x, int pos) throws Exception{
        if( n >= array.length || pos < 0 || pos > n){
            throw new Exception("Error!");
        }
 
        for(int i = n; i>pos; i--){
            array[i] = array[i-1];
        }
        
        /* MEU METODO
        int i = n;
        do{
            array[i] = array[i-1];
            i--;
        }while(pos != i);
        */

        array[pos] = x;
        n++;
    }//end Inserir();





    //Remover no INICIO
    public int removerInicio() throws Exception{
        if(n == 0){
            throw new Exception("Erro!");
        }

        int resp = array[0];
        n--;

        for(int i = 0; i<n; i++){
            array[i] = array[i+1]; 
        }

        return resp;
    }//end RemoverInicio();





    //Remover no FIM
    public int removerFim() throws Exception{
        if(n == 0){
            throw new Exception("Erro!");
        }

        int resp = array[n];
        n--;

        return resp;
    }//end RemoverFim();





    //Remover 
    public int remover(int pos) throws Exception{
        if(n == 0 || pos < 0 || pos >= n){
            throw new Exception("Erro!");
        }

        int resp = array[pos];
        n--;

        for(int i = pos; i<n; i++){
            array[i] = array[i+1];
        }

        return resp;
    }//end Remover();





    //Mostar elementos do array
    public void mostrar(){

        System.out.print("\n [ ");
        for(int i = 0; i<n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("]\n");
    }//end Mostar();





    public static void main(String[] args) throws Exception{
        Lista lista = new Lista(6);

        lista.inserirInicio(2);
        lista.inserirInicio(1);
        lista.inserirFim(10);
        lista.inserirFim(12);
        lista.inserir(8, 2);
        lista.inserir(6, 1);
        lista.mostrar();
        lista.removerInicio();
        lista.mostrar();
        lista.removerFim();
        lista.mostrar();
        lista.remover(1);
        lista.mostrar();
        
    }



}
