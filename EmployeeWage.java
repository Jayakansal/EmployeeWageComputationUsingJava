import java.util.Random;

public class EmployeeWage {

      public static void  main (String[] args)
{
  System.out.println("Welcome to Employee Wage Computation Using Java");


                Random random=new Random();
                        int randomNum=random.nextInt(2);

if (randomNum==1) {
        System.out.println("Employee is Present");
}
 else {
        System.out.println("Employee is Absent");
        }
        }

}
