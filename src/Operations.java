public interface Operations {
    int addition(int a, int b);

    int subtraction(int a, int b);

    int multiplication(int a, int b);

    int division(int a, int b);

    int addition(int a, int b, int c);

    int subtraction(int a, int b, int c);

    int multiplication(int a, int b, int c);

    int division(int a, int b, int c);

    int addMul(int a, int b, int c); //Сложение_Умножение | a + b * c

    int addDiv(int a, int b, int c); //Сложение_Деление | a + b / c

    int addSub(int a, int b, int c); //Сложение_Вычитание | a + b - c

    int subAdd(int a, int b, int c); //Вычитание_Сложение | a - b + c

    int subMul(int a, int b, int c); //Вычитание_Умножение | a - b * c

    int subDiv(int a, int b, int c); //Вычитание_Деление | a - b / c

    int mulAdd(int a, int b, int c); //Умножение_Сложение | a * b + c

    int mulDiv(int a, int b, int c); //Умножение_Деление | a * b / c

    int mulSub(int a, int b, int c); //Умножение_Вычитание | a * b - c

    int divAdd(int a, int b, int c); //Деление_Сложение | a / b + c

    int divSub(int a, int b, int c); //Деление_Вычитание | a / b - c

    int divMul(int a, int b, int c); //Деление_Умножение | a / b * c
}
