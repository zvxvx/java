public class Testing {

    private String aWord;
    private int aNumber;
    private double precisionNum;

    public void setValues () {
        aWord = "Default";
        aNumber = 4;
        precisionNum = 1.54;
    }

    public void settingValues(String word, int num, double precision) {
        aWord = word;
        aNumber = num;
        precisionNum = precision;

    }
    public void setWord(String word) {
        aWord = word;
    }
    public void setNum(int num) {
        aNumber = num;
    }
    public void setPrecision(double precision) {
        precisionNum = precision;
    }

    public String getWord() {
        return aWord;
    }
    public int getNum() {
        return aNumber;
    }
    public double getPrecision() {
        return precisionNum;
    }
    public String toString(){
        return String.format(aWord + " : " + aNumber + " : " + precisionNum);
    }
}
