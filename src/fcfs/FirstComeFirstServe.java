package fcfs;

import java.util.Scanner;

public class FirstComeFirstServe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of processes");
		int noOfProcesses = sc.nextInt();
		int[][] processes = new int[noOfProcesses][2];
		for (int i = 0; i < noOfProcesses; i++) {
			System.out.println("Enter arrival time and burst time for process "
					+ (i + 1));
			for (int j = 0; j < 2; j++) {
				processes[i][j] = sc.nextInt();
			}
		}
		sc.close();
		sortJobs(processes);
		int[] completionTime;
		int[] waitingTime;
		int[] turnAroundTime;

		completionTime = calculateCompletionTime(processes);
		turnAroundTime = calculateTurnAroundTime(processes, completionTime);
		waitingTime = calculateWaitingTime(processes, turnAroundTime);
		System.out.format("\n%-10s %-10s %-15s %-15s %-15s\n", "Arrival",
				"Burst", "Completion", "TurnAround", "Waiting");
		for (int i = 0; i < processes.length; i++) {
			System.out.format("\n%-10s %-10s %-15s %-15s %-15s\n",
					processes[i][0], processes[i][1], completionTime[i],
					turnAroundTime[i], waitingTime[i]);
		}

		int totalWaitingTime = 0;
		for (int aWaitingTime : waitingTime) {
			totalWaitingTime += aWaitingTime;
		}
		float averageWaitingTime = totalWaitingTime / processes.length;
		System.out.println("Average Waiting Time : " + averageWaitingTime);
		int maxWaitingTime = waitingTime[0];
		for (int i = 1; i < waitingTime.length; i++) {
			if (maxWaitingTime < waitingTime[i]) {
				maxWaitingTime = waitingTime[i];
			}
		}
		System.out.println("Maximum Waiting Time : " + maxWaitingTime);

	}

	private static void sortJobs(int[][] processes) {

		for (int i = 0; i < processes.length - 1; i++) {
			for (int j = 0; j < processes.length - i - 1; j++) {
				if (processes[j][0] > processes[j + 1][0]) {
					int arrivalTemp = processes[j][0];
					processes[j][0] = processes[j + 1][0];
					processes[j + 1][0] = arrivalTemp;
					int burstTemp = processes[j][1];
					processes[j][1] = processes[j + 1][1];
					processes[j + 1][1] = burstTemp;

				}
			}
		}
	}

	private static int[] calculateWaitingTime(int[][] processes,
			int[] turnAroundTime) {
		int[] waitingTime = new int[turnAroundTime.length];
		for (int i = 0; i < turnAroundTime.length; i++) {
			waitingTime[i] = turnAroundTime[i] - processes[i][1];
		}
		return waitingTime;
	}

	private static int[] calculateTurnAroundTime(int[][] processes,
			int[] completionTime) {
		int[] turnAroundTime = new int[completionTime.length];
		for (int i = 0; i < completionTime.length; i++) {
			turnAroundTime[i] = completionTime[i] - processes[i][0];
		}
		return turnAroundTime;
	}

	private static int[] calculateCompletionTime(int[][] processes) {
		int[] completionTime = new int[processes.length];
		completionTime[0] = processes[0][1];
		for (int i = 1; i < processes.length; i++) {
			if (processes[i][0] > completionTime[i - 1]) {
				completionTime[i] = processes[i][0] + processes[i][1];
			} else {
				completionTime[i] = completionTime[i - 1] + processes[i][1];
			}
		}
		return completionTime;
	}
}
