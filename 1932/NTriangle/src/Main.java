import java.io.*;
import java.util.*;
import java.math.*;

//1932 �����ﰢ��
public class Main {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] tri = new int[n][n];
        int[][] dp = new int[n][n];
		String[] s;
		for(int i = 1; i<=n; i++)
		{
			s = br.readLine().split(" ");
			for(int j = 0; j<i; j++)
			{
				tri[i-1][j] = Integer.parseInt(s[j]);
			}
		}

        for(int i = n-1; i>=0; i--){

            for(int j = 0; j<=i; j++){
                if(i == n-1)
                    dp[i][j] = tri[i][j];
                else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i+1][j+1])+tri[i][j];
                }
            }
        }

		System.out.println(dp[0][0]);
	}

}