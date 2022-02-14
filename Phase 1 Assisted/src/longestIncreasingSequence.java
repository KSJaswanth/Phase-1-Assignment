import java.io.BufferedReader;
import java.io.InputStreamReader;

public class longestIncreasingSequence 
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the list of numbers:\n");
        String[] s1=br.readLine().split(" ");
        int n=s1.length;
        int[] a=new int[n];
        String []ls=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=Integer.parseInt(s1[i]);
        }
        int[]dp=new int[n];
        int max=dp[0]=1;
        String seq=ls[0]=s1[0];
        for(int i=1;i<n;i++)
        {
            dp[i]=1;
            String x="";
            for(int j=i-1;j>=0;j--)
            {
                if(a[j]<a[i]&&dp[j]>dp[i]-1)
                {
                    dp[i]=dp[j]+1;
                    x=ls[j];
                }
            }
            x+=(" "+a[i]);
            ls[i]=x;
            if(dp[i]>max)
            {
                max=dp[i];
                seq=ls[i];
            }
        }
        System.out.println("Length Longest Increasing Sequence is: " + max + "\nThe Longest Increasing Sequence is: " + seq);
    }
}