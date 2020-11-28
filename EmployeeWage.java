import java.util.Random;

public class PartTimeORFullTime {

      public static void  main (String[] args)
{
  System.out.println("Welcome to Employee Wage Computation Using Java");


                int PartTime=1;
                int FullTime=2;
                int EmpRatePerHr=20;
                int EmpHur=0;

                Random random=new Random();
                int randomNum=random.nextInt(3);
                if (randomNum==1)
                {
                 EmpHur=4;
                }
                else if (randomNum==2) {
                 EmpHur=8;
                }
                else {
                         EmpHur=0;
                }

                System.out.println("Employee Hours"+ EmpHur);
                System.out.println("Salary:"+( EmpHur*EmpRatePerHr));


                }


        }


