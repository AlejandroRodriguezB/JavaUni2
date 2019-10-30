/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosas;

/**
 *
 * @author alumno
 */
public class CosasToLocas {

    private void inicio(){
        int num1=300;
        int num2=200;
        int num3=100;
        int rs1;
        int rs2;
        char letra='a';
        
    /*
        int resultado;
        resultado = suma(1,2);
        System.out.println(resultado);
    
        resultado = suma(num1,num2);
        System.out.println(resultado);
        suma2(100, resultado);
    
    //resultado= mayor2(num1,num2,num3);
        rs1=mayor(num1,num2);
        rs2=mayor(num2,num3);
        resultado=mayor(rs1,rs2);
        System.out.println(resultado);
        */
        boolean result;
        result=vocal(letra);
        System.out.println(result);
    }
    
    //sub programa que nos dice si un numero es divisor de otro
    public boolean MayorEnt(int a , int b ){
        boolean c;
        if (a%b == 0 ){
            c=true;
        }
        else{
            c=false;
        }
        
        return c;
    }
    
    public int suma(int a, int b){
        int suma;
        suma= a+b;
    
        return suma;
    }
    public void suma2(int a, int b){
        int suma;
        suma= a+b;
    
    }
    public int mayor(int a, int b){
        int mayor;
        if(a<b){
        mayor=b;
        }
        else{
        mayor=a;
        }
        return mayor;
    }
    public int mayor2(int a, int b, int c){
        int mayor;
        if(a<b && c<b ){
            mayor=b;
        }
        else if(a<c && b<c){
            mayor=c;
        }
        else{
            mayor=a;
        }
        return mayor;
    }
    
    public boolean vocal(char a){
        boolean VyFvocal;
        if(a=='a'|| a=='e' || a=='i'|| a=='o' || a=='u'){
            VyFvocal=true;
        }
        else{
            VyFvocal=false;
        }
        return VyFvocal;
    }
    
    
            
    public static void main(String[] args) {
        
        CosasToLocas var = new CosasToLocas();
        var.inicio();
            
    }
    
}
