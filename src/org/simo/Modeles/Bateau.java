package org.simo.Modeles;

import java.util.List;

import org.simo.Modeles.Marin;


public class Bateau {
	
	private String nom;
	private String port;
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	private int tonnage;
	private List<Marin> equipage;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getTonnage() {
		return tonnage;
	}
	public void setTonnage(int tonnage) {
		this.tonnage = tonnage;
	}
	public List<Marin> getEquipage() {
		return equipage;
	}
	public void setEquipage(List<Marin> equipage) {
		this.equipage = equipage;
	}
	

}
