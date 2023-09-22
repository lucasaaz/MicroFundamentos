public class CelulaDupla {
    
    //Atributos
    private int elemento;
    private CelulaDupla prox;
    private CelulaDupla ant;


    //Construtores
    CelulaDupla(){
        this(0);
    }

    CelulaDupla(int x){
        this.elemento = x;
        this.prox = null;
        this.ant = null;
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
     * @return CelulaDupla return the prox
     */
    public CelulaDupla getProx() {
        return prox;
    }

    /**
     * @param prox the prox to set
     */
    public void setProx(CelulaDupla prox) {
        this.prox = prox;
    }

    /**
     * @return CelulaDupla return the ant
     */
    public CelulaDupla getAnt() {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(CelulaDupla ant) {
        this.ant = ant;
    }

}
