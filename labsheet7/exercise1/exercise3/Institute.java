package labsheet7.exercise1.exercise3;

import java.util.Arrays;

public class Institute {
    private String InstituteName;
    private Department[] departments;

    public Institute(String name,Department[] departments)
    {
        setName(InstituteName);
        setDepartments(departments);

    }


    public String toString() {
      String str = "Name: " + getInstituteName() + "\n\nDepartments: ";

        for(int i=0;i<getDepartments().length;i++)
            if(departments[i]!=null)
                str+=departments[i];

        return str;

    }

    public void setName(String InstituteName)
    {
        this.InstituteName=InstituteName;

    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public String getInstituteName() {
        return InstituteName;
    }

    public Department[] getDepartments() {
        return departments;
    }
    public int getTotalStudents()
    {
        int noOfStudents = 0; //assuming there are no students
        Student[] students; // array of studenrs
        for(Department dept : departments)
        {
            if(dept!=null) {
                students = dept.getStudents();
                for (Student s : students) {
                    if(s != null)
                        noOfStudents++;
                }
            }
        }
        return noOfStudents;
    }

}
