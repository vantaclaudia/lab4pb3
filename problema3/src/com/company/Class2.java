package com.company;

public class Class2 {
    double[] b;
    int n;
    double aux;

    public Class2() {
    }

    public void bubble(double[] b, int n) {
        for(int i = 0; i < n - 1; ++i) {
            for(int j = 0; j < n - i - 1; ++j) {
                if (b[j] > b[j + 1]) {
                    this.aux = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = this.aux;
                }
            }
        }

    }
}


