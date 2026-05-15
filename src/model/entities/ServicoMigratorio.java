package model.entities;
public  abstract  class ServicoMigratorio  {

    private  String origem;
    private String destino;

    public ServicoMigratorio(String origem, String destino)  {
        this.origem = origem;
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }
    public void setOrigem(String origem) {
        origem = origem;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    public abstract  boolean processar() throws model.Exceptions.ServicoMigratorio;

}
