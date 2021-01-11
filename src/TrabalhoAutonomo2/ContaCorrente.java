package TrabalhoAutonomo2;

public class ContaCorrente extends ContaBancaria {

    private int numero;
    private double saldo;
    private int quantidadeTransacoes;

    public ContaCorrente(String senha, int numero){
        super(senha);
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                ", quantidadeTransacoes=" + quantidadeTransacoes +
                '}';
    }

    @Override
    public double levanta() {
        return 0;
    }

    @Override
    public double deposita() {
        return 0;
    }

    @Override
    public void tiraExtrato() {

    }
}
