package banco;


import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import modelo.Modeloanuncio;

public class Controleanuncio extends Conexao {
	PreparedStatement executa = null;
	ResultSet r=null;

	public boolean inserirdados(String nomeanuncio, 
			String nomecliente, Date datainicio,
			Date datafinal, double investimentodia) {
		Conectar();
		try {
			String sql = "INSERT INTO anuncio(nomeanuncio, nomecliente, datainicio, datafinal,"
					+ "investimentodia) VALUES (?,?,?,?,?)";
			executa=con.prepareStatement(sql);
			executa.setString(1, nomeanuncio);
			executa.setString(2, nomecliente);
			executa.setDate(3, datainicio);
			executa.setDate(4, datafinal);
			executa.setDouble(5, investimentodia);
			executa.execute();
			return true;
		}catch (SQLException ex) {
    		return false;
        }
		}
	public ArrayList<Modeloanuncio> consultanome(String nomecliente){
		Conectar();
		ArrayList<Modeloanuncio> consulta = new ArrayList<Modeloanuncio>();
		try {
			String sql = ("SELECT * FROM anuncio WHERE nomecliente like ?");
			executa=con.prepareStatement(sql);
			executa.setString(1, "%"+ nomecliente +"%");
			executa.execute();
			r=executa.executeQuery();
			while(r.next()) {
				Modeloanuncio busca = new Modeloanuncio();
				busca.setNomeanuncio(r.getString("nomeanuncio"));
				busca.setNomecliente(r.getString("nomecliente"));
				busca.setDatainicio(r.getDate("datainicio"));
				busca.setDatafinal(r.getDate("datafinal"));
				busca.setInvestimentodia(r.getDouble("investimentodia"));
				consulta.add(busca);
			}
			return consulta;
		}catch (SQLException ex) {
    		return null;
        }
	}
		public ArrayList<Modeloanuncio> consultadata(Date datainicio, Date datafinal){
			Conectar();
			ArrayList<Modeloanuncio> consulta = new ArrayList<Modeloanuncio>();
			try {
				String sql = ("SELECT * FROM anuncio WHERE datainicio BETWEEN ? and ? and datafinal BETWEEN ? and ?");
				executa=con.prepareStatement(sql);
				executa.setDate(1, datainicio);
				executa.setDate(2,datafinal);
				executa.setDate(3, datainicio);
				executa.setDate(4,datafinal);
				executa.execute();
				r=executa.executeQuery();
				while(r.next()) {
					Modeloanuncio busca = new Modeloanuncio();
					busca.setNomeanuncio(r.getString("nomeanuncio"));
					busca.setNomecliente(r.getString("nomecliente"));
					busca.setDatainicio(r.getDate("datainicio"));
					busca.setDatafinal(r.getDate("datafinal"));
					busca.setInvestimentodia(r.getDouble("investimentodia"));
					consulta.add(busca);
				}
				return consulta;
			}catch (SQLException ex) {
	    		return null;
	        }		
	}
	}