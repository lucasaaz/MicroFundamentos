public class Fila {
    
    //Atributos
    private Celula primeiro; //sempre aponta para o endereço da primeira entrada
    private Celula ultimo;   //sempre aponta para o endereço da ultima entrada

    //Metodo Construtor, faz a fila iniciar com priemiro/ultimo = null
    Fila(){
        primeiro = new Celula();
        ultimo   = primeiro;
    }

    /**
     * @return Celula return the primeiro
     */
    public Celula getPrimeiro() {
        return primeiro;
    }

    /**
     * @param primeiro the primeiro to set
     */
    public void setPrimeiro(Celula primeiro) {
        this.primeiro = primeiro;
    }

    /**
     * @return Celula return the ultimo
     */
    public Celula getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Celula ultimo) {
        this.ultimo = ultimo;
    }


    /**
     * Metodo inserir
     */
    public void inserir(int x){
        ultimo.setProx(new Celula(x));
        ultimo = ultimo.getProx();
    }


    /**
     * Metodo remover
     */
    public int remover() throws Exception{
        if(primeiro == ultimo){
            throw new Exception("Erro!");
        }else{
            int remover = primeiro.getProx().getElemento();

            Celula tmp = primeiro.getProx();
            primeiro.setProx(primeiro.getProx().getProx());
            tmp.setProx(null);
            tmp = null;

            return remover;
        }
    }


    /**
     * Metodo mostar
     */
    public void mostar(){
        System.out.print("\n[ ");
        for(Celula i = primeiro.getProx(); i != null; i = i.getProx()){
            System.out.print(i.getElemento() + " ");
        }
        System.out.print("]\n\n");
    }




}
