package subscriber;

import application.*;

public class CurrentConditions implements Subscriber, DisplayElement{

	private float temp, humidity, pressure;
	private Publisher WeatherData;
	
	public CurrentConditions(Publisher WeatherData){
		
		this.WeatherData = WeatherData;
		
	}
	
	public void update(float temp, float humidity, float pressure){
		
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
	public void display(){
		
		System.out.println("Condições atuais: Temperatura: " + temp + "Humidade: " + humidity + "Pressão Atmosférica: " + pressure);
	
	}

}
