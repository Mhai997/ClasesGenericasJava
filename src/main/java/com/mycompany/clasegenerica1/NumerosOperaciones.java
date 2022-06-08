/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clasegenerica1;

/**
 *
 * @author DaniMay
 */
public class NumerosOperaciones<T> {
    private T x1,x2;

    public NumerosOperaciones(T x1, T x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public String toString() {
        return "NumerosOperaciones{" + "x1=" + x1 + ", x2=" + x2 + '}';
    }

  
    public T getX1() {
        return x1;
    }

    public void setX1(T x1) {
        this.x1 = x1;
    }

    public T getX2() {
        return x2;
    }

    public void setX2(T x2) {
        this.x2 = x2;
    }
    
    
}
