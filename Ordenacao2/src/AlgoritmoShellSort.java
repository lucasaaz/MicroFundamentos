import java.util.Random;

public class AlgoritmoShellSort {

    //Definir tamanho do array
    static int TAM = 10;

    //Preencher o vetor com elementos aléatorios
    public static void preencherVetor(int [] vetor){
        Random rnd = new Random();
        for(int i = 0; i < TAM; i++){
            vetor[i] = rnd.nextInt(100);
        }
    }

    //Imprimir vetor
    public static void imprimirVetor(int [] vetor){
        System.out.print("\n[ ");
        for (int i : vetor) {
            System.out.print( i + " ");
        }
        System.out.print("]\n");
    }

    //ShellSort
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

    }

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
    }



    public static void main(String[] args){
        int [] vetor = new int[TAM];
 
        preencherVetor(vetor);

        imprimirVetor(vetor);

        shellSort(vetor);

        imprimirVetor(vetor);
        
    }
    
}

