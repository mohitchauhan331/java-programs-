#include<iostream>
using namespace std;

void findWaitingTime(int processes[], int n, int bt[], int wt[]) {
    wt[0] = 0;
    for (int i = 1; i < n; i++)
        wt[i] = bt[i - 1] + wt[i - 1];
}

void findTurnaroundTime(int processes[], int n, int bt[], int wt[], int tat[]) {
    for (int i = 0; i < n; i++)
        tat[i] = bt[i] + wt[i];
}

void findAverageTimes(int processes[], int n, int bt[]) {
    int wt[n], tat[n];
    findWaitingTime(processes, n, bt, wt);
    findTurnaroundTime(processes, n, bt, wt, tat);
    float avgWaitTime = 0, avgTurnaroundTime = 0;
    for (int i = 0; i < n; i++) {
        avgWaitTime += wt[i];
        avgTurnaroundTime += tat[i];
    }
    avgWaitTime /= n;
    avgTurnaroundTime /= n;
    cout << "Average Waiting Time: " << avgWaitTime << endl;
    cout << "Average Turnaround Time: " << avgTurnaroundTime << endl;
}

int main() {
    int n;
    cout << "Enter the number of processes: ";
    cin >> n;
    int processes[n], burstTime[n];
    cout << "Enter the burst time for each process:" << endl;
    for (int i = 0; i < n; i++) {
        cout << "Process " << i + 1 << ": ";
        cin >> burstTime[i];
        processes[i] = i + 1;
    }
    findAverageTimes(processes, n, burstTime);
    return 0;
}

