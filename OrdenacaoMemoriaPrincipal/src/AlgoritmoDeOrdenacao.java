import java.util.Random;

public class AlgoritmoDeOrdenacao{

    //Definir tamanho do array
    static int TAM = 10;

    //Preencher o array com elementos aléatorios
    public static void preencherArray(int [] array){
        Random rnd = new Random();

        for(int i = 0; i < TAM; i++){
            array[i] = rnd.nextInt(100);
        }

    }//end PreencherArray()



    //Imprimir elementos do array
    public static void imprimirArray(int [] array){
        System.out.print("\n[ ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.print("]\n");

    }//end ImprimirArray()



    //Swap
    public static void swap(int i, int j, int [] array){
        int  tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
        
    }//end Swap()












    /*
    *
    *  MÉTODOS DE PESQUISA
    *
    */


    //Pesquisar Sequencial
    public static void pesquisaSequencial(int [] array){
        boolean resultado = false;

        MyIO.print("\nQual valor deseja procurar? ");
        int valor = MyIO.readInt();

        for(int i =0; i<TAM; i++){

            if(array[i] == valor){
                resultado = true;
                i = TAM;
            }
        }

        if (resultado) {
            MyIO.print("\nO valor " + valor + " foi encontrado com SUCESSO!!\n");
        }else{
            MyIO.print("\nO valor " + valor + " NAO foi encontrado.\n");
        }

    }//end PesquisaSequencial()




    //Pesquisa Binária
    public static void pesquisaBinaria(int [] vetor, int tam){
        boolean resultado = false;

        int dir = tam - 1;
        int esq = 0;
        int meio = 0;

        MyIO.print("\nQual valor deseja procurar? ");
        int valor = MyIO.readInt();

        while(esq <= dir){
            meio = (esq + dir)/2;
            if( valor == vetor[meio]){
                resultado = true;
                esq = tam;
            } else if(valor < vetor[meio]){
                dir = meio - 1;
            } else if(valor > vetor[meio]){
                esq = meio + 1;
            }
        }

        if (resultado) {
            MyIO.print("\nO valor " + valor + " foi encontrado com SUCESSO!!\n");
        }else{
            MyIO.print("\nO valor " + valor + " NAO foi encontrado.\n");
        }

    }//end PesquisaBinaria()












    /*
    *
    *  MÉTODOS DE ORDENAÇÃO
    *
    */


    //SELEÇÃO 
    public static void selecao(int [] array, int tam){
        int i, j, menor;

        for (i = 0; i < tam - 1; i++){
            menor = i;

            for (j = i + 1; j < tam; j++){
                
                if (array[menor] > array[j]){
                    menor = j;
                }
            }
            swap(menor, i, array);
        }
    }//end Seleção




    //INSERÇÃO 
    public static void insercao(int [] array, int tam){
        for(int i = 1; i < tam; i++){
            int tmp = array[i];
            int j = i - 1;

            while ( (j >= 0) && (array[j] > tmp) ){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = tmp;
        }
    }//end Inserção()




    //QUICKSORT
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
                swap(i,j, vetor);
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

    }//end QuickSort()




    //Método BOLHA (BUBBLESORT)
    public static void bubblesort(int [] vetor){
        boolean houveTroca = true;
        for(int rep = 0; rep < TAM-1 && houveTroca; rep++){
            houveTroca = false;
            for(int b = 0; b < TAM-(rep + 1); b++){
                if (vetor[b] > vetor[b + 1]) {
                    //Swap
                    int tmp = vetor[b];
                    vetor[b] = vetor[b+1];
                    vetor[b+1] = tmp;
                    houveTroca = true;
                }
            }
        }
    }//end BubbleSort()




    //SHELLSORT
    public static void shellSort(int [] vetor){
        int h = 1;
        do{
            h = (h * 3) + 1;
        }while(h < TAM);
        do{
            h/=3;
            for(int cor = 0; cor < h; cor++){
                insercaoPorCor(cor, h, vetor);
            }
        }while(h != 1);

    }//end ShellSort()

    public static void insercaoPorCor(int cor, int h, int [] vetor){
        for(int i = (h + cor); i < TAM; i+=h){
            int tmp = vetor[i];
            int j = i-h;
            while ((j >= 0) && (vetor[j] > tmp)) {
                vetor[j+h] = vetor[j];
                j-=h;
            }
            vetor[j+h] = tmp;
        }
    }//end InsercaoPorCor




