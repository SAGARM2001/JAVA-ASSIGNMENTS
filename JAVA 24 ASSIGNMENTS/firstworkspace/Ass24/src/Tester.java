import java.sql.*;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws Exception {
		// connect kela database ithe
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/st_details", "root", "Sagar@2001");
		Statement stmt = conn.createStatement();

		// menu no ghenya sathi banvla
		int choice;
		while (true) {
			System.out.println("1. Insert record");
			System.out.println("2. Update record");
			System.out.println("3. Delete record");
			System.out.println("4. Display particular record");
			System.out.println("5. Display all records");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			// choice input ghetli user kadun
			Scanner sc = new java.util.Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.println("------------Add the deatils--------------");
				System.out.print("Enter Roll No:");
				int roll = sc.nextInt();
				System.out.print("Enter Name:");
				String name = sc.next();
				System.out.print("Enter Percentage:");
				double percentage = sc.nextDouble();

				// values insert kelya ahet ithe
				String query = "INSERT INTO student VALUES (?, ?, ?)";
				PreparedStatement pstmt = conn.prepareStatement(query);
				pstmt.setInt(1, roll);
				pstmt.setString(2, name);
				pstmt.setDouble(3, percentage);
				pstmt.execute();
				System.out.println("Deatils inserted successfully!!");
				System.out.println("..........................");
				break;
			case 2:
				System.out.println("------------Update the deatils--------------");
				// rollno input ghetla ani tya basis var update hoel data
				System.out.print("Enter Roll No:");
				int roll_no = sc.nextInt();

				System.out.print("Enter new Percentage: ");
				double percent = sc.nextDouble();

				System.out.print("Enter new Name: ");
				String newname = sc.next();

				System.out.print("Enter new Rollno: ");
				int newroll = sc.nextInt();

				String query1 = "UPDATE student SET percentage = ? , name = ?, rollno = ? WHERE rollno = ?";
				PreparedStatement pstmt1 = conn.prepareStatement(query1);
				pstmt1.setDouble(1, percent);
				pstmt1.setString(2, newname);
				pstmt1.setInt(3, newroll);
				pstmt1.setInt(4, roll_no);
				boolean status = pstmt1.execute();
				if (!status)
					System.out.println("Details Updated Successfully!!");
				System.out.println("..........................");
				break;
			case 3:
				System.out.println("------------Delete the deatils--------------");
				System.out.print("Enter Roll No:");
				int delroll = sc.nextInt();
				String query2 = "DELETE FROM student where rollno = ?";
				PreparedStatement pstmt2 = conn.prepareStatement(query2);
				pstmt2.setInt(1, delroll);
				boolean status1 = pstmt2.execute();
				if (!status1)
					System.out.println("Details Deleted Successfully!!");
				System.out.println("..........................");
				break;
			case 4:
				System.out.println("------------Display the deatils--------------");
				System.out.print("Enter Roll No:");
				int disroll = sc.nextInt();
				String query3 = "SELECT * FROM student where rollno = ?";
				PreparedStatement pstmt3 = conn.prepareStatement(query3);
				pstmt3.setInt(1, disroll);
				ResultSet rset = pstmt3.executeQuery();
				if (rset.next()) {
					System.out.println("Roll No: " + rset.getInt("rollno"));
					System.out.println("Name: " + rset.getString("name"));
					System.out.println("Percentage: " + rset.getDouble("percentage"));
					System.out.println("Details Displayed Successfully!!");
					System.out.println("..........................");
				} else {
					System.out.println("Details were not found of these roll no");
				}
				break;
			case 5:
				System.out.println("------------Display the deatils--------------");
				String query4 = "SELECT * FROM student";
				ResultSet rset2 = stmt.executeQuery(query4);
				while (rset2.next()) {
					System.out.println("Roll No: " + rset2.getInt("rollno"));
					System.out.println("Name: " + rset2.getString("name"));
					System.out.println("Percentage: " + rset2.getDouble("percentage"));
					System.out.println("-----------------------");
				}
				break;
			case 6:
				System.exit(0);
			}
		}
	}
}
