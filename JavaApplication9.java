/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author Şamil
 */
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class JavaApplication9 {


	public static void main(String[] args) {
                    double en=0.2;
                    double boy=0.5;
                    double oran=2;
                    double kalinlik18=125.86;
                    double kalinlik28=186.9;
                    
                    for(int i=0; i<6; i++){
                        for(int j=0;j<6;j++){
                            if(j%2==0){
                                System.out.println("18 = " + en*boy*kalinlik18*1.15*1.18 );
                            }
                            else{
                                
                                System.out.println("28 = " + en*boy*kalinlik28*1.15*1.18 );
                                boy+=0.5;
                            }
                        }
                        boy=0.5;
                        System.out.println("----------"+oran +"----");
                        oran+=2;
                        en+=0.2;
                    }
		
                }
        }
