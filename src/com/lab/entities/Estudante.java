package com.lab.entities;

public class Estudante {

	private double media;
	private String nome;
	private double notaMatematica;
	private double notaPortugues;

	public Estudante(String nome, double notaMatematica, double notaPortugues) {
		super();
		this.nome = nome;
		this.notaMatematica = notaMatematica;
		this.notaPortugues = notaPortugues;
		this.setMedia();
	}
	
	public double getMedia() {
		return media;
	}
	public void setMedia() {
		this.media = (this.getNotaMatematica() + this.getNotaPortugues())/2;
	}	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaMatematica() {
		return notaMatematica;
	}
	public void setNotaMatematica(double notaMatematica) {
		this.notaMatematica = notaMatematica;
	}
	public double getNotaPortugues() {
		return notaPortugues;
	}
	public void setNotaPortugues(double notaPortugues) {
		this.notaPortugues = notaPortugues;
	}
	
	@Override
	public String toString() {
		return this.getNome() +"\t"+ this.getMedia();
	}
	
}
