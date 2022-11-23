package digital.innovation.singleton.model;

import org.springframework.stereotype.Component;



@Component
public class Funcionario {

    private Double salario;
    private String nome;



    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
