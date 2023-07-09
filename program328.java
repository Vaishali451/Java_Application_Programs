 // Approach 1
 
 import java.util.*;

 class program328
 {
    
      public static void main(String[] arg) 
      {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        int iMult=1;

        for(int icnt=1 ;icnt<=iNo ; icnt++)
        {
            iMult=iMult*icnt;
        }
        
        System.out.println("Factorial is :"+iMult);
      
        sobj.close();
      }
    }