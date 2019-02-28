import java.sql.*;

class student{
	public static void main(String[]args){
		try{
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			String dburl="jdbc:mysql://localhost:3306/student";
			String username="root";
			String password="1234";
			//get connection
			Connection myConnection=DriverManager.getConnection(dburl,username,password);
			//create a statement object
			Statement myStatement=myConnection.createStatement();
			//execute query
			ResultSet myResultSet=myStatement.executeQuery("Select * from students");
			//get the result
			while(myResultSet.next()){
				System.out.println("Student Full Name :"+myResultSet.getString("firstname")+" "+myResultSet.getString("lastname"));
			}		
		}catch(Exception e){
			System.out.println(e.getMessage());		
		}
	}
}
