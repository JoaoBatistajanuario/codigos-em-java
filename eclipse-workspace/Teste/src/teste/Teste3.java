package teste;

import javax.swing.JOptionPane;

public class Teste3 {

	        public static void main(String[]args) {
	  	  
     float nota1,nota2,calc_media;
	                                  //criei as variaveis 
	                                  //datainputstream = manipula dados;
	 nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a primeira nota"));
     nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota"));
	 
	  
	   calc_media = (nota1 + nota2)  / 2;
	   System.out.println("A media = "+calc_media);
	   JOptionPane.showMessageDialog(null, "A media = "+calc_media) ;
}

}
			   
	    