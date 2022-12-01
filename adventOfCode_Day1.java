import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File(
                "adventOfCode_input_1");

        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        Integer curr = 0;
        Integer max = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        while ((st = br.readLine()) != null) {
            if(st.equals("")){
                max = Math.max(max, curr);
                pq.add(curr);
                curr = 0;
            }
            else curr += Integer.parseInt(st);
        }

        int count = 0;
        int ans = 0;
        while(count<3) {
            ans += pq.poll();
            count++;
        }
        System.out.println(ans);
    }

    public Test() throws FileNotFoundException {
    }
}
