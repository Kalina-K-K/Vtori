package edu2;

public class TV {
	int channel=1;
	int volume=1;
	boolean on=false;
	
	TV(){
	}
	
	void turnOn() {
		if(!on) {
			on=true;
		}
	}
	void turnOff() {
		if(on) {
			on=false;
		}
	}
	void setChannel(int newChannel) {
		if(on) {
		channel=newChannel;
		}
	}
	void setVolume(int newVolume) {
		if(on) {
		volume=newVolume;
		}
	}
	void channelUp() {
		if(on) {
			if(channel==120) {
				channel=1;
			}else {
				channel+=1;
			}
		}
	}
	void channelDown() {
		if(on) {
			if(channel==1) {
				channel=120;
			}else {
				channel-=1;
			}
		}
	}
	void volumeUp() {
		if(on) {
			if(volume<7) {
				volume+=1;
			}
		}
	}
	void volumeDown() {
		if(on) {
			if(volume>1) {
				volume-=1;
			}
		}
	}
	void vij() {
		if(on) {
		System.out.println("Channel: " + channel);
		System.out.println("Volume: " + volume);
		}else {
			System.out.println("The TV is off");
		}
	}
}
