
import java.io.*;
import  java.util.*;
		public int weightofString(int input1, int input2){
		// Write code here...
		int sum=0;
        	int a='a', b='e', c='i', d='o', e='u';
        	input1 = input1.toLowerCase();
        	if(input2==1)
        	{
            		for(int i=0;i<input1.length();i++)
            		{
                		int j = input1.charAt(i);
                		if(j>96 && j<123)
                    			sum += j-96;
            		}
        	}
        	else
        	{
            		int sum1 =0;
            		for(int i=0;i<input1.length();i++)
            		{
                		int j = input1.charAt(i);
                		if(j>96 && j<123)
                    			sum += j-96;
                		if(j==a || j==b || j==c || j==d || j==e)
                    			sum1 += j-96;
            		}
            		sum = sum - sum1;
        	}
        	return sum;
	}
}