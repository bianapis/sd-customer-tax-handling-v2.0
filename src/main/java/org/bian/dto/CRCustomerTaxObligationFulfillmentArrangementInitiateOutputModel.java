package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModel   {
  private String customerTaxObligationFulfillmentArrangementInstanceReference = null;

  private String customerTaxObligationFulfillmentArrangementInitiateActionReference = null;

  private Object customerTaxObligationFulfillmentArrangementInitiateActionRecord = null;

  private String customerTaxObligationFulfillmentArrangementInstanceStatus = null;

  private CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return customerTaxObligationFulfillmentArrangementInitiateActionReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInitiateActionReference() {
    return customerTaxObligationFulfillmentArrangementInitiateActionReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInitiateActionReference(String customerTaxObligationFulfillmentArrangementInitiateActionReference) {
    this.customerTaxObligationFulfillmentArrangementInitiateActionReference = customerTaxObligationFulfillmentArrangementInitiateActionReference;
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

  public CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord getCustomerTaxObligationFulfillmentArrangementInstanceRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceRecord(CRCustomerTaxObligationFulfillmentArrangementInitiateOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceRecord = customerTaxObligationFulfillmentArrangementInstanceRecord;
  }


}

