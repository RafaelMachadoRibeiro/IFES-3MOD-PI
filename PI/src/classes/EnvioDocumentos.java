package classes;


public class EnvioDocumentos {
    private String dadosPessoais;
    private String dependentes;
    private String rendimentos;
    private String bensDireitos;
    private String dividasOnus;
    private String doacoesEfetuadas;
    private String investimentos;

    public EnvioDocumentos(String dadosPessoais, String dependentes, String rendimentos, String bensDireitos, String dividasOnus, String doacoesEfetuadas, String investimentos) {
        this.dadosPessoais = dadosPessoais;
        this.dependentes = dependentes;
        this.rendimentos = rendimentos;
        this.bensDireitos = bensDireitos;
        this.dividasOnus = dividasOnus;
        this.doacoesEfetuadas = doacoesEfetuadas;
        this.investimentos = investimentos;
    }

    public String getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(String dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getDependentes() {
        return dependentes;
    }

    public void setDependentes(String dependentes) {
        this.dependentes = dependentes;
    }

    public String getRendimentos() {
        return rendimentos;
    }

    public void setRendimentos(String rendimentos) {
        this.rendimentos = rendimentos;
    }

    public String getBensDireitos() {
        return bensDireitos;
    }

    public void setBensDireitos(String bensDireitos) {
        this.bensDireitos = bensDireitos;
    }

    public String getDividasOnus() {
        return dividasOnus;
    }

    public void setDividasOnus(String dividasOnus) {
        this.dividasOnus = dividasOnus;
    }

    public String getDoacoesEfetuadas() {
        return doacoesEfetuadas;
    }

    public void setDoacoesEfetuadas(String doacoesEfetuadas) {
        this.doacoesEfetuadas = doacoesEfetuadas;
    }

    public String getInvestimentos() {
        return investimentos;
    }

    public void setInvestimentos(String investimentos) {
        this.investimentos = investimentos;
    }

}