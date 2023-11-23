import java.util.Scanner;

public class Main {


    public static String calcularNivel(int placar) {
        if (placar <= 10) {
            return "Ferro";

        } else if ( placar <= 20){
        return "Bronze";
    
    } else if (placar <= 50){
        return "Prata";
    
    } else if ( placar <= 80){
    return "Ouro";

    } else if (placar <= 90){
    return "Diamante";

    } else if (placar <= 100){
    return "Lendário";

    } else {
    return "Imortal";
}
    }


    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
       
        System.out.println("Quantas partidas você venceu?");
        int partidasVencidas = leitor.nextInt();

        System.out.println("Quantas partidas você perdeu?");
        int partidasPerdidas = leitor.nextInt();

        int placar = partidasVencidas - partidasPerdidas;
        
        String nivel = calcularNivel(placar);

        System.out.println("Seu nível é: " + nivel);
    }

    
}
