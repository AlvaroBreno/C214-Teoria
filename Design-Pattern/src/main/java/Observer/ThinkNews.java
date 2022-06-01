package Observer;

import Observer.impl.Observador;
import Observer.impl.Observavel
public class ThinkNews {
    // Criando o observavel (subject) netflix.
    Observavel think = new Observavel();

    //Criando 3 observadores e fazendo a inscrição em Netflix.
    Observador obs1 = new Observador(1);
    Observador obs2 = new Observador(2);
    Observador obs3 = new Observador(3);

		think.registraObservador(obs1);
		think.registraObservador(obs2);
		think.registraObservador(obs3);

		think.setNovoAnuncioNetflix("AAA", "TERROR");
		think.setNovoAnuncioNetflix("BBB", "Comedia");

		think.removeObservador(obs3);




		System.out.println("\n\nMandando notificação para todos os clientes: ");
		think.notificaObservadores();

}
}
