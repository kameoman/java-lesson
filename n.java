import java.io.*;
import java.util.*;

public class n {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sc = br.readLine();
        int N = Integer.parseInt(sc);
        convertToAsterisk(N);
    }
        
    public static void convertToAsterisk(int n) {
for(int i = 0; i < n ; i++){
System.out.print("*");
}
    }
}