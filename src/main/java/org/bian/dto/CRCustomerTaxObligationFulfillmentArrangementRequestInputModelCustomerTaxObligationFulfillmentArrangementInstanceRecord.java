package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementRequestInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord
 */
public class CRCustomerTaxObligationFulfillmentArrangementRequestInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord   {
  private String customerReference = null;

  private String customerTaxReportingSchedule = null;

  private Object customerProductServiceEligibilityInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer for whom the consolidated tax position is maintained 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Defines the customer tax reporting obligations, recording target and actual dates 
   * @return customerTaxReportingSchedule
  **/

  public String getCustomerTaxReportingSchedule() {
    return customerTaxReportingSchedule;
  }

  public void setCustomerTaxReportingSchedule(String customerTaxReportingSchedule) {
    this.customerTaxReportingSchedule = customerTaxReportingSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: This is the customer's eligibility profile including in-force product terms for the customer - defining the taxation consolidation sources 
   * @return customerProductServiceEligibilityInstanceRecord
  **/

  public Object getCustomerProductServiceEligibilityInstanceRecord() {
    return customerProductServiceEligibilityInstanceRecord;
  }

  public void setCustomerProductServiceEligibilityInstanceRecord(Object customerProductServiceEligibilityInstanceRecord) {
    this.customerProductServiceEligibilityInstanceRecord = customerProductServiceEligibilityInstanceRecord;
  }


}

