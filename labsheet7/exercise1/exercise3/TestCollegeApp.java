package labsheet7.exercise1.exercise3;

//TestCollegeApp.java
/*A driver class to test out the functionality of the Institute, Student and Department
classes*/

import labsheet9.exercise1.Employee;

public class TestCollegeApp {
    public static void main (String[] args) {
        Student s1 = new Student("Jake", 154345, "Computing");
        Student s2 = new Student("Mary", 234532, "Creative Media");
        Student s3 = new Student("Tommy", 453726, "Computing");
        Student s4 = new Student("Peter", 623456, "Creative Media");

        Student computingStudents[] = new Student[10];
        computingStudents[0] = s1;
        computingStudents[1] = s3;

        Student creativeMediaStudents[] = new Student[10];
        creativeMediaStudents[0] = s2;
        creativeMediaStudents[1] = s4;

        Department creativeMedia = new Department("Creative Media", creativeMediaStudents);
        Department computing = new Department("Computing", computingStudents);

        Department departments[] = new Department[5];
        departments[0] = creativeMedia;
        departments[1] = computing;

        Institute institute = new Institute("Institute of Technology, Tralee", departments);

        System.out.println(institute);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudents());

        System.out.println("\n\nJake now moving from the Computing dept to the Creative Media dept");

        //The following code will move Jake the "easy" way :-)
        //creativeMediaStudents[2] = s1;
        //s1.setDept("Creative Media");
        //computingStudents[0] = null;

        //this does it the hard way!

        int creativeMediaSubscript=-1, computingSubscript=-1;

        for(int i=0;i<departments.length;i++) {
            if (departments[i] != null && departments[i].getName().equals("Creative Media"))
                creativeMediaSubscript = i;

            if (departments[i] != null && departments[i].getName().equals("Computing"))
                computingSubscript = i;

        }

        if (creativeMediaSubscript!=-1 && computingSubscript!=-1) {

            Student[] allDeptStudents = departments[computingSubscript].getStudents();

            int j;

            for (j = 0; j < allDeptStudents.length; j++) {
                if (allDeptStudents[j] != null) {
                    if (allDeptStudents[j].getId() == 154345) {
                        System.out.println("\nFound Jake!\n");

                        allDeptStudents[j].setDept("Creative Media");

                        departments[creativeMediaSubscript].getStudents()[2] = allDeptStudents[j];
                        allDeptStudents[j] = null;

                        break;
                    }
                }
            }

            if(j==allDeptStudents.length)
                System.out.println("\nCouldn't find Jake\n");
        }
        System.out.println(institute);
    }
}

/* 	JTextArea textArea = new JTextArea();
					Font textFont = new Font("monospaced",Font.PLAIN ,12);

			     	textArea.setFont(textFont);

					textArea.append(String.format("%10s\n", salaries));

					JOptionPane.showMessageDialog(null,textArea,"Salary Data",
				         JOptionPane.INFORMATION_MESSAGE);*/


/*package problemsolvingweek6.exercisea;

//TestEmployee.java
A driver class to test out the functionality of the Employee, Address and Insurance classes

import labsheet9.exercise1.Employee;

public class TestEmployee {
    public static void main(String[] args) {

        Insurance emp1Insurance = new Insurance("Irish Life Excel 500",5468292);
        Employee employee1 = new Employee("Joseph Bloggs III",536272, new Address("123 Hyde Road","Ballydehob", "Cork","Ireland","R54HT7D"),emp1Insurance);

        Insurance emp2Insurance = new Insurance("AXA Superlative Life",9374633);
        Employee employee2 = new Employee("Marie O Connell",982111, new Address("Boreen na dTonnta","Connemara", "Galway","Ireland","PG52K3B"),emp2Insurance);

        Insurance emp3Insurance = new Insurance("LA Brokers Golden Goose",7372642);
        Employee employee3 = new Employee("Mark Mc Manus",352723, new Address("87 Racecourse Lawn","Tralee", "Kerry","Ireland","AH78P36"),emp3Insurance);


        Employee allEmployees[] = new Employee[5];

        allEmployees[0] = employee1;
        allEmployees[1] = employee2;
        allEmployees[2] = employee3;

        System.out.println("\n\nDisplaying the state of the " + allEmployees.length + " Employee objects at this point\n");

        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println("Employee " + (i + 1) + "\n\n" + allEmployees[i] + "\n\n");
        }

        //Looking for employees whose name contains the word "joseph" and changing the address of that Employee object

        System.out.println("\n\nNow searching through the array of Employee objects to find any employees whose name contains the word 'joseph'");

        String josephList = "";
        int josephSubscript=-1;

        System.out.println("\n\nThe details of all employees whose name contains the word 'joseph' is: ");

        for (int i = 0; i < allEmployees.length; i++)
            if (allEmployees[i] != null && allEmployees[i].getName().toLowerCase().contains("joseph")){
                josephList += allEmployees[i] + "\n\n";
                josephSubscript = i;
            }

        System.out.println("\n\n" + josephList);

        System.out.println("\nNow changing the address of Joseph Bloggs III\n\n");

        allEmployees[josephSubscript].setAddress(new Address("56 Main Street", "Thurles", "Tipperary", "Ireland", "B87JH5Q"));

        System.out.println("\nDisplaying the state of the 'Joseph Bloggs III' employee now gives\n\n" + allEmployees[josephSubscript]);

        System.out.println("\nNow removing the insurance details completely for the second employee object");

        employee2.setInsurance(null);

        System.out.println("\nDisplaying the state of the second employee now gives\n\n" + employee2);

        System.out.println("\nDisplaying the state of the second employee insurance object now gives\n\n" + emp2Insurance);

        String kerryList = "";

        for (int i = 0; i < allEmployees.length; i++)
            if (allEmployees[i] != null && allEmployees[i].getAddress().getCounty().equalsIgnoreCase("Kerry"))
                kerryList += allEmployees[i];

        System.out.println("\nDisplaying the state of all employees who hail from county Kerry\n\n" + kerryList);

        Insurance emp4Insurance = new Insurance("LA Brokers Golden Goose",7372642);
        Employee employee4 = new Employee("Jaimie O Toole",234234, new Address("2 Rock St","Mallow", "Cork","Ireland","YU67R34"),emp4Insurance);

        Insurance emp5Insurance = new Insurance("LA Brokers Golden Goose",7372642);
        Employee employee5 = new Employee("Lara Connolly",568554, new Address("12 Westbrook Drive","Trim", "Meath","Ireland","78TYMDS"),emp5Insurance);

        allEmployees[3] = employee4;
        allEmployees[4] = employee5;

        sortEmployeesByName(allEmployees);

        System.out.println("\n\nDisplaying the state of the " + allEmployees.length + " Employee objects at this point in alphabetical order by name\n");

        for (int i = 0; i < allEmployees.length; i++)
            System.out.println("Employee " + (i + 1) + "\n\n" + allEmployees[i] + "\n\n");

    }

    private static void sortEmployeesByName(Employee[] allEmployees){
        String smallestName;
        int smallestSub;
        Employee;

        for (int i = 0; i < allEmployees.length-1; i++) {
            smallestName = allEmployees[i].getName();
            smallestSub = i;

            for (int j = i + 1; j < allEmployees.length; j++) {
                if (allEmployees[j].getName().compareTo(smallestName) < 0) {
                    smallestName = allEmployees[j].getName();
                    smallestSub = j;
                }
            }

            temp = allEmployees[i];
            allEmployees[i] = allEmployees[smallestSub];
            allEmployees[smallestSub] = temp;
        }
    }



}
*/
