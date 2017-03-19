package application;

import java.util.ArrayList;

public class WeatherData implements Publisher{

	private ArrayList<Subscriber> subscribers;
	private float temp, pressure, humidity;

	public WeatherData(){
		subscribers = new ArrayList<Subscriber>();
	}
	
	public ArrayList<Subscriber> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(ArrayList<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}
	
	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	
	public void addSubscriber(Subscriber subs){
		
		subscribers.add(subs);
	
	}
	
	public void removeSubscriber(Subscriber subs){
		
		int count = subscribers.indexOf(subs);
		
		if (count >= 0){
			subscribers.remove(count);
		}
	}
	
	public void notifySubscriber(){
		
		for (int count = 0; count < subscribers.size(); count++){
			Subscriber subs = (Subscriber)subscribers.get(count);
			subs.update(temp, humidity, pressure);
		}
		
	}
	
	public void measurementsChanged(){
		notifySubscriber();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		
		setTemp(temp);
		setHumidity(humidity);
		setPressure(pressure);
		measurementsChanged();
		
	}
	
}
