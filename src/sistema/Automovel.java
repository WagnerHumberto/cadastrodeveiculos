gitpackage sistema;

public class Automovel extends Veiculo {


    private int qtdMarchas;


    public int getQtdMarchas() {
        return qtdMarchas;
    }

    public void setQtdMarchas(int qtdMarchas) {
        this.qtdMarchas = qtdMarchas;
    }

    public Automovel(String modelo, String fabricante, String combustivel, String cor, int anoFabricacao, int qtdMarchas) {
        super(modelo, fabricante, combustivel, cor, anoFabricacao);
        this.qtdMarchas = qtdMarchas;



    }

}

