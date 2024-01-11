package academy.devdojo.javaoneforall.introduction;

public class Class08MultidimensionalArrays01 {
  public static void main(String[] args) {
    int[][] days = new int[4][3];
    days[0][0] = 31;
    days[0][1] = 28;
    days[0][2] = 31;
    days[1][0] = 30;
    days[1][1] = 31;
    days[1][2] = 30;
    days[2][0] = 31;
    days[2][1] = 31;
    days[2][2] = 30;
    days[3][0] = 31;
    days[3][1] = 30;
    days[3][2] = 31;

    // Option 1
//    String[][] months = new String[4][3];
//    months[0][0] = "January";
//    months[0][1] = "February";
//    months[0][2] = "March";
//    months[1][0] = "April";
//    months[1][1] = "May";
//    months[1][2] = "June";
//    months[2][0] = "July";
//    months[2][1] = "August";
//    months[2][2] = "September";
//    months[3][0] = "October";
//    months[3][1] = "November";
//    months[3][2] = "December";

    // Option 2
//    String[][] months = new String[4][3];
//    String[] values = new String[]{
//        "January", "February", "March",
//        "April", "May", "June",
//        "July", "August", "September",
//        "October", "November", "December"
//    };
//
//    for (int i = 0; i < months2.length; i++) {
//      months[(i / 3)][i % 3] = values[i];
//    }


    // Option 3
    String[][] months = new String[][] {
        new String[] {"January", "February", "March"},
        new String[] {"April", "May", "June"},
        new String[] {"July", "August", "September"},
        new String[] {"October", "November", "December"}
    };

    // Example 3 dimensional
    String[][][] months2 = new String[][][] {
        new String[][] {
            new String[] {"January"},
            new String[] {"February"},
            new String[] {"March"}
        },
        new String[][] {
            new String[] {"April"},
            new String[] {"May"},
            new String[] {"June"}
        },
        new String[][] {
            new String[] {"July"},
            new String[] {"August"},
            new String[] {"September"}
        },
        new String[][] {
            new String[] {"October"},
            new String[] {"November"},
            new String[] {"December"}
        }
    };



    for (int i = 0; i < days.length; i++) {
      for (int j = 0; j < days[i].length; j++) {
        System.out.printf("%s has %d days \n", months[i][j], days[i][j]);
      }
    }
  }
}

