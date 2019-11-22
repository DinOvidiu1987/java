package heroes;

public class Mage extends Hero {

    public Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    @Override
    public void firePrimary() {
        mana -=15;
    }

    @Override
    public void fireSecondery() {
        mana -= 40;
    }

    @Override
    public void receiveHit() {
        hp -= 30;
    }
}