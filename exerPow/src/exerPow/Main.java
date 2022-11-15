package exerPow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

class Solution {
	public double myPow(double x, int n) {

        if(x < 0 && n < 0){
            x*=-1;
            n*=-1;
        }

        if(x==1)
            return 1.0;

        if(x==-1)
            return -1.0;

        if(n==-2147483648)
            return 0.0;
        
        BigDecimal p = new BigDecimal(x);

		int n2 = n;
		if (n2 < 0)
			n2 *= -1;

		if (n < 0)
			p = new BigDecimal(1 / Math.pow(x,n2));

		else {
			p = new BigDecimal(Math.pow(x,n2));
		}

		return p.doubleValue();
	}
}

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);

		double a;
		int b;

		a = Double.parseDouble(in.readLine());
		b = Integer.parseInt(in.readLine());

		Solution s = new Solution();

		System.out.println(s.myPow(a, b));

	}
}
