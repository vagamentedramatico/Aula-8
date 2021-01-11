package Ex2;

public class DiaDosNamorados extends CartaoPresente {

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("Feliz dia dos Namorados, "
                 + getDestinatario() + "! ❤");
    }


}
