package controller;

import model.Departamento;

public class CtrlPrograma {
    
    public static void main(String[] args){
        Departamento d1 = new Departamento("CB", "Contabilidade");
        System.out.println(d1);

        System.out.println("A sigla de d1: é " + d1.getSigla());
        System.out.println("O nome de d1: é " + d1.getNome());

        d1.setSigla("CBE");
        d1.setNome("Contabilidade Empresarial");

        System.out.println("A sigla d1 é: " + d1.getSigla());
        System.out.println("O nome de d1 é: " + d1.getNome());

    }

}
