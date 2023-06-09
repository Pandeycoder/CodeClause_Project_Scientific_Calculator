package login;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class cal2 extends JFrame implements ActionListener
{
	Container c;
	JTextField t1;
	JButton add,sub,mul,div,one,two,three,four,five,root1,cube1,sin1,cos1,tan1,cot1,sec1,cosec1,sinI,cosI,tanI,cotI,secI,cosecI;
	JButton six,seven,eight,nine,zero,equal,power,clear,expo,pi,ln,log,modelus,greater,less;
	JButton square,cube_root,hcf,lcm;
	static double a=0,b=0,result=0;
	static int operator=0;
	
	public cal2()
	{
		//c=new JFrame("Calculator");
		
		setTitle("Calculator");
		setBounds(50,50,650,500);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		
		c=getContentPane();
		c.setLayout(null);
		c.setBackground(new Color(123,196,196));
		
		Font font=new Font("Arial",Font.BOLD,25);
		
	
		t1=new JTextField();
		t1.setBounds(50,10,550,70);
		t1.setFont(font);
		t1.setBorder(BorderFactory.createLineBorder(Color.black));
		t1.setBackground(new Color(153,237,240));
		//t1.resize(500,30);
		c.add(t1);
		
		seven=new JButton("7");
		seven.setBounds(60,90,80,40);
		seven.setFont(font);
		c.add(seven);
		
	    eight=new JButton("8");
		eight.setBounds(150,90,80,40);
		eight.setFont(font);
		
		c.add(eight);
		
		nine=new JButton("9");
		nine.setBounds(240,90,80,40);
		nine.setFont(font);
		c.add(nine);
		
		clear=new JButton("C");
		clear.setBounds(330,90,80,40);
		clear.setFont(font);
		clear.setForeground(new Color(168,21,72));
		c.add(clear);
		
	    four=new JButton("4");
		four.setBounds(60,140,80,40);
		four.setFont(font);
		c.add(four);
		
		five=new JButton("5");
		five.setBounds(150,140,80,40);
		five.setFont(font);
		
		c.add(five);
		
		six=new JButton("6");
		six.setBounds(240,140,80,40);
		six.setFont(font);
		c.add(six);
		

		mul=new JButton("*");
		mul.setBounds(330,140,80,40);
		mul.setFont(font);
		mul.setForeground(new Color(168,21,72));
		c.add(mul);
		
		
		one=new JButton("1");
		one.setBounds(60,190,80,40);
		one.setFont(font);
		c.add(one);
		
		two=new JButton("2");
		two.setBounds(150,190,80,40);
		two.setFont(font);
		
		c.add(two);
		
		three=new JButton("3");
		three.setBounds(240,190,80,40);
		three.setFont(font);
		c.add(three);
		
		sub=new JButton("-");
		sub.setBounds(330,190,80,40);
		sub.setFont(font);
		sub.setForeground(new Color(168,21,72));
		c.add(sub);
		
		zero=new JButton("0");
		zero.setBounds(60,240,80,40);
		zero.setFont(font);
	    c.add(zero);
	    
	    expo=new JButton("e");
	    expo.setBounds(60,290,80,40);
		expo.setFont(font);
		expo.setForeground(new Color(168,21,72));
		c.add(expo);
		
		div=new JButton("/");
	    div.setBounds(150,240,80,40);
		div.setFont(font);
		div.setForeground(new Color(168,21,72));
		div.setBackground(Color.white);
		c.add(div);
		

		cube1=new JButton("x³");
	    cube1.setBounds(150,290,80,40);
		cube1.setFont(font);
		cube1.setForeground(new Color(168,21,72));
		c.add(cube1);
		
		add=new JButton("+");
		add.setBounds(240,240,80,40);
		add.setFont(font);
		add.setForeground(new Color(168,21,72));
		c.add(add);
		
		square=new JButton("χ2");
		square.setBounds(240,290,80,40);
		square.setForeground(new Color(168,21,72));
		square.setFont(font);
		c.add(square);
		
		equal=new JButton("=");
		equal.setBounds(330,240,80,40);
		equal.setForeground(Color.white);
		equal.setBackground(new Color(81,96,222));
		add.setFont(font);
		c.add(equal);
		
		lcm=new JButton("lcm");
		lcm.setBounds(330,290,80,40);
		lcm.setForeground(new Color(168,21,72));
		lcm.setFont(font);
		c.add(lcm);
		
		
		

		power=new JButton("^");
		power.setBounds(420,90,80,40);
		power.setForeground(new Color(168,21,72));
		add.setFont(font);
		c.add(power);
		
		modelus=new JButton("%");
		modelus.setBounds(420,140,80,40);
		modelus.setForeground(new Color(168,21,72));
		add.setFont(font);
		c.add(modelus);
		
		greater=new JButton(">");
		greater.setBounds(420,190,80,40);
		greater.setForeground(new Color(168,21,72));
		add.setFont(font);
		c.add(greater);
		
		less=new JButton("<");
		less.setBounds(420,240,80,40);
		less.setForeground(new Color(168,21,72));
		add.setFont(font);
		c.add(less);
		
		cube_root=new JButton("3√");
		cube_root.setBounds(510,90,80,40);
		cube_root.setForeground(new Color(168,21,72));
		cube_root.setFont(font);
		c.add(cube_root);
		
		root1=new JButton("√");
		root1.setBounds(510,140,80,40);
		root1.setForeground(new Color(168,21,72));
		add.setFont(font);
		c.add(root1);
		
		log=new JButton("log");
		log.setBounds(510,190,80,40);
		log.setForeground(new Color(168,21,72));
		log.setFont(font);
		c.add(log);
		
		ln=new JButton("ln");
		ln.setBounds(510,240,80,40);
		ln.setForeground(new Color(168,21,72));
		ln.setFont(font);
		c.add(ln);
		
		pi=new JButton("π");
		pi.setBounds(510,290,80,40);
		pi.setForeground(new Color(168,21,72));
		pi.setFont(font);
		c.add(pi);
		
		hcf=new JButton("hcf");
		hcf.setBounds(420,290,80,40);
		hcf.setForeground(new Color(168,21,72));
		hcf.setFont(font);
		c.add(hcf);
		
		sin1=new JButton("sin");
	    sin1.setBounds(60,340,80,40);
		sin1.setFont(font);
		sin1.setForeground(new Color(168,21,72));
		c.add(sin1);
		
		cos1=new JButton("cos");
	    cos1.setBounds(150,340,80,40);
		cos1.setFont(font);
		cos1.setForeground(new Color(168,21,72));
		c.add(cos1);
		
		tan1=new JButton("tan");
	    tan1.setBounds(240,340,80,40);
		tan1.setFont(font);
		tan1.setForeground(new Color(168,21,72));
		c.add(tan1);
		
		cot1=new JButton("cot");
	    cot1.setBounds(330,340,80,40);
		cot1.setFont(font);
		cot1.setForeground(new Color(168,21,72));
		c.add(cot1);
		
		sec1=new JButton("sec");
	    sec1.setBounds(420,340,80,40);
		sec1.setFont(font);
		sec1.setForeground(new Color(168,21,72));
		c.add(sec1);
		
		cosec1=new JButton("cose");
	    cosec1.setBounds(510,340,80,40);
		cosec1.setFont(new Font("Arial",Font.BOLD,18));
		cosec1.setForeground(new Color(168,21,72));
		c.add(cosec1);
		
		sinI=new JButton("sn1");
	    sinI.setBounds(60,390,80,40);
		sinI.setFont(font);
		sinI.setForeground(new Color(168,21,72));
		c.add(sinI);
		
		cosI=new JButton("cs1");
	    cosI.setBounds(150,390,80,40);
		cosI.setFont(font);
		cosI.setForeground(new Color(168,21,72));
		c.add(cosI);
		
		tanI=new JButton("tn1");
	    tanI.setBounds(240,390,80,40);
		tanI.setFont(font);
		tanI.setForeground(new Color(168,21,72));
		c.add(tanI);
		
		cotI=new JButton("ct1");
	    cotI.setBounds(330,390,80,40);
		cotI.setFont(font);
		cotI.setForeground(new Color(168,21,72));
		c.add(cotI);
		
		secI=new JButton("sc1");
	    secI.setBounds(420,390,80,40);
		secI.setFont(font);
		secI.setForeground(new Color(168,21,72));
		c.add(secI);
		
		cosecI=new JButton("cos1");
	    cosecI.setBounds(510,390,80,40);
		cosecI.setFont(new Font("Arial",Font.BOLD,18));
		cosecI.setForeground(new Color(168,21,72));
		c.add(cosec1);
		
		//t1=new JTextField("+");
		
		
		setVisible(true);
		seven.addActionListener( this);
		six.addActionListener( this);
		five.addActionListener( this);
		four.addActionListener( this);
		three.addActionListener( this);
		two.addActionListener( this);
		one.addActionListener( this);
		zero.addActionListener( this);
		nine.addActionListener( this);
		eight.addActionListener(this);
		
		add.addActionListener( this);
		sub.addActionListener( this);
		mul.addActionListener( this);
		div.addActionListener( this);
		
		power.addActionListener( this);
		equal.addActionListener( this);
		clear.addActionListener(this);
		cube1.addActionListener( this);
		cube_root.addActionListener(this);
		square.addActionListener( this);
		root1.addActionListener( this);
		pi.addActionListener( this);
		expo.addActionListener( this);
		hcf.addActionListener( this);
		lcm.addActionListener( this);
		modelus.addActionListener(this);
		less.addActionListener(this);
		greater.addActionListener(this);
		log.addActionListener(this);
		ln.addActionListener(this);
		
		sin1.addActionListener(this);
		cos1.addActionListener(this);
		tan1.addActionListener(this);
		cot1.addActionListener(this);
		sec1.addActionListener(this);
		cosec1.addActionListener(this);
		sinI.addActionListener(this);
		cosI.addActionListener(this);
		tanI.addActionListener(this);
		cotI.addActionListener(this);
		secI.addActionListener(this);
		cosecI.addActionListener(this);
		
		
			
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
		
		if(e.getSource()==seven)
		{
			t1.setText(t1.getText().concat("7"));
		
		}
		else if(e.getSource()==nine)
		{
			t1.setText(t1.getText().concat("9"));
		}
		else if(e.getSource()==eight)
		{
			t1.setText(t1.getText().concat("8"));
		}
		else if(e.getSource()==six)
		{
			t1.setText(t1.getText().concat("6"));
		}
		else if(e.getSource()==five)
		{
			t1.setText(t1.getText().concat("5"));
		}
		else if(e.getSource()==four)
		{
			t1.setText(t1.getText().concat("4"));
		}
		else if(e.getSource()==two)
		{
			t1.setText(t1.getText().concat("2"));
		}
		else if(e.getSource()==one)
		{
			t1.setText(t1.getText().concat("1"));
		}
		else if(e.getSource()==zero)
		{
			t1.setText(t1.getText().concat("0"));
		}
		else if(e.getSource()==three)
		{
			t1.setText(t1.getText().concat("3"));
		}
		else if(e.getSource()==add)
		{
			a=Double.parseDouble(t1.getText());
			operator=1;
			t1.setText("");
		}
		else if(e.getSource()==sub)
		{
			a=Double.parseDouble(t1.getText());
			operator=2;
			t1.setText("");
		}else if(e.getSource()==mul)
		{
			a=Double.parseDouble(t1.getText());
			operator=3;
			t1.setText("");
		}else if(e.getSource()==div)
		{
			a=Double.parseDouble(t1.getText());
			operator=4;
			t1.setText("");
		}
		else if(e.getSource()==pi)
		{
			result=3.14;
			t1.setText(""+result);
		}
		else if(e.getSource()==power)
		{
			a=Double.parseDouble(t1.getText());
			operator=5;
			t1.setText("");
		}
		else if(e.getSource()==root1)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.sqrt(a);
			//operator=6;
			t1.setText(""+result);
		}
		else if(e.getSource()==square)
		{
			a=Double.parseDouble(t1.getText());
			result=a*a;
			t1.setText(""+result);
		}
		else if(e.getSource()==modelus)
		{
			a=Double.parseDouble(t1.getText());
			operator=6;
			t1.setText("");
		}
		else if(e.getSource()==less)
		{
			a=Double.parseDouble(t1.getText());
			operator=7;
			t1.setText("");
		}
		else if(e.getSource()==greater)
		{
			a=Double.parseDouble(t1.getText());
			operator=8;
			t1.setText("");
		}
		else if(e.getSource()==cube1)
		{
			a=Double.parseDouble(t1.getText());
			//operator=12;
			result=a*a*a;
			t1.setText(""+result);
		}
		else if(e.getSource()==cube_root)
		{
			a=Double.parseDouble(t1.getText());
			//operator=12;
			result=Math.cbrt(a);
			t1.setText(""+result);
		}
		else if(e.getSource()==log)
		{
			a=Double.parseDouble(t1.getText());
			//operator=12;
			result=Math.log10(a);
			t1.setText(""+result);
		}
		else if(e.getSource()==ln)
		{
			a=Double.parseDouble(t1.getText());
			//operator=12;
			result=Math.log(a);
			t1.setText(""+result);
		}
		else if(e.getSource()==lcm)
		{
			a=Double.parseDouble(t1.getText());
			operator=9;
			t1.setText("");
		}
		else if(e.getSource()==hcf)
		{
			a=Double.parseDouble(t1.getText());
			operator=10;
			t1.setText("");
		}
		else if(e.getSource()==clear)
		{
			t1.setText("");
		}
		else if(e.getSource()==sin1)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.sin(a);
			t1.setText(""+result);
		}
		else if(e.getSource()==cos1)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.cos(a);
			t1.setText(""+result);
		}
		else if(e.getSource()==tan1)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.cos(a);
			t1.setText(""+result);
		}
		else if(e.getSource()==sec1)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.cosh(a);
			t1.setText(""+result);	
		}
		else if(e.getSource()==cosec1)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.sinh(a);
			t1.setText(""+result);	
		}
		else if(e.getSource()==sinI)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.asin(a);
			t1.setText(""+result);
		}
		else if(e.getSource()==cosI)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.acos(a);
			t1.setText(""+result);
		}
		else if(e.getSource()==tanI)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.atan(a);
			t1.setText(""+result);
		}
		else if(e.getSource()==cotI)
		{
			a=Double.parseDouble(t1.getText());
			
			t1.setText(""+result);
		}
		else if(e.getSource()==secI)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.cos(a);
			t1.setText(""+result);	
		}
		else if(e.getSource()==cosecI)
		{
			a=Double.parseDouble(t1.getText());
			result=Math.asin(a);
			t1.setText(""+result);
		}
		
		
		
		else if(e.getSource()==equal)
		{
			//a=Double.parseDouble(t1.getText());
			b=Double.parseDouble(t1.getText());
			switch(operator)
			{
			case 1:
				result=a+b;
				break;
			case 2:
				result=a-b;
				break;
			case 3:
				result=a*b;
				break;
			case 4:
				result=a/b;
				break;
			case 5:
				result=Math.pow(a, b);
				break;
			case 6:
				result=a%b;
				break;
			case 7:
				if(a<b)
				{
					result=a;
				}
				else
				{
					result=b;
				}
				break;
			case 8:
				if(a>b)
				{
					result=a;
				}
				else
				{
					result=b;
				}
				break;
			case 9:
			//double result=0;
			   int s=0;
			   if(a>b)
				   s=(int)a;
			   else
				   s=(int)b;
	
				for(int i=s;i<=(a*b);i++)
				{
					if(i%(int)a==0&&i%(int)b==0)
					{
						result=i;
						break;
					}
				}
			
			case 10:
				int s1=0;
				if(a<b)
					s=(int)a;
				else
					s=(int)b;
				for(int i=1;i<=s;i++)
				{
					if(a%i==0&&b%i==0)
					{
						result=i;
						break;
					}
				}
				
			
			}
			t1.setText(""+result);
			}
			
		
	}
		catch(NumberFormatException e1)
		{
		  System.err.println("Invalid number");
		}
		catch(ArithmeticException e2)
		{
			System.err.println("Cannot Divided by zero");
		}
}
}

public class Original_cal
{
	public static void main(String[] args)throws Exception {
		cal2 ob=new cal2();
	}
}

