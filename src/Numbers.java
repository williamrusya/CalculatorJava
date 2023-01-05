abstract class Numbers implements Operations {
    private int num1;
    private int num2;
    private int num3;


    public int getNum1() { return num1; }

    public int getNum2() {
        return num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum1(int num1) {
        try {
            if (num1 <= 10 && num1 >= -10) {
                this.num1 = num1;
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            System.out.println("The first value is incorrect, please enter a number from -10 to 10");
            throw new RuntimeException(e);
        }
    }

    public void setNum2(int num2) {
        try {
            if (num2 <= 10 && num2 >= -10) {
                this.num2 = num2;
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            System.out.println("The second value is incorrect, please enter a number from -10 to 10");
            throw new RuntimeException(e);
        }
    }

    public void setNum3(int num3) {
        try {
            if (num3 <= 10 && num3 >= -10) {
                this.num3 = num3;
            } else {
                throw new RuntimeException();
            }
        } catch (Exception e) {
            System.out.println("The third value is incorrect, please enter a number from -10 to 10");
            throw new RuntimeException();
        }
    }


}

