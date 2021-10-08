public class StudentManagement {
    Student[] students = new Student[100];
    String[] groups = new String[100];
    int studentSize = 0;
    int groupSize = 0;

    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup().equals(s2.getGroup()));
    }

    public void addStudent(Student newStudent) {
        students[studentSize] = newStudent;
        studentSize++;
    }

    /**
    * this is studentByGroup.
    * @return res
    */

    public String studentsByGroup() {
        String res = "";
        if (studentSize > 0) {
            groups[groupSize] = students[0].getGroup();
            groupSize++;
            for (int i = 0; i < studentSize; i++) {
                int check = 0;
                for (int j = 0; j < groupSize; j++) {
                    if (students[i].getGroup().equals(groups[j])) {
                        ++check;
                        continue;
                    }
                }
                if (check == 0) {
                    groups[groupSize] = students[i].getGroup();
                    groupSize++;
                }
            }
            for (int i = 0; i < groupSize; i++) {
                res += groups[i] + "\n";
                for (int j = 0; j < studentSize; ++j) {
                    if (students[j].getGroup().equals(groups[i])) {
                        res += students[j].getInfo() + "\n";
                    }
                }
            }
        }
        return res;
    }

    /**
    * This is removeStudent.
    * @param id xoa id
    */

    public void removeStudent(String id) {
        for (int i = 0; i < studentSize; i++) {
            if (students[i].getId().equals(id)) {
                for (int j = i; j < studentSize - 1; j++) {
                    students[j] = students[j + 1];
                }
            }
        }
        studentSize--;
    }

    /**
    * this is main.
    * @param args tham so dau vao
    */
}
 
