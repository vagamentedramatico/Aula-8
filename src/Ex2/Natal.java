package Ex2;

public class Natal extends CartaoPresente {

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz Natal, "
                 + getDestinatario() + "! 🎄");
    }


}
