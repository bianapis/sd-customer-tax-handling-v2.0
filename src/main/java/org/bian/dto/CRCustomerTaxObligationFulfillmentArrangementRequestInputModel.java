package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementRequestInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementRequestInputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementRequestInputModel   {
  private String customerTaxHandlingServicingSessionReference = null;

  private String customerTaxObligationFulfillmentArrangementInstanceReference = null;

  private CRCustomerTaxObligationFulfillmentArrangementRequestInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord = null;

  private Object customerTaxObligationFulfillmentArrangementRequestActionTaskRecord = null;

  private CRCustomerTaxObligationFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType = null;


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

  public CRCustomerTaxObligationFulfillmentArrangementRequestInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord getCustomerTaxObligationFulfillmentArrangementInstanceRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceRecord(CRCustomerTaxObligationFulfillmentArrangementRequestInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceRecord = customerTaxObligationFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerTaxObligationFulfillmentArrangementRequestActionTaskRecord
  **/

  public Object getCustomerTaxObligationFulfillmentArrangementRequestActionTaskRecord() {
    return customerTaxObligationFulfillmentArrangementRequestActionTaskRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementRequestActionTaskRecord(Object customerTaxObligationFulfillmentArrangementRequestActionTaskRecord) {
    this.customerTaxObligationFulfillmentArrangementRequestActionTaskRecord = customerTaxObligationFulfillmentArrangementRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerTaxObligationFulfillmentArrangementRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerTaxObligationFulfillmentArrangementRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

