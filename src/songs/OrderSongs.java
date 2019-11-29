package songs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OrderSongs {
    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader( new FileReader("songs.txt"));
            String line;
            String[] songs = new String[10];
            int i = 0;
            while((line = file.readLine()) != null) {
                songs[i] = line;
                i++;
            }
            System.out.println(songs.length);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
