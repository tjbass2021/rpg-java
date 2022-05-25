public class Personagem {
    private String nome;
    private String raca;
    private String origem;
    private double peso;
    private int idade;

    // atributos básicos

    private int forca;
    private int consti;
    private int dest;
    private int inte;
    private int sabe;
    private int caris;



    private void setForca(int valor) {
        this.forca = valor;
    }

    private int getForca() {
        return this.forca;
    }

    // modificadores

    private int modFor;
    private int modConst;
    private int modDest;
    private int modInte;
    private int modSabe;
    private int modCari;

    public Personagem(int forca) {
        setForca(forca);
        this.forca = getForca();
        setModFor();
        this.modFor = getModFor();

    }


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

    private void setModFor() {
        this.modFor = calcMod(this.forca, this.modFor);
    }
    private int getModFor() {
        return this.modFor;
    }

    public void exibicao() {
        System.out.printf("O modificador de força é: %d", this.modFor);
    }


}
