
public class AllContineosSeriesInanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {0,1,2,4,5,7};
		
		int start = -1;
		int end = -1;
		for(int i=0;i<=a.length-1;i++){
			if(i+1<a.length && a[i+1]-a[i]==1){
				if(start==-1)
					start = i;
				end = i+1;
			}
			else{
				if(start == -1 && end == -1)
				System.out.println(a[i]);
				if(start >-1 && end>-1){
					System.out.println(a[start]+"-->"+a[end]);
					start = -1;
					end = -1;
				}
				
			}
		}

	}

}
