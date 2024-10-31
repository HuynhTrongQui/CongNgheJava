package ex3;

import java.util.List;
public class Program {
    public static void main(String[] args) {
        
        // 1. khởi tạo danh sách sinh viên
        List<Student> list = StudentUtils.generate();
        StudentUtils.print(list);

        // 2. sắp xếp theo tên và in ra kết quả
        StudentUtils.sortByName(list);
        StudentUtils.print(list);

        // 3. sắp xếp tăng dần theo điểm trung bình và in ra kết quả
        StudentUtils.sortByAvg(list);
        StudentUtils.print(list);

     
        // @TODO: sắp xếp giảm dần theo tuổi rồi in kết quả
        StudentUtils.sortByAgeDescending(list);
        StudentUtils.print(list);
       
        // @TODO: tính điểm trung bình của toàn bộ danh sách rồi in kết quả
        double averageScore = StudentUtils.avg(list);
        System.out.println("============ BEGIN ============ ");
        System.out.println("The average score of all students is: " + averageScore);
        System.out.println("============ END ============ ");
        System.out.println();
       
        // @TODO: lấy danh sách TÊN học sinh giỏi rồi in kết quả
        List<String> goodStudents = StudentUtils.goodStudentName(list);
        System.out.println("============ BEGIN ============ ");
        System.out.println("The names of good students are: ");
        for (String name : goodStudents) System.out.println(name);
        System.out.println("============ END ============ ");
    }
}
