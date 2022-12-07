import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File(
                "adventOfCode_input");

        BufferedReader br = new BufferedReader(new FileReader(file));
        // Declaring a string variable
        Integer score = 0;
        Stack<String> stack = new Stack<>();
        Map<String, Long> map = new HashMap<>();
        //Map<String, List<String>> adjList = new HashMap<>();
        String st;
        while ((st = br.readLine()) != null) {
            String[] arr = st.split("\\s");
            if(arr[0].equals("$")){
                if(arr[1].equals("cd")) {
                    if (arr[2].equals("..")) {
                        String curr = stack.toString();
                        stack.pop();
                        map.put(stack.toString(), map.getOrDefault(stack.toString(), 0l)+map.getOrDefault(curr, 0l));
                    }
                    else stack.push(arr[2]);
                }
            }
            else{
                String curr = stack.toString();
                if(arr[0].equals("dir")) {
                   continue; // map.putIfAbsent()
                }
                //String curr = stack.peek();
                map.put(curr, map.getOrDefault(curr, 0l)+Long.parseLong(arr[0]));
            }
        }
        Long ans = 0l;
        Long[] sizes = new Long[map.size()];
        int cnt = 0;
        for(String k : map.keySet()){
            if(map.get(k)<=100000l) {
               // System.out.println(k);
                ans += map.get(k);
            }
            sizes[cnt++] = map.get(k);
        }
        Arrays.sort(sizes);
        long available = 70000000l- sizes[sizes.length-1];
        Long reqd = 30000000l -available;
        //System.out.println(map);
        System.out.println(available+" "+reqd);
        for(int i=0; i<cnt; i++){
          //  System.out.println(sizes[i]);
            if(sizes[i]>=reqd){
                System.out.println(sizes[i]);
                break;
            }
        }

       // System.out.println(map);
       // System.out.println(ans);



    }

    public Test() throws FileNotFoundException {
    }
}
