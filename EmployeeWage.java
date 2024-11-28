import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ram", 123);
        Random r = new Random();
        int i = (r.nextInt(1000)) % 3;
        switch (i) {
            case 1 -> e1.attendance(true);
            case 2 -> {
                e1.attendance(true);
                System.out.println("Part time today");
                e1.normalWorkDay = 4;
            }

            default -> e1.attendance(false);
        }
        e1.calculateWage();
    }
}
/*
 * Git Procedure
 * Step by step in terminal
 * git init (it initializes git inside your current folder): Done one time at
 * the beginning of the oroject
 * Stage - Staging
 * We have to Select the files which we want to keep a record of or keep a track
 * of or the files which are to be used int he current situation
 * To select the files the procedure to select files is called staging and to
 * mark the files which are to be stored, we use git add <FileName>
 * to check the status, we use: git status
 * Storing the files inside the system - to store the files which are staged, we
 * have to use a command called git commit- but remember always a commit must be
 * followed by a message, without commit message we are not allowed to save the
 * code
 * commit message must be minimum
 * // * Changing master branch to main because master gives rise to derogatory
 * terms such as Slaves
 * Next: Change we will be renaming master to main (only 1 time)
 * 
 * We have to provide the remote repository link and save it inside a keyword
 * 
 * git remote add origin <URL>
 * git checkout is used to exit branch and enter other branch
 * git checkout -b is used to create a new branch and then enter
 * 
 * After you have worked in the other branch and everything is working
 * correctly,merge the branch in the branch
 * the merge actually takes place only in the current local branch but you will
 * be have to push too.
 */