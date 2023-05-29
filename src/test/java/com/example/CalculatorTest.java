package com.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void multiplyで3と4の乗算結果を取得する() {
        Calculator sut = new Calculator();
        int expected = 12;
        int actual = sut.multiply(3, 4);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void devideで3と2の除算結果を取得する() {
        Calculator sut = new Calculator();
        double expected = 1.5;
        double actual = sut.devide(3, 2);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void calcTriangleAreaで底辺が3で高さが5の三角形の面積を取得する() {
        Calculator sut = new Calculator();
        double expected = 7.5;
        double actual = sut.calcTriangleArea(3, 5);
        assertThat(actual).isEqualTo(expected);
    }
}