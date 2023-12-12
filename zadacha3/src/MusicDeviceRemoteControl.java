public class MusicDeviceRemoteControl implements RemoteControl {
    private Device device;

    public MusicDeviceRemoteControl(Device device) {
        this.device = device;
    }

    @Override
    public void powerOn() {
        device.turnOn();
    }

    @Override
    public void powerOff() {
        device.turnOff();
    }

    @Override
    public void setDeviceVolume(int volume) {
        device.setVolume(volume);
    }
}