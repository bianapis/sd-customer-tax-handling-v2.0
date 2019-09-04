package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementRequestOutputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementRequestOutputModel   {
  private String customerTaxObligationFulfillmentArrangementRequestActionTaskReference = null;

  private Object customerTaxObligationFulfillmentArrangementRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Tax Obligation Fulfillment Arrangement instance request service call 
   * @return customerTaxObligationFulfillmentArrangementRequestActionTaskReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementRequestActionTaskReference() {
    return customerTaxObligationFulfillmentArrangementRequestActionTaskReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementRequestActionTaskReference(String customerTaxObligationFulfillmentArrangementRequestActionTaskReference) {
    this.customerTaxObligationFulfillmentArrangementRequestActionTaskReference = customerTaxObligationFulfillmentArrangementRequestActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

