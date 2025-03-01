package study_12_24;
import java.util.*;
import java.io.*;

public class bj_11055 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] dp = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            dp[i] = arr[i];
        }
        dp[0]=arr[0];
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]&&dp[i]<dp[j]+arr[i]){
                    dp[i]=dp[j]+arr[i];
                }
            }
        }
        int max=0;
        for(int i=0;i<n;i++){
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
