import java.io.*;
class RRSTONE
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String inp[]=br.readLine().split(" ");
        int N=Integer.parseInt(inp[0]);
        int K=Integer.parseInt(inp[1]);
        inp=br.readLine().split(" ");
        long a[]=new long[N];
        for(int i=0;i<N;i++)
        {
            a[i]=Long.parseLong(inp[i]);
            
        }
        if(K==0)
        {
            
        }
        else if(K%2==1)
        {
            K=1;
        }
        else
        {
            K=2;
        }
        for(int i=1;i<=K;i++)
        {
            long max=a[0];
            for(int j=1;j<N;j++)
            if(a[j]>max)
            max=a[j];
            
            for(int j=0;j<N;j++)
            {
                a[j]=max-a[j];
            }
        }
        for(int i=0;i<N;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
