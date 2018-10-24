

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
	          RaceCar eligah = new RaceCar ("Ford Focus",5);
		// 3. Get the RaceCar to print its position in the race.
System.out.println(eligah.getPositionInRace());
		// 4. Crash the RaceCar
		eligah.crash();
		// 5. If the car is damaged. Bring it in for a pit stop.
        eligah.pit();
		// 6. Help the car move into first place.
        eligah.overtake();
	}
}
