

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[] = {"a","b","c","d","e","f","g"};
		int k = 6;
		int first = a.length-k;
		//first array 0 to first-1
		//reverse first array
		reverseArray(a, 0, first-1);
		
		//second array first to a.length-1
		//reverse second array
		reverseArray(a, first, a.length-1);
		//reverse whole array
		reverseArray(a, 0, a.length-1);
		for(String element : a){
			System.out.print(" "+element);
		}
	}
	public static void reverseArray(String[] a,int i,int j){
			int k=(j-i)/2;
			while(i<=k){
				String temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
	}
}