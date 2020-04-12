import java.util.Scanner; 
public class GradeAverage{
   public static void main(String[] args)
   {
   Scanner scnr=new Scanner(System.in);
      double grade1=50;//User input of exam 1
      double grade2=60;//User input of exam 2
      double grade3=60;//User input of exam 3
      double average;
      average=(grade1+grade2+grade3)/3;
      System.out.println(average);
if(average>=60)
  System.out.print("Student Pass");
else
  System.out.print("Student Fail");}}
