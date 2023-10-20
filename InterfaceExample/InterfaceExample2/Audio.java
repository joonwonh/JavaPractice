package InterfaceExample2;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니당");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니당");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME)	{
			this.volume = MAX_VOLUME;
		}else if(volume < MIN_VOLUME)	{
			this.volume = MIN_VOLUME;
		}else
			this.volume = volume;
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}

	


}
