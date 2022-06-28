public class Trabalhador {
    private String Nome;
    private Double HorasTrabalhadas;
    private Double salarioPorHora;

    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    
    public Double getSalarioPorHora() {
        return salarioPorHora;
    }
    public void setSalarioPorHora(Double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
    
    public Double getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }
    public void setHorasTrabalhadas(Double horasTrabalhadas) {
        HorasTrabalhadas = horasTrabalhadas;
    }

    
}
