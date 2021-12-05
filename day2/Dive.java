import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Dive {
    public static void main(String args[]){
        File file = new File("day2/input2.txt");
        int depth = 0;
        int horizontal = 0;
        int aim = 0;

        try {

            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                if(str.substring(0,2).equals("fo")){
                    int forward = Integer.parseInt(str.substring(str.length()-1));
                    horizontal += forward;
                    depth = depth + (aim * forward);
                } else if (str.substring(0,2).equals("up")){
                    int up = Integer.parseInt(str.substring(str.length()-1));
                    //depth -= up;
                    aim -= up;
                } else if (str.substring(0,2).equals("do")){
                    int down = Integer.parseInt(str.substring(str.length()-1));
                    //depth += down;
                    aim += down;
                }
            }
            scan.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(depth);
        System.out.println(horizontal);
        System.out.println(depth*horizontal);
    }
}
