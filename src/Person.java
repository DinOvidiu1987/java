public class Person {
    String name;
    int age;
    int height;
    int stamina;


    public void run() {
        stamina--;
    }
    public void sleep() {
        stamina+=12;
    }

    public boolean isMajor() {
       return age >= 18;

        }

    public int getAge() {
        return age;
    }
}




