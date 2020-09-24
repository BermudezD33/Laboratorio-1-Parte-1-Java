package com.cenfotec.componentes.control;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class GraficoBarras extends javax.swing.JPanel {

    public GraficoBarras() {
        initComponents();
    }

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
//Barras
        g2d.drawLine(20, 100, 20, 40);
        g2d.drawLine(30, 100, 30, 40);
        g2d.drawLine(50, 100, 50, 20);
        g2d.drawLine(60, 100, 60, 20);
        g2d.drawLine(80, 100, 80, 50);
        g2d.drawLine(90, 100, 90, 50);
        g2d.drawLine(110, 100, 110, 90);
        g2d.drawLine(120, 100, 120, 90);
//Linea base     
        g2d.drawLine(5, 100, 125, 100);

//Lineas top
        g2d.drawLine(20, 40, 30, 40);
        g2d.drawLine(50, 20, 60, 20);
        g2d.drawLine(80, 50, 90, 50);
        g2d.drawLine(110, 90, 120, 90);
//Linea datos
        g2d.drawLine(5, 100, 5, 20);
//Valores
        g2d.drawString("0", 0, 115);
        g2d.drawString("1", 24, 115);
        g2d.drawString("2", 54, 115);
        g2d.drawString("3", 84, 115);
        g2d.drawString("4", 114, 115);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
