package com.smartbill360.modules.consignee.service;

import java.util.List;

import com.smartbill360.modules.consignee.dto.ConsigneeRegModel;
import com.smartbill360.modules.consignee.dto.UpdateConsigneeModel;
import com.smartbill360.modules.consignee.entity.Consignee;
import com.smartbill360.modules.consignee.exception.ConsigneeNotFoundException;
import com.smartbill360.modules.consignee.exception.GSTAlreadyExistedException;

import jakarta.validation.Valid;

public interface ConsigneeService {

    Consignee createConsignee(@Valid ConsigneeRegModel model) throws GSTAlreadyExistedException;

    Consignee getConsigneeById(Integer consigneeId) throws ConsigneeNotFoundException;

    Consignee getConsigneeByIdAndStatus(Integer consigneeId, boolean isActive) throws ConsigneeNotFoundException;

    Consignee deactivateConsignee(Integer consigneeId) throws ConsigneeNotFoundException;

    Consignee updateConsignee(Integer consigneeId, @Valid UpdateConsigneeModel model) throws ConsigneeNotFoundException;

    List<Consignee> getAllConsignee();

    Consignee getConsigneeByGST(String gst) throws ConsigneeNotFoundException;

    List<Consignee> searchConsigneeByNameSubstring(String keyword);
}
