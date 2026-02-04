public class Room {
    private int laenge;
    private int breite;
    //Anzahl an eingängen
    private int Gates;
    //Gibt an welche in Himmelsrichtungen die Türen zeigen
    private boolean GN, GW, GS, GE;


    public Room(int plaenge, int pbreite, int pGates, boolean pGN, boolean pGW, boolean pGS, boolean pGE){
        this.laenge = plaenge;
        this.breite = pbreite;
        this.Gates = pGates;
    }

    public int getLaenge(){
        return this.laenge;
    }

    public int getBreite(){
        return this.breite;
    }

}