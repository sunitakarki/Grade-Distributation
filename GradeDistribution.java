import java.util.Scanner;
public class GradeDistribution {

	 public static void main(String[] args) {
	 
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int F = 0;
	   
        int count=0;
	   
        Scanner in = new Scanner(System.in);
	    System.out.println("Enter 10 grades:");
	    
	    int score = in.nextInt();
	    while(score>0 && score<100); {
	     
	       count++;
	       if(score>=90 && score<=100)
	        A++;
	    else if(score>=80 && score<=89)
	        B++;
	    else if(score>=70 && score<=79)
	        C++;
	    else if(score>=60 && score<=69)
	        D++;
	    else if(score>=0 && score<=59)
	        F++;
	    score = in.nextInt();
	 }
	    
	 System.out.println("Grade Range   "+ "No.");
	 System.out.println("[90-100]      "+ A);
	 System.out.println("[80-89]       "+ B);
	 System.out.println("[70-79]       "+ C);
	 System.out.println("[0-69]        "+ D);
	 System.out.println("Others        "+ F);
	 } 
	 } 