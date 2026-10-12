public class Kort {
    private String ägare;
    final private int kortNr = antalKort + 1;
    private int lånadeBöcker = 0;
    private static final int maxLån = 3;
    private static int antalKort = 0;

    Kort(String namn){
        setÄgare(namn);
        antalKort++;
    }

    public String getÄgare() {
        return ägare;
    }

    public int getLånadeBöcker(){
        return lånadeBöcker;
    }

    public void setÄgare(String namn) {
        if (namn.isBlank()){
            throw new IllegalArgumentException("Det är inte ett giltigt namn");
        } else {
            ägare = namn;
        }
    }

    public int getKortNr() {
        return kortNr;
    }

    public boolean låna(){
        if (lånadeBöcker < maxLån){
            lånadeBöcker++;
            return true;
        } else{
            throw new IllegalArgumentException("Du har lånat för många böcker.");
        }
    }

    public boolean lämna(){
        lånadeBöcker--;
        if (lånadeBöcker < 0) {
            lånadeBöcker = 0;
            return false;
        }
        return true;
    }

    public void info(){
        IO.println("ägare:" + this.ägare + "\nKortnummer:" + this.kortNr + "\nLånade böcker");
    }

    public int antalSkapadeKort(){
        return antalKort;
    }
}