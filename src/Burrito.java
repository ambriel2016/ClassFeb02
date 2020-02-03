public class Burrito {
    private String rice;
    private String mean;
    private String beans;
    private Veggies veggies;

    public Burrito(){

    }

    public void setRice(String rice){
        this.rice = rice;
    }
    public String getRice(){
        return this.rice;
    }
    public void setBeans(String beans){
        this.beans = beans;
    }
    public String getBeans(){
        return this.beans;
    }
    public void setMean(String mean){
        this.mean = mean;
    }
    public String setMean(){
        return this.mean;
    }
    public void setVeggies(Veggies veggies){
        this.veggies = veggies;
    }
    public Veggies getVeggies(){
        return this.veggies;
    }
}
