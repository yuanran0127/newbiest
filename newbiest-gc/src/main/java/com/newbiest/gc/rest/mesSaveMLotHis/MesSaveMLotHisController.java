package com.newbiest.gc.rest.mesSaveMLotHis;

import com.newbiest.base.exception.ClientException;
import com.newbiest.base.rest.AbstractRestController;
import com.newbiest.gc.service.GcService;
import com.newbiest.mms.model.MaterialLot;
import com.newbiest.mms.model.MaterialLotUnit;
import com.newbiest.msg.Request;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * GlaxyCore MES记录MLot历史
 */
@RestController
@RequestMapping("/gc")
@Slf4j
@Api(value="/gc", tags="gc客制化接口", description = "GalaxyCore客制化接口")
public class MesSaveMLotHisController extends AbstractRestController {

    @Autowired
    GcService gcService;

    @ApiOperation(value = "物料批记录历史", notes = "记录物料、晶圆历史")
    @ApiImplicitParam(name="request", value="request", required = true, dataType = "MesSaveMLotHisRequest")
    @RequestMapping(value = "/mLotSaveHisManager", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public MesSaveMLotHisResponse execute(@RequestBody MesSaveMLotHisRequest request) throws Exception {
        MesSaveMLotHisResponse response = new MesSaveMLotHisResponse();
        response.getHeader().setTransactionId(request.getHeader().getTransactionId());
        MesSaveMLotHisResponseBody responseBody = new MesSaveMLotHisResponseBody();

        MesSaveMLotHisRequestBody requestBody = request.getBody();
        String actionType = requestBody.getActionType();
        String transId = requestBody.getTransId();
        if (MesSaveMLotHisRequest.ACTION_SAVE_MLOT_HIS.equals(actionType)) {
            List<MaterialLot> materialLotList = requestBody.getMaterialLots();
            String message = gcService.mesSaveMaterialLotHis(materialLotList, transId);
            response.setMessage(message);
        } else if (MesSaveMLotHisRequest.ACTION_SAVE_MLOTUNIT_HIS.equals(actionType)) {
            List<MaterialLotUnit> materialLotUnitList = requestBody.getMaterialLotUnits();
            String message = gcService.mesSaveMaterialLotUnitHis(materialLotUnitList, transId);
            response.setMessage(message);
        } else if(MesSaveMLotHisRequest.ACTION_RECEIVE_RAW_MATERIAL.equals(actionType)){
            List<MaterialLot> materialLotList = requestBody.getMaterialLots();
            String message = gcService.mesReceiveRawMaterialAndSaveHis(materialLotList, transId);
            response.setMessage(message);
        } else if(MesSaveMLotHisRequest.ACTION_IRA_RETURN.equals(actionType)){
            List<MaterialLot> materialLotList = requestBody.getMaterialLots();
            String message = gcService.mesIraMaterialReturnWarehouse(materialLotList, transId);
            response.setMessage(message);
        } else {
            throw new ClientException(Request.NON_SUPPORT_ACTION_TYPE + requestBody.getActionType());
        }
        return response;
    }

}