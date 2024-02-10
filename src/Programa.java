import java.util.Scanner;
import javax.swing.*;
public class Programa {
    static int hpInicial = 185;
    static int mpInicial = 90;
    static int capInicial = 470;

    public static void main(String[] args) {
        //?___________________________________
        // * Classe Knight

      Vocations knight = new Vocations();
        knight.metodoDeBusca = "Knight";
        knight.nomeVocacao = "Knight";
        knight.hpPerLevel = 15;
        knight.mpPerLevel = 5;
        knight.capPerLevel = 25;
        //?___________________________________
        // * Classe Paladin

        Vocations paladin = new Vocations();
        paladin.metodoDeBusca = "Paladin";
        paladin.hpPerLevel = 10;
        paladin.mpPerLevel = 15;
        paladin.capPerLevel = 20;
        //?___________________________________
        // * Vocação Druid

        Vocations druid = new Vocations();
        druid.metodoDeBusca = "Druid";
        druid.hpPerLevel = 5;
        druid.mpPerLevel = 30;
        druid.capPerLevel = 10;
        //?___________________________________
        // * Vocação Sorcerer

        Vocations sorcerer = new Vocations();
        sorcerer.metodoDeBusca = "Sorcerer";
        sorcerer.hpPerLevel = 5;
        sorcerer.mpPerLevel = 30;
        sorcerer.capPerLevel = 10;


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

                    knight.hpFinal = hpInicial + (level * knight.hpPerLevel);
                    knight.manaFinal = mpInicial + (level * knight.mpPerLevel);
                    knight.capFinal = capInicial + (level * knight.capPerLevel);
                    System.out.println
                            (" Level: " + level +
                            "\n Hp: "+ knight.hpFinal +
                            "\n mana: " + knight.manaFinal +
                            "\n Cap: " + knight.capFinal);
                break;
                case 2:
                    System.out.println("Vocação Selecionada Paladin");
                    System.out.println("Qual o Level Desejado: ");
                    level = scanner.nextInt();
                    paladin.hpFinal = hpInicial + (level * paladin.hpPerLevel);
                    paladin.manaFinal = mpInicial + (level * paladin.mpPerLevel);
                    paladin.capFinal = capInicial + (level * paladin.capPerLevel);

                    System.out.println
                            (" Level: " + level +
                            "\n Hp: "   +  paladin.hpFinal +
                            "\n mana: " +  paladin.manaFinal +
                            "\n Cap: "  +  paladin.capFinal);
                break;
                case 3:
                    System.out.println("Vocação Selecionada Druid");
                    System.out.println("Qual o Level Desejado: ");
                    level = scanner.nextInt();

                    druid.hpFinal = hpInicial +   (level * druid.hpPerLevel);
                    druid.manaFinal = mpInicial + (level * druid.mpPerLevel);
                    druid.capFinal = capInicial + (level * druid.capPerLevel);

                    System.out.println
                            (" Level: " + level +
                                    "\n Hp: "   +  druid.hpFinal +
                                    "\n mana: " +  druid.manaFinal +
                                    "\n Cap: "  +  druid.capFinal);

                case 4:
                    System.out.println("Vocação Selecionada Sorcerer");
                    System.out.println("Qual o Level Desejado: ");
                    level = scanner.nextInt();
                    sorcerer.hpFinal = hpInicial +   (level * sorcerer.hpPerLevel);
                    sorcerer.manaFinal = mpInicial + (level * sorcerer.mpPerLevel);
                    sorcerer.capFinal = capInicial + (level * sorcerer.capPerLevel);

                    System.out.println
                            (" Level: " + level +
                                    "\n Hp: "   + sorcerer.hpFinal +
                                    "\n mana: " + sorcerer.manaFinal +
                                    "\n Cap: "  + sorcerer.capFinal);
                    break;
                default:
                    System.out.println("Opção não encontrada");
            }
        }

    }
