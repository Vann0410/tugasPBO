/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.riyad;
import java.util.Scanner;
/**
 *
 * @author vann0410
 */
public class RIYAD {

    public static void main(String[] args) {
        double val1, val2, jumlah;
        Scanner valinput = new Scanner (System.in);
        
        System.out.println("Operator Penugasan ");
        System.out.println("############################################");
        // OPS = OPERATOR PENUGASAN
        System.out.println("OPS PLUS. +=");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 += val2));
        System.out.println("OPS MIN. -=");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 -= val2));
        System.out.println("OPS MULTIPLIED. *=");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 *= val2));
        System.out.println("OPS DIVISION. /=");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 /= val2));
        System.out.println("OPS PERCENT. %=");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 %= val2));
        
        System.out.println("Operator Pembanding");
        //OPD= OPERATOR PEMBANDING
        System.out.println("############################################");
        System.out.println("OPD BIGGER. >");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 > val2));
        System.out.println("OPD SMALLER. <");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 < val2));
        System.out.println("OPD DOUBLE EQUALS. ==");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 == val2));
        System.out.println("OPD NOT EQUALS. !=");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 != val2));
        System.out.println("OPD BIGGERQUALS . >=");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 >= val2));
        System.out.println("OPD SMALLERQUALS. <=");
        System.out.print("Masukkan Angka Pertama : ");
        val1 = valinput.nextDouble();
        System.out.print("Masukkan Angka Kedua : ");
        val2 = valinput.nextDouble();
        System.out.println("Hasilnya adalah :" + (val1 <= val2));
        
        
        System.out.println("Operator Bitwise");
        System.out.println("############################################");
        int Val1,Val2;
        System.out.println("OB AND. &");
        System.out.print("Masukkan Angka Pertama : ");
        Val1 = valinput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        Val2 = valinput.nextInt();
        System.out.println("Hasilnya adalah :" + (Val1 & Val2));
        System.out.println("OB OR. |");
        System.out.print("Masukkan Angka Pertama : ");
        Val1 = valinput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        Val2 = valinput.nextInt();
        System.out.println("Hasilnya adalah :" + (Val1 | Val2));
        System.out.println("OB XOR. ^");
        System.out.print("Masukkan Angka Pertama : ");
        Val1 = valinput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        Val2 = valinput.nextInt();
        System.out.println("Hasilnya adalah :" + (Val1 ^ Val2));
        System.out.println("OB NEGASI. ~");
        System.out.print("Masukkan Angka Pertama : ");
        Val1 = valinput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        Val2 = valinput.nextInt();
        System.out.println("Hasilnya adalah :" + "Negasi angka pertama =>" + " " + (~Val1) + ","  + "Negasi Angka Kedua" + " " + (~Val2));
        System.out.println("OB RANDL SHIFTS. >> dan <<");
        System.out.print("Masukkan Angka Pertama : ");
        Val1 = valinput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        Val2 = valinput.nextInt();
        System.out.println("Hasilnya adalah :" + "angka pertama =>" + " " + (Val1 >> 1));
        System.out.println("Hasilnya adalah :" + "angka pertama =>" + " " + (Val2 >> 3));
        
        System.out.println("OB 3PEAT RSHIFT. >>>");
        System.out.print("Masukkan Angka Pertama : ");
        Val1 = valinput.nextInt();
        System.out.print("Masukkan Angka Kedua : ");
        Val2 = valinput.nextInt();
        System.out.println("Hasilnya adalah :" + "angka pertama =>" + " " + (Val1 >>> 1));
        System.out.println("Hasilnya adalah :" + "angka pertama =>" + " " + (Val2 >>> 3));
    }
}
