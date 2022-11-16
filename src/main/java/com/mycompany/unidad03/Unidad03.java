/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.unidad03;

import javax.swing.JFrame;

/**
 *
 * @author LAB-2
 */
public class Unidad03 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        var ventana0301a = new JFrame();
        ventana0301a.setTitle("Ventana Unidad 03.01a");
        ventana0301a.setSize(800, 600);
        ventana0301a.setLocation(200, 100);
        ventana0301a.setVisible(true);
        ventana0301a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        var ventana0302a = new JFrame();
        ventana0302a.setTitle("Ventana Unidad 03.01.02");
        ventana0302a.setSize(400, 200);
        ventana0302a.setLocation(600, 0);
        ventana0302a.setVisible(true);
        ventana0302a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        var ventana0304a = new JFrame();
        ventana0304a.setTitle("Ventana Unidad 03.01.04");
        ventana0304a.setSize(300, 300);
        ventana0304a.setLocation(540,360 );
        ventana0304a.setVisible(true);
        ventana0304a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
