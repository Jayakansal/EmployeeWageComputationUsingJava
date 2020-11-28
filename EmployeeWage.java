import java.util.Random;

public class EmployeeWage {

      public static void  main (String[] args)
{
  System.out.println("Welcome to Employee Wage Computation Using Java");


                Random random=new Random();
                        int randomNum=random.nextInt(2);

if (randomNum==1) {
System.out.println("Employee is Present");
int EmpHur=8;
int ratePerHur=20;
System.out.println("Salary:(int EmpHur* int ratePerHur)}");

} else {
System.out.println("Employee is Absent");
System.out.println("Salary:+0");
}
}
}


}
