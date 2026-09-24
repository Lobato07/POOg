package aula01;
public class Aula01 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;    //chamada a atributo
        c1.destampar();

        c1.status(); // chamada a método
        c1.rabiscar();

        System.out.println("------------------------------------------");

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "preta";
        c2.ponta = 0.2f;
        c2.tampar();

        c2.status();
        c2.rabiscar();
    }
}