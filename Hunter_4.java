
import java.util.Scanner;

public class Hunter_4 {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	int ak = sc.nextInt();
	Integer arr[] = new Integer[ak];
	for (int i = 0; i < arr.length; i++) {

		arr[i] = sc.nextInt();
	}
	int a=0;
	for(int i=0;i<arr.length;i++) {
		int count=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
						
		}
		if(count==1) {
			a=arr[i];
		}
	}
	
	
	System.out.println(a);

   }
}
