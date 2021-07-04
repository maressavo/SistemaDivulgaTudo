package modelo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.sql.Date;
import banco.Controleanuncio;
import java.text.ParseException;


public class Modeloanuncio {
	private String nomeanuncio;
	private String nomecliente;
	private Date datainicio;
	private Date datafinal;
	private double investimentodia;
    
    
 public String getNomeanuncio() {
		return nomeanuncio;
	}


	public void setNomeanuncio(String nomeanuncio) {
		this.nomeanuncio = nomeanuncio;
	}


	public String getNomecliente() {
		return nomecliente;
	}


	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}


	public Date getDatainicio() {
		return datainicio;
	}


	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}


	public Date getDatafinal() {
		return datafinal;
	}


	public void setDatafinal(Date datafinal) {
		this.datafinal = datafinal;
	}


	public double getInvestimentodia() {
		return investimentodia;
	}


	public void setInvestimentodia(double investimentodia) {
		this.investimentodia = investimentodia;
	}
	
	public boolean Salvar(String nomeanuncio,String nomecliente, Date datainicio,
			Date datafinal, double investimentodia){
		Controleanuncio anuncio = new Controleanuncio();
		return anuncio.inserirdados(nomeanuncio, nomecliente, datainicio, datafinal, investimentodia);	
	}
	public boolean Validarnome(String nome) {
		if(nome.length()>3) {
			return true;
		}
		return false;
	}
	public boolean Validarfinal(Date datainicio, Date datafinal) {
		if( Diferencaentredatas(datainicio,datafinal)>0   ) {
			return true;
		}
		return false;
		
	}
 	public int Diferencaentredatas(Date datainicio,Date datafinal)   {
 		long diffInMillies = datafinal.getTime() - datainicio.getTime();
 	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
 	   System.out.println("A diferença de dias é = "+ diff);
 	    return (int) diff;
     }
 	public  ArrayList<Modeloanuncio> consultanome(String nomecliente){
 		Controleanuncio anuncio = new Controleanuncio();
		return anuncio.consultanome(nomecliente);
 		
 	}
 	public  ArrayList<Modeloanuncio> consultadata(Date datainicio, Date datafinal){
 		Controleanuncio anuncio = new Controleanuncio();
		return anuncio.consultadata(datainicio, datafinal);
 		
 	}

}
