package operadores;

import javax.swing.JOptionPane;
public class operadores{

	public static void main(String args[])  {
  
		
		
		float num1, num2, soma,multiplicacao,divisao,subtracao;
        //num1 = 50;
	    //num2 = 30;
  
     num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero1"));
     num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero2"));
     
	 soma = num1 + num2;
	 multiplicacao = num1 * num2;
	 divisao = num1 / num2;
	 subtracao = num1 - num2;;
     JOptionPane.showMessageDialog(null,"A soma = "+soma);
     JOptionPane.showMessageDialog(null,"A multiplicacao = "+multiplicacao);
     JOptionPane.showMessageDialog(null,"A divisao = "+divisao);
     JOptionPane.showMessageDialog(null,"A subtracao = "+subtracao);
     
     
    
     
     
}
   } 


