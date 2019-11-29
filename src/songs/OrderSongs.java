package songs;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class OrderSongs {
    public static void main(String[] args) {
        try {
            BufferedReader file = new BufferedReader( new FileReader("songs.txt"));
            String line;
            TreeSet<String> songs = new TreeSet<>();

            while((line = file.readLine()) != null) {
                songs.add(line);
            }
            System.out.println(songs.size());
            System.out.println(songs);

          //  Collections.shuffle(songs);
            //System.out.println(songs);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
