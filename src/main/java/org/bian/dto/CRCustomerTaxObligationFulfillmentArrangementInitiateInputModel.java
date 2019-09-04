package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementInitiateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementInitiateInputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementInitiateInputModel   {
  private String customerTaxHandlingServicingSessionReference = null;

  private Object customerTaxObligationFulfillmentArrangementInitiateActionRecord = null;

  private String customerTaxObligationFulfillmentArrangementInstanceStatus = null;

  private CRCustomerTaxObligationFulfillmentArrangementInitiateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return customerTaxObligationFulfillmentArrangementInitiateActionRecord
  **/

  public Object getCustomerTaxObligationFulfillmentArrangementInitiateActionRecord() {
    return customerTaxObligationFulfillmentArrangementInitiateActionRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInitiateActionRecord(Object customerTaxObligationFulfillmentArrangementInitiateActionRecord) {
    this.customerTaxObligationFulfillmentArrangementInitiateActionRecord = customerTaxObligationFulfillmentArrangementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Tax Obligation Fulfillment Arrangement instance (e.g. initialised, pending, active) 
   * @return customerTaxObligationFulfillmentArrangementInstanceStatus
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceStatus() {
    return customerTaxObligationFulfillmentArrangementInstanceStatus;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceStatus(String customerTaxObligationFulfillmentArrangementInstanceStatus) {
    this.customerTaxObligationFulfillmentArrangementInstanceStatus = customerTaxObligationFulfillmentArrangementInstanceStatus;
  }


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceRecord
   * @return customerTaxObligationFulfillmentArrangementInstanceRecord
  **/

  public CRCustomerTaxObligationFulfillmentArrangementInitiateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord getCustomerTaxObligationFulfillmentArrangementInstanceRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceRecord(CRCustomerTaxObligationFulfillmentArrangementInitiateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceRecord = customerTaxObligationFulfillmentArrangementInstanceRecord;
  }


}

