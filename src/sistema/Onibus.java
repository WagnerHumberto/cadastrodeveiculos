package sistema;

public class Onibus extends Veiculo {

    private int qtdLugares;

    public Onibus(String modelo, String fabricante, String combustivel, String cor, int anoFabricacao, int qtdLugares){
        super(modelo, fabricante, combustivel, cor, anoFabricacao);
        this.qtdLugares = qtdLugares;
    }

    public int getQtdLugares() {
        return qtdLugares;
    }

    public void setQtdLugares(int qtdLugares) {
        this.qtdLugares = qtdLugares;
    }
}
