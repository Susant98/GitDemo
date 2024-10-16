package javaProgram;

public class FindMissingNumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,5};
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		for(int j=1;j<=5;j++) {
			sum2=sum2+j;
		}
		
		int res = sum2-sum1;
		System.out.println(res);

	}

}
