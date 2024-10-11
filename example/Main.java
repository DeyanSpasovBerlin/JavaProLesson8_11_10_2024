package org.example;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        int[][] mas = cat.generateMatrix(3,4);
        Cat.print2DArray(mas);
         mas = cat.generateMatrix(5,4);
        Cat.print2DArray(mas);

    }
}