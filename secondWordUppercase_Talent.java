import java.io.*;
import  java.util.*;

class UserMainCode
{
	public int secondWordUppercase(int input1){


		// Write code here...
        	String[] s = input1.split("\\s");
        	if(s.length<2)
            		return "LESS";
        	return s[1].toUpperCase();
	}
}