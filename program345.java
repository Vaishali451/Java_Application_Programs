 // Approach 2
 
 import java.util.*;

 class ArrayX
 {
  public int Arr[];

  public ArrayX(int iSize)
  {
    Arr = new int [iSize];
  }

  public void Accept()
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the Elements:");
    for(int iCnt=0 ; iCnt<Arr.length;iCnt++)
    {
      Arr[iCnt]=sobj.nextInt();
    }
  }

  public void Display()
  {
    System.out.println("Elements of Array Are:");
    for(int iCnt=0 ; iCnt<Arr.length;iCnt++)
    {
      System.out.print(Arr[iCnt]+"\t");
    }

    System.out.println();
  }
 }
 
 class program345
 {
      
      public static void main(String[] arg) 
      {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number of Elements:");
        int iSize = sobj.nextInt();

        ArrayX aobj = new ArrayX(iSize);

        aobj.Accept();
        aobj.Display();
     }
 }