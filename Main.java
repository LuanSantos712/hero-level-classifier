public class Main {
    public static void main(String[] args) {

        String continuar = "sim";

        while (continuar.equals("sim")) {
            String nome = "Luan";
            int xp = 7500;
            String nivel = "";

            if (xp < 1000) {
                nivel = "Ferro";
            } else if (xp <= 2000) {
                nivel = "Bronze";
            } else if (xp <= 5000) {
                nivel = "Prata";
            } else if (xp <= 7000) {
                nivel = "Ouro";
            } else if (xp <= 8000) {
                nivel = "Platina";
            } else if (xp <= 9000) {
                nivel = "Ascendente";
            } else if (xp <= 10000) {
                nivel = "Imortal";
            } else {
                nivel = "Radiante";
            }

            String mensagem = String.format(
                "O Herói de nome %s está no nível de %s",
                nome,
                nivel
            );

            System.out.println(mensagem);

            continuar = "não";
        }
    }
}