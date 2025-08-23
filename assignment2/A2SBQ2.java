package assignment2;

class A2SBQ2  {
    String name;
    double salary;

    A2SBQ2 (String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}

class Developer extends A2SBQ2  {
    String projectName;

    Developer(String name, double salary, String projectName) {
        super(name, salary);
        this.projectName = projectName;
    }

    void displayDeveloperDetails() {
        displayEmployeeDetails();
        System.out.println("Project Name: " + projectName);
    }
}

class Programmer extends Developer {
    String progLanguage;

    Programmer(String name, double salary, String projectName, String progLanguage) {
        super(name, salary, projectName);
        this.progLanguage = progLanguage;
    }

    void displayProgrammerDetails() {
        displayDeveloperDetails();
        System.out.println("Programming Language: " + progLanguage);
    }



    public static void main(String[] args) {
        Developer dev = new Developer("Priya Sharma", 85000.0, "SmartCity App");
        System.out.println("=== Developer Details ===");
        dev.displayDeveloperDetails();
    }
}