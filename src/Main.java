import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner pontuacao = new Scanner(System.in);

        int pontuaçaoLevi = pontuacao.nextInt();
        double pontuacaoRoq = pontuacao.nextDouble();
        double resultadoR = (int) pontuacaoRoq - pontuaçaoLevi;
        double pontuacaoL = pontuaçaoLevi - pontuacaoRoq;

        if (pontuacaoRoq > pontuaçaoLevi) {

            System.out.println("Parabens roque vc teve uma pontuaçao amais de " + resultadoR );

        } else {

            System.out.println("Parabens Levi vc teve uma pontuação amais de " + pontuacaoL);



        }


        }
    }
