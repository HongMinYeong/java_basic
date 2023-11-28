package _05_class._interface;

public class CdPlayer implements Music{

    String title;

    @Override
    public void Play(String title) {
        System.out.println("CD 플레이어에서 '" + title + "' 음악을 재생합니다.");
        this.title = title;
    }

    @Override
    public void Stop() {
        System.out.println("CD 플레이어에서 '" + title + "' 음악을 정지합니다.");
        this.title = title;
    }
}
