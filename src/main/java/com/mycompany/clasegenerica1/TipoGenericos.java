/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasegenerica1;

/**
 *
 * @author DaniMay
 */
public class TipoGenericos {
     public static void main(String[] args)
    {
        (new TipoGenericos()).suma();

    }
    private void suma(){
        NumerosOperaciones<Integer> numeroEntero = new NumerosOperaciones<Integer>(5,5);
        NumerosOperaciones<Double> numeroDouble = new NumerosOperaciones<Double>(5.0,5.2);
        System.out.println(numeroEntero);
        System.out.println(numeroDouble);
        
         NumerosOperaciones<TipoGenericos> tipo = new NumerosOperaciones<>(
            new TipoGenericos(), new TipoGenericos());

        System.out.println(tipo);
    }
}
