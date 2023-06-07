// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
class HelloWorld {
    public static int NthPrime(int input1)
    {
        int count=0, i=2;
        while(i>0)
        {
            int f=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
                count++;
            if(count==input1)
                return i;
            i++;
        }
        return 0;
    }
    public static void main(String[] args) {
        int num, result;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        result = NthPrime(num);
        System.out.println(result);
        
    }
}