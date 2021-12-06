package com.SimpleFrame;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;

public class SimpleFrame extends  JFrame{
    public SimpleFrame(){
        this.setSize(200,200);
        this.setLocation(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //Makes the frame visible
    public void showIt(){
        this.setVisible(true);
    }
    //makes the frame visible and shows the title bar
    public void showIt(String title){
      this.setTitle(title);
      this.setVisible(true);
    }
    //makes the frame visible and sets the title text and position of the window
    public void showIt(String title,int x,int y){
        this.setTitle(title);
        this.setLocation(x,y);
        this.setVisible(true);
    }
    //makes the frame invisible
    public void hideIt(){
        this.setVisible(false);
    }


    public static void main(String[] args) {
	// write your code here
        SimpleFrame sFrame1 = new SimpleFrame();
        SimpleFrame sFrame2 = new SimpleFrame();
        sFrame1.showIt("SimpleFrame 1");
        sFrame2.showIt("SimpleFrame 2",300,300);
    }

}



