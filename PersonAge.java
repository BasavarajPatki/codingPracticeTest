package codingPractiseTest;

import java.util.Scanner;

public class PersonAge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total number of people : ");
		int n=sc.nextInt();
		int a[]=new int[n];

		System.out.println("Enter the ages of "+n+" people :");

		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int child=0;
		int adult=0;
		int senior=0;
		for(int i=0;i<n;i++) {
			if(a[i]<18 && a[i]>0) {
				child++;
			}
			else if(a[i]<=54) {
				adult++;

			}
			else if(a[i]>=55) {
				senior++;
			}
		}
		System.out.println("Children : "+child);
		System.out.println("Adult : "+adult);
		System.out.println("Senior Citizen : "+senior);

	}

}
