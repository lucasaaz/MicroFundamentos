/*
using System;

class MaioOQ{
    
    //Definir tamanho do array
    const int TAM = 100;

    //Preencher array com elementos aleátorios
    public static void preencherVetor(int [] vetor){
        Random rnd = new Random();
        for(int i = 0; i < TAM; i++){
            vetor[i] = rnd.Next(100);
        }
    }

    //Imprimir vetor 
    public static void imprimirVetor(int [] vetor){
        Console.Write("\n\n[ ");
        foreach (int item in vetor){
            Console.Write(item + " ");
        }
        Console.Write(" ]\n");
    }

    //Swap - Realiza a troca de posição de alguns elementos
    public static void Swap(int i, int j, int [] vetor){
        int tmp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = tmp;
    }

    //QuickSort
    public static void quicksort(int esq, int dir, int [] vetor){
        int pivo = vetor[(dir+esq)/2];
        int i = esq;
        int j = dir;

        if(i <= j){
            while(vetor[i] < pivo){
                i++;
            }
            while(vetor[j] > pivo){
                j--;
            }
            if(i <= j){
                Swap(i,j, vetor);
                i++;
                j--;
            }
        }
        if(esq < j){
            quicksort(esq, j, vetor);
        }
        if(i < dir){
            quicksort(i, dir, vetor);
        }

    }

    public static void Main(String [] args ){
        int [] vetor = new int[TAM];

        preencherVetor(vetor);

        Console.Write("\nAntes:");
        imprimirVetor(vetor);

        quicksort(0, TAM-1, vetor);

        Console.Write("\nDepois:");
        imprimirVetor(vetor);


    }


}//end MainOQ
*/