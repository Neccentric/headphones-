public class headphones {
    
    String name;
    String charge;
    String color;
    String[] controls = {"power", "volume", "skip", "play/pause"};
    static boolean power = false;
    static int volume = 0;

    public headphones (String name, String charge, String color){
        this.name = name;
        this.charge = charge;
        this.color = color;

    }
    public headphones() {
        name = "Beats";
        charge = "Micro usb";
        color = "red";
    }

    public String displayDetails(){
        return name + " " +charge + " " + color;
    }

    public static void powerOn() {
        power = false;
    }
    public static void powerOff() {
        power = false;
    }
    public static void volumeUp() {
        volume++;
    }

    public static void volumeDown() {
        volume--;
    }
    

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        headphones Hp = new headphones("Oriamo","Micro USB","Black");
        headphones hp = new headphones();


        System.out.println(Hp.displayDetails());
        hp.volumeUp();
        System.out.println(hp.displayDetails());
        System.out.println(hp.volume);

    }
}
