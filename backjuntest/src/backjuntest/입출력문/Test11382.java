package backjuntest.입출력문;

import java.util.*;
import java.io.*;

public class Test11382 {
	public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] strs = bf.readLine().split(" ");
        Long a = Long.valueOf(strs[0]);
        Long b = Long.valueOf(strs[1]);
        Long c = Long.valueOf(strs[2]);
        System.out.println(a+b+c);
    }
}
