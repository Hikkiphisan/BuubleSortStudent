public class BubbleSortStudents {
    public static void bubbleSortStudents(Student[] students) {
        boolean swapped; // Biến cờ để kiểm tra hoán đổi
        for (int i = 0; i < students.length - 1; i++) {
            swapped = false; // Đặt cờ hoán đổi thành false ở mỗi lần lặp
            for (int j = 0; j < students.length - 1 - i; j++) {
                // So sánh điểm số
                if (students[j].score < students[j + 1].score) {
                    // Hoán đổi nếu điểm số hiện tại nhỏ hơn điểm số tiếp theo
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    swapped = true; // Đánh dấu rằng đã có hoán đổi
                } else if (students[j].score == students[j + 1].score) {
                    // Nếu điểm số bằng nhau, so sánh họ tên
                    if (students[j].name.compareTo(students[j + 1].name) > 0) {
                        // Hoán đổi nếu tên hiện tại lớn hơn tên tiếp theo
                        Student temp = students[j];
                        students[j] = students[j + 1];
                        students[j + 1] = temp;
                        swapped = true; // Đánh dấu rằng đã có hoán đổi
                    }
                }
            }
            // Nếu không có hoán đổi nào, mảng đã được sắp xếp
            if (!swapped) {
                break; // Dừng lại sớm nếu mảng đã được sắp xếp
            }
        }
    }

}
