public class Test {

    public double calcTest(double int1, String operator, double int2) {

        if (operator == "+") {
            return int1 + int2;
        } else if (operator == "-") {
            return int1 - int2;
        } else if (operator == "*") {
            return int1 * int2;
        } else if (operator == "/") {
            return int1 / int2;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        Test myObj = new Test();
        double test = myObj.calcTest(1, "-", 2);
        System.out.println(test);
    }
}