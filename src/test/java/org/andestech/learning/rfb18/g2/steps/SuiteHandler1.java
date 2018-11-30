package org.andestech.learning.rfb18.g2.steps;

import cucumber.api.java.ru.Дано;
import cucumber.api.java.ru.Если;
import cucumber.api.java.ru.Тогда;
import org.junit.Assert;

public class SuiteHandler1 {

    private int a1,b1,res1;

    @Дано("два числа {int} и {int}")
    public void дваЧислаИ(Integer int1, Integer int2) {
       a1 = int1;
       b1 = int2;

    }

    @Если("сумма равна {int}")
    public void суммаРавна(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
      //  throw new cucumber.api.PendingException();
    }

    @Тогда("тест пройден")
    public void тестПройден() {
      //  // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
    }

    @Дано("два числа {int} и {int} и {int}")
    public void дваЧислаИИ(Integer int1, Integer int2, Integer int3) {
        // Write code here that turns the phrase above into concrete actions
       // throw new cucumber.api.PendingException();
    }

    @Если("сумма равна {int} то тест пройден")
    public void суммаРавнаТоТестПройден(Integer summ) {
        // Write code here that turns the phrase above into concrete actions

        Assert.assertEquals((long)summ, a1 + b1 );

    }

}
