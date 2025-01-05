/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


/**
 *
 * @author Sys
 */
public class JavaCalculator extends Frame implements ActionListener {

    TextField display;
    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,add,sub,mul,div,equals,clear,btn;
    
    JavaCalculator(){
        display= new TextField("0");
        display.setBounds(50,50,400,50);
        
        btn0= new Button("0");
        btn0.setBounds(50,400,80,80);
        btn0.addActionListener(this);
        
        btn1= new Button("1");
        btn1.setBounds(50,300,80,80);
        btn1.addActionListener(this);
        
        btn2= new Button("2");
        btn2.setBounds(150,300,80,80);
        btn2.addActionListener(this);
        
        btn3= new Button("3");
        btn3.setBounds(250,300,80,80);
        btn3.addActionListener(this);
        
        btn4= new Button("4");
        btn4.setBounds(50,200,80,80);
        btn4.addActionListener(this);
        
        btn5= new Button("5");
        btn5.setBounds(150,200,80,80);
        btn5.addActionListener(this);
        
        btn6= new Button("6");
        btn6.setBounds(250,200,80,80);
        btn6.addActionListener(this);
        
        btn7= new Button("7");
        btn7.setBounds(50,100,80,80);
        btn7.addActionListener(this);
        
        btn8= new Button("8");
        btn8.setBounds(150,100,80,80);
        btn8.addActionListener(this);
        
        btn9= new Button("9");
        btn9.setBounds(250,100,80,80);
        btn9.addActionListener(this);
        
        add= new Button("+");
        add.setBounds(350,300,80,80);
        add.addActionListener(this);
        
        sub= new Button("-");
        sub.setBounds(350,100,80,80);
        sub.addActionListener(this);
        
        mul= new Button("*");
        mul.setBounds(350,200,80,80);
        mul.addActionListener(this);
        
        div= new Button("/");
        div.setBounds(350,400,80,80);
        div.addActionListener(this);
        
        equals= new Button("=");
        equals.setBounds(150,400,80,80);
        equals.addActionListener(this);
        
        clear= new Button("C");
        clear.setBounds(250,400,80,80);
        clear.addActionListener(this);
        
        
        
        add(display);
        add(btn0);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5); 
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(add);
        add(sub);
        add(mul);
        add(div);
        add(equals);
        add(clear);
        
        setSize(500,600);
        setLayout(null);
        setTitle("Calculator");
        setVisible(true);    
    }
    
    
    /**
     *
     * @param e
     */
    public void actionPerformed(ActionEvent e){
        if(e.getSource()== btn0){
            String exp= display.getText();
            exp += "0";
            display.setText(exp);
        }
        if(e.getSource()== btn1){
            String exp= display.getText();
            exp += "1";
            display.setText(exp);
        }
        if(e.getSource()== btn2){
            String exp= display.getText();
            exp += "2";
            display.setText(exp);
        }
        if(e.getSource()== btn3){
            String exp= display.getText();
            exp += "3";
            display.setText(exp);
        }
        if(e.getSource()== btn4){
            String exp= display.getText();
            exp += "4";
            display.setText(exp);
        }
        if(e.getSource()== btn5){
            String exp= display.getText();
            exp += "5";
            display.setText(exp);
        }
        if(e.getSource()== btn6){
            String exp= display.getText();
            exp += "6";
            display.setText(exp);
        }
        if(e.getSource()== btn7){
            String exp= display.getText();
            exp += "7";
            display.setText(exp);
        }
        if(e.getSource()== btn8){
            String exp= display.getText();
            exp += "8";
            display.setText(exp);
        }
        if(e.getSource()== btn9){
            String exp= display.getText();
            exp += "9";
            display.setText(exp);
        }
        if(e.getSource()== clear){
            display.setText("0");
        }
        if(e.getSource()== add){
            String exp= display.getText();
            exp += "+";
            display.setText(exp);
        }
        if(e.getSource()== sub){
            String exp= display.getText();
            exp += "-";
            display.setText(exp);
        }
        if(e.getSource()== mul){
            String exp= display.getText();
            exp += "*";
            display.setText(exp);
        }
        if(e.getSource()== div){
            String exp= display.getText();
            exp += "/";
            display.setText(exp);
        }
        if(e.getSource()== equals){
            int a,b,i;
            char operator= '+';
            
            String exp= display.getText();
            String tempA="",tempB="";
            
            for(i=0;i<exp.length();i++){
                if(Character.isDigit(exp.charAt(i))){
                    tempA += exp.charAt(i);
                }
                else{
                    operator = exp.charAt(i);
                    break;
                }    
            }
            tempB= exp.substring(i+1);
            
            a= Integer.parseInt(tempA);
            b= Integer.parseInt(tempB);
            
            int result= 0;
            
            switch(operator){
                case '+':
                    result = a+b;
                    break;
                    
                case '-':    
                    result = a-b;
                    break;
                
                case '*':    
                    result = a*b;
                    break;
                    
                case '/':    
                    result = a/b;
                    break;    
            }
            
            display.setText(String.valueOf(result));
    
        }
     
    }
    
    public class WindowClosing extends Frame {
        WindowClosing(){
            Button btn= new Button();
            add(btn);
            
            addWindowListener(new WindowAdapter(){
                public void windowClosing(WindowEvent e){
                    System.exit(0);
                }
            });
            
            setLayout(new FlowLayout());
            setSize(500,500);
            setVisible(true);
            
        }
        

        
        
    }
    
    public static void main(String[] args) {
        new JavaCalculator();
    }

    
  
    
}
