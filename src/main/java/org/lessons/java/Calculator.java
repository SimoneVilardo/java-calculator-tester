package org.lessons.java;

public class Calculator {
	
	
	public float addizione(float num1, float num2) {
        return num1 + num2;
    }

    public float sottrazione(float num1, float num2) {
        return num1 - num2;
    }

    public float divisione(float num1, float num2) throws Exception {
        if (num2 == 0) {
            throw new Exception("Non puoi dividere per zero");
        }
        return num1 / num2;
    }

    public float moltiplicazione(float num1, float num2) {
        return num1 * num2;
    }
	
}

