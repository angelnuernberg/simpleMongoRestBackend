package base;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface SensorMeasurementRepository extends MongoRepository<SensorMeasurement, Integer> {

}
