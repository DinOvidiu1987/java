public class Program {
    public static void main(String[] args) {
        Person alex = new Person("Alexandru", 20,175, 10 );


        student andrei = new student("Andrei",25,180,100, "A");
        andrei.grow (10);

        if (andrei instanceof Person) {
            System.out.println(andrei.getName()  + " este persoana");
        }
        student s = (student) andrei;
        System.out.println();
        System.out.println(andrei.getHeight());
        System.out.println(andrei.toString());



        System.out.println(alex.name  + " are " + alex.age + " de ani ");

        alex.run();
        alex.run();
        alex.run();
        System.out.println(alex.name + " are energia " + alex.stamina);
        alex.sleep();
        System.out.println(alex.name + " are energia " + alex.stamina);

        if(alex.isMajor()){
            System.out.println(alex.name + " drinks beer");

        }
    }
}
