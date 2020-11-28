import java.util.LinkedList;

import java.util.Random;

public class EmployeeWageBuilder implements IComputeEmpWage  {

        public static final int IS_PART_TIME=1;
        public static final int IS_FULL_TIME=2;

        public int numOfCompany=0;

        private LinkedList<CompanyEmpWage> companyEmpWageList;



        //CompanyEmpWage companyEmpWage[];

        public EmployeeWageBuilderArray()
        {
                companyEmpWageList= new LinkedList<CompanyEmpWage>();


                //companyEmpWage=new CompanyEmpWage[5];
        }

        public void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth)
 {
                CompanyEmpWage companyEmpWage=new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);

                companyEmpWageList.add(companyEmpWage);



        }

        public void computeEmpWage()
        {
                for (int i = 0; i <companyEmpWageList.size(); i++)
                {
                                CompanyEmpWage company=companyEmpWageList.get(i);
                                company.setTotalEmpWage(this.computeEmpWage(company));
                                System.out.println(company);

                }
        }


 public int computeEmpWage(CompanyEmpWage companyEmpWage)
        {
        int empHrs=0,totalEmpHrs=0,totalWorkingDays=0;
        Random random=new Random();
        while(totalEmpHrs<=companyEmpWage.maxHoursPerMonth && totalWorkingDays<companyEmpWage.numOfWorkingDays)
        {
                totalWorkingDays++;

                int empCheck=random.nextInt(3);
                                //(int) Math.floor(Math.random() * 10)%3;
                switch(empCheck)
                {
                case IS_PART_TIME:
                        empHrs=4;
                        break;

                case IS_FULL_TIME:
                        empHrs=8;
                        break;
                default:
                        empHrs=0;
                }
                totalEmpHrs+=empHrs;
                System.out.println("day: "+totalWorkingDays + "EmpHrs: "+empHrs);
                }


        return totalEmpHrs * companyEmpWage.empRatePerHour;
        }


        public static void main(String[] args) {
                EmployeeWageBuilderArray empWageBuilder=new EmployeeWageBuilderArray();
                empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
                empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
                empWageBuilder.computeEmpWage();
        }



        }

}
