/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraavancada;



/**
 *
 * @author hugop
 */
public class ConversaoBase {

    private String n1;
    private int baseSelecionada;
    
    public ConversaoBase(String n1, int baseSelecionada) {
        this.n1 = n1;
        this.baseSelecionada = baseSelecionada;
    }
    public String getN1() {
        return this.n1;
    }
    
    public void setN1(String n1) {
        this.n1 = n1;
    }
    
    public int getBase() {
        return this.baseSelecionada;
    }
    
    public void setBaseSelecionada(int baseSelecionada) {
        this.baseSelecionada = baseSelecionada;
    }
    
    public static String Decimal(ConversaoBase calculadora) {
        switch(calculadora.getBase()) {
            case 0: //dec
                return calculadora.getN1();
            case 1: //hex
                return Integer.toString(Integer.parseInt(calculadora.getN1(), 16));
            case 2: //oct
                return Integer.toString(Integer.parseInt(calculadora.getN1(), 8));
            case 3: //bin
                return Integer.toString(Integer.parseInt(calculadora.getN1(), 2));
            default: 
                return "Erro";
        }
    }
    
    public static String Binario(ConversaoBase calculadora) {
        switch(calculadora.getBase()) {
            case 0: //dec
                return Integer.toBinaryString(Integer.parseInt(calculadora.getN1()));
            case 1: //hex
                return Integer.toBinaryString(Integer.parseInt(calculadora.getN1(), 16));
            case 2: //oct
                return Integer.toBinaryString(Integer.parseInt(calculadora.getN1(), 8));
            case 3: //bin
                return calculadora.getN1();
            default: 
                return "Erro";
        }
    }
    
    public static String Hexadecimal(ConversaoBase calculadora) {
        switch(calculadora.getBase()) {
            case 0: //dec
                return Integer.toHexString(Integer.parseInt(calculadora.getN1())).toUpperCase();
            case 1: //hex
                return calculadora.getN1();
            case 2: //oct
                return Integer.toHexString(Integer.parseInt(calculadora.getN1(), 8)).toUpperCase();
            case 3: //bin
                return Integer.toHexString(Integer.parseInt(calculadora.getN1(), 2)).toUpperCase();
            default: 
                return "Erro";
        }
    }
    
    public static String Octal(ConversaoBase calculadora) {
        switch(calculadora.getBase()) {
            case 0: //dec
                return Integer.toOctalString(Integer.parseInt(calculadora.getN1()));
            case 1: //hex
                return Integer.toOctalString(Integer.parseInt(calculadora.getN1(), 16));
            case 2: //oct
                return calculadora.getN1();
            case 3: //bin
                return Integer.toOctalString(Integer.parseInt(calculadora.getN1(), 2));
            default: 
                return "Erro";
        }
    }
    
}
