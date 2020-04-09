package opdracht5;

public class Btw {
    private int btw = 21;
    private double prijs = .543;

    public double getPrijs() {
        return this.prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getBtw() {
        return this.btw;
    }

    public void setBtw(int btw) {
        this.btw = btw;
    }

    public double getPrijsInclusiefBtw() {
        return prijs*(btw/100);
    }
}
