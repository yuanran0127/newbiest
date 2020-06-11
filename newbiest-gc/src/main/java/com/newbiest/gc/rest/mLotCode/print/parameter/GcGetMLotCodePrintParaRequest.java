package com.newbiest.gc.rest.mLotCode.print.parameter;

import com.newbiest.msg.Request;
import io.swagger.annotations.ApiModel;
import lombok.Data;

@Data
@ApiModel
public class GcGetMLotCodePrintParaRequest extends Request {

	private static final long serialVersionUID = 1L;
	
	public static final String MESSAGE_NAME = "GCGetMLotCodePrintParamter";

	private GcGetMLotCodePrintParaRequestBody body;

}
