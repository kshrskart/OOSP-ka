//Напишите программу для управления разными типами музыкальных устройств (плееры, колонки, наушники) с использованием паттерна "мост"
public class Main {
    public static void main(String[] args) {
        Device musicPlayer = new MusicPlayer();
        RemoteControl musicPlayerRemoteControl = new MusicDeviceRemoteControl(musicPlayer);

        musicPlayerRemoteControl.powerOn();
        musicPlayerRemoteControl.setDeviceVolume(50);
        musicPlayerRemoteControl.powerOff();

        Device speakers = new Speakers();
        RemoteControl speakersRemoteControl = new MusicDeviceRemoteControl(speakers);

        speakersRemoteControl.powerOn();
        speakersRemoteControl.setDeviceVolume(70);
        speakersRemoteControl.powerOff();

        Device headphones = new Headphones();
        RemoteControl headphonesRemoteControl = new MusicDeviceRemoteControl(headphones);

        headphonesRemoteControl.powerOn();
        headphonesRemoteControl.setDeviceVolume(30);
        headphonesRemoteControl.powerOff();
    }
}
