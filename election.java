import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("***********************");
        System.out.println("Eleição para presidente!");
        System.out.println("***********************");

        System.out.print("Informe os votos do candidato Bolsonaro: ");
        int bolsonaro = sc.nextInt();
        System.out.print("Informe os votos do candidato Lula: ");
        int lula = sc.nextInt();
        System.out.print("Informe os votos do candidato Michael Temer: ");
        int temer = sc.nextInt();

        if(bolsonaro > lula + temer){
            System.out.print("O candidato Bolsonaro é o novo presidente da república!");
        } else if (lula > bolsonaro + temer) {
            System.out.print("O candidato Lula é o novo presidente da república!");
        } else if(temer > lula + bolsonaro){
            System.out.print("O candidato Temer é o novo presidente da república!");
        } else {
            System.out.println("A eleição irá para o segundo turno!");
        }

    }
}