import java.util.Scanner;

public class Calculator extends Functions {

    public Calculator(int num1, int num2) {
        setNum1(num1);
        setNum2(num2);

    }

    public Calculator(int num1, int num2, int num3) {
        setNum1(num1);
        setNum2(num2);
        setNum3(num3);

    }


    public static void main(String[] args) {

        int nm1;
        int nm2;
        int nm3;

        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        // [1] [+] [2] [*] [3]
        //  0   1   2   3   4

        if (str.length == 5) {
            nm1 = Integer.parseInt(str[0]);
            nm2 = Integer.parseInt(str[2]);
            nm3 = Integer.parseInt(str[4]);

            Calculator calc = new Calculator(nm1, nm2, nm3);
            switch (str[1]) {
                case "+":
                    switch (str[3]) {
                        case "*":
                            System.out.println(calc.addMul(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;
                        case "/":
                            System.out.println(calc.addDiv(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;
                        case "+":
                            System.out.println(calc.addition(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;
                        case "-":
                            System.out.println(calc.addSub(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        default:
                            System.out.println("Defined the invalid operator. Please enter correct operator: +, -, *, /");
                            throw new RuntimeException();
                    }
                    break;

                case "-":
                    switch (str[3]) {
                        case "*":
                            System.out.println(calc.subMul(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        case "/":
                            System.out.println(calc.subDiv(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        case "+":
                            System.out.println(calc.subAdd(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        case "-":
                            System.out.println(calc.subtraction(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        default:
                            System.out.println("Defined the invalid operator. Please enter correct operator: +, -, *, /");
                            throw new RuntimeException();

                    }
                    break;
                case "*":
                    switch (str[3]) {
                        case "*":
                            System.out.println(calc.multiplication(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        case "/":
                            System.out.println(calc.mulDiv(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        case "+":
                            System.out.println(calc.mulAdd(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        case "-":
                            System.out.println(calc.mulSub(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        default:
                            System.out.println("Defined the invalid operator. Please enter correct operator: +, -, *, /");
                            throw new RuntimeException();

                    }

                    break;
                case "/":
                    switch (str[3]) {
                        case "*":
                            System.out.println(calc.divMul(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        case "/":
                            System.out.println(calc.division(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        case "+":
                            System.out.println(calc.divAdd(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        case "-":
                            System.out.println(calc.divSub(calc.getNum1(), calc.getNum2(), calc.getNum3()));
                            break;

                        default:
                            System.out.println("Defined the invalid operator. Please enter correct operator: +, -, *, /");
                            throw new RuntimeException();

                    }
                    break;

                default:
                    System.out.println("Defined the invalid operator. Please enter correct operator: +, -, *, /");
                    throw new RuntimeException();
            }
        } else if (str.length == 3) {
            nm1 = Integer.parseInt(str[0]);
            nm2 = Integer.parseInt(str[2]);

            Calculator calcTwo = new Calculator(nm1, nm2);

            switch (str[1]) {
                case "+":
                    System.out.println(calcTwo.addition(calcTwo.getNum1(), calcTwo.getNum2()));
                    break;
                case "-":
                    System.out.println(calcTwo.subtraction(calcTwo.getNum1(), calcTwo.getNum2()));
                    break;
                case "*":
                    System.out.println(calcTwo.multiplication(calcTwo.getNum1(), calcTwo.getNum2()));
                    break;
                case "/":
                    System.out.println(calcTwo.division(calcTwo.getNum1(), calcTwo.getNum2()));
                    break;

                default:
                    System.out.println("Defined the invalid operator. Please enter correct operator: +, -, *, /");
                    throw new RuntimeException();
            }
        } else {
            System.out.println("Defined the invalid expression. Please enter expression like: a + b - c");
            throw new RuntimeException();
        }


    }
}


