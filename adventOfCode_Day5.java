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
        int cnt = 0;
        Stack<Character>[] stacks = new Stack[10];
        for(int i=0;i<10;i++){
            stacks[i] = new Stack<>();
        }
        String[] inp = {"DMSZRFWN", "WPQGS", "WRVQFNJC", "FZPCGDL", "TPS", "HDFWRL", "ZNDC", "WNRFVSJQ", "RMSGZWV"};
        for(int i=0; i<inp.length; i++){
            for(int j = 0; j<inp[i].length(); j++)
                stacks[i+1].push(inp[i].charAt(j));
        }
        String st;
        while ((st = br.readLine()) != null) {

            String[] steps = st.split("\\s");
            int num = Integer.parseInt(steps[1]);
            int from = Integer.parseInt(steps[3]);
            int to = Integer.parseInt(steps[5]);
           // System.out.println(stacks[to]);
            //System.out.println(stacks[from]);

            Stack<Character> temp = new Stack<>();
            while(num>0){
                temp.push(stacks[from].pop());
                num--;
            }
            while(!temp.isEmpty()) stacks[to].add(temp.pop());
        }

        int count = 0;
        int ans = 0;
        for(int i=1;i<10;i++){
            System.out.print(stacks[i].peek()) ;
        }

    }

    public Test() throws FileNotFoundException {
    }
}
