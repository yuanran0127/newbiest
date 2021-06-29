package com.newbiest.gc.rest.rw.manager;

import com.newbiest.msg.Request;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel
public class RwMaterialLotRequest extends Request {

	private static final long serialVersionUID = 1L;
	
	public static final String MESSAGE_NAME = "GCRwMLotManager";

	public static final String ACTION_QUERY_PRINT_PARAMETER = "getPrintParameter";

	public static final String ACTION_RECEIVE_PACKEDLOT = "RWReceivePackedLot";

	public static final String ACTION_PRINT_LOT_LABEL = "GetLotPrintLabel";

	public static final String ACTION_AUTO_PICK = "AutoPick";

	public static final String ACTION_STOCK_OUT_TAG = "StockOutTag";

	public static final String ACTION_UN_STOCK_OUT_TAG = "UnStockOutTag";
	
	public static final String ACTION_ADD_SHIP_ORDERID = "AddShipOrderId";

	public static final String ACTION_QUERY_MLOT = "QueryMLot";

	public static final String ACTION_STOCK_OUT = "StockOut";

	public static final String ACTION_GET_RW_PRINT_PARAMETER = "RWBoxPrint";

	public static final String ACTION_GET_RW_STOCK_OUT = "RWStockOutPrint";

	private RwMaterialLotRequestBody body;

}