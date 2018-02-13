package base;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="measurements")
public class SensorMeasurement {
	@Id	
	// Important: @GeneratedValue(strategy=GenerationType.AUTO) causes errors! 
    private Integer measurementId;
    
    private Integer sensorId;
   
	private String dateTime;
    
    private Float temperature;

    private Float humidity;

    public Integer getMeasurementId() {
		return measurementId;
	}

	public void setMeasurementId(Integer measurementId) {
		this.measurementId = measurementId;
	}
	
    public Integer getSensorId() {
		return sensorId;
	}

	public void setSensorId(Integer sensorId) {
		this.sensorId = sensorId;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public Float getTemperature() {
		return temperature;
	}

	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}

	public Float getHumidity() {
		return humidity;
	}

	public void setHumidity(Float humidity) {
		this.humidity = humidity;
	}

	@Override
	public String toString() {
		return "SensorMeasurement [measurementId=" + measurementId + ", sensorId=" + sensorId + ", dateTime=" + dateTime
				+ ", temperature=" + temperature + ", humidity=" + humidity + "]";
	}

	
    
}

