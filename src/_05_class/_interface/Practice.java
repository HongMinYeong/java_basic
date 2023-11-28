package _05_class._interface;

public class Practice {
    public static void main(String[] args) {
        Music mp;

        mp = new Mp3Player();
        System.out.println("==== MP3 Player ====");
        mp.Play("아이유 블루밍");
        mp.Stop();

        Music cd;
        System.out.println("==== CD Player ====");
        cd = new CdPlayer();
        cd.Play("아이유 꽃갈피");
        cd.Stop();
    }

}
