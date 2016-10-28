package task;
import java.sql.*;

public  class XYZ {
	private Connection conn;

	public XYZ()throws Exception {
		//Class.forName("com.msql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/task";
		String uName="root";
		String pass ="";

		 conn = DriverManager.getConnection(url,uName,pass);
		 System.out.println("DB connection successful to: " + url);
	}
			public void search_product(product product){
				try{
					
					PreparedStatement st = conn.prepareStatement("select * from product where manufacturer=?");
					st.setString(1, product.getManufacturer());
					ResultSet rs=st.executeQuery();
					while(rs.next()){
						String data ="ID= "+rs.getString("ID")+", Type= "+rs.getString("type")+", Manufacturer= "+rs.getString("manufacturer")+", Production Date= "+rs.getString("productionDate")+", Expiry Date= "+rs.getString("expiryDate");
						System.out.println(data);
					}
			
						
						st.close();
						conn.close();
						}
						catch (Exception exc){
							exc.printStackTrace();
						} 
				}

			public void insert_product(product product){
				try{		
			PreparedStatement st = conn.prepareStatement("insert into product (ID,type,manufacturer,productionDate,expiryDate) values  (?,?,?,?,?)");
			st.setInt(1, product.getID());
			st.setString(2, product.getType());
			st.setString(3, product.getManufacturer());
			st.setString(4, product.getProductionDate());
			st.setString(5, product.getExpiryDate());
			
			int i = st.executeUpdate();
			if (i > 0) {
				System.out.println("Product was successfully added");
			}
			else {
				System.out.println("Product was not added");
			}
			st.close();
		conn.close();
		}
		
		catch (Exception exc) {
			exc.printStackTrace();
		}
			
			}
			
			public void update_product(product product){
				try{
					PreparedStatement st = conn.prepareStatement("update product set type=?, manufacturer=?, productionDate=?, expiryDate=? where ID=?");
					st.setInt(5, product.getID());
					st.setString(4,product.getExpiryDate());
					st.setString(3,product.getProductionDate());
					st.setString(2, product.getManufacturer());
					st.setString(1, product.getType());
					int i=st.executeUpdate();
					if (i > 0) {
						System.out.println("Product was successfully updated!");
					}
					else {
						System.out.println("Product was not updated!");
					}
					st.close();
					conn.close();
				}
				
				
				catch (Exception exc){
					exc.printStackTrace();
				}
				

			}
			
			public void delete_product(product  product){
				try{
			PreparedStatement st = conn.prepareStatement("delete from product where ID=? ");
			st.setInt(1, product.getID());
			int i=st.executeUpdate();
			if (i > 0) {
				System.out.println("Product was successfully deleted!");
			}
			else {
				System.out.println("Product was not deleted!");
			}
			st.close();
			conn.close();
		
			}
			catch (Exception exc){
				exc.printStackTrace();
			}
			

		}

		
}
			