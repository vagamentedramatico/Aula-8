package Ex1;

public class Main {
    public static void main(String[] args){

        Assistente assistente = new Assistente("Tobias", "T473");
        Vendedor vendedor = new Vendedor("Lulu", "L537", 150);
        Gerente gerente = new Gerente("Maria", "G535");

        System.out.println(assistente);
        System.out.println(vendedor);
        System.out.println(gerente);

    }
}
