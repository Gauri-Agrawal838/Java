
class UserMainCode
{
	public int nonRepeatDigitsCount(int input1){

		// Write code here...
		
        int count=0;
        int arr[] = new int[10]; 
        Arrays.fill(arr, 0); 
        while(input1>0)
        {
            int rem = input1%10;
            arr[rem] = arr[rem]+1;
            input1 /= 10;
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]==1)
            count++;
        }
        return count;
        
	}
}