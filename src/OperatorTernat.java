import java.time.LocalDateTime;
import java.time.LocalTime;

public class OperatorTernat {
    public static void main(String[] args) {
        int ora = LocalDateTime.now().getHour();
        int minute = LocalDateTime.now().getMinute();

        String perioada = ora >= 12 ? "pm" : "am";

        System.out.println(ora + ":" + minute);
        System.out.println(perioada);
        for ( int i = 5; i > 0; i--){
            System.out.println(i);

            for(int o =0; o < 10; o++){
                for(int j = 0; j < 20; j++){
                    System.out.println("I is" + o + "and j is" + j) ;
                }
            }
        }
    }
}
