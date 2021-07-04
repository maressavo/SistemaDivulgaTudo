package modelo;

public class Modelorelatorio {
	double valorinvestido=0;
	int quantidademaximavisualizacoes;
	int quantidademaximadecliques;
	int quantidademaximadecompartilhamentos;
	
	public double getValorinvestido() {
		return valorinvestido;
	}

	public void setValorinvestido(double valorinvestido) {
		this.valorinvestido = valorinvestido;
	}

	public int getQuantidademaximavisualizacoes() {
		return quantidademaximavisualizacoes;
	}

	public void setQuantidademaximavisualizacoes(int quantidademaximavisualizacoes) {
		this.quantidademaximavisualizacoes = quantidademaximavisualizacoes;
	}

	public int getQuantidademaximadecliques() {
		return quantidademaximadecliques;
	}

	public void setQuantidademaximadecliques(int quantidademaximadecliques) {
		this.quantidademaximadecliques += quantidademaximadecliques;
	}

	public int getQuantidademaximadecompartilhamentos() {
		return quantidademaximadecompartilhamentos;
	}

	public void setQuantidademaximadecompartilhamentos(int quantidademaximadecompartilhamentos) {
		this.quantidademaximadecompartilhamentos = quantidademaximadecompartilhamentos;
	}

	public void Calcular() {
		Double ai=0.0;
		Double cq=0.0;
		Double cp=0.0;
		Double nv=0.0;
		Double tv=0.0;
		if (getValorinvestido()>0){
			ai=30*getValorinvestido();
			ai=Math.floor(ai);
			nv=ai;
			for(int count=1 ; count <=3 ; count++) {	
				if(nv>0) {
						cq=nv*0.12;
						cq=Math.floor(cq);
						setQuantidademaximadecliques((int)Math.floor(cq));
						if(cq>0) {
							cp=cq*0.15;
							cp=Math.floor(cp);
							setQuantidademaximadecompartilhamentos((int)Math.floor(cp));
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
		 
		 setQuantidademaximavisualizacoes( (int)Math.floor(tv));
		
	}
}
