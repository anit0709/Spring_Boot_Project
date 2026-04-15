package org.practice;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calc c=new Calc();
        c.sum(3,4);
        c.removeAstringFromStart("AATCDE");
        boolean check=c.isfirstAndLastequals("ABCDAB");
        System.out.println(check);



    }
}