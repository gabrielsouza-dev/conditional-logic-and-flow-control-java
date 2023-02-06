package class3;

public class FlowControl {
    public static void main(String[] args) {
        ifArrow();
        ifWithoutArrow();
        ifVacation();
        ifSmaller();

        switchWeek();
        switchNumber();
        switchVacation();
    }

    private static void ifArrow() {

        int month = 20;
        if (month == 1) {
            System.out.println("January");
        } else {
            if (month == 2) {
                System.out.println("February");
            } else {
                if (month == 3) {
                    System.out.println("March");
                } else {
                    if (month == 4) {
                        System.out.println("April");
                    } else {
                        if (month == 5) {
                            System.out.println("May");
                        } else {
                            if (month == 6) {
                                System.out.println("June");
                            } else {
                                if (month == 7) {
                                    System.out.println("July");
                                } else {
                                    if (month == 8) {
                                        System.out.println("August");
                                    } else {
                                        if (month == 9) {
                                            System.out.println("September");
                                        } else {
                                            if (month == 10) {
                                                System.out.println("October");
                                            } else {
                                                if (month == 11) {
                                                    System.out.println("November");
                                                } else {
                                                    if (month == 12) {
                                                        System.out.println("December");
                                                    } else {
                                                        System.out.println("Indefinite Month");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static void ifWithoutArrow() {

        int month = 9;
        if (month == 1) {
            System.out.println("January");
        } else if (month == 2) {
            System.out.println("February");
        } else if (month == 3) {
            System.out.println("March");
        } else if (month == 4) {
            System.out.println("April");
        } else if (month == 5) {
            System.out.println("May");
        } else if (month == 6) {
            System.out.println("June");
        } else if (month == 7) {
            System.out.println("July");
        } else if (month == 8) {
            System.out.println("August");
        } else if (month == 9) {
            System.out.println("September");
        } else if (month == 10) {
            System.out.println("October");
        } else if (month == 11) {
            System.out.println("November");
        } else {
            System.out.println("December");
        }
//      } else if (month == 12) {
//            System.out.println("December");
//      } else {
//            System.out.println("Indefinite month");
//      }

    }

    private static void ifVacation() {

        String month = "July";
        if (month == "July" || month == "December" || month == "January") {
            System.out.println("Vacation");
        }
    }

    private static void ifSmaller() {

        double monthlySalary = 11893.58d;
        double averageSalary = 10500d;

        int amountDependents = 4;
        int averageDependents = 2;

        if ((monthlySalary < averageSalary) && (amountDependents >= averageDependents)) {
            System.out.println("Official must receive assistance.");
        }

        boolean lowSalary = monthlySalary < averageSalary;
        boolean manyDependents = amountDependents >= averageDependents;

        if ((lowSalary) && (manyDependents)) {
            System.out.println("Official must receive assistance.");
        }

        boolean receivesAid = (lowSalary) && (manyDependents);
        if (receivesAid) {
            System.out.println("Official must receive assistance.");
        } else {
            System.out.println("Official should not receive assistance.");
        }

    }

    private static void switchWeek() {

        String day = "hjhgkh";
        switch (day){
            case "Monday":
                System.out.println(2);
                break;
            case "Tuesday":
                System.out.println(3);
                break;
            case "Wednesday":
                System.out.println(4);
                break;
            case "Thursday":
                System.out.println(5);
                break;
            case "Friday":
                System.out.println(6);
                break;
            case "Saturday":
                System.out.println(7);
                break;
            case "Sunday":
                System.out.println(1);
                break;
            default:
//                System.out.println(1);
                System.out.println("Invalid Day");
                break;
        }
    }

    private static void switchNumber() {

        int number = 4;
        switch (number){
            case 1:
            case 2:
            case 3:
                System.out.println("Right");
                break;
            case 4:
                System.out.println("Wrong");
                break;
            case 5:
                System.out.println("Perhaps");
                break;
            default:
                System.out.println("Indefinite Value");
                break;
        }
    }

    private static void switchVacation() {

        String month = "December";
        switch (month) {
            case "December":
            case "July":
            case "January":
                System.out.println("Vacation");
                break;
            default:
                System.out.println("Indefinite Month");
                break;
        }
    }
}
