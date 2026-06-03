public class plumber extends workers {
    String purpose;

    plumber(int umar, int paisa, String purp){
        super(umar,paisa);
        this.purpose = purp;
    }
    void task(){
        System.out.println("Iam A Plumber");
    }
}
