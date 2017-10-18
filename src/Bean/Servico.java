package Bean;

public class Servico {
    
    private float tempo;
    private float valor;
    private String nome;

    public Servico(float tempo, float valor, String nome) {
        this.tempo = tempo;
        this.valor = valor;
        this.nome = nome;
    }
    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Servico{" + "tempo=" + tempo + ", valor=" + valor + ", nome=" + nome + '}';
    }
}
