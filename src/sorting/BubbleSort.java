package sorting;

public class BubbleSort {
	
	public static void bubblesort(int []arr) {
		int temp;
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
						
				}
			}
		}
		for(int k=0;k<n;k++) {
			System.out.print(arr[k]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,22,5,1,88};
		bubblesort(arr);

	}

}
