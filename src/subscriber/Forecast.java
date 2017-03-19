package subscriber;

import application.*;

public class Forecast implements Subscriber, DisplayElement {

	private float temp, humidity, pressure;
	private Publisher WeatherData;
	
	
	public Forecast(Publisher WeatherData){
		
		this.WeatherData = WeatherData;
		
	}
	
	public void update(float temp, float humidity, float pressure){
		
		this.temp = temp * 2;
		this.humidity = humidity * 2;
		this.pressure = pressure * 2;
		display();
	}
	
	public void display(){
		
		System.out.println("Previsão do tempo: Temperatura: " + temp + "Humidade: " + humidity + "Pressão Atmosférica: " + pressure);
	
	}
}
