package digital.innovation.singleton;

import digital.innovation.singleton.controller.FuncionarioRestControl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApp implements CommandLineRunner {

    @Autowired
    private FuncionarioRestControl funcionarioControl;

    @Override
    public void run(String... args) throws Exception {
        funcionarioControl.setFuncinario("Moraniel",1500.00);
        funcionarioControl.getFuncinario();
    }
}
