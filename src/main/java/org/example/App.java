package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws Exception {
        System.out.println("Hello World!" );


        // 계산기 사용 예제
        Calculator calc = new Calculator();
        int result = calc.add(5, 10);
        System.out.println("Result=" + result);
    }
}
