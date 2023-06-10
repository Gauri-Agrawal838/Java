class UserMainCode
{
	public int isPalinPossible(int input1){

	// Write code here...
	int arr[] = new int[10];
        int count = 0;
        Arrays.fill(arr, 0); 
        while(input1!=0)
        {
            int rem = input1%10;
            arr[rem] = arr[rem]+1;
            input1 /= 10;
        }
        for(int i=0;i<10;i++)
        {
            if(arr[i]%2!=0)
                count++;
        }
        if(count>1)
            return 1;
        return 2;
	}
}