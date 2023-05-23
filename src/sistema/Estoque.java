package sistema;

public class Estoque {

    private static int contadorEstoque = 1;
    private int idEstoque;
    private Veiculo veiculo;


    public Estoque(Automovel novo) {
        this.idEstoque = contadorEstoque;
        this.veiculo = novo;
        contadorEstoque += 1;

    }

    public Estoque(Onibus novo) {
        this.idEstoque = contadorEstoque;
        this.veiculo = novo;
        contadorEstoque += 1;

    }

    public Estoque(Motocicleta novo) {
        this.idEstoque = contadorEstoque;
        this.veiculo = novo;
        contadorEstoque += 1;

    }

    @Override
    public String toString() {
        return "Estoque{" +
                "idEstoque=" + idEstoque +
                ", veiculo=" + veiculo +
                '}';
    }

    public int getIdEstoque() {
        return idEstoque;
    }

}
