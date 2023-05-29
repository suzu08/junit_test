package com.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JudgementTest {

	private Judgement judgement;

	@BeforeEach
	public void setUp() {
		this.judgement = new Judgement();
	}

	@AfterEach
	public void tearDown() {
		this.judgement = null;
	}

    @Test
    void 得点が80の場合の結果を取得する() {

        String expected = "合格";
        String actual = judgement.judge(80);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 得点が30の場合の結果を取得する() {

        String expected = "不合格";
        String actual = judgement.judge(30);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void 得点が101の場合falseを返すこと() {
    	int score = 101;
    	assertThat(judgement.isValid(score)).isFalse();
    }

    @Test
    void 得点が30の場合に判定結果がNULLではないことを検証する() {
    	 String actual = judgement.judge(30);
    	 assertThat(actual).isNotNull();
    }

    @Test
    void judgeメソッド呼び出し時の引数が不正な場合例外が発生すること() throws IllegalArgumentException {
    	int score = -1;

    	assertThatThrownBy(() -> {
    		judgement.judge(score);
    	})
    	.isInstanceOf(IllegalArgumentException.class)
    	.hasMessage("正常な得点ではありません。");

    }

}