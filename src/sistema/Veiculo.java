package sistema;

public class Veiculo {

    protected String modelo;
    protected String fabricante;
    protected String combustivel;
    protected String cor;
    protected int anoFabricacao;


    public Veiculo(String modelo, String fabricante, String combustivel, String cor, int anoFabricacao){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.combustivel = combustivel;
        this.cor = cor;
        this.anoFabricacao = anoFabricacao;


    }



    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "modelo='" + modelo + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", combustivel='" + combustivel + '\'' +
                ", cor='" + cor + '\'' +
                ", anoFabricacao=" + anoFabricacao;
    }
}
