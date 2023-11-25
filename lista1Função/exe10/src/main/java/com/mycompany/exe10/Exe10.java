/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe10;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Exe10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("qual a nota do aluno?");
        double notaAluno = s.nextDouble();
        
        String conceitoAluno = resultadoAluno(notaAluno);
        
        System.out.println("o resultado do conceito da nota do aluno é: " + conceitoAluno);
    }
    
    public static String resultadoAluno( double a){
        if((a >= 0 && a <= 4.9)){
            
            return "conceito D";
            
        }else if((a >= 5 && a <= 6.9)){
            
            return "conceito C";
            
        }else if((a >= 7 && a <= 8.9)){
            
            return "conceito B";
            
        }else if((a >= 9 && a <= 10)){
            
            return "conceito A";
            
        }else{
            return "conceito invalido";
        }
    }
}
