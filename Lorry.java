package Exercise;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Scanner;

public class Lorry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed of the lorry");
		int speed = sc.nextInt();
		System.out.println("Enter the distance to be covered");
		int distance = sc.nextInt();
		new DisplayTime(speed, distance);
	}
}
class DisplayTime {
	static int speed, distance, dayDistance, totalDistance = 0;

	DisplayTime(int s, int d) {
		speed = s;
		distance = d;
		dayDistance = calDistance(speed);
		calTime();
	}

	private int calDistance(int speed) {
		return speed * 8;
	}

	void calTime() {
		if (distance < speed) {
			System.out.print(LocalDate.now() + " ");
			int hour = LocalDateTime.now().getHour();
			int minute=LocalDateTime.now().getMinute();
			float remainingMinute = ((distance) / (float) speed);
			remainingMinute = ((remainingMinute) * 60)+minute;
			if(remainingMinute>60) {
				hour++;
				remainingMinute =remainingMinute-60;
			}
			float remainingTime =(remainingMinute/100)+hour;
			System.out.printf("%.2f hrs", remainingTime);
			return;
		}
		int hour = LocalDateTime.now().getHour();
		if (hour < 22 && (22 - hour) < 8) {
			totalDistance = ((22 - hour)) * speed;
			if (totalDistance > distance) {
				System.out.println(LocalDate.now() + " " + (float) (distance / speed) + (float) hour);
				return;
			}
		} else
			totalDistance = dayDistance;
		int i = 1;
		LocalDate newDate = null;
		LocalDate localDate = LocalDate.now();
		while (totalDistance <= (distance - dayDistance)) {
			newDate = localDate.plusDays(i);
			DayOfWeek day = newDate.getDayOfWeek();
			int dayOfWeek = day.getValue();
			int dayI = newDate.getDayOfMonth();
			Month months = newDate.getMonth();
			int month = months.getValue();
			if (dayOfWeek == 1 || (month == 1 && dayI == 26) || (month == 1 && dayI == 1) || (month == 8 && dayI == 15)
					|| (dayOfWeek == 7 && dayI > 7 && dayI <= 14)) {
				i++;
			} else {
				totalDistance = totalDistance + dayDistance;
				// System.out.println(distance-totalDistance);
				i++;
			}
		}
		float remainingTime = ((distance - totalDistance) / (float) speed);
		int x = (int) remainingTime;
		float minutes = remainingTime - x;
		remainingTime = (minutes * 60 / 100) + x;
		System.out.print(localDate.plusDays(i) + " ");
		System.out.printf("%.2f hrs", remainingTime);
	}
}
