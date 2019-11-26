package heroes;

public class Game {
    public static void main(String[] args) {
        Goku hero1 = new Goku("Goku", 400, 200);
        Mage hero2 = new  Mage("China",200,800);
        Wanderwoman hero3 = new Wanderwoman("Diana",500,300);

        hero1.firePrimary(hero2);
        hero1.firePrimary(hero3);
        hero2.fireSecondery(hero1);
        hero3.firePrimary(hero1);

        System.out.println(hero1.toString());
        System.out.println(hero2.toString());
        System.out.println(hero3.toString());

    }
}
