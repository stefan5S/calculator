
package calculator;

import java.awt.*;
import java.awt.event.*;

public class computer implements ActionListener
{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,plus,minus,egal,inchide,inmultire,impartire,lasuta,C,CE,Mplus,Mminus,MR;
    Button MC;
    Label rezultat;
    String s="";
    int nr1=0,nr2=0,r,m=0;
    char o;

    computer()
    {
        Frame fr=new Frame();
        
        fr.setTitle("Calculator");
        fr.setVisible(true);
        fr.setLayout(null);
        fr.setSize(500,500);
        
        MC=new Button("MC");
        MR=new Button("MR");
        Mminus=new Button("M-");
        Mplus=new Button("M+");
        CE=new Button("CE");//sterge intrarea curenta
        C=new Button("C");//sterge toate calculele facute pana in prezent
        lasuta=new Button("%");
        rezultat=new Label();
        inmultire=new Button("*");
        impartire=new Button("/");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        plus=new Button("+");
        minus=new Button("-");
        egal=new Button("=");
        inchide=new Button("Inchide");
       
        
        fr.add(b1);fr.add(b2);fr.add(b3);fr.add(b4);fr.add(b5);fr.add(b6);fr.add(b7);fr.add(b8);fr.add(b9);
        fr.add(plus);fr.add(minus);fr.add(egal);fr.add(rezultat);fr.add(inchide);fr.add(impartire);
        fr.add(inmultire);fr.add(lasuta);fr.add(C);fr.add(CE);fr.add(Mplus);fr.add(Mminus);fr.add(MR);
        fr.add(MC);
        
        MC.setBounds(270,270,50,50);
        MR.setBounds(210,270,50,50);
        Mminus.setBounds(270,210,50,50);
        Mplus.setBounds(210,210,50,50);
        CE.setBounds(330,210,50,50);
        C.setBounds(330,150,50,50);
        lasuta.setBounds(270,150,50,50);
        impartire.setBounds(330,90,50,50);
        inmultire.setBounds(330,30,50,50);
        inchide.setBounds(270,30,50,50);
        b1.setBounds(30,30,50,50);
        b2.setBounds(90,30,50,50);
        b3.setBounds(150,30,50,50);
        b4.setBounds(30,90,50,50);
        b5.setBounds(90,90,50,50);
        b6.setBounds(150,90,50,50);
        b7.setBounds(30,150,50,50);
        b8.setBounds(90,150,50,50);
        b9.setBounds(150,150,50,50);
        plus.setBounds(210,30,50,50);
        minus.setBounds(210,90,50,50);
        egal.setBounds(210,150,50,50);
        rezultat.setBounds(90,210,110,50);
        
        MC.addActionListener(this);
        MR.addActionListener(this);
        Mminus.addActionListener(this);
        Mplus.addActionListener(this);
        CE.addActionListener(this);
        C.addActionListener(this);
        inchide.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        egal.addActionListener(this);        
        inmultire.addActionListener(this);
        impartire.addActionListener(this);
        lasuta.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
        
        
        if(ae.getSource()==inchide)
        {
            System.exit(0);
        }
         
        
        if(ae.getSource()==b1)
        {
            s=s+"1";rezultat.setText(s);     
        
            //Se mai poate si:rezultat.setText(rezultat.getText()+"1");
        
        
        }
         
        if(ae.getSource()==b2)
        {
            s=s+"2";rezultat.setText(s);
        }
         
        if(ae.getSource()==b3)
        {
            s=s+"3";rezultat.setText(s);
        }
         
        if(ae.getSource()==b4)
        {
            s=s+"4";rezultat.setText(s);
        }
         
        if(ae.getSource()==b5)
        {
            s=s+"5";rezultat.setText(s);
        }
         
        if(ae.getSource()==b6)
        {
            s=s+"6";rezultat.setText(s);
        }
         
        if(ae.getSource()==b7)
        {
            s=s+"7";rezultat.setText(s);
        }
         
        if(ae.getSource()==b8)
        {
            s=s+"8";rezultat.setText(s);
        }
         
        if(ae.getSource()==b9)
        {
            s=s+"9";rezultat.setText(s);
        }
         
        //se sterg toate calculele facute pana in prezent
        if(ae.getSource()==C)
        {
            nr1=0;
            nr2=0;
            rezultat.setText("");
            s="";
        }
        
        
         
        if(ae.getSource()==minus)
        {
            nr1=Integer.parseInt(s);
            rezultat.setText("");

            o='-';
            s="";
        }
        
        
        if(ae.getSource()==plus)
        {
                        
            nr1=Integer.parseInt(s);
            o='+';
            
            rezultat.setText("");
            
            s="";
        }
        
        if(ae.getSource()==inmultire)
        {
            nr1=Integer.parseInt(s);
            o='*';
            rezultat.setText("");

            
            s="";
        }
        
        if(ae.getSource()==CE)
        {
            s="";
            rezultat.setText("");
            
        }
        
        if(ae.getSource()==MC)
        {
            rezultat.setText("");
            m=0;
        }
        
        if(ae.getSource()==MR)
        {
            rezultat.setText(Integer.toString(m));
            
        }
        
        
        
        if(ae.getSource()==impartire)
        {
            nr1=Integer.parseInt(s);
            o='/';
            s="";
            rezultat.setText("");
        }
        
        if(ae.getSource()==lasuta)
        {
            nr1=Integer.parseInt(s);
            o='%';
            s="";
            rezultat.setText("");
        }
        
        if(ae.getSource()==Mplus)
        {
            m=m+Integer.parseInt(s);
            rezultat.setText("");
            s="";
            
        }
        
        if(ae.getSource()==Mminus)
        {
            m=m-Integer.parseInt(s);
            rezultat.setText("");
            s="";
        }
        
        
        //afisarea rezultatului
        if(ae.getSource()==egal)
        {
            
            nr2=Integer.parseInt(s);
            s="";
            
            if(o=='+')
            {
                r=nr1+nr2;
                rezultat.setText(Integer.toString(r));
            }      
            
            if(o=='-')
            {
                r=nr1-nr2;
                rezultat.setText(Integer.toString(r));
            }
            
            if(o=='*')
            {
                r=nr1*nr2;
                rezultat.setText(Integer.toString(r));
            }
            
            if(o=='/')
            {
                r=nr1/nr2;
                rezultat.setText(Integer.toString(r));
            }
            
            if(o=='%')
            {
                r=nr1%nr2;
                rezultat.setText(Integer.toString(r));
            }
            
        }
         
       
        
        
    }
    
    
    
    
}
