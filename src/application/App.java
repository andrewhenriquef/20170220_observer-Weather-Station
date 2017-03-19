package application;

import subscriber.CurrentConditions;
import subscriber.Forecast;
import subscriber.Statistics;

public class App {

	public static void main(String[] args) {

		
		WeatherData data = new WeatherData();
		
		Forecast forecast = new Forecast(data);
		Statistics statistics = new Statistics(data);
		CurrentConditions current = new CurrentConditions(data);
	
		//add a subscriber
		data.addSubscriber(forecast);
		
		//5
		data.setMeasurements(5f, 5f, 5f);
		System.out.println("-----------------------------");
		
		//add some subscribers
		data.addSubscriber(statistics);
		data.addSubscriber(current);
		
		//10
		data.setMeasurements(10.1f, 10f, 10f);
		System.out.println("-----------------------------");
		
		//20
		data.setMeasurements(20f, 20f, 20f);
		
		//remove a subscriber
		data.removeSubscriber(current);
		System.out.println("-----------------------------");
		
		//30
		data.setMeasurements(30f, 30f, 30f);
		
		System.out.println("-----------------------------");
		
		
	
	}

}
