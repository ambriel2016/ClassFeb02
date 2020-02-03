public class Main {
    public static void main(String[] args) {
        Burrito b = new Burrito();
        Veggies v = new Veggies();
        v.setFajitas(false);
        v.setLettuce(true);

        b.setBeans("Black Beans");
        b.setMean("Chicken");
        b.setRice("White Rice");
        b.setVeggies(v);

        System.out.println(b.getBeans());
        System.out.println(b.setMean());
        System.out.println(b.getRice());

        System.out.println("Fajitas is "+ b.getVeggies().isFajitas());
        System.out.println("Lettuce is " + b.getVeggies().isLettuce());

    }
}
