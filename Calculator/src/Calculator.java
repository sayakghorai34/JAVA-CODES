//LOGIC ERROR!!!!!!!!!!!!

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Calculator extends JFrame {

private JPanel contentPane;
private String INP1="";
private long result;
private int pointer=1;
private char op;
/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Calculator frame = new Calculator();
frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the frame.
*/
public Calculator() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setBounds(100, 100, 450, 300);
contentPane = new JPanel();
contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
setContentPane(contentPane);
contentPane.setLayout(null);

JLabel FirstVAR = new JLabel("0");
FirstVAR.setBounds(0, 0, 126, 57);
contentPane.add(FirstVAR);

JLabel SecondVar = new JLabel("0");
SecondVar.setBounds(0, 56, 126, 57);
contentPane.add(SecondVar);

JLabel Operator = new JLabel("ƒ");
Operator.setBackground(Color.RED);
Operator.setBounds(10, 189, 56, 51);
contentPane.add(Operator);

JLabel Result = new JLabel("0");
Result.setBounds(167, 37, 241, 57);
contentPane.add(Result);

JSeparator separator = new JSeparator();
separator.setBounds(0, 174, 116, 2);
contentPane.add(separator);

JButton NUM0 = new JButton("0");
NUM0.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1+="0";
	System.out.println(INP1);
	if(pointer==1) {
		FirstVAR.setText(INP1);
	}
	else if(pointer==2) {
		SecondVar.setText(INP1);
	}
}
});
NUM0.setBounds(233, 192, 62, 25);
contentPane.add(NUM0);

JButton NUM1 = new JButton("1");
NUM1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {
	INP1=INP1+"1";
	System.out.println(INP1);
	if(pointer==1) {
		FirstVAR.setText(INP1);
	}
	else if(pointer==2) {
		SecondVar.setText(INP1);
	}
}
});
NUM1.setBounds(169, 107, 62, 25);
contentPane.add(NUM1);

JButton NUM2 = new JButton("2");
NUM2.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1=INP1+"2";
	System.out.println(INP1);
	if(pointer==1) {
		FirstVAR.setText(INP1);
	}
	else if(pointer==2) {
		SecondVar.setText(INP1);
	}
}
});
NUM2.setBounds(233, 107, 62, 25);
contentPane.add(NUM2);

JButton NUM3 = new JButton("3");
NUM3.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1=INP1+"3";
	System.out.println(INP1);
	if(pointer==1) {
		FirstVAR.setText(INP1);
	}
	else if(pointer==2) {
		SecondVar.setText(INP1);
	}
}
});
NUM3.setBounds(297, 107, 62, 25);
contentPane.add(NUM3);

JButton NUM4 = new JButton("4");
NUM4.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1+="4";
	System.out.println(INP1);
	if(pointer==1) {
		FirstVAR.setText(INP1);
	}
	else if(pointer==2) {
		SecondVar.setText(INP1);
	}
}
});
NUM4.setBounds(169, 135, 62, 25);
contentPane.add(NUM4);

JButton NUM5 = new JButton("5");
NUM5.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1+="5";
	System.out.println(INP1);
	if(pointer==1) {
		FirstVAR.setText(INP1);
	}
	else if(pointer==2) {
		SecondVar.setText(INP1);
	}
}
});
NUM5.setBounds(233, 135, 62, 25);
contentPane.add(NUM5);

JButton NUM6 = new JButton("6");
NUM6.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1+="6";
	System.out.println(INP1);
	if(pointer==1) {
		FirstVAR.setText(INP1);
	}
	else if(pointer==2) {
		SecondVar.setText(INP1);
	}
}
});
NUM6.setBounds(297, 135, 62, 25);
contentPane.add(NUM6);

JButton NUM7 = new JButton("7");
NUM7.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1=INP1+"7";
	System.out.println(INP1);
	if(pointer==1) {
		FirstVAR.setText(INP1);
	}
	else if(pointer==2) {
		SecondVar.setText(INP1);
	}
}
});
NUM7.setBounds(169, 164, 62, 25);
contentPane.add(NUM7);

JButton NUM8 = new JButton("8");
NUM8.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1=INP1+"8";
	System.out.println(INP1);
	if(pointer==1) {
		FirstVAR.setText(INP1);
	}
	else if(pointer==2) {
		SecondVar.setText(INP1);
	}
}
});
NUM8.setBounds(233, 164, 62, 25);
contentPane.add(NUM8);

