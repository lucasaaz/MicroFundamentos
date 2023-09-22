
public class Matriz {
    
    private Celula inicio;
    private int linha;
    private int coluna;


    Matriz(){
        this(3,3);
        this.inicio = null;
    }
    Matriz(int l, int c){
        this.linha = l;
        this.coluna = c;
    }


    /**
     * @return Celula return the inicio
     */
    public Celula getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Celula inicio) {
        this.inicio = inicio;
    }

    /**
     * @return int return the linha
     */
    public int getLinha() {
        return linha;
    }

    /**
     * @param linha the linha to set
     */
    public void setLinha(int linha) {
        this.linha = linha;
    }

    /**
     * @return int return the coluna
     */
    public int getColuna() {
        return coluna;
    }

    /**
     * @param coluna the coluna to set
     */
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }





    
    /**
     * Metodo inserir Inicio
     */
    public void inserir(int x){
        inicio = new Celula(x);
        Celula k = inicio;
        Celula y = inicio;
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                k.setDir(new Celula(x));
                k = k.getDir();
            }
            y.setInf(new Celula(x));
            y = y.getInf();
            k = y;
        }
    }




    /**
     * Metodo mostrar
     */
    public void mostrar(){
        System.out.print("\n[ ");
        for(Celula i = inicio.getDir(); i != null; i = i.getDir()){
            System.out.print(i.getElemento() + " ");
        }
        System.out.print("]\n");
    }







}