    //COUNTINGSORT
    public static void countingSort(int [] vetor){
        int max = maiorElemento(vetor);
        //Vetor para contar o numero de ocorrencias de cada elemento
        int [] count = new int[max+1];
        int [] ordenado = new int[TAM + 1];

        //Inicializar a cada posição do vetor de contagem
        for(int i = 0; i < count.length; i++){
            count[i] = 0;
        }

        //Agora, o count[i] contem o numero de elementos iguais a i
        for( int i = 0; i < TAM; i++){
            count[vetor[i]]++;
        }

        //Agora, o count[i] contem o numero de elementos menores ou iguais a i
        for( int i = 1; 1 <= count.length; i++){
            count[i] += count[i - 1];
        }

        //Ordenado
        for(int i = TAM-1; i >= 0; i--){
            ordenado[count[vetor[i]] - 1] = vetor[i];
            count[vetor[i]]--;
        }

    }
    //Maior elemento do array
    public static int maiorElemento(int [] array){
        int maior = 0;
        for(int i = 0; i < TAM; i++){
            if (array[1] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }




    //MERGESORT
    public static void mergeSort(int esq, int dir, int [] vetor){
        if( esq < dir){
            int meio = (esq + dir) / 2;
            mergeSort(esq, meio, vetor);
            mergeSort(meio+1, dir, vetor);
            intercalar(esq, meio, dir, vetor);
        }
    }
    //Intercalar
    public static void intercalar(int esq, int meio, int dir, int [] vetor){
        int nEsq = (meio+1)-esq;
        int nDir = (dir - meio);

        int [] arrayEsq = new int[nEsq+1];
        int [] arrayDir = new int[nDir+1];

        //Sentinela no final dos dois arrays
        arrayEsq[nEsq] = arrayDir[nDir] = 0x7FFFFFFF;

        int iEsq, iDir, i;

        //Inicializar primeiro subarray
        for(iEsq = 0; iEsq < nEsq; iEsq++ ){
            arrayEsq[iEsq] = vetor[esq + iEsq];
        }

        //Inicializar segundo subarray
        for(iDir = 0; iDir < nDir; iDir++ ){
            arrayDir[iDir] = vetor[(meio+1)+iDir];
        }

        //Intercalacao propriamente dita
        for(iEsq = iDir = 0, i = esq; i <= dir; i++){
            vetor[i] = (arrayEsq[iEsq] <= arrayDir[iDir]) ? arrayEsq[iEsq++] : arrayDir[iDir++];
        }
    }




    //HEAPSORT
    public static void heapSort(int [] vetor, int TAM){
        //Construção do heap
        for(int tam = 2; tam <= TAM; tam++){
            construir(vetor, tam);
        }

        //Ordenação propriamente dita
        int tam = TAM;
        while(tam > 1){
            swap(1, tam--, vetor);
            reconstruir(vetor, tam);
        }
    }
    //Construir
    public static void construir(int [] vetor, int tam){
        for(int i = tam; i > 1 && vetor[i] > vetor[i/2]; i /= 2){
            swap(i, i/2, vetor);
        }
    }
    //Reconstruir
    public static void reconstruir(int [] vetor, int tam){
        int i = 1;
        while(hasFilho(i, tam) == true){
            int filho = getMaiorFilho(vetor, i, tam);
            if(vetor[i] < vetor[filho]){
                swap(i, filho, vetor);
                i = filho;
            }else{
                i = tam;
            }
        }
    }
    //Maior Filho
    public static int getMaiorFilho(int [] vetor, int i, int tam){
        int filho;
        if(2*i == tam || vetor[2*i] > vetor[2*i + 1]){
            filho = 2*i;
        }else{
            filho = 2*i + 1;
        }
        return filho;
    }
    //Tem Filho
    public static boolean hasFilho(int i, int tam){
        return (i <= (tam/2));
    }











    /*
    *
    *  MÉTODOS PRINCIPAL
    *
    */

    public static void main(String [] args){

        //Array
        int [] array = new int[TAM];

        //Prencher elementos array
        preencherArray(array);

        //Mostra array antes de ordenar
        System.out.print("\nAntes: ");
        imprimirArray(array);





    /*
    *  MÉTODOS DE ORDENAÇÃO
    */
        //insercao     (array, TAM);
        //selecao      (array, TAM);
        quicksort    (0, TAM-1, array);
        //bubblesort   (array);
        //shellSort    (array);
        //countingSort (array);           +-
        //mergeSort    (0, TAM-1, array);
        //heapSort     (array, TAM);      +-





    /*
    *  MÉTODOS DE PESQUISA
    */
        //pesquisaSequencial(array);
        //pesquisaBinaria(array, TAM);





        //Mostra array depois de ordenar
        System.out.print("\nDepois: ");
        imprimirArray(array); 
        System.out.print("\n");



    }//end main()

}//end AlgoritimoDeOrdenacao
