package org.example;

public class Main {
    public static void main(String[] args) {

        Process[] FCFSSchedule = new Process[5];

        FCFSSchedule[0] = new Process(1,2,2);
        FCFSSchedule[1] = new Process(2,1,1);
        FCFSSchedule[2] = new Process(3,8,4);
        FCFSSchedule[3] = new Process(4,4,2);
        FCFSSchedule[4] = new Process(5,5,3);
        System.out.println("----------FCFS----------");
        System.out.println("Process ID | Waiting Time | Turnaround Time");
        calculate(FCFSSchedule);

        Process[] SJFSchedule = new Process[5];
        SJFSchedule[0] = new Process(2,1,1);
        SJFSchedule[1] = new Process(1,2,2);
        SJFSchedule[2] = new Process(4,4,2);
        SJFSchedule[3] = new Process(5,5,3);
        SJFSchedule[4] = new Process(3,8,4);
        System.out.println("----------SFJ----------");
        System.out.println("Process ID | Waiting Time | Turnaround Time");
        calculate(SJFSchedule);




    }

    public static void calculate(Process[] p){
        double currentTime = 0;
        double waitTime = 0;
        for (Process curr : p) {
            System.out.println(curr.getProcessId() + "\t\t|\t\t" + currentTime + "\t\t|\t\t" + (curr.getBurstTime() + currentTime));
            currentTime += curr.getBurstTime();
            waitTime += currentTime - curr.getBurstTime();
        }
        System.out.println(waitTime);
        System.out.println("Average wait time = " + (waitTime / p.length));
    }



}