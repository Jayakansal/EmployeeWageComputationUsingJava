import java.util.Random;

public class Monthly Wage {

      public static void  main (String[] args)
{
  System.out.println("Welcome to Employee Wage Computation Using Java");


                int partTimeHours=4;
                int fullTimeHours=8;
                int FullTime=8;
                int EmpRatePerHr=20;
        double Salary;
        int absent=0;
       int WorkingDays=20;
       int day;
       int EmpHur;


      for ( day= 1; day< WorkingDays; day++) {

           Random random=new Random();
           int randomNum=random.nextInt(3);

           switch (randomNum) {
                case 1:
                        int partTimeWage=(partTimeHours*EmpRatePerHr);
                        System.out.println("Part Time Employee " +partTimeWage);
                        break;
                case 2:
                        int fullTimeWage=(fullTimeHours*EmpRatePerHr);
                        System.out.println("Full Time Employee " +fullTimeWage);
                        break;

                default:
                        System.out.println("Absent"+ absent);
                        break;
                }

}
        }
}


     


