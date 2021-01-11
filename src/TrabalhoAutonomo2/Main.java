package TrabalhoAutonomo2;

public class Main {
    public static void main(String[] args){

        ContaCorrente CC1 = new ContaCorrente("abc123", 12);

        System.out.println(CC1);
        CC1.alteraSenha();
    }
}
