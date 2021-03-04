package com.data;


/*
The parameter weekday is true if it is a weekday, and the parameter
 vacation is true if we are on vacation. We sleep in if it is not
 a weekday or we're on vacation. Return true if we sleep in.

 */

public class Sleep {

    // compile code
    public boolean sleep(boolean weekday, boolean vacation){

        if(weekday != false || vacation == true){
            System.out.println("sleep");
            return true;

        } else{
            System.out.println("not sleep");
        }
        return false;
    }

}

   /*

   - "main" bir metod oldugu icin icinde yeni bir metod yazamayiz

    public static void main(String[] args) {
              }
   - metodu farkli bir class da tanimlayip, main class da cagirabiliriz

   - kodda main satirinin basta veya sonda olmasi farketmez

    - Java is a strongly typed programming language because every
    variable must be declared with a data type. A variable cannot
    start off life without knowing the range of values it can hold,
    and once it is declared, the data type of the variable cannot change.

    - metod static ve public olursa objesini olusturmadan baska bir class
    dan metod cagirilabilir

     */
