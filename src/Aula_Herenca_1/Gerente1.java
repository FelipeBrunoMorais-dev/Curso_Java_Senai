package Aula_Herenca_1;

public class Gerente1 extends Funcionario1 {

    private String departamento;


        public Gerente1(String nome, double salario, String departamento) {
            super(nome, salario);
            this.departamento = departamento;
        }

        public void aprovaVerba(){
            System.out.println("O Gerente " + this.nome + " do depto " + this.departamento + " aprovou a verba.");
        }

        }
