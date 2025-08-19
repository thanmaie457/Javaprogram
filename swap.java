public class swap {
	public static void main(String[] args) {
		int[] arr={5,4,3,2,1};
		int n=arr.length;
		int temp;
		int swapcount=0;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapcount++;
				}
			}
		}
		System.out.println("Array in ascending order:");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+" ");
		}
		System.out.println("\n Swap count:"+swapcount);
	}
}