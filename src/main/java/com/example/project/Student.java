package com.example.project;

public class Student {
    // instance variables for 
    // first name (String)
    // last name (String)
    // graduation year (int)
    // sum of test scores (double).. should initialize at 0.0
    // test score count (int) ..should initialize at 0
    // highest test score (double).. should initialize at 0.0

    private String firstName;
    private String lastName;
    private int gradYear;
    private double accumulatedTestScores = 0.0;
    private int testScoreCount = 0;
    private double highestTestScores = 0.0;
 
    // constructor
    public Student(String firstName, String lastName, int gradYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
    }
 
    // returns firstName
    public String getFirstName() {
        return firstName;
    }
 
    // returns lastName
    public String getLastName() {
        return lastName;
    }
 
    public double getHighestTestScore() {
        return highestTestScores;
    }

    public int getTestScoreCount(){
        //implement code here!
        return testScoreCount;
    }

    public int getGradYear(){
        return gradYear;
    }
 
    // sets gradYear to newGradYear
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }
 
    // adds newTestScore to accumulatedTestScores
    // and increments testScoreCount by 1
    // set new highest test score 
    public void addTestScore(double newTestScore) {
        //implement code here!
        accumulatedTestScores += newTestScore;
        testScoreCount++;
        if (newTestScore > highestTestScores)
        {
            highestTestScores = newTestScore;
        }
    }
 
    // returns true if the student's average test score is greater
    // than or equal to 65; returns false otherwise (see Note 2 below)
    public boolean isPassing() {
        //implement code here!
        return ((accumulatedTestScores / testScoreCount) >= 65);
        
    }
 
    // returns the Student's average test score as the
    // quotient of accumulatedTestScores and testScoreCount
    public double averageTestScore() {
        //implement code here!
        return accumulatedTestScores / testScoreCount;
    }
 
    // this method prints all info of a Student object to the console 
    // I AM NOT TESTING YOU ON THIS METHOD. IT'S FOR YOUR TESTING PURPOSES ONLY.. you don't have to use it
    public void printStudentInfo() {
        System.out.println("Student Full Name: " );
        System.out.println("Graduation Year: ");
        System.out.println("Number of tests: ");
        System.out.println("Average Test Score: ");
        System.out.println("Highest Test Score: ");
        System.out.println("Is passing: ");
    }
 }
 