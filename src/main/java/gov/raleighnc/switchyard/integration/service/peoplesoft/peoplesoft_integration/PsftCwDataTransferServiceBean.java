package gov.raleighnc.switchyard.integration.service.peoplesoft.peoplesoft_integration;

import javax.inject.Inject;

import org.switchyard.component.bean.Reference;
import org.switchyard.component.bean.Service;

@Service(PsftCwDataTransferService.class)
public class PsftCwDataTransferServiceBean implements PsftCwDataTransferService {

	@Inject
	@Reference
	private PsftService psftService;

	//private CwService cwService;
	
	@Override
	public void test() {
		// test method for scheduler
		System.out.println("calling method 'test'");
	}

	@Override
	public void updateCwMaterials() {
		try {			
			// get items
			// TODO - roll back date to 1900; change cron
			ItemsList items = psftService.getNewMaterialItemsList("2014-04-01");
			
			// test print
			System.out.println("items:[ ");
			for (Item item: items.getItems()){
				System.out.println(item);
			}
			System.out.println("]");	
			
			if (items != null){
				for (Item item: items.getItems()){
					MaterialLeaf ml = new MaterialLeaf(
							1,
							item.getMaterialUID(),
							"",
							item.getDescription(),
							item.getManufacturer(),
							"",
							"",
							-1,
							item.getUnitCost(),
							"",
							item.getDetail(),
							item.getUnitOfMeasure(),
							"",
							"",
							item.isViewable(),
							-1.0,
							item.getFamilyField()
							);
					
					// test print
					System.out.println();
					System.out.println("creating material leaf object: " + ml.toString());
					
					
					CwSqlConnection cwSqlConn = new CwSqlConnection();
					
					String result = cwSqlConn.createMaterialLeaf(ml);
					System.out.println(result);
					
//					Result result = createMaterialLeaf(ml);
//					if (result != null && result.isSuccess()) {
//						System.out.println(result.getMessage() + " material leaf stored");
//					}
				}
			}
		} catch (Exception ex){
			System.out.println(ex);
		}
		

	}

//	private Result createMaterialLeaf(MaterialLeaf materialLeaf) {
//		if (materialLeaf != null) {
//			Connection conn = null;
//			CallableStatement cs = null;
//			try {
//				InitialContext ctx = new InitialContext();
//				DataSource ds = (DataSource) ctx.lookup("java:jboss/datasources/CityworksDS");
//				conn = ds.getConnection();
//				cs = conn.prepareCall("{CALL azteca.materialLeaf_Insert(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }");
//				cs.registerOutParameter(1, Types.VARCHAR);  			// MATERIALLEAF SID
//				cs.setString(2, materialLeaf.getMaterialUID()); 		// MATERIAL UID
//				cs.setString(3, materialLeaf.getPartNumber());			// Part Number
//				cs.setString(4,  materialLeaf.getDescription()); 		// Description
//				cs.setString(5, materialLeaf.getManufacturer());		// Manufacturer
//				cs.setString(6, materialLeaf.getSupplier()); 			// Supplier
//				cs.setString(7, materialLeaf.getModel()); 				// Model
//				cs.setInt(8, materialLeaf.getMinQuantity()); 			// Min Quantity
//				cs.setDouble(9, materialLeaf.getUnitCost()); 			// Unit Cost
//				cs.setString(10, materialLeaf.getCostType());			// Cost Type
//				cs.setString(11, materialLeaf.getDetail());				// Detail
//				cs.setString(12, materialLeaf.getUnitOfMeasure());		// Unit of Measure
//				cs.setString(13, materialLeaf.getAuditInterval());		// Audit Interval
//				cs.setNull(14,  Types.DECIMAL);							// Custom1 - MSR Number
//				cs.setNull(15,  Types.DECIMAL);							// Custom2
//				cs.setString(16, materialLeaf.getPsftFamilyField());	// Custom3 - PSFT Family Field
//				cs.setNull(17,  Types.VARCHAR);							// Custom4
//				cs.setNull(19,  Types.VARCHAR);							// Custom5
//				cs.setNull(20,  Types.VARCHAR);							// DefaultImgPath
//				cs.setNull(21,  Types.VARCHAR);							// GDBTableName
//				cs.setNull(22,  Types.VARCHAR);							// CUCategory
//				cs.setNull(23,  Types.VARCHAR);							// GDBSubType
//				
//				cs.execute();
//
//				return new Result(true, cs.getString(1), null);
//			} catch (Exception e) {
//				// return error message
//				return new Result(false, null, e.getMessage());
//			} finally {
//				if (cs != null) {
//					try {
//						cs.close();
//					} catch (SQLException sqle) {
//						// Can't do much here
//					}
//				}
//					
//				if (conn != null) {
//					try {
//						conn.close(); 
//					} catch (SQLException sqle) {
//						// Can't do much here							
//					}
//				}						
//			}
//		}
//		
//		return new Result(false, null, "The material leaf passed in was null.");
//	}

}
