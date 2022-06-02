package Strategy;

import Strategy.RotasMode.Onibus;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class testeRout {
    Navigator navegar;
    String walk;
    String carro;
    String busao;

    @Test
    public void testeBusao() {
        navegar = new PublicTransportStrategy();
        String decisao = navegar.decideRota(busao);
        assertEquals(decisao, String.valueOf(1.6666666666666667));
    }
    @Test
    public void testeUber() {
        navegar = new RoadStrategy();
        String decisao = navegar.decideRota(carro);
        assertEquals(decisao, String.valueOf(1.25));
    }
    @Test
    public void testeBike() {
        navegar = new WalkingStrategy();
        String decisao = navegar.decideRota(walk);
        assertEquals(decisao, String.valueOf(6.666666666666667));
    }

}
