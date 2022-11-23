package digital.innovation.singleton.controller;




import digital.innovation.singleton.model.Funcionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class FuncionarioRestControl {

    @Autowired
    private Funcionario funcinario;

    public Funcionario setFuncinario(String nome,Double valor){
        funcinario.setNome(nome);
        funcinario.setSalario(valor);
        return funcinario;
    }
    public void getFuncinario(){
        System.out.println("O Funcionario "+funcinario.getNome()+
                " possui R$: "+funcinario.getSalario()+" de sálario");

    }
}
