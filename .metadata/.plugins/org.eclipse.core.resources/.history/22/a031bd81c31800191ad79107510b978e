package assign_2;

public class Assign_2_2 {

	public static void main(String[] args) {
		int[][] arr=new int[13][];
		arr[0]=new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12};
		for(int i=1;i<arr.length;i++){
			int[] temp=new int[i+1];
			temp[0]=i;
			for(int j=1;j<temp.length;j++)
				temp[j]=i*j;
			arr[i]=temp;			
		}
	
	for(int[] i:arr){
		for(int j:i){
			System.out.print(String.format("|%5d", j));
		}System.out.println("|");
		System.out.println("|_____________________________________________________________________________|");
	}
}
}
