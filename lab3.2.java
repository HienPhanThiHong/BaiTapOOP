/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab3;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class bài_2 {
  Scanner scn = new Scanner();
     class  vector {
            
         float a1,a2,a3= scn.nextFloat();
         
         float b1,b2,b3 = scn.nextFloat();
         float c1,c2,c3 = scn.nextFloat();
         
         double Multiply_2_scalar_vector;
         double Plus_2_Scalar_vector;
         double Minus_2_Scalar_vector;

        public double getMultiply_2_scalar_vector() {
            return Multiply_2_scalar_vector;
        }

        public void setMultiply_2_scalar_vector(double Multiply_2_scalar_vector) {
            this.Multiply_2_scalar_vector = (a1*b1+a2*b2+a3*b3)/(Math.sqrt(a1*a1+a2*a2+a3*a3)*Math.sqrt((b1*b1+b2*b2+b3*b3)));
        }

        public double getPlus_2_Scalar_vector() {
            return Plus_2_Scalar_vector;
        }

        public void setPlus_2_Scalar_vector(double Plus_2_Scalar_vector) {
            this.Plus_2_Scalar_vector = Plus_2_Scalar_vector;
        }

        public double getMinus_2_Scalar_vector() {
            return Minus_2_Scalar_vector;
        }

        public void setMinus_2_Scalar_vector(double Minus_2_Scalar_vector) {
            this.Minus_2_Scalar_vector = Minus_2_Scalar_vector;
        }
         
     }
   
}
