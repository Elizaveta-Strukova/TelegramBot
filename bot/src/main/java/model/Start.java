package model;

import model.Calculator;

public class Start {
    private Calculator calculator;
    private double a;
    private double b;
    private double c;
    private double d;

    private double chuys;
    private double calcSpec;
    private double calcPlusBol;
    private double calcMinusBol;
    private double calcRasp;
    private double calcPCPlus;
    private double calcPCMinus;


    public Start(){
        calculator = new Calculator();
    }

    public String action() {
        return "Калькулятор расчета статистических данных" +"\n" +
                "Введите данные для расчета (через проблел : \n" +
                "истинно-положительный результат (true-positive, TP) — пациент больной, диагноз положительный;\n" +
                "ложно-положительный результат (false-positive, FP) — пациент здоров, диагноз положительный;\n" +
                "ложно-отрицательный результат (false-negative, FN) — пациент больной, диагноз отрицательный; \n" +
                "истинно-отрицательный результат (true-negative, TN) — пациент здоров, диагноз отрицательный)";
    }

    public void calculate(String answer){
        String[] numbers = answer.split(" ");
        if (numbers.length < 4) {
            // Обработка ошибки недостаточного количества чисел
            return;
        }

        try {
           a = Integer.parseInt(numbers[0]);
             b = Integer.parseInt(numbers[1]);
             c = Integer.parseInt(numbers[2]);
           d = Integer.parseInt(numbers[3]);

            chuys = calculator.calcChuvs(a, b);
            calcSpec = calculator.calcSpec(c, d);
            calcPlusBol = calculator.calcPlusBol(chuys);
            calcMinusBol = calculator.calcMinusBol(chuys);
            calcRasp = calculator.calcRasp(a, b, d, c);
            calcPCPlus = calculator.calcPCPlus(chuys, d);
            calcPCMinus = calculator.calcPCMinus(c, b);
            

            


        } catch (NumberFormatException e) {
            return;
        }
    }

    public String end() {
        return "                 Таблица сопряженности" + "\n" +
                "            Матрица            |"  +   "Заболевание есть |"  + "Заболевания нет"   +"\n" +
                "Тест положительный |                " +         a + "           |       " + b + "\n" +
                "Тест отрицательный   |              " +  c +        "            |       " + d + "\n" +
                "\n"+
                "Результаты расчета: " + "\n" +
                "\n"+
                "Чувствительность = " + chuys  + " %" + "\n"+
                "Специфичность = " + calcSpec +  " %" +"\n" +
                "Положительная вероятность болезни = " + calcPlusBol +  " %" +"\n" +
                "Отрицательная вероятность болезни = " + calcMinusBol + " %" +"\n" +
                "Распространенность заболевания = " +calcRasp +  " %" + "\n" +
                "Прогностическая ценность положительного результата = " + calcPCPlus  + " %" + "\n" +
                "Прогностическая ценность отрицательного результата = " + calcPCMinus + " %" + "\n";
    }
}
