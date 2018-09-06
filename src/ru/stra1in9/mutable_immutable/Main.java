package ru.stra1in9.mutable_immutable;

import java.util.Date;

import ru.stra1in9.mutable_immutable.immutable.B;
import ru.stra1in9.mutable_immutable.mutable.A;

public class Main {

    public static void main(String[] args) {
        // A is mutable
        // ------------------------------------------------------------------------------------------------------------
        System.out.println("A is mutable.");
        System.out.println("Creating and testing an A instance...");

        A a = new A();

        a.a1 = new Date();

        System.out.println("a.a1 after initialization: " + a.a1);

        a.a2 = String.format("%1$td.%1$tm.%1$tY %<tH:%<tM:%<tS", a.a1);

        System.out.println("a.a2 after initialization: " + a.a2);

        a.a1.setTime(100500);

        System.out.println("a.a1 after modification: " + a.a1);

        a.a2 = String.format("%1$td.%1$tm.%1$tY %<tH:%<tM:%<tS", a.a1);

        System.out.println("a.a2 after modification: " + a.a2);
        // ------------------------------------------------------------------------------------------------------------

        System.out.println("");

        // B is immutable
        // ------------------------------------------------------------------------------------------------------------
        System.out.println("Is B immutable?");
        System.out.println("Creating and testing a B instance...");

        Date now = new Date();

        B b =
            new B(
                now,
                String.format("%1$td.%1$tm.%1$tY %<tH:%<tM:%<tS", now)
            );

        System.out.println("b.b1 after initialization:" + b.getB1());
        System.out.println("b.b2 after initialization:" + b.getB2());

        b.getB1().setTime(100500);
        b.getB2().replace(b.getB2(), "01.01.1970 03:01:40");

        System.out.println("b.b1 after modification:" + b.getB1());
        System.out.println("b.b2 after modification:" + b.getB2());
        // ------------------------------------------------------------------------------------------------------------

    }
}
