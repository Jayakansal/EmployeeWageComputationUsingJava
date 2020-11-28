import java.util.Random;

public class PartTimeORFullTime {

      public static void  main (String[] args)
{
  System.out.println("Welcome to Employee Wage Computation Using Java");


               int PartTime=1;
                int FullTime=2;
                int EmpRatePerHr=20;
                double Salary;
                int absent=0;
                int partTimeHour=4;
                int fullTimeHour=8;
                Random random=new Random();
                int randomNum=random.nextInt(3);
                int EmpHur;
                switch (randomNum) {
                case 1:
                        int partTimeWage=(partTimeHour*EmpRatePerHr);
                        System.out.println("Part Time Employee " +partTimeWage);
                        break;
                case 2:
                        int fullTimeWage=(fullTimeHour*EmpRatePerHr);
                        System.out.println("Full Time Employee " +fullTimeWage);
                        break;

                default:
                        System.out.println("Absent"+ absent);
                        break;
                }


        }
        }

     


