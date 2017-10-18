package Bean;

import org.junit.Test;
import static org.junit.Assert.*;
import lavajato.LavaJato;
public class AgendamentoTest {
    
    /**
     * Test of toString method, of class Agendamento.
     */
    @Test
    public void PrimeiroTeste() {
        Agendamento a = new Agendamento();
        LavaJato l = new LavaJato();
        Servico s = new Servico(15,25,"Ducha");
        l.list.add(s);
        a.calcularValor();
        
        assertEquals(25,a.valorR,0.0);
    }
    @Test
    public void SegundoTeste() {
        
        Agendamento a = new Agendamento();
        LavaJato l = new LavaJato();
        Servico s = new Servico(15,25,"Ducha");
        Servico s1 = new Servico(30,75,"Completao");
        Servico s2 = new Servico(20,50,"Polimento");
        l.list.add(s);
        l.list.add(s1);
        l.list.add(s2);
        
        a.calcularValor();
        
        assertEquals("",150,a.valorR,0.1);
        
    }
    
}
