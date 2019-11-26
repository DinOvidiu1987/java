package animals;

public class Robodog implements Animal,Pet,Robot {
      protected int battery = 50;

    @Override
    public void makeNoise() {
        System.out.println("Barkzzz!");
    }

    @Override
    public void play() {
        System.out.println("Jetpack backflip");
    }

    @Override
    public void recharge() {
    battery = 100;
    }
}
