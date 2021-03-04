package com.data;

public class Main {

    public static void main(String[] args) {
	        sleep(true,true);
	        sleep(true, false);
	        sleep(false, false);
	        sleep (false,true);
    }
    public static boolean sleep(boolean weekday, boolean vacation){ //compile
        if(weekday != false || vacation == true){
            System.out.println("sleep");
            return true;
        }
        else{
            System.out.println("not sleep");
        }
        return false;
    }

}