JButton NUM9 = new JButton("9");
NUM9.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1+="9";
	System.out.println(INP1);
	if(pointer==1) {
		FirstVAR.setText(INP1);
	}
	else if(pointer==2) {
		SecondVar.setText(INP1);
	}
}
});
NUM9.setBounds(297, 164, 62, 25);
contentPane.add(NUM9);

JButton ADDBTTN = new JButton("+");
ADDBTTN.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(INP1!="") {
		op='+';
		pointer=2;
		result+=Long.parseLong(INP1);
		INP1="";
		Operator.setText("+");
		FirstVAR.setText(Long.toString(result));
		SecondVar.setText("0");
	}

}
});

ADDBTTN.setFont(new Font("Tahoma", Font.PLAIN, 16));
ADDBTTN.setBackground(Color.GREEN);
ADDBTTN.setBounds(363, 107, 45, 25);
contentPane.add(ADDBTTN);


JButton SUBTRACTBTTN = new JButton("-");
SUBTRACTBTTN.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if(INP1!="") {
	op='-';
	pointer=2;
	result=Long.parseLong(INP1);
	INP1="";
	Operator.setText("-");
}
}
});
SUBTRACTBTTN.setFont(new Font("Tahoma", Font.PLAIN, 18));
SUBTRACTBTTN.setBackground(Color.GREEN);
SUBTRACTBTTN.setBounds(363, 135, 45, 25);
contentPane.add(SUBTRACTBTTN);

JButton MULTIPLEBTTN = new JButton("X");
MULTIPLEBTTN.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	if(INP1!="") {
		op='X';
		pointer=2;
		result=Long.parseLong(INP1);
		INP1="";
		Operator.setText("X");
	}
}
});

MULTIPLEBTTN.setFont(new Font("Tahoma", Font.PLAIN, 16));
MULTIPLEBTTN.setBackground(Color.GREEN);
MULTIPLEBTTN.setBounds(363, 164, 45, 25);
contentPane.add(MULTIPLEBTTN);

JButton DIVBTTN = new JButton("÷");
DIVBTTN.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	if(INP1!="") {
		op='÷';
		pointer=2;
		result=Long.parseLong(INP1);
		INP1="";
		Operator.setText("÷");
	}
}
});
DIVBTTN.setFont(new Font("Tahoma", Font.PLAIN, 16));
DIVBTTN.setBackground(Color.GREEN);
DIVBTTN.setBounds(363, 192, 45, 25);
contentPane.add(DIVBTTN);

JButton EQUALBTTN = new JButton("=");
EQUALBTTN.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	if(pointer==1 && INP1!="") {
		Result.setText(INP1);
	}
	else if(pointer==2 && INP1!="") {
		if(op=='+') {
			result+=Long.parseLong(INP1);
			Result.setText(Long.toString(result));
		}
		else if(op=='-') {
			result-=Long.parseLong(INP1);
			Result.setText(Long.toString(result));
		}
		else if(op=='X') {
			result*=Long.parseLong(INP1);
			Result.setText(Long.toString(result));
		}
		else if(op=='÷') {
			result/=Long.parseLong(INP1);
			Result.setText(Long.toString(result));
		}

	}
	else
		Result.setText(Long.toString(result));
}
});
EQUALBTTN.setBounds(297, 193, 62, 25);
contentPane.add(EQUALBTTN);

JButton RESET = new JButton("RESET!");
RESET.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1="";
	pointer=1;
	result=0;
	FirstVAR.setText("0");
	SecondVar.setText("0");
	Result.setText(Long.toString(result));
	Operator.setText("ƒ");
}
});
RESET.setBackground(Color.RED);
RESET.setForeground(Color.RED);
RESET.setBounds(166, 228, 242, 25);
contentPane.add(RESET);



JButton CLR = new JButton("CLR");
CLR.setFont(new Font("Tahoma", Font.ITALIC, 13));
CLR.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	INP1="";
	if(pointer==1) {
		FirstVAR.setText("0");
	}
	else {
		SecondVar.setText("0");
		Operator.setText("ƒ");
	}
	
}
});
CLR.setForeground(Color.DARK_GRAY);
CLR.setBackground(Color.RED);
CLR.setBounds(169, 192, 62, 25);
contentPane.add(CLR);


}
}
