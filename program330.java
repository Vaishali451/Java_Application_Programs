 // Approach 3
 
 import java.util.*;

 class Numbers
 {
    public int Factorial(int iValue)
    {
        int iMult=1;

        for(int icnt=1 ;icnt<=iValue ; icnt++)
        {
           iMult=iMult*icnt;
        }

       return iMult;
    }
 }
 class program330
 {
      
      public static void main(String[] arg) 
      {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number");
        int iNo = sobj.nextInt();

        Numbers nobj= new Numbers();

        int iRet = nobj.Factorial(iNo);

        System.out.println("Factorial is :"+iRet);
      
        sobj.close();
      }
    }