package com.example.project;

class StudentRunner{
    public static void main(String[] args) {
        //use this StudentRunner class if you need to test your code 

        Student now = new Student("First", "Second", 2026);

        now.addTestScore(90);
        now.addTestScore(99);

        System.out.println(now.getHighestTestScore());
        System.out.println(now.getTestScoreCount());
    }
}