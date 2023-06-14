package model;

/**
 * Класс Calculator отвечает за расчёт необходимых данных. Он содержит в себе 4 переменные, значения которых берутся из базы данных и 7 переменных для получения 7 различных результатов вычисления. Также имеет геттеры и сеттеры для доступа к содержимому.
 */
public class Calculator {
    private double a; // yes yes
    private double b; // yes no
    private double c; // no yes
    private double d; // no no

    /**
     * Метод calcChuvs() – производит вычисление значения и возвращает результат вычислений chuvs.
     * @return
     */
    public double calcChuvs(double a, double b) {
        return Math.round(a / (a + b) * 100);
    }

    /**
     * Метод calcSpec() – производит вычисление значения и возвращает результат вычислений в переменную spec.
     * @return
     */
    public double calcSpec(double c, double d) {
        return Math.round(c / ( d + c) * 100);
    }

    /**
     * Метод calcPlusBol() – производит вычисление значения и возвращает результат вычислений в переменную plus.
     * @return
     */
    public double calcPlusBol(double chuvs) {
        return Math.round((chuvs / 100) / (1- (chuvs / 100)));
    }

    /**
     * Метод calcMinusBol() – производит вычисление значения и возвращает результат вычислений в переменную minus.
     * @return
     */
    public double calcMinusBol(double chuvs) {
        return Math.round((1- (chuvs / 100)) /(chuvs / 100));
    }

    /**
     * Метод calcRasp()– производит вычисление значения и возвращает результат вычислений в переменную rasp.
     * @return
     */
    public double calcRasp(double a, double b, double d, double c) {
        return Math.round( (a + b) / (a + b + d + c) * 100);
    }

    /**
     * Метод calcPCPlus() – производит вычисление значения и возвращает результат вычислений в переменную pcplus.
     * @return
     */
    public double calcPCPlus(double chuvs, double d) {
        return Math.round( chuvs / (chuvs + d) * 100);
    }

    /**
     * Метод calcPCMinus() – производит вычисление значения и возвращает результат вычислений в переменную pcminus.
     * @return
     */
    public double calcPCMinus(double c, double b) {
        return Math.round( c / (b + c) * 100);
    }
}
