public class array4 {
    public static void min(int arr[]) {
	    int min1=arr[0];
	    for(int i=1;i<arr.length;i++)
	    {
	        if(min1>arr[i])
	        min1=arr[i];
	}
	System.out.println(min1);
}
	public static void main(String[] args) {
	int a[]={33,3,4,5};
	min(a);
}

    
}
