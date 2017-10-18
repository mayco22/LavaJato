package Bean;
import lavajato.LavaJato;

public class Agendamento {
    
    private String data;
    private String horario;
    private Servico servico;
    public static int horaR;
    public static int minutoR;
    public static float valorR;
   
    public void calcularTempo(){
        LavaJato l = new LavaJato();
        float resultado=0;
        for(Servico s :l.list){
            resultado+=s.getTempo();
        }
        horaR = (int)resultado/60;
        minutoR = (int)resultado%60;
        System.out.println("Tempo Gasto: "+horaR+":"+minutoR);
    }
    public void calcularValor(){
        LavaJato l = new LavaJato();
        float resultado=0;
        for(Servico s :l.list) {
            resultado+=s.getValor();
        }
        System.out.println("valorTotal:"+resultado);
    }
    
    public String getData() {
        return data;
    }


    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }
    @Override
    public String toString() {
        return "Agendamento{" + "data=" + data + ", horario=" + horario + ", servico=" + servico + '}';
    }
}
