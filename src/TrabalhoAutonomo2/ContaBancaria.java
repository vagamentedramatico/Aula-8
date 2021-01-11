package TrabalhoAutonomo2;

import java.util.Scanner;

public abstract class ContaBancaria {

    private static Scanner in = new Scanner(System.in);

    public abstract double levanta();
    public abstract double deposita();
    public abstract void tiraExtrato();

    public String senha;

    public ContaBancaria(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void alteraSenha() {
        System.out.println("Nova senha:");
        String novaSenha = in.nextLine();
        System.out.println("Confirme a senha atual:");
        String senhaConfirmar = in.nextLine();
        if(senhaConfirmar.equals(senha)){
            this.senha = novaSenha;
            System.out.println("Senha alterada");
        } else {
            System.out.println("Senha incorreta");
        }
    }

}
