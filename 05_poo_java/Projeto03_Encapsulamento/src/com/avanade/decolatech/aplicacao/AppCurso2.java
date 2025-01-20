package com.avanade.decolatech.aplicacao;

import javax.swing.JOptionPane;

import com.avanade.decolatech.classes.Curso;

public class AppCurso2 {
	public static void main(String[] args) {
		try {
			Curso curso1 = new Curso();
			curso1.setDados(1, "Curso bacana", 0, 4000);
			System.out.println(curso1.getDados());
			JOptionPane.showMessageDialog(null, curso1.getDados());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
