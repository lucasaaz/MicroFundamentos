/**
 * Celula
 */
public class Celula {

    private int elemento;
    private Celula prox;

    Celula(){
        this(0);
    }

    Celula(int x){
        this.elemento = x;
        prox = null;
    }

    /**
     * @return int return the elemento
     */
    public int getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    /**
     * @return Celula return the prox
     */
    public Celula getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(Celula prox) {
        this.prox = prox;
    }

}