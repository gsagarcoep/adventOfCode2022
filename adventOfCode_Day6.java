import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File(
                "adventOfCode_input");

        BufferedReader br = new BufferedReader(new FileReader(file));
       // FWNSHLDNZ
       // FWNSHLDNZ
        // Declaring a string variable
        Integer score = 0;

        String st;
        while ((st = br.readLine()) != null) {
            int start =0;
            outer: for(int i=1; i<st.length(); i++){
                boolean found = true;
                inner: for(int j=start; j<i; j++){
                    if(st.charAt(j)==st.charAt(i)) {
                        start=j;
                        while(st.charAt(start)==st.charAt(i) && start!=i) start++;
                        found=false;
                        break inner;
                    }
                }
                if(found && i-start+1==14){
                    System.out.println(i+1);
                    return;
                }
            }
        }



    }

    public Test() throws FileNotFoundException {
    }
}
