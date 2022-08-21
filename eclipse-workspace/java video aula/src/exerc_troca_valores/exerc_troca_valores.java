package exerc_troca_valores;

import javax.swing.JOptionPane;
public class exerc_troca_valores{

		public static void main(String args[])  {
	  
			
			
			int A, B, auxiliar;
			A = 5;
		    B = 10; 
		    JOptionPane.showMessageDialog(null,"Antes da troca :\nA = "+A+" e \nB = "+B);
		    auxiliar = A; 
		    A = B;  
		    B = auxiliar; 
		    JOptionPane.showMessageDialog(null,"Depois da troca :\nA = "+A+" e \nB = "+B);
	}
	   } 




