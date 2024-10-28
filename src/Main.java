public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 85.5),
                new Student("Bob", 92.0),
                new Student("Charlie", 85.5),
                new Student("David", 75.0),
                new Student("Eve", 92.0)
        };

        System.out.println("Trước khi sắp xếp:");
        for (Student student : students) {
            System.out.println(student);
        }

        BubbleSortStudents.bubbleSortStudents(students);

        System.out.println("\nSau khi sắp xếp theo điểm số và họ tên:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
