package hibernate_student_eb9_prc;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int choice;
		boolean flag = true;

		Student student = new Student();

		StudentCRUD crud = new StudentCRUD();

		do {
			System.out.println(
					"Enter the choice \n 1.Save student \n 2.Update student \n 3.Delete student \n 4.Get student \n 5.Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				System.out.println("Enter the name");
				String name = scanner.next();
				System.out.println("Enter the father's name");
				String fathername = scanner.next();
				System.out.println("Enter the mother's name");
				String mothername = scanner.next();
				System.out.println("Enter the address");
				String address = scanner.next();
				System.out.println("Enter the total marks");
				int totalmarks = scanner.nextInt();
				System.out.println("Enter the percentage");
				double percentage = scanner.nextDouble();

				student.setId(id);
				student.setName(name);
				student.setFathername(fathername);
				student.setMothername(mothername);
				student.setAddress(address);
				student.setTotalmarks(totalmarks);
				student.setPercentage(percentage);

				crud.saveStudent(student);
			}
				break;

			case 2: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();
				System.out.println("Enter the name");
				String name = scanner.next();

				crud.updateStudent(id, name);
			}
				break;

			case 3: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();

				crud.deleteStudent(id);
			}
				break;

			case 4: {
				System.out.println("Enter the id");
				int id = scanner.nextInt();

				crud.getStudent(id);
			}
				break;

			default:
				flag = false;
			}

		} while (flag);

	}

}
