package inter;

public class Audio implements RemoteControl {

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");

    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.setVolume(RemoteControl.MAX_VOLUME);
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.setVolume(RemoteControl.MIN_VOLUME);
        } else {
            this.volume = volume;
        }
        System.out.println("현재 audio 볼륨 : " + volume);
    }

}
