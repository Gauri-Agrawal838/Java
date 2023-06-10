import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int digitSum(int input1){

	// Write code here...
        
	while(input1/10!=0)
        {
            int sum=0;
            while(input1!=0)
            {
                sum += input1%10;
                input1 /= 10;
            }
            input1 = sum;
        }
        return input1;
	}
}
