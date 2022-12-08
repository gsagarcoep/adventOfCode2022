import java.io.*;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File(
                "/Volumes/workplace/test/src/adventOfCode_input");

        BufferedReader br = new BufferedReader(new FileReader(file));
        // Declaring a string variable
        Integer score = 0;
        List<String> list = new ArrayList<>();
        //Map<String, List<String>> adjList = new HashMap<>();
        String st;
        while ((st = br.readLine()) != null) {
                list.add(st);
        }
        int n = list.get(0).length();
        int m = list.size();
        boolean[][] visible = new boolean[m][n];
        for(int i=0; i<m; i++)
            Arrays.fill(visible[i], false);

        int ans = 0;
        for(int i=1; i<m-1; i++){
            String curr = list.get(i);
            char max = curr.charAt(0);
            visible[i][0]=true;
            //ans++;
            for(int j=1; j<n-1; j++){
                if(curr.charAt(j) > max ){
                    System.out.println("here1 "+i+" "+j+" "+curr.charAt(j));
                    ans++; visible[i][j]=true;
                    max = curr.charAt(j);
                }
            }
            max = curr.charAt(n-1);
            visible[i][n-1]=true; //ans++;
            for(int j=curr.length()-2; j>=1; j--){
                if(curr.charAt(j) > max){
                    System.out.println("here2 "+i+" "+j+" "+curr.charAt(j));
                    if(!visible[i][j]) ans++;
                    visible[i][j]=true;
                    max = curr.charAt(j);
                }
            }
        }

        for(int i=1; i<n-1; i++){
            char max = list.get(0).charAt(i);
            visible[0][i]=true;
            for(int j=1; j<m-1; j++){
                if(list.get(j).charAt(i) > max ){
                    System.out.println("here3 "+j+" "+i+" "+list.get(j).charAt(i)+" max is:"+max);
                    if(!visible[j][i]) ans++;
                    visible[j][i]=true;
                    max = list.get(j).charAt(i);
                }
            }
            max = list.get(m-1).charAt(n-1);
            for(int j=m-2; j>=1; j--){
                if(list.get(j).charAt(i) > max){
                    System.out.println("here4 "+j+" "+i+" "+list.get(j).charAt(i));
                    if(!visible[j][i]) ans++;
                    visible[j][i]=true;
                    max = list.get(j).charAt(i);
                }
            }
        }
        System.out.println("ros cols "+m+" "+n+" ");

        ans+=m+m+n+n+-4;

        System.out.println(ans);
    }

    public Test() throws FileNotFoundException {
    }
}
