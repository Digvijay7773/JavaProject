import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CALCULATOR extends JFrame implements ActionListener 
{

    JButton one,four,seven,nine,two,five,eight,zero,three,six,del,plus,minus,mul,divide,clear,equal,dot,other;
    JTextField t;
    JMenuBar m;
    JMenu Settings;
    JMenuItem Theme;
    Container c;
    JLabel l;
    JRadioButton r1,r2;
    ButtonGroup g;
    double num1,num2,num3,result;
    int calculation;

     CALCULATOR()
    {
         m = new JMenuBar();

        
         Theme = new JMenuItem("Theme");
 
         Settings = new JMenu("Settings");
         Settings.add(Theme);
         
         m.add(Settings);
 
         setJMenuBar(m);
        
         c=new Container();
         c=this.getContentPane();
       
        setLayout(null);
        setSize(580, 630);
        setDefaultLookAndFeelDecorated(JFrame.isDefaultLookAndFeelDecorated());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("CALCULATOR");
        getContentPane().setBackground(Color.BLACK);

        ImageIcon I=new ImageIcon("calculator.Png");

        setIconImage(I.getImage());
        
        Font font=new Font("Arial", Font.BOLD, 50);

        l=new JLabel(" ");
        l.setBounds(10, 10, 545,40);
        add(l);
        l.setBackground(Color.YELLOW);
        l.setFont(font);
        l.setHorizontalAlignment(SwingConstants.RIGHT);
        l.setForeground(Color.white);
   
        t= new JTextField();
        t.setBounds(10, 60, 545, 110);
        add(t);
        t.setBackground(Color.WHITE);
        t.setFont(font);
          t.setEditable(false);
          t.setHorizontalAlignment(SwingConstants.RIGHT);
          t.setForeground(Color.BLACK);
        
       

        Cursor cs=new Cursor(Cursor.HAND_CURSOR);

        r1=new JRadioButton(" ON");
        add(r1);
        r1.setBounds(10,185,125,30);
        r1.setBackground(Color.WHITE);
        // r1.setFont(font);

        r2=new JRadioButton(" OFF");
        add(r2);
        r2.setBounds(10,225,125,30);
        r2.setBackground(Color.WHITE);
        // r2.setFont(font);

        g=new ButtonGroup();
        g.add(r1);
        g.add(r2);    


        zero=new JButton(" 0 ");
        zero.setBounds(150, 510, 125, 50);
        add(zero);
        zero.setBackground(Color.WHITE);
        zero.setFont(font);
        zero.setCursor(cs);
        zero.setFocusable(false);

       one=new JButton(" 1 ");
       one.setBounds(10, 270, 125, 70);
       add(one);
       one.setBackground(Color.WHITE);
       one.setFont(font);
       one.setCursor(cs);
       one.setFocusable(false);
       


       two=new JButton(" 2 ");
       two.setBounds(150, 270, 125, 70);
       add(two);
       two.setBackground(Color.WHITE);
       two.setFont(font);
       two.setCursor(cs);


        three=new JButton(" 3 ");
        three.setBounds(290, 270, 125, 70);
        add(three);
        three.setBackground(Color.WHITE);
        three.setFont(font);
        three.setCursor(cs);


        four=new JButton(" 4 ");
        four.setBounds(10, 350, 125, 70);
        add(four);
        four.setBackground(Color.WHITE);
        four.setFont(font);
         four.setCursor(cs);


        five=new JButton(" 5 ");
        five.setBounds(150, 350, 125, 70);
        add(five);
        five.setBackground(Color.WHITE);
        five.setFont(font);
        five.setCursor(cs);

        six=new JButton(" 6 ");
        six.setBounds(290, 350, 125, 70);
        add(six);
        six.setBackground(Color.WHITE);
        six.setFont(font);
        six.setCursor(cs);

         
        seven=new JButton(" 7 ");
        seven.setBounds(10, 430, 125, 70);
        add(seven);
        seven.setBackground(Color.WHITE);
        seven.setFont(font);
        seven.setCursor(cs);


        eight=new JButton(" 8 ");
        eight.setBounds(150, 430, 125, 70);
        add(eight);
        eight.setBackground(Color.WHITE);
        eight.setFont(font);
        eight.setCursor(cs);


  
        nine=new JButton(" 9 ");
        nine.setBounds(290, 430, 125, 70);
        add(nine);
        nine.setBackground(Color.WHITE);
        nine.setFont(font);
         nine.setCursor(cs);


        del=new JButton(" DEL ");
        del.setBounds(350, 185, 205, 75);
        add(del);
        del.setBackground(Color.RED);
        del.setFont(font);
         del.setCursor(cs);


        plus=new JButton(" + ");
        plus.setBounds(430, 270, 125, 70);
        add(plus);
        plus.setBackground(Color.GREEN);
        plus.setFont(font);
         plus.setCursor(cs);


        minus=new JButton(" - ");
        minus.setBounds(430, 350, 125, 70);
        add(minus);
        minus.setBackground(Color.GREEN);
        minus.setFont(font);
         minus.setCursor(cs);


        mul=new JButton(" * ");
        mul.setBounds(430, 430, 125, 70);
        add(mul);
        mul.setBackground(Color.GREEN);
        mul.setFont(font); 
        mul.setCursor(cs);



        divide=new JButton(" / ");
        divide.setBounds(290, 510, 125, 50);
        add(divide);
        divide.setBackground(Color.GREEN);
        divide.setFont(font);
         divide.setCursor(cs);


        clear=new JButton(" C ");
        clear.setBounds(150, 185, 190, 75);
        add(clear);
        clear.setBackground(Color.RED);
        clear.setFont(font);
         clear.setCursor(cs);


        equal=new JButton(" = ");
        equal.setBounds(430, 510, 125, 50);
        add(equal);
        equal.setBackground(Color.GREEN);
        equal.setFont(font);
         equal.setCursor(cs);


        dot=new JButton(" . ");
        dot.setBounds(10, 510, 125, 50);
        add(dot);
        dot.setBackground(Color.LIGHT_GRAY);
        dot.setFont(font);
         dot.setCursor(cs);
         dot.setForeground(Color.WHITE);


        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        mul.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        divide.addActionListener(this);
        del.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);
                      
        r1.addActionListener(this);
        r2.addActionListener(this);


        setVisible(true);
    }
      
        @Override
        public void actionPerformed(ActionEvent a)
        {

       Object obj=a.getSource();

       if (obj==r1)
       {
        enable();
       }
       else if(obj==r2)
       {
        disable();
       }
       else if(obj==clear )
       {
          l.setText(" ");
          
          t.setText(" ");
       }
       else if (obj==zero)
       {
        t.setText(t.getText()+"0");
       
      }
       else if (obj==one)
       {
        t.setText(t.getText()+"1");
       }
       else if (obj==two)
       {
        t.setText(t.getText()+"2");
       }
       else if (obj==three)
       {
        t.setText(t.getText()+"3");
       }
       else if (obj==four)
       {
        t.setText(t.getText()+"4");
       }
       else if (obj==five)
       {
        t.setText(t.getText()+"5");
       }
       else if (obj==six)
       {
        t.setText(t.getText()+"6");
       }
       else if (obj==seven)
       {
        t.setText(t.getText()+"7");
       }
       else if (obj==eight)
       {
        t.setText(t.getText()+"8");
       }
       else if (obj==nine)
       {
        t.setText(t.getText()+"9");
       }
       else if (obj==plus)
       {
        String str=t.getText();
        num1=Double.parseDouble(t.getText());
        calculation=1;
        t.setText("");
        l.setText(str+"+");
       }
       else if (obj==minus)
       {
        String str=t.getText();
        num1=Double.parseDouble(t.getText());
        calculation=2;
        t.setText("");
        l.setText(str+"-");
       }

       else if (obj==mul)
       {
        String str=t.getText();
        num1=Double.parseDouble(t.getText());
        calculation=3;
        t.setText("");
        l.setText(str+"*");
       }

       else if (obj==divide)
       {
        String str=t.getText();
        num1=Double.parseDouble(t.getText());
        calculation=4;
        t.setText("");
        l.setText(str+"/");
       }

       else if (obj==dot)
       {
        if(t.getText().contains(".")){
        return;
        }else{
        t.setText(t.getText()+".");
       }
      }

      else if(obj == equal) {
        num2 = Double.parseDouble(t.getText());
     
    
        switch (calculation) {
            case 1:
                result = num1 + num2; 
                break;
    
            case 2:
                result = num1 - num2;  
                break;
    
            case 3:
                result = num1 * num2;  
                break;
    
            case 4:
                result = num1 / num2; 
                break;
    
            default:
                break;
        }
                if(Double.toString(result).endsWith(".0")){
                  t.setText(Double.toString(result).replace(".0", " "));
                  
                }
                else 
                {
                  t.setText(Double.toString(result));
                }
                l.setText("");
                num1=result;
                
                
        }
    }
    

    public void enable()
    {
     r1.setEnabled(false);
      r2.setEnabled(true);
        zero.setEnabled(true);
          one.setEnabled(true);
           two.setEnabled(true);
             three.setEnabled(true);
               four.setEnabled(true);
                 five.setEnabled(true);
                   six.setEnabled(true);
                     seven.setEnabled(true);
                        eight.setEnabled(true);
                         nine.setEnabled(true);
                           equal.setEnabled(true);
                             plus.setEnabled(true);
                               minus.setEnabled(true);
                                 dot.setEnabled(true);
                                   divide.setEnabled(true);
                                     mul.setEnabled(true);
                                      clear.setEnabled(true);

    }

    public void disable()
    {
  r1.setEnabled(true);
   r2.setEnabled(false);
    l.setText("");
      t.setText("");
        zero.setEnabled(false);
          one.setEnabled(false);
           two.setEnabled(false);
             three.setEnabled(false);
               four.setEnabled(false);
                 five.setEnabled(false);
                   six.setEnabled(false);
                     seven.setEnabled(false);
                        eight.setEnabled(false);
                         nine.setEnabled(false);
                           equal.setEnabled(false);
                             plus.setEnabled(false);
                               minus.setEnabled(false);
                                dot.setEnabled(false);
                                  divide.setEnabled(false);
                                    mul.setEnabled(false);
                                      clear.setEnabled(false);

    }
  
    
 
    public static void main(String[] args)
     {

        new CALCULATOR();
  
    }

}
