package de.tum.cit.aet;

/**
 * Main class for testing the Lecture implementation.
 */
public class Main {
    
    /**
     * TODO 3: Test your implementation
     * 
     * Instantiate Lecture objects and test the methods to make sure they work properly.
     * Use System.out.println() to print out the return values.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Lecture lecture1 = new Lecture("Introduction to Programming", 100, 50, 3, 10);
        lecture1.addGuestStudents(50);
        System.out.println(lecture1.getNumberOfStudentsPerTutor());
    }
}