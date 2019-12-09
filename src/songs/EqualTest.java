package songs;

public class EqualTest {
    public static void main(String[] args) {
        Song first = new  Song( title: "Come as you are", artist:"Nirvana");
        Song second = new  Song( title: "Come as you are", artist:"Nirvana");
        if (first == second){
            System.out.println("Sunt egale");
        } else {
            System.out.println("Nu sunt egale");
        }
    }
}
