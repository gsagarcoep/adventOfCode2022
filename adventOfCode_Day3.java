import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File(
                "/Volumes/workplace/test/src/adventOfCode_input");

        BufferedReader br = new BufferedReader(new FileReader(file));

        // Declaring a string variable
        String st;
        Integer score = 0;
        int cnt = 0;
        Set<Character> curr = new HashSet<>();
        Set<Character> curr2 = new HashSet<>();


        while ((st = br.readLine()) != null) {
            int len = st.length();
            if(cnt==0){
                for(int i=0; i<len; i++){
                    curr.add(st.charAt(i));
                }
            }else if(cnt==1){
                for(int i=0; i<len; i++){
                    if(curr.contains(st.charAt(i))){
                        curr2.add(st.charAt(i));
                    }
                }
            }
            else{
                for(int i=0; i<len; i++){
                    if(curr2.contains(st.charAt(i))){
                        //if(curr.getOrDefault(st.charAt(i),0)>0){
                        Character ch = st.charAt(i);
                        if(ch >='a' && ch<='z') score+= ch-'a'+1;
                        else score+= ch-'A'+27;
                        curr2.remove(ch);
                    }
                }

            }


            System.out.println(len+" "+score);
            cnt++;
            if(cnt==3){
                cnt=0;
                curr.clear();
                curr2.clear();
            }
        }

        int count = 0;
        int ans = 0;
        System.out.println(cnt);
    }

    public Test() throws FileNotFoundException {
    }
}
