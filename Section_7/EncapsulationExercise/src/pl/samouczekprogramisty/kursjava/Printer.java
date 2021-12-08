package pl.samouczekprogramisty.kursjava;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int addToner(int tonerAmount) {
        if(tonerAmount >= 0 && tonerAmount <= 100) {
            if((this.tonerLevel + tonerAmount > 100) || (this.tonerLevel + tonerAmount < 0)) {
                return -1;
            } else {
                this.tonerLevel += tonerAmount;
                return this.tonerLevel;
            }
        }
        return -1;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(isDuplex) {
            pagesToPrint /= 2;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }
}
