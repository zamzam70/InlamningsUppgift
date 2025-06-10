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



    public String longestWord(String text) {
        // Dela upp raden i ord

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
        this.rows ++;
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

}

