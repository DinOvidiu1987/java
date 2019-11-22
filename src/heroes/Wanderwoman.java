package heroes;

public class Wanderwoman extends Hero {
    public Wanderwoman(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        mana -= 10;
        hp++;
    }

    @Override
    public void fireSecondery() {
         mana -= 30;
         hp += 3;
    }

    @Override
    public void receiveHit() {
       hp--;
    }
}
