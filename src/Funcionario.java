public class Funcionario {
    private double salario;
    private long registro;
    private boolean estaAtivo;
    private String nome;
    private String departamento;
    private String rg;

    public Funcionario() {
        this.estaAtivo = true;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public long getRegistro() {
        return registro;
    }

    public void setRegistro(long registro) {
        this.registro = registro;
    }

    public boolean isEstaAtivo() {
        return estaAtivo;
    }

    public void setEstaAtivo(boolean estaAtivo) {
        this.estaAtivo = estaAtivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void bonificar(double salario) {
        setSalario(getSalario() + salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", registro=" + registro +
                ", estaAtivo=" + estaAtivo +
                ", nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", rg='" + rg + '\'' +
                '}';
    }
}
