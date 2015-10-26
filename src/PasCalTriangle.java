
public class PasCalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k =9;
		int a[][] = new int[k][2*k-1];
		
		for(int i=0;i<k;i++){
			for(int j=0;j<2*k-1;j++){
				a[i][j] = 0;
				}
			}
		
		
		
		a[0][k-1] = 1;
		for(int i=1;i<k;i++){
			for(int j=0;j<2*k-1;j++){
				//a[0][k-1] = 1;
				if(i>0 && j>0){
					a[i][j] = a[i-1][j-1]+a[i-1][j];
				}
			}
		}
			for(int i=0;i<k;i++){
				for(int j=0;j<2*k-1;j++){
					   if(a[i][j] != 0){
						   System.out.print(a[i][j]+"_");
					   }
					   else
						   System.out.print("");
					   
					}
				System.out.println();
				}
			
			
			
		}

	

}
