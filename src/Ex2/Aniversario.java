package Ex2;

public class Aniversario extends CartaoPresente {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Aniversario, "
                 + getDestinatario() + "! 🎂");
    }


}
