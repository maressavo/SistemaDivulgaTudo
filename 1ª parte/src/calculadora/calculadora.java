package calculadora;

import javax.swing.JOptionPane;

public class calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valor;
		double investimento=0;
		calculadora calculadora=new calculadora();
		try {
		valor=JOptionPane.showInputDialog("Informe um valor para o cálculo:");
		valor = valor.replace(",",".");
		investimento=Double.parseDouble(valor);
		JOptionPane.showMessageDialog(null,"A quantidade total de visualizações é ="+calculadora.Calcular(investimento));
	}
		catch(NumberFormatException e ){
		    JOptionPane.showMessageDialog(null,"Digite somente números.","Caracteres inválidos",1);
		  } 
	}
		public int Calcular(Double x) {
			Double ai=0.0;
			Double cq=0.0;
			Double cp=0.0;
			Double nv=0.0;
			Double tv=0.0;
			if (x>0){
				ai=30*x;
				ai=Math.floor(ai);
				nv=ai;
				for(int count=1 ; count <=3 ; count++) {	
					if(nv>0) {
							cq=nv*0.12;
							cq=Math.floor(cq);
							if(cq>0) {
								cp=cq*0.15;
								cp=Math.floor(cp);
							}
							if(count <=3) {
								if(cp>0) {
									nv=cp*40;
									tv+=Math.floor(nv);
								}	
							}
						}
				}
			 }tv=ai+tv;	
			return (int) Math.floor(tv);
			
		}
}

