package ru.itis;
import org.sikuli.script.App;
import org.sikuli.script.Screen;

public class TestMain {
    public static void main(String[] args) {

        App calculator = new App("Calculator.app");
        calculator.open();
        Screen s = new Screen();
        try {
            // 7 + 7
            String seven = TestMain.class.getResource("/7.png").getPath();
            String plus = TestMain.class.getResource("/plus.png").getPath();
            String equal = TestMain.class.getResource("/equal.png").getPath();
            s.click(seven);
            s.click(plus);
            s.click(seven);
            s.click(equal);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
