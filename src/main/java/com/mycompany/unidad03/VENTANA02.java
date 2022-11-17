/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.unidad03;

import java.awt.Color;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author LAB-2
 */
public final class VENTANA02 extends JFrame{
   private List<JPanel> jPanelLIst;
   private List<JLabel> jLabelList;
   
    public  VENTANA02() throws HeadlessException{
   this.setTitle("Venta");
   this.setSize(800,600);
   this.setLocation(200,100);
   this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   this.iniciarPaneles();
   this.iniciarlLabels();
   this.setContentPane(this.jPanelLIst.get(0));
   this.setVisible(true);
   }
    public void iniciarPaneles(){
    this.jPanelLIst=new ArrayList<>();
    this.jPanelLIst.add(new JPanel());
    this.jPanelLIst.add(new JPanel());
    this.jPanelLIst.add(new JPanel());
    this.jPanelLIst.add(new JPanel());
    this.jPanelLIst.add(new JPanel());
    
    this.jPanelLIst.get(0).setBackground(Color.white);
    this.jPanelLIst.get(1).setBackground(Color.yellow);
    this.jPanelLIst.get(2).setBackground(Color.blue);
    this.jPanelLIst.get(3).setBackground(Color.red);
    this.jPanelLIst.get(4).setBackground(Color.green);
    
    this.jLabelList.get(0).add(this.jPanelLIst.get(1));
    this.jLabelList.get(0).add(this.jPanelLIst.get(2));
    this.jLabelList.get(0).add(this.jPanelLIst.get(3));
    this.jLabelList.get(0).add(this.jPanelLIst.get(4));
    
    }
   public void iniciarlLabels(){
   
   this.jLabelList=new ArrayList<>();
   this.jLabelList.add(new JLabel("Azul"));
   this.jLabelList.add(new JLabel("Azul"));
   this.jLabelList.add(new JLabel("Azul"));
   this.jLabelList.add(new JLabel("Azul"));
   this.jLabelList.add(new JLabel("Azul"));
   
   this.jPanelLIst.get(1).add(this.jLabelList.get(0));
   this.jPanelLIst.get(2).add(this.jLabelList.get(1));
   this.jPanelLIst.get(3).add(this.jLabelList.get(2));
   this.jPanelLIst.get(4).add(this.jLabelList.get(3));
   }  
}
