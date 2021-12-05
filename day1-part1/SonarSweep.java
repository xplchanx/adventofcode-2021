import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class SonarSweep {
    public static void main(String args[]){
        File file = new File("day1-part1/input.txt");
        ArrayList<Integer> listOfNum = new ArrayList<Integer>();
        try {

            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                listOfNum.add(scan.nextInt());
            }
            scan.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int count = 0;
        for(int i=1; i < listOfNum.size(); i++){
            if(listOfNum.get(i) > listOfNum.get(i-1)){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
