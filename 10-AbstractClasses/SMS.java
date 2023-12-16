public class SMS extends Message {
    int pnumber;

    public SMS(String text, int pnumber) {
        super(text);
        this.pnumber = pnumber;
    }

    public int getPnumber() {
        return pnumber;
    }


    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }
    @Override
    public String send(){
        return text;
    }
public static void main(String[] args) {
    Message m1 = new Message("Nowa wiadomosc");
    System.out.println(m1.send());
}
}
