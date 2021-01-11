package Ex2;


public class Main {
    public static void main(String[] args){

        CartaoPresente cartao1 = new Aniversario("José");
        CartaoPresente cartao2 = new Natal("Maria");
        CartaoPresente cartao3 = new DiaDosNamorados("Alberto");

        cartao1.showMessage();;
        cartao2.showMessage();;
        cartao3.showMessage();;

    }
}
