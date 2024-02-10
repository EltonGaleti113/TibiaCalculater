import java.util.Scanner;
import javax.swing.*;
public class Programa {
    static int hpInicial = 185;
    static int mpInicial = 90;
    static int capInicial = 470;

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
        paladin.hpPerLevel = 10;
        paladin.mpPerLevel = 15;
        paladin.capPerLevel = 20;


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
                    System.out.println("Vocação Selecionada Knight");
                    System.out.println("Qual o Level Desejado: ");
                    int level = scanner.nextInt();

                    int hpFinal   = hpInicial + (level * knight.hpPerLevel);
                    int manaFinal = mpInicial + (level * knight.mpPerLevel);
                    int capFinal = capInicial + (level * knight.capPerLevel);
                    System.out.println(" Level: " + level + "\n Hp: "+ hpFinal + "\n mana: " + manaFinal + "\n Cap: " + capFinal);
                break;
                case 2:
                    System.out.println("Vocação Selecionada Paladin");
                    System.out.println("Qual o Level Desejado: ");
                    level = scanner.nextInt();

                break;
                case 3:
                    System.out.println("teste Druid");
                case 4:
                    System.out.println("Teste Sorcerer");
                break;
                default:
                    System.out.println("Opção não encontrada");
            }
        }

    }
