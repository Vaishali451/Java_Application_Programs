 // Approach 1
 
 import java.util.*;

 class program343
 {
      
      public static void main(String[] arg) 
      {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number of Elements:");
        int iSize = sobj.nextInt();

        int Arr[] = new int [iSize];

        System.out.println("Enter the Elements:");

        int iCnt = 0;

        for(iCnt = 0; iCnt< iSize ;iCnt++)
        {
          Arr[iCnt]=sobj.nextInt();
        }

        System.out.println("Elemeents of Array Are:");

        for(iCnt = 0; iCnt< iSize ;iCnt++)
        {
          System.out.println(Arr[iCnt]);
        }

        sobj.close();
      }
    }