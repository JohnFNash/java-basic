package com.johnfnash.learn.lombok.demo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class BBO extends ABO {
	private int b;

    public static void main(String[] args) {

        BBO bbo1 = new BBO();
        BBO bbo2 = new BBO();

        bbo1.setA(1);
        bbo2.setA(2);

        bbo1.setB(1);
        bbo2.setB(1);

        System.out.print(bbo1.equals(bbo2)); // true
    }
}

@Data
class ABO {
	private int a;
}
