package PresentationHW;

import java.lang.Math;

class Java_W2_04_Basics_Operators_Colors {

    public static void main (String [] args) {
    int red = Integer.parseInt (args [1]);
    int green = Integer.parseInt (args [1]);
    int blue = Integer.parseInt (args [2]);
    fourthTask (red, green, blue);
    }    

    public static void fourthTask (int red, int green, int blue) {
    float white;
    float cyan;
    float magenta;
    float yellow;
    float black;
    if (red==0 && green==0 && blue==0) {
        cyan = 0;
        magenta = 0;
        yellow = 0;
        white = 0;
        black = 1;
    }
    else { 
        white = Math.max ((float)(red)/255,Math.max((float)(green)/255,(float)(blue)/255)) ;
        cyan = (white - (float)(red)/255)/white;
        magenta = (white - (float)(green)/255)/white;
        yellow = (white - (float)(blue)/255)/white;
        black = (1-white);
    }
    System.out.println ("Cyan ="+ cyan);
    System.out.println ("Magenta ="+ magenta);
    System.out.println ("Yellow ="+ yellow);
    System.out.println ("Black ="+ black);
    }
}