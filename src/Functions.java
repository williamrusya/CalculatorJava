abstract class Functions extends Numbers implements Operations {
    private int result;

    public int addition(int a, int b) {
        return result = a + b;
    }

    public int subtraction(int a, int b) {
        return result = a - b;
    }

    public int multiplication(int a, int b) {
        return result = a * b;
    }

    public int division(int a, int b) {
        return result = a / b;
    }

    public int addition(int a, int b, int c) {
        return result = a + b + c;
    }

    public int subtraction(int a, int b, int c) {
        return result = a - b - c;
    }

    public int multiplication(int a, int b, int c) {
        return result = a * b * c;
    }

    public int division(int a, int b, int c) {
        return result = a / b / c;
    }

    @Override
    public int addMul(int a, int b, int c) {
        return addition(multiplication(b, c), a);
    }

    @Override
    public int addDiv(int a, int b, int c) {
        return addition(a, division(b, c));
    }

    @Override
    public int addSub(int a, int b, int c) {
        return subtraction(addition(a, b), c);
    }

    @Override
    public int subAdd(int a, int b, int c) {
        return addition(subtraction(a, b), c);
    }

    @Override
    public int subMul(int a, int b, int c) {
        return subtraction(a, multiplication(b, c));
    }

    @Override
    public int subDiv(int a, int b, int c) {
        return subtraction(a, division(b, c));
    }

    @Override
    public int mulAdd(int a, int b, int c) {
        return addition(multiplication(a, b), c);
    }

    @Override
    public int mulDiv(int a, int b, int c) {
        return division(multiplication(a, b), c);
    }

    @Override
    public int mulSub(int a, int b, int c) {
        return subtraction(multiplication(a, b), c);
    }

    @Override
    public int divAdd(int a, int b, int c) {
        return addition(division(a, b), c);
    }

    @Override
    public int divMul(int a, int b, int c) {
        return multiplication(division(a, b), c);
    }

    @Override
    public int divSub(int a, int b, int c) {
        return subtraction(division(a, b), c);
    }
}
