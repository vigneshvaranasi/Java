import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Challenge1 {

    // 1. Store Song Titles in an ArrayList of Strings
    ArrayList<String> songList = new ArrayList<String>();

    // 2. Add Songs to the ArrayList using a Method & prints the song list
    public void addSong() {
        getSongs();
        System.out.println("Songs are: "+songList);
    }
    // 3. A method that would read the file
    public void getSongs() {
        File file = new File("SongList.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    
    public static void main(String[] args) {
        
    }
    
}
