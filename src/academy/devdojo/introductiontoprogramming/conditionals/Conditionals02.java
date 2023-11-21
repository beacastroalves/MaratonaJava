package academy.devdojo.introductiontoprogramming.conditionals;

public class Conditionals02 {
  public static void main(String[] args) {
    // ==, !=, >, >=, <, <=
    float salaryManager = 5000;
    float salaryDeveloper = 4500F;

    boolean isSalaryManagerGreaterThanDeveloper = salaryManager > salaryDeveloper;
    boolean isSalaryManagerGreaterOrEqualThanDeveloper = salaryManager >= salaryDeveloper;

    boolean isSalaryManagerLowerThanDeveloper = salaryManager < salaryDeveloper;
    boolean isSalaryManagerLessOrEqualThanDeveloper = salaryManager <= salaryDeveloper;

    boolean isSalaryManagerEqualThanDeveloper = salaryManager == salaryDeveloper;
    boolean isSalaryManagerDifferentThanDeveloper = salaryManager != salaryDeveloper;


    System.out.println("isSalaryManagerGreaterThanDeveloper: " + isSalaryManagerGreaterThanDeveloper);
    System.out.println("isSalaryManagerGreaterOrEqualThanDeveloper: " + isSalaryManagerGreaterOrEqualThanDeveloper);
    System.out.println("isSalaryManagerLowerThanDeveloper: " + isSalaryManagerLowerThanDeveloper);
    System.out.println("isSalaryManagerLessOrEqualThanDeveloper: " + isSalaryManagerLessOrEqualThanDeveloper);
    System.out.println("isSalaryManagerEqualThanDeveloper: " + isSalaryManagerEqualThanDeveloper);
    System.out.println("isSalaryManagerDifferentThanDeveloper: " + isSalaryManagerDifferentThanDeveloper);
  }
}
