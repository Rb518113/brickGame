/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brickgame;

import javax.swing.JFrame;

/**
 *
 * @author rifatbhuiyan
 */
public class BrickGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      GamePlay gamePlay = new GamePlay();  
      JFrame obj = new JFrame();
      obj.setBounds(10,10,700,600);
      obj.setTitle("Breakout Ball");
      obj.setResizable(false);
      obj.setVisible(true);
      obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      obj.add(gamePlay);
      
    }
    
}
