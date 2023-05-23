package sistema;

public class Motocicleta extends Veiculo{

    private String cilindrada;

    public Motocicleta(String modelo, String fabricante, String combustivel, String cor, int anoFabricacao, String cilindrada){
        super(modelo, fabricante, combustivel, cor, anoFabricacao);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }
}
