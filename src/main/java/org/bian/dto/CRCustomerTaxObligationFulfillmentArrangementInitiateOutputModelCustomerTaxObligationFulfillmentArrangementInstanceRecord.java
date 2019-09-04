package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord
 */
public class CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord   {
  private Object customerTaxHandlingArrangementRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The consolidated record of the customer tax reporting position - basis for generating tax reports 
   * @return customerTaxHandlingArrangementRecord
  **/

  public Object getCustomerTaxHandlingArrangementRecord() {
    return customerTaxHandlingArrangementRecord;
  }

  public void setCustomerTaxHandlingArrangementRecord(Object customerTaxHandlingArrangementRecord) {
    this.customerTaxHandlingArrangementRecord = customerTaxHandlingArrangementRecord;
  }


}

