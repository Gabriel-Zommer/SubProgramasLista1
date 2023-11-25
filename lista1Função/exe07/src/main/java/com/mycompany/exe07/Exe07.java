/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe07;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Exe07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("digite sua idade: ");
        int nadador = s.nextInt();
        
        String categoria = plau(nadador);
        
        System.out.println("a categoria do nadador é: " + categoria);
    }
    
    public static String plau(int a){
        if((a >= 5) && (a <=7)){
            
            return "Infantil A";
            
        }else if((a >= 8) && (a <=10)){
            return "Infantil B";
            
        }else if((a >= 11) && (a <=13)){
            return "Juvenil A";
        }else if((a >= 14) && (a <=17)){
           return "Juvenil B";  
        }else if(a > 17){
           return "Adulto";
        } else {
            return "Idade fora da faixa";
        }
       
    }
}
