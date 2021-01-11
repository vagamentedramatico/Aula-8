package Ex1;

public class Vendedor extends Funcionario {

    private double comissao;

    public Vendedor(String nome, String codigo, double comissao) {
        super(nome, codigo);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + getComissao();
    }

    @Override
    public String toString() {
        return "Vendedor " + super.toString();
    }

}
