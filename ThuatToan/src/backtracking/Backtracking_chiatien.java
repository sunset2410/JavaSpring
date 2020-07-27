package backtracking;
import java.util.Scanner;

public class Backtracking_chiatien
{
    int n, N, a[], b[], sum=0;
    public void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap so tien can chia: ");
        N = in.nextInt();
        System.out.print("Nhap so loai tien le: ");
        n = in.nextInt();
        a = new int [n];
        b = new int [N];
        for (int i=0; i<n; i++)
        {
            System.out.printf("Nhap loai tien thu %d : ",i+1);
            a[i] = in.nextInt();
        }
        in.close();
    }
    public void chiatien(int i)
    {
        for (int k = 0; k < n; k++)
        {
            b[i] = a[k];
            if (i==0 || (i >0 && b[i] >= b[i-1]))
            {
                sum += b[i];
                if (sum <= N)
                {
                    if (sum == N)
                    {
                        for (int l=0; l<=i; l++)
                            System.out.print(b[l]+ "  ");
                        System.out.print("\n");
                    }
                    else
                        chiatien(i+1);
                }
                sum -= b[i];
            }
        }
 
    }
    public static void main(String[] agrs)
    {
    	Backtracking_chiatien ct = new Backtracking_chiatien();
 
        ct.input();
        System.out.print("\nCac cach chia tien :\n");
        ct.chiatien(0);
    }
 
}