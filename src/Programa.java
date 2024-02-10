import java.util.Scanner;
import javax.swing.*;
public class Programa {

    public static void main(String[] args) {
        // * Classe Knight
        Vocations knight = new Vocations();
        knight.metodoDeBusca = "Knight";
        knight.nomeVocacao = "Knight";
        knight.hpPerLevel = 15;
        knight.mpPerLevel = 5;
        // * Classe Paladin
        Vocations paladin = new Vocations();
        paladin.metodoDeBusca = "Paladin";


        Scanner scanner = new Scanner(System.in);

        System.out.println
                ("""
                Qual vocação deseja procurar?
                1. Knight
                2.Paladin
                3.Druid
                4.Sorcerer
                """);
        int vocacao = scanner.nextInt();

            switch (vocacao){
                case 1:
                    System.out.println("Teste bem executado");

            }
        }

    }
