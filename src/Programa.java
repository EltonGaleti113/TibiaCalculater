import java.util.Scanner;
import javax.swing.*;
public class Programa {

    public static void main(String[] args) {
        new Screen();
        Vocations knight = new Vocations();
        knight.metodoDeBusca = "Knight";
        knight.nomeVocacao = "Knight";
        knight.hpPerLevel = 15;
        knight.mpPerLevel = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual vocação deseja procurar?");
        String Nome = scanner.nextLine();
        if (Nome == knight.metodoDeBusca){
            System.out.println("Executado");
        }else {
            System.out.println("Vocação não identificada");
        }

    }
}
