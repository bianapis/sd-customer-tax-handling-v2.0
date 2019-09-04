package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementExecuteOutputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementExecuteOutputModel   {
  private String customerTaxObligationFulfillmentArrangementExecuteActionTaskReference = null;

  private Object customerTaxObligationFulfillmentArrangementExecuteActionTaskRecord = null;

  private String executeRecordReference = null;

  private Object executeResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Tax Obligation Fulfillment Arrangement instance execute service call 
   * @return customerTaxObligationFulfillmentArrangementExecuteActionTaskReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementExecuteActionTaskReference() {
    return customerTaxObligationFulfillmentArrangementExecuteActionTaskReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementExecuteActionTaskReference(String customerTaxObligationFulfillmentArrangementExecuteActionTaskReference) {
    this.customerTaxObligationFulfillmentArrangementExecuteActionTaskReference = customerTaxObligationFulfillmentArrangementExecuteActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return customerTaxObligationFulfillmentArrangementExecuteActionTaskRecord
  **/

  public Object getCustomerTaxObligationFulfillmentArrangementExecuteActionTaskRecord() {
    return customerTaxObligationFulfillmentArrangementExecuteActionTaskRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementExecuteActionTaskRecord(Object customerTaxObligationFulfillmentArrangementExecuteActionTaskRecord) {
    this.customerTaxObligationFulfillmentArrangementExecuteActionTaskRecord = customerTaxObligationFulfillmentArrangementExecuteActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the execute transaction/record 
   * @return executeRecordReference
  **/

  public String getExecuteRecordReference() {
    return executeRecordReference;
  }

  public void setExecuteRecordReference(String executeRecordReference) {
    this.executeRecordReference = executeRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the execute action service response 
   * @return executeResponseRecord
  **/

  public Object getExecuteResponseRecord() {
    return executeResponseRecord;
  }

  public void setExecuteResponseRecord(Object executeResponseRecord) {
    this.executeResponseRecord = executeResponseRecord;
  }


}

