package class2;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean b = true;
        boolean b1 = false;
        boolean b2 = true;
        boolean b3 = false;

        //conjunction comparison
        System.out.println("b && b1: " + (b && b1));
        System.out.println("b && b2: " + (b && b2));

        //disjunction comparison
        System.out.println("b1 || b2: " + (b1 || b2));
        System.out.println("b1 || b3: " + (b1 || b3));

        //unique disjunction comparison
        System.out.println("b ^ b2: " + (b ^ b2));
        System.out.println("b3 ^ b: " + (b3 ^ b));

        //negation
        System.out.println("!b: " + !b);
        System.out.println("!b1: " + !b1);

        int i = 10;
        int i1 = 5;
        float f = 20f;
        float f1 = 50f;

        System.out.println("(i > i1) || (f1 < f): " + ((i > i1) || (f1 < f)));
        System.out.println("(i + i1) < (f1 - f) && true: " + ((i + i1) < (f1 - f) && true));

        double monthlySalary = 15555.45d;
        double averageSalary = 14161.87d;
        int amountDependents = 4;
        int averageDependents = 2;

        //good practice
        System.out.println((monthlySalary < averageSalary) && (amountDependents >= averageDependents));

        //reduction
        boolean lowSalary = monthlySalary < averageSalary;
        boolean manyDependents = amountDependents >= averageDependents;

        System.out.println((lowSalary) && (manyDependents));

        //smaller reduction
        boolean receivesAid = (lowSalary) && (manyDependents);
        System.out.println("receivesAid: " + receivesAid);
    }
}
