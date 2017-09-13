package examen_1_app_apm_pichardoesquivel_5im6;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import javafx.util.converter.IntegerStringConverter;
import javax.swing.*;
/**
 *
 * @author Pichardo Esquivel
 * @version 1.0
 */
public class convertidor extends JFrame implements ActionListener{
   
    JPanel panel=new JPanel();
    JTextField texto=new JTextField();
    JButton num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
    JButton punto, CE, Conv=new JButton();
    
    float numero=0;
    String aux;
    
    public convertidor(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(100, 100, 500, 500);
        setResizable(false);
        
        texto.setBounds(100,50,300,50);
        add(texto);
        
        num9=new JButton("9");
        num9.setBounds(100,150,50,50);
        num9.addActionListener(this);
        add(num9);
        
        num8=new JButton("8");
        num8.setBounds(160,150,50,50);
        num8.addActionListener(this);
        add(num8);
        
        num7=new JButton("7");
        num7.setBounds(220,150,50,50);
        num7.addActionListener(this);
        add(num7);
        
        num6=new JButton("6");
        num6.setBounds(100,220,50,50);
        num6.addActionListener(this);
        add(num6);
        
        num5=new JButton("5");
        num5.setBounds(160,220,50,50);
        num5.addActionListener(this);
        add(num5);
        
        num4=new JButton("4");
        num4.setBounds(220,220,50,50);
        num4.addActionListener(this);
        add(num4);
        
        num3=new JButton("3");
        num3.setBounds(100,290,50,50);
        num3.addActionListener(this);
        add(num3);
        
        num2=new JButton("2");
        num2.setBounds(160,290,50,50);
        num2.addActionListener(this);
        add(num2);
        
        num1=new JButton("1");
        num1.setBounds(220,290,50,50);
        num1.addActionListener(this);
        add(num1);
        
        num0=new JButton("0");
        num0.setBounds(100,360,50,50);
        num0.addActionListener(this);
        add(num0);
        
        punto=new JButton(".");
        punto.setBounds(160,360,50,50);
        punto.addActionListener(this);
        add(punto);
        
        CE=new JButton("CE");
        CE.setBounds(320,150,80,120);
        CE.addActionListener(this);
        add(CE);
        
        Conv=new JButton("Convertir");
        Conv.setBounds(320,290,80,120);
        Conv.addActionListener(this);
        add(Conv);
        
        setVisible(true);
    }
    
    
    public float conv(){
        numero=numero/19;
        return numero;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        aux=texto.getText();
        
        if(e.getActionCommand().equals("9"))
            texto.setText(aux+"9");
        else if(e.getActionCommand().equals("8"))
            texto.setText(aux+"8");
        else if(e.getActionCommand().equals("7"))
            texto.setText(aux+"7");
        else if(e.getActionCommand().equals("6"))
            texto.setText(aux+"6");
        else if(e.getActionCommand().equals("5"))
            texto.setText(aux+"5");
        else if(e.getActionCommand().equals("4"))
            texto.setText(aux+"4");
        else if(e.getActionCommand().equals("3"))
            texto.setText(aux+"3");
        else if(e.getActionCommand().equals("2"))
            texto.setText(aux+"2");
        else if(e.getActionCommand().equals("1"))
            texto.setText(aux+"1");
        else if(e.getActionCommand().equals("0"))
            texto.setText(aux+"0");
        else if(e.getActionCommand().equals("."))
            texto.setText(aux+".");
        
        
        else if(e.getActionCommand().equals("CE"))
            texto.setText("");
        
        
        else if(e.getActionCommand().equals("Convertir")){
            try{
                numero=Float.valueOf(texto.getText().trim()).floatValue();
                conv();
                texto.setText(String.valueOf(numero));
            }
            catch(NumberFormatException exception){
                JOptionPane.showMessageDialog(null, "Dato no válido");
                texto.setText("");
            }
            
        }
    }

}
