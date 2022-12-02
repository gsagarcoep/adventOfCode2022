import java.io.*;
import java.util.*;

//https://adventofcode.com/2022/day/2
public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File(
                "adventOfCode_input");

        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        Integer score = 0;
        int cnt = 0;
        while ((st = br.readLine()) != null) {
            char opp = st.charAt(0);
            char own = st.charAt(2);
            switch(opp){
                case 'A':
                    if(own=='X'){
                        score+=3;
                    }
                    else if (own=='Y'){
                        score+=4;
                    }
                    else{
                        score+=8;
                    }
                    break;
                case 'B':
                    if(own=='X'){
                        score+=1;
                    }
                    else if (own=='Y'){
                        score+=5;
                    }
                    else{
                        score+=9;
                    }
                    break;
                case 'C':
                    if(own=='X'){
                        score+=2;
                    }
                    else if (own=='Y'){
                        score+=6;
                    }
                    else{
                        score+=7;
                    }
                    break;
            }
            cnt++;
            System.out.println(opp+" "+own+" "+score);
        }

        int count = 0;
        int ans = 0;
        System.out.println(cnt);
    }

    public Test() throws FileNotFoundException {
    }
}
