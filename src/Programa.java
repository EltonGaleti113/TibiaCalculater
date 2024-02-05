public class Programa {

    public static void main(String[] args) {
        Vocations knight = new Vocations();
        knight.nomeVocacao = "Vocação: Knight";
        knight.hpPerLevel = 15;
        knight.mpPerLevel = 5;

        System.out.println(knight.nomeVocacao);
    }
}
