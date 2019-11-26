package animals;

import animals.vet.Vet;

public class VetProgram {
    public static void main(String[] args) {
        Bear winnie = new Bear();
        Lion simba = new Lion();
        Chicken kfc = new Chicken();
        Robodog foca = new Robodog();
        Vet marcel = new Vet();


        marcel.makeShot(simba);
        marcel.makeShot(kfc);
        marcel.makeShot(winnie);
        marcel.makeShot(foca);

        foca.recharge();
    }
}
