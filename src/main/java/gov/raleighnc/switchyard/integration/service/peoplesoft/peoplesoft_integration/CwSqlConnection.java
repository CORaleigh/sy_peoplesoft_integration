package gov.raleighnc.switchyard.integration.service.peoplesoft.peoplesoft_integration;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class CwSqlConnection {
	
	public String createMaterialLeaf(MaterialLeaf materialLeaf) {
		if (materialLeaf != null) {
			Connection conn = null;
			CallableStatement cs = null;
			try {
				InitialContext ctx = new InitialContext();
				DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/CityworksDS");
				conn = ds.getConnection();
				cs = conn.prepareCall("{CALL azteca.materialLeaf_Insert(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }");
				cs.registerOutParameter(1, Types.VARCHAR);  			// MATERIALLEAF SID
				cs.setString(2, materialLeaf.getMaterialUID()); 		// MATERIAL UID
				
				if (materialLeaf.getPartNumber() != null){
					cs.setString(3, materialLeaf.getPartNumber());
				} else {
					cs.setNull(3, Types.VARCHAR);
				}
				if (materialLeaf.getDescription() != null){
					cs.setString(4, materialLeaf.getDescription());
				} else {
					cs.setNull(4, Types.VARCHAR);
				}					
				if (materialLeaf.getManufacturer() != null){
					cs.setString(5, materialLeaf.getManufacturer());
				} else {
					cs.setNull(5, Types.VARCHAR);
				}		
				if (materialLeaf.getDetail() != null){
					cs.setString(6, materialLeaf.getDetail());
				} else {
					cs.setNull(6, Types.VARCHAR);
				}
				if (materialLeaf.getModel() != null){
					cs.setString(7, materialLeaf.getModel());
				} else {
					cs.setNull(7, Types.VARCHAR);
				}
				if (materialLeaf.getCostType() != null){
					cs.setString(8, materialLeaf.getCostType());
				} else {
					cs.setNull(8, Types.VARCHAR);
				}
				if (materialLeaf.getAuditInterval() != null){
					cs.setString(9, materialLeaf.getAuditInterval());
				} else {
					cs.setNull(9, Types.VARCHAR);
				}
				if (materialLeaf.getMinQuantity() >= 0){
					cs.setInt(10, materialLeaf.getMinQuantity());
				} else {
					cs.setNull(10, Types.INTEGER);
				}
				if (materialLeaf.getSupplier() != null){
					cs.setString(11, materialLeaf.getSupplier());
				} else {
					cs.setNull(11, Types.VARCHAR);
				}
				if (materialLeaf.getUnitCost() >= 0){
					cs.setDouble(12, materialLeaf.getUnitCost());
				} else {
					cs.setNull(12, Types.DECIMAL);
				}
				if (materialLeaf.getUnitOfMeasure() != null){
					cs.setString(13, materialLeaf.getUnitOfMeasure());
				} else {
					cs.setNull(13, Types.VARCHAR);
				}
				cs.setNull(14,  Types.VARCHAR);							// DefaultImgPath
				cs.setNull(15,  Types.VARCHAR);							// CUCategory
				cs.setNull(16,  Types.VARCHAR);							// GDBSubType
				cs.setBoolean(17, materialLeaf.isViewable());
				if (materialLeaf.getMsrNumber() >= 0){
					cs.setDouble(18, materialLeaf.getMsrNumber());
				} else {
					cs.setNull(18, Types.DECIMAL);
				}
				cs.setNull(19,  Types.DECIMAL);							// Custom2
				if (materialLeaf.getPsftFamilyField() != null) {
					cs.setString(20, materialLeaf.getPsftFamilyField());	
				} else {
					cs.setNull(20, Types.VARCHAR);
				}
				cs.setNull(21,  Types.VARCHAR);							// Custom4
				cs.setNull(22,  Types.VARCHAR);							// Custom5
				
				cs.execute();

				return "Success: New CW Material UID " + materialLeaf.getMaterialUID() + " added.";
			} catch(SQLException sqle){
				
				try {
					// close out any connection, will re-establish 
					if (cs != null) {
						cs.close();
					} 
					if (conn != null) {
						conn.close();
					}
					
					// try to update
					InitialContext ctx = new InitialContext();
					DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/CityworksDS");
					conn = ds.getConnection();
					Statement stmt = conn.createStatement();
					String sql = "SELECT MaterialSID, DefaultImgPath, GdbTableName, CUCategory FROM azteca.MaterialLeaf WHERE MaterialUID = '" + materialLeaf.getMaterialUID() + "'";
					ResultSet rs = stmt.executeQuery(sql);
//					if (rs.next())
//						System.out.println("Found MaterialSID="+rs.getInt("MaterialSID"));
//					else
//						System.out.println("Not found");
//					cs = conn.prepareCall("{CALL azteca.materialLeaf_SelByMatUID(?, ?) }");
//					cs.setNString("MaterialUID", materialLeaf.getMaterialUID());
//					cs.setBoolean("ViewableOnly", false);
//					
//					boolean success = cs.execute();
//					System.out.println("uid found");
//					ResultSet rs = cs.executeQuery();
					
					if (rs != null && rs.next()) {
						// should only be one row
						int sid = rs.getInt("MaterialSID");
	//					String pn = rs.getString(3);
	//					String desc = rs.getString(4);
	//					String manf = rs.getString(5);
	//					String detail = rs.getString(6);
	//					String model = rs.getString(7);
	//					String ct = rs.getString(8);
	//					String ai = rs.getString(9);
	//					int minq = rs.getInt(10);
	//					String supplier = rs.getString(11);
	//					double uc = rs.getDouble(12);
	//					String um = rs.getString(13);
						String dip = rs.getString("DefaultImgPath");
						String cucat = rs.getString("GdbTableName");
						String gdbsub = rs.getString("CUCategory");
	//					boolean viewable = rs.getBoolean(17);
	//					double msr = rs.getDouble(18);
	//					String psftFamily = rs.getString(20);
						
						
						// prepare update call
						cs = conn.prepareCall("{CALL azteca.materialLeaf_Update(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }");
						cs.setInt(1, sid);
						cs.setString(2, materialLeaf.getMaterialUID());
						if (materialLeaf.getPartNumber() != null){
							cs.setString(3, materialLeaf.getPartNumber());
						} else {
							cs.setNull(3, Types.VARCHAR);
						}
						if (materialLeaf.getDescription() != null){
							cs.setString(4, materialLeaf.getDescription());
						} else {
							cs.setNull(4, Types.VARCHAR);
						}					
						if (materialLeaf.getManufacturer() != null){
							cs.setString(5, materialLeaf.getManufacturer());
						} else {
							cs.setNull(5, Types.VARCHAR);
						}		
						if (materialLeaf.getDetail() != null){
							cs.setString(6, materialLeaf.getDetail());
						} else {
							cs.setNull(6, Types.VARCHAR);
						}
						if (materialLeaf.getModel() != null){
							cs.setString(7, materialLeaf.getModel());
						} else {
							cs.setNull(7, Types.VARCHAR);
						}
						if (materialLeaf.getCostType() != null){
							cs.setString(8, materialLeaf.getCostType());
						} else {
							cs.setNull(8, Types.VARCHAR);
						}
						if (materialLeaf.getAuditInterval() != null){
							cs.setString(9, materialLeaf.getAuditInterval());
						} else {
							cs.setNull(9, Types.VARCHAR);
						}
						if (materialLeaf.getMinQuantity() >= 0){
							cs.setInt(10, materialLeaf.getMinQuantity());
						} else {
							cs.setNull(10, Types.INTEGER);
						}
						if (materialLeaf.getSupplier() != null){
							cs.setString(11, materialLeaf.getSupplier());
						} else {
							cs.setNull(11, Types.VARCHAR);
						}
						if (materialLeaf.getUnitCost() >= 0){
							cs.setDouble(12, materialLeaf.getUnitCost());
						} else {
							cs.setNull(12, Types.DECIMAL);
						}
						if (materialLeaf.getUnitOfMeasure() != null){
							cs.setString(13, materialLeaf.getUnitOfMeasure());
						} else {
							cs.setNull(13, Types.VARCHAR);
						}
						if (dip != null){
							cs.setString(14, dip);
						} else {
							cs.setNull(14, Types.VARCHAR);
						}
						if (cucat != null){
							cs.setString(15, cucat);
						} else {
							cs.setNull(15, Types.VARCHAR);
						}
						if (gdbsub != null){
							cs.setString(16, gdbsub);
						} else {
							cs.setNull(16, Types.VARCHAR);
						}
						cs.setBoolean(17, materialLeaf.isViewable());
						if (materialLeaf.getMsrNumber() >= 0){
							cs.setDouble(18, materialLeaf.getMsrNumber());
						} else {
							cs.setNull(18, Types.DECIMAL);
						}
						cs.setNull(19,  Types.DECIMAL);							// Custom2
						if (materialLeaf.getPsftFamilyField() != null) {
							cs.setString(20, materialLeaf.getPsftFamilyField());	
						} else {
							cs.setNull(20, Types.VARCHAR);
						}
						cs.setNull(21,  Types.VARCHAR);							// Custom4
						cs.setNull(22,  Types.VARCHAR);							// Custom5
						
						cs.execute();
						return "Success: CW Material UID " + materialLeaf.getMaterialUID() + " has been updated.";
					}
				
				} catch (Exception e) {
					// return error message
					return "Error: " + e.getMessage();
				}
			}
			catch (Exception e) {
				// return error message
				return "Error: " + e.getMessage();
			} finally {
				if (cs != null) {
					try {
						cs.close();
					} catch (SQLException sqle) {
						// Can't do much here
					}
				}
					
				if (conn != null) {
					try {
						conn.close(); 
					} catch (SQLException sqle) {
						// Can't do much here							
					}
				}						
			}
		}
		
		return "Error: MaterialLeaf passed in was null";
	}

}
