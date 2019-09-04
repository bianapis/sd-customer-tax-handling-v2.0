package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementControlOutputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementControlOutputModel   {
  private String customerTaxObligationFulfillmentArrangementControlActionTaskReference = null;

  private Object customerTaxObligationFulfillmentArrangementControlActionTaskRecord = null;

  private String customerTaxObligationFulfillmentArrangementControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Tax Obligation Fulfillment Arrangement instance control processing service call 
   * @return customerTaxObligationFulfillmentArrangementControlActionTaskReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementControlActionTaskReference() {
    return customerTaxObligationFulfillmentArrangementControlActionTaskReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementControlActionTaskReference(String customerTaxObligationFulfillmentArrangementControlActionTaskReference) {
    this.customerTaxObligationFulfillmentArrangementControlActionTaskReference = customerTaxObligationFulfillmentArrangementControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerTaxObligationFulfillmentArrangementControlActionTaskRecord
  **/

  public Object getCustomerTaxObligationFulfillmentArrangementControlActionTaskRecord() {
    return customerTaxObligationFulfillmentArrangementControlActionTaskRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementControlActionTaskRecord(Object customerTaxObligationFulfillmentArrangementControlActionTaskRecord) {
    this.customerTaxObligationFulfillmentArrangementControlActionTaskRecord = customerTaxObligationFulfillmentArrangementControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerTaxObligationFulfillmentArrangementControlActionResponse
  **/

  public String getCustomerTaxObligationFulfillmentArrangementControlActionResponse() {
    return customerTaxObligationFulfillmentArrangementControlActionResponse;
  }

  public void setCustomerTaxObligationFulfillmentArrangementControlActionResponse(String customerTaxObligationFulfillmentArrangementControlActionResponse) {
    this.customerTaxObligationFulfillmentArrangementControlActionResponse = customerTaxObligationFulfillmentArrangementControlActionResponse;
  }


}

