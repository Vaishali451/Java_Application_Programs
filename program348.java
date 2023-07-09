 // Accept Array from element and display summation
 
 import java.util.*;

import javax.naming.directory.InitialDirContext;

 class ArrayX
 {
  protected int Arr[];

  public ArrayX(int iSize)
  {
    Arr = new int [iSize];
  }

  protected void Accept()
  {
    Scanner sobj = new Scanner(System.in);

    System.out.println("Enter the Elements:");
    for(int iCnt=0 ; iCnt<Arr.length;iCnt++)
    {
      Arr[iCnt]=sobj.nextInt();
    }
  }

  protected void Display()
  {
    System.out.println("Elements of Array Are:");
    for(int iCnt=0 ; iCnt<Arr.length;iCnt++)
    {
      System.out.print(Arr[iCnt]+"\t");
    }

    System.out.println();
  }

  
 }
 
 class MyArray extends ArrayX
 {
  public MyArray(int iSize)
  {
    super(iSize);
  }
  public int summation()
  {

    int iSum=0;
    for(int iCnt = 0 ;iCnt<Arr.length ; iCnt++)
    {
      iSum=iSum+Arr[iCnt];
    }
    return iSum;
  }
 }
 class program348
 {
      
      public static void main(String[] arg) 
      {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enter Number of Elements:");
        int iSize = sobj.nextInt();

        MyArray mobj = new MyArray(iSize);

        mobj.Accept();
        mobj.Display();

        System.out.println("Summation of all elements:"+mobj.summation());
     }
 }