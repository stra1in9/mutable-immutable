package ru.stra1in9.mutable_immutable.immutable;

import java.util.Date;

final public class B {
    final private Date   b1;
    final private String b2;

    public B (
        Date   b1,
        String b2
    ) {
       this.b1 = b1;
       this.b2 = b2;
    }

    public Date getB1() {
        return new Date(b1.getTime());
    }

    public String getB2() {
        return b2;
    }
}
