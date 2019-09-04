package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementExecuteInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementExecuteInputModelExecuteRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementExecuteInputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementExecuteInputModel   {
  private String customerTaxHandlingServicingSessionReference = null;

  private String customerTaxObligationFulfillmentArrangementInstanceReference = null;

  private CRCustomerTaxObligationFulfillmentArrangementExecuteInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord = null;

  private Object customerTaxObligationFulfillmentArrangementExecuteActionTaskRecord = null;

  private CRCustomerTaxObligationFulfillmentArrangementExecuteInputModelExecuteRecordType executeRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerTaxHandlingServicingSessionReference
  **/

  public String getCustomerTaxHandlingServicingSessionReference() {
    return customerTaxHandlingServicingSessionReference;
  }

  public void setCustomerTaxHandlingServicingSessionReference(String customerTaxHandlingServicingSessionReference) {
    this.customerTaxHandlingServicingSessionReference = customerTaxHandlingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Tax Obligation Fulfillment Arrangement instance 
   * @return customerTaxObligationFulfillmentArrangementInstanceReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceReference() {
    return customerTaxObligationFulfillmentArrangementInstanceReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceReference(String customerTaxObligationFulfillmentArrangementInstanceReference) {
    this.customerTaxObligationFulfillmentArrangementInstanceReference = customerTaxObligationFulfillmentArrangementInstanceReference;
  }


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceRecord
   * @return customerTaxObligationFulfillmentArrangementInstanceRecord
  **/

  public CRCustomerTaxObligationFulfillmentArrangementExecuteInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord getCustomerTaxObligationFulfillmentArrangementInstanceRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceRecord(CRCustomerTaxObligationFulfillmentArrangementExecuteInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceRecord = customerTaxObligationFulfillmentArrangementInstanceRecord;
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
   * Get executeRecordType
   * @return executeRecordType
  **/

  public CRCustomerTaxObligationFulfillmentArrangementExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(CRCustomerTaxObligationFulfillmentArrangementExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

