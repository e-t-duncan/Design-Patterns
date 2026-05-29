package designPatterns.adapter;

public class DisplayDataThirdParty {
    public float index;
    public String data;

    public DisplayDataThirdParty(float index, String data){
        this.index = index;
        this.data = data;
    }

    public void displayData(){
        System.out.println("Index: " +index+ " Data: " +data);
    }

}
