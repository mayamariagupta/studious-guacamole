import java.io.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.Scanner;
import java.io.IOException;
 /* Represents a point in space and time, recorded by a GPS sensor.
 

 * @author Maya Gupta
 */
public class Track {
  private List<Point> points;

  // TODO: Create a stub for the constructor
  public Track() {
    points = new ArrayList<>();
  }

  public Track(String filename) throws IOException {
    readFile(filename);
  }

  // TODO: Create a stub for readFile()
  public void readFile(String fileName) throws IOException {
  }

  // TODO: Create a stub for add()
  public void add(Point point) {
    points.add(point);
  }

  // TODO: Create a stub for get()
  public Point get(int index) throws GPSException {
    //return null;
      if (index >= 0 && index < points.size()) {
        return points.get(index);
    } else {
        throw new GPSException("Invalid points");
    }
  }

  // TODO: Create a stub for size()
  public int size() {
    return points.size();
  }

  // TODO: Create a stub for lowestPoint()
  public Point lowestPoint() {
    return null;
  }

  // TODO: Create a stub for highestPoint()
  public Point highestPoint() {
    return null;
  }

  // TODO: Create a stub for totalDistance()
  public double totalDistance() {
    return 0;
  }

  // TODO: Create a stub for averageSpeed()
  public double averageSpeed() {
    return 0;
  }

}
