package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// write a program to find how many objects are made without using the static block:
    Abc obj1 = new Abc();
    Abc obj2 = new Abc();
    Abc obj3 = new Abc();
    Abc obj4 = new Abc();
        System.out.println(Abc.c);
    }
}
class Abc{
    static int c = 0;
    Abc(){
        c++;
    }
}
/* the number of objects which you will create will be equal to the number of call of
of a constructor in which the variable is static.
 */