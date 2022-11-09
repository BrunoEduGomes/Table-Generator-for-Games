public class Jogo {
    private Time time1;
    private Time time2;
    private int gols1;
    private int gols2;
    private Time Vencedor;

    public Jogo(){
        time1 = null;
        time2 = null;
        gols1 = 0;
        gols2 = 0;
        Vencedor = partida();
    }
    

    // Métodos que pegam o valor do atributo no objeto.
    public Time getTime1(){
        return time1;
    }

    public Time getTime2(){
        return time2;
    }

    public int getGols1(){
        return gols1;
    }

    public int getGols2(){
        return gols2;
    }

    public Time getVencedor(){
        return Vencedor;
    }
    //


    // Método que diz os gols de cada time de um jogo.
    public void setGols(int a, int b){
        gols1 = a;
        gols2 = b;
    }

    // Método que diz os times que serão inseridos no jogo.
    public void setTime(Time c, Time d){
        time1 = c;
        time2 = d;
    }
    //

    
    // Método que determina o VENCEDOR de uma partida.
    public Time partida(){
        Time a = null;
        if ((time1 != null) && (time2 != null)){
            if (gols1 > gols2){
                return a = time1;
            }
            if (gols2 > gols1){
                return a = time2;
            }
        }
        return a;
    }


    public String organizaJogo(){
        return time1.getNome() + "(" + time1.getSigla() + ")" + " " + gols1 + "\n" +
               time2.getNome() + "(" + time2.getSigla() + ")" + " " + gols2;
    }

}
