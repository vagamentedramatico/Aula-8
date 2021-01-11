package TrabalhoAutonomo;

public class Main {
    public static void main(String[] args){

        Cavalo cavalo = new Cavalo(3, 4, true);
        Peao peao1 = new Peao(1, 1, false);
        Peao peao2 = new Peao(4, 2, true);

        System.out.println(cavalo);
        System.out.println(peao1);
        System.out.println(peao2);

    }
}
