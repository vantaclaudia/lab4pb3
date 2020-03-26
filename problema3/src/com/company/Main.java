package com.company;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cate planete doriti?");
        Class1[] p = new Class1[50];
        Class2 ABC = new Class2();
        int n = sc.nextInt();
        double[] f = new double[50];

        int i;
        for(i = 0; i < n; ++i) {
            p[i] = new Class1();
        }

        int j;
        for(i = 0; i < n; ++i) {
            j = i + 1;
            System.out.println("Pentru planeta " + j + " : ");
            System.out.print("Numele planetei este:");
            p[i].setName(sc.next());
            System.out.print("X: ");
            p[i].setX(sc.nextInt());
            System.out.print("Y: ");
            p[i].setY(sc.nextInt());
            System.out.print("Z: ");
            p[i].setZ(sc.nextInt());
            f[i] = Math.sqrt((double)(p[i].getX() * p[i].getX() + p[i].getY() * p[i].getY() + p[i].getZ() * p[i].getZ()));
        }

        for(i = 0; i < n; ++i) {
            j = i + 1;
            System.out.println("Planeta " + j + "        Nume: " + p[i].getName() + "         D: " + f[i]);
            ABC.bubble(f, n);
            PrintStream var10000 = System.out;
            String var10001 = p[0].getName();
            var10000.println("Planetele cele mai apropiate sunt :\n" + var10001 + "\n" + p[1].getName() + "\n" + p[2].getName());
            var10000 = System.out;
            var10001 = p[-1].getName();
            var10000.println("Planetele cele mai departate sunt :\n" + var10001 + "\n" + p[-2].getName());
        }

    }
}
