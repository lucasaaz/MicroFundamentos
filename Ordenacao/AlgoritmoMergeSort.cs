using System;

class MainOM{

    //Definir tamanho do array
    const int TAM = 10;

    //Preencher array com elementos aleátorios
    public static void preencherVetor(int [] vetor){
        Random rnd = new Random();
        for(int i = 0; i < TAM; i++){
            vetor[i] = rnd.Next(100);
        }
    }

    //Imprimir vetor 
    public static void imprimirVetor(int [] vetor){
        Console.Write("\n[ ");
        foreach (int item in vetor){
            Console.Write(item + " ");
        }
        Console.Write("]\n");
    }

    //MergeSort
    public static void mergeSort(int esq, int dir, int [] vetor){
        if(esq < dir){
            int meio = (esq + dir) / 2;
            mergeSort(esq, meio, vetor);
            mergeSort(meio + 1, dir, vetor);
            intercalar(esq, meio, dir, vetor);
        }
    }

    public static void intercalar(int esq, int meio, int dir, int [] vetor){
        //Definir tamanho dos dois subarrays
        int nEsq = (meio+1)-esq;
        //   4
        int nDir = dir - meio;
        //   4

        int[] arrayEsq = new int[nEsq+1];
        //                          5
        int[] arrayDir = new int[nDir+1];
        //                          5

        //Sentinela no final dos dois arrays
        arrayEsq[nEsq] = arrayDir[nDir] = 0x7FFFFFFF;

        int iEsq, iDir, i;

        //Inicializar primeiro subarray
        for(iEsq = 0; iEsq < nEsq; iEsq++){
            arrayEsq[iEsq] = vetor[esq+iEsq];
        }

        //Inicializar segundo subarray
        for(iDir = 0; iDir < nDir; iDir++){
            arrayDir[iDir] = vetor[(meio+1)+iDir];
        }

        //Intercalacao propriamente dita
        for(iEsq = iDir = 0, i = esq; i <= dir; i++){
            vetor[i] = (arrayEsq[iEsq] <= arrayDir[iDir]) ? arrayEsq[iEsq++] : arrayDir[iDir++];
        }

    }


    public static void Main(String [] args){
        int [] vetor = new int[TAM];

        preencherVetor(vetor);

        imprimirVetor(vetor);

        mergeSort(0, TAM-1, vetor);

        imprimirVetor(vetor);
    }

}