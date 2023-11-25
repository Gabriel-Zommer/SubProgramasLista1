/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exe02;

/**
 *
 * @author Gabriel
 */
public class Exe02 {

    public static void main(String[] args) {
        double nota1 = 8.0;
        double nota2 = 7.0;
        double nota3 = 9.0;
        char tipoMedia = 'A';
        double mediaFinal = calcularMediaAluno(nota1, nota2, nota3, tipoMedia);
        System.out.println("A média do aluno é: " + mediaFinal);
        
   
    }
    public static double calcularMediaAluno(double nota1, double nota2, double nota3, char tipoMedia){
        if(tipoMedia == 'A'){
            double mediaAluno = (nota1 + nota2 + nota3)/3;
            return mediaAluno;
        }else if(tipoMedia == 'P'){
            double mediaRuim = (nota1*5 + nota2*3 + nota3*2)/10;
            return mediaRuim;
        }else{
            return 0;
        }
    }
}
