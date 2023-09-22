/*
using System;

class MainOI{

    //Definir tamanho do vetor []
    const int TAM = 100;
    static int contador;

    //Preencher vetor [] com valores aleatórios
    public static void preencherVetor(int [] vetor){
        Random rnd = new Random();
        for (int i = 0; i < TAM; i++) {
            vetor[i] = rnd.Next(100);
        }
    }

    //Imprimir vetor []
    public static void imprimirVetor(int [] vetor){
        Console.Write("\n[ ");
        foreach( int x in vetor){
            Console.Write(x + " ");
        }
        Console.Write("]");
    }

    //Inserção - Método de ordenação
    public static async void insercao(int [] array, int tam){
        for(int i = 1; i < tam; i++){
            int tmp = array[i];
            int j = i - 1;

            while ( (j >= 0) && (array[j] > tmp) ){
                array[j + 1] = array[j];
                contador++;
                j--;
            }
            array[j + 1] = tmp;
        }
    }

    public static void Main(String[] args){
        int [] vetor = new int[TAM];
        
        preencherVetor(vetor);

        imprimirVetor(vetor);

        insercao(vetor, TAM );

        Console.Write("\n\n[ ");
        foreach(int item in vetor){
            Console.Write(item + " ");
        }
        Console.Write("]");
        Console.WriteLine("\n\nNumero de comparações: " + contador);
    }

}
*/










