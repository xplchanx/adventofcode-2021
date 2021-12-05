import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class SonarSweep {
    public static void main(String args[]){
        File file = new File("day1/input2.txt");
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
        //System.out.println(listOfNum);
        int count = 0;
        for(int i=1; i < listOfNum.size(); i++){
            if(i+2 >= listOfNum.size()){
                break;
            }
            if((listOfNum.get(i-1) + (listOfNum.get(i)) + (listOfNum.get(i+1))) < ((listOfNum.get(i)) + (listOfNum.get(i+1)) + (listOfNum.get(i+2)))){
                count++;
            }
        }
        System.out.println(count);
        
    }
}
