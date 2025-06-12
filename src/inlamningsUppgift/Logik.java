package inlamningsUppgift;

public class Logik {


    private int rows;
    private int antalTecken;
    private int antalOrd;
    private String langstaOrdet = "";


    public Logik() {

        rows = 0;
        antalTecken = 0;
        antalOrd = 0;

    }


    public int teckenCount(String word) {
        if (!word.equalsIgnoreCase("stop"))
            antalTecken += word.length();

        return antalTecken;

    }


    // Dela upp raden i ord
    //trim: Removes leading and trailing whitespace from the
    // It splits a string into words based on whitespace,
    // If the string o is empty (i.e., ""), skip the rest of the loop and move to the next string.
    //Compares the length of the current word o to langstaOrdet
    //If o is longer than the current longest word, update langstaOrdet.
    public String longestWord(String text) {

        String[] ord = text.trim().split("\\s+");
        for (String o : ord) {
            if (o.isEmpty()) continue;
            antalOrd++;
            if (o.length() > langstaOrdet.length()) {
                langstaOrdet = o;
            }
        }


        return langstaOrdet;
    }

    public int getAntalTecken() {
        return antalTecken;
    }

    public void setAntalTecken() {
        this.antalTecken = antalTecken;
    }

    public int getRows() {
        return rows;
    }

    public void setRows() {
        this.rows++;
    }

    public int getAntalOrd() {
        return antalOrd;
    }

    public void setAntalOrd() {
        this.antalOrd = antalOrd;
    }

    public String getLangstaOrdet() {
        return langstaOrdet;
    }

    public void setLangstaOrdet(String langstaOrdet) {
        this.langstaOrdet = langstaOrdet;
    }

    public void checkText(String hejJagHeterZamzam) {
        rows++;
    }

}

