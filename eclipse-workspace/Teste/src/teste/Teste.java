package teste;

import javax.swing.JOptionPane;

class Teste {


   
  public static void main (String args[]) {
  
		  float salario;
		  int idade;
		  String nome;
		  //salario = 2000;
		  //idade = 18;
		 //nome = "neri neitzke";
	      nome = JOptionPane.showInputDialog("Digite o nome");
		  idade =  Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		  salario = Float.parseFloat (JOptionPane.showInputDialog("Digite o salario"));
		  
	     System.out.println("o nome = "+nome);
	     System.out.println("sua idade = "+idade);
	     System.out.println("Seu salario = "+salario);
	    
  }
  
   }
 


	    			 	    			 
	    			 
	     