import javax.swing.JOptionPane;
public class exerc_automovel {

	public static void main(String args[])  {
		
	
      float custo_fabrica, perc_revendedor, impostos, preco_final;
      custo_fabrica = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do custo de fabrica deste automovel"));
      perc_revendedor = (25 * custo_fabrica) /100;
      impostos = (45 * custo_fabrica) /100;
      preco_final = custo_fabrica + perc_revendedor + impostos;
      JOptionPane.showMessageDialog(null,"\nCusto de fabrica .......................R$  "+custo_fabrica+  
      		                             "\npercentual do revendedor ...............R$  "+perc_revendedor+
    		                             "\nvalor dos impostos......................R$  "+impostos+    		         
    		                             "\npreco final ............................R$  "+preco_final);
	} 		      }                       