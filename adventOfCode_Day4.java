import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File(
                "adventOfCode_input");

        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        Integer score = 0;
        int cnt = 0;
        Set<Character> curr = new HashSet<>();
        Set<Character> curr2 = new HashSet<>();
int total=0;

        while ((st = br.readLine()) != null) {
            total++;
                String[] pair = st.split(",");
            String[] p1 = pair[0].split("-");
            String[] p2 = pair[1].split("-");
            int num11 = Integer.parseInt(p1[0]);
            int num12 = Integer.parseInt(p1[1]);
            int num21 = Integer.parseInt(p2[0]);
            int num22 = Integer.parseInt(p2[1]);

            if((num11 < num21 && num12 < num21) || (num11 > num22 ))
                {
                    System.out.println(pair[0]+" "+pair[1]);
                    cnt++;
                }

        }

        int count = 0;
        int ans = 0;
        System.out.println(total-cnt);
    }

    public Test() throws FileNotFoundException {
    }
}
