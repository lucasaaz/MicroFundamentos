/**
 * Celula
 */
public class Celula {

    private int elemento;
    private Celula dir;
    private Celula esq;
    private Celula sup;
    private Celula inf;

    Celula(){
        this(0);
    }

    Celula(int x){
        this.elemento = x;
        this.dir = null;
        this.esq = null;
        this.sup = null;
        this.inf = null;
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
     * @return Celula return the dir
     */
    public Celula getDir() {
        return dir;
    }

    /**
     * @param dir the dir to set
     */
    public void setDir(Celula dir) {
        this.dir = dir;
    }

    /**
     * @return Celula return the esq
     */
    public Celula getEsq() {
        return esq;
    }

    /**
     * @param esq the esq to set
     */
    public void setEsq(Celula esq) {
        this.esq = esq;
    }

    /**
     * @return Celula return the sup
     */
    public Celula getSup() {
        return sup;
    }

    /**
     * @param sup the sup to set
     */
    public void setSup(Celula sup) {
        this.sup = sup;
    }

    /**
     * @return Celula return the inf
     */
    public Celula getInf() {
        return inf;
    }

    /**
     * @param inf the inf to set
     */
    public void setInf(Celula inf) {
        this.inf = inf;
    }

}