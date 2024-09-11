public class Record {
    private String name;
    private String date;
    private int amountOwned;
    private int amountPayed;
    private int change;

    public Record (String name, String date, int amountOwned, int amountPayed){
        this.name = name;
        this.date = date;
        this.amountOwned = amountOwned;
        this.amountPayed = amountPayed;
        this.change = amountPayed - amountOwned;
    }

    public String getName(){
        return name;
    }

    public String getDate(){
        return date;
    }

    public int getAmountOwned(){
        return amountOwned;
    }

    public int getAmountPayed(){
        return amountPayed;
    }

    public int getChange(){
        return change;
    }
}
