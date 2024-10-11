public class Dragon {
    // Attributes/fields
    private String name;
    private int length; //write a getter method and setter method for this field
    // constructor
    public Dragon(String n, int l){
        this.name = n;
        this.length = l;
    }
    // methods

    // getter and setter methods for name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    // getter and setter methods for length
    public int getLength(){
        return length;
    }
    public void setLength(int newLength){
        this.length = newLength;
    }

    // toString()
    public String dragonName(){
        return "The dragon's name is " + name;
    }
} // end of Dragon class
