package ru.netology.sqr;

public class SQRService {
    public int calcSQR(int max, int min) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min && i * i <= max) {
                count++;
            }
        }
        return count;
    }


}

