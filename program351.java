
 import java.util.*;

 class program351
 {
      
      public static void main(String[] arg) 
      {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sobj.nextLine();

        System.out.println("Your name is:"+name);

        System.out.println("Length of String is:"+name.length());

        for(int iCnt = 0; iCnt<name.length();iCnt++)
        {
          System.out.println(name.charAt(iCnt));
        }

        sobj.close();
     }
 }