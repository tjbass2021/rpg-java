public class Personagem {
    // características do personagem
    private String nome;
    private String raca;
    private String origem;
    private double peso;
    private int idade;
    // métodos de características de personagens
    // métodos de nome
    private void setNome(String nome) {
        this.nome = nome;
    }
    private String getNome() {
        return this.nome;
    }
    // métodos de raça
    private void setRaca(String raca) {
        this.raca = raca;
    }
    private String getRaca() {
        return this.raca;
    }
    // métodos de origem
    private void setOrigem(String origem) {
        this.origem = origem;
    }
    private String getOrigem() {
        return this.origem;
    }
    // métodos de peso
    private void setPeso (double peso) {
        this.peso = peso;
    }
    private double getPeso() {
        return this.peso;
    }
    // métodos de idade
    private void setIdade(int idade) {
        this.idade = idade;
    }
    private int getIdade() {
        return this.idade;
    }
    // --- Fim dos métodos de características de personagens ---
    // atributos básicos
    private int forca;
    private int consti;
    private int dest;
    private int inte;
    private int sabe;
    private int caris;
    // métodos de atributos básicos
    // métdodos de força
    private void setForca(int valor) {
        this.forca = valor;
    }
    private int getForca() {
        return this.forca;
    }
    // métodos de constituição
    private void setConst(int valor) {
        this.consti = valor;
    }
    private int getConst() {
        return this.consti;
    }
    // métodos de destreza
    private void setDest(int valor) {
        this.dest = valor;
    }
    private int getDest() {
        return this.dest;
    }
    // métodos de inteligência
    private void setInte(int valor) {
        this.inte = valor;
    }
    private int getInte() {
        return this.inte;
    }
    // métodos de sabedoria
    private void setSabe(int valor) {
        this.sabe = valor;
    }
    private int getSabe() {
        return this.sabe;
    }
    // métodos de carisma
    private void setCari(int valor) {
        this.caris = valor;
    }
    private int getCaris() {
        return this.caris;
    }
    // --- fim dos métodos de atributos básicos ---
    // modificadores
    private int modFor;
    private int modConst;
    private int modDest;
    private int modInte;
    private int modSabe;
    private int modCari;
    // Métodos dos modificadores
    // método de cálculo de modificador
    private static int calcMod(int atr, int mod) {
        if(atr > 18) {
            mod += 5;
        }
        else
            if (atr > 10 && atr <= 18){
                mod += 3;
            }
        else
            if (atr > 3 && atr <= 10) {
                mod -= 1;
            }
        return mod;
    }
    // métodos de modificador de força
    private void setModFor() {
        this.modFor = calcMod(this.forca, this.modFor);
    }
    private int getModFor() {
        return this.modFor;
	}
	// métodos de modificador de constituição
    private void setModConst() {
        this.modConst = calcMod(this.consti, this.modConst);
    }
    private int getModConst() {
        return this.modConst;
    }
    // métodos de modificador de destreza
    private void setModDes() {
        this.modDest = calcMod(this.dest, this.modDest);
    }
    private int getModDes() {
        return this.modDest;
    }
	// métodos de modificador de inteligência
    private void setModInt() {
        this.modInte = calcMod(this.inte, this.modInte);
    }
    private int getModInt() {
        return this.modInte;
    }
    // métodos de modificador de sabedoria
    private void setModSabe() {
        this.modSabe = calcMod(this.sabe, this.modSabe);
    }
    private int getModSabe() {
        return this.modSabe;
    }
    // métodos de modificador de carisma
    private void setModCari() {
        this.modCari = calcMod(this.caris, this.modCari);
    }
    private int getModCari() {
        return this.modCari;
    }
    // método de exibição de mensagem
    public void exibicao() {
        System.out.printf("O modificador de força é: %d", this.modFor);
    }
    // Construtores
    public Personagem(String nome, String raca, String origem, double peso, int idade,
                      int forca, int consti, int dest, int inte, int sabe, int caris) {
        // características do personagem
        setNome(nome);
        this.nome = getNome();
        setRaca(raca);
        this.raca = getRaca();
        setOrigem(origem);
        this.origem = getOrigem();
        setPeso(peso);
        this.peso = getPeso();
        setIdade(idade);
        this.idade = getIdade();
        // atributos básicos e modificadores
        setForca(forca);
        this.forca = getForca();
        setModFor();
        this.modFor = getModFor();
        setConst(consti);
        this.consti = getConst();
        setModConst();
        this.modConst = getConst();
        setDest(dest);
        this.dest = getDest();
        setModDes();
        this.modDest = getModDes();
        setInte(inte);
        this.inte = getInte();
        setModInt();
        this.modInte = getModInt();
        setSabe(sabe);
        this.sabe = getSabe();
        setModSabe();
        this.sabe = getModSabe();
        setCari(caris);
        this.caris = getCaris();
        setModCari();
        this.modCari = getModCari();
    }
}
