
import impl.Observavel;
import impl.Observador;

public class App {

    public static void main(String[] args) {

        Observavel app = new Observavel();

        Observador obs1 = new Observador(1);
        Observador obs2 = new Observador(2);
        Observador obs3 = new Observador(3);

        app.registraObservador(obs1);
        app.registraObservador(obs2);
        app.registraObservador(obs3);

        app.setNovoAnuncioFrase("Jerepeps do Peps do Perereps");
        app.setNovoAnuncioFrase("Avanti Palestra");
        app.setNovoAnuncioFrase("Mente fria e coração quente");
        app.setNovoAnuncioFrase("BIRRRRRRRRRRRRRRRRRRRRL");

        app.removeObservador(obs3);

        System.out.println("\n\nMandando notificação das frases: ");
        app.notificaObservadores();
    }

}

