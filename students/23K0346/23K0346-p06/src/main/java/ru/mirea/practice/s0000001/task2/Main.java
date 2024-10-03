package ru.mirea.practice.s0000001.task2;

public abstract class Main {
    public static void main(String[] args) {
        // Создаем массив объектов типа Printable
        Printable[] printables = new Printable[]{
            new Book("The Great Gatsby"),
            new Magazine("National Geographic"),
            new Book("1984"),
            new Magazine("TIME")
        };

        // Проходим по массиву и вызываем метод print() для каждого объекта
        for (Printable printable : printables) {
            printable.print();
        }
    }
}

