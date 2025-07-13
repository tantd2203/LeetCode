package TwoPointers;

import java.util.Arrays;

public class _2410_Maximum_Matching_of_Players_With_Trainers {
	public int matchPlayersAndTrainers(int[] players, int[] trainers) {

		Arrays.sort(players);
		Arrays.sort(trainers);
		int count = 0;
		int i = 0, j = 0;
		while (i < players.length && j < trainers.length) {
			if (trainers[j] >= players[i]) {
				count++;
				i++;
				j++;
			} else {
				j++;
			}

		}
		return count;
	}
}

