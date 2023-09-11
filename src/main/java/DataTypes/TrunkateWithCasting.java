package DataTypes;

public class TrunkateWithCasting {

    public static void main(String[] args) {

        //To truncate, first you times by 10, then convert to integer, then to double, then divide by 100 :)
        double variable = 1456.6765443;
        variable = variable * 100;
        int num = (int) variable;
        double variable1 = num;
        variable1 = variable1 / 100;
        System.out.println(variable1);

        int nums = 3;
        if (nums == Days.MONDAY) {

        }
    }
}
