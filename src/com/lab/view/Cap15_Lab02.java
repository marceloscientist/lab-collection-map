package com.lab.view;

import java.util.ArrayList;

import com.lab.entities.Estudante;

public class Cap15_Lab02 {

	public static void main(String[] args) {
		ArrayList<Estudante> estudanteList = new ArrayList<>();
		estudanteList.add(new Estudante("Joana",8.5,8.5));
		estudanteList.add(new Estudante("Ant�nio",6.0,9.0));
		estudanteList.add(new Estudante("Mariana",7.5,9.0));
		estudanteList.add(new Estudante("Ricardo",7.0,6.0));
		estudanteList.add(new Estudante("Gustavo",9.5,10.0));

		estudanteList.forEach(e->e.setMedia((e.getNotaMatematica()+e.getNotaPortugues())/2));
		estudanteList.forEach(System.out::println);
	}

}
