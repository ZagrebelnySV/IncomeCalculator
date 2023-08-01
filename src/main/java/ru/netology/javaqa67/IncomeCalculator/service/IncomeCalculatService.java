package ru.netology.javaqa67.IncomeCalculator.service;

public class IncomeCalculatService {
    public int incomeCalc(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = (money - expenses) / 3; // в месяц отдыха из накоплений вычитаются обязательные платежи и накопления уменьшаются в 3 раза
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
