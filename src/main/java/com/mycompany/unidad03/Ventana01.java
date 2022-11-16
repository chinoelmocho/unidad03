/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JPanel;
import javax.swing.JFrame;
        import java.util.ArrayList;
import java.util.List;
        
/**
 *
 * @author LAB-2
 */
public class Ventana01 extends  JFrame{
   private List<JPanel> jPanelList;

    public Ventana01(String title) throws HeadlessException {
        super(title);
        this.setSize(100,200);
        this.setLocation(200,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jPanelList=new ArrayList<>();
        this.setLayout(new FlowLayout());
    }
    
        public void iniciarComponentes(){
        var jPanelRojo= new JPanel();
        jPanelRojo.setBackground(Color.red);
        var jPanelAzul=new JPanel();
        jPanelAzul.setBackground(Color.blue);
        var jPanelVerde=new JPanel();
        jPanelVerde.setBackground(Color.green);
        var jPanelNaranja=new JPanel();
        jPanelNaranja.setBackground(Color.ORANGE);
        var jPanelAmarillo=new JPanel();
        jPanelAmarillo.setBackground(Color.YELLOW);
        this.jPanelList.add(jPanelRojo);
        this.jPanelList.add(jPanelAzul);
        this.jPanelList.add(jPanelVerde);
        this.jPanelList.add(jPanelNaranja);
        this.jPanelList.add(jPanelAmarillo);
        for(var jPanel:this.jPanelList){
            this.getContentPane().add(jPanel);
        }
        }
        
}

    

