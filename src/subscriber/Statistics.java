package subscriber;

import application.*;

public class Statistics implements Subscriber, DisplayElement{

	private float temp, humidity, pressure;
	private Publisher WeatherData;
	
	
	public Statistics(Publisher WeatherData){
		
		this.WeatherData = WeatherData;
		
	}
	
	public void update(float temp, float humidity, float pressure){
		
		this.temp = temp + 1;
		this.humidity = humidity + 2;
		this.pressure = pressure + 3;
		display();
		
	}
	
	public void display(){
		
		System.out.println("Estatisticas: Temperatura: " + temp + "Humidade: " + humidity + "Pressão Atmosférica: " + pressure);
	
	}
}
