package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("Enter a value for n");
        int n = in.nextInt();
        boolean [] prime = new boolean[n+1];
        for (int S = 2; S < prime.length; S++)
        {prime[S] = true;
        
        }
        for (int S = 2; S < n; S++)
        	if (prime[S] == true)

        {for (int L = 2*S; L <= n; L = S+L)         		
        {prime [L] = false;
        }
        
	}for (int S = 2; S < prime.length; S++)
	{ if (prime[S] == true)
	{         System.out.println(S);

	}}
	}
}
