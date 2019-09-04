package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementControlInputModelCustomerTaxObligationFulfillmentArrangementControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementControlInputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementControlInputModel   {
  private String customerTaxHandlingServicingSessionReference = null;

  private String customerTaxObligationFulfillmentArrangementInstanceReference = null;

  private Object customerTaxObligationFulfillmentArrangementControlActionTaskRecord = null;

  private CRCustomerTaxObligationFulfillmentArrangementControlInputModelCustomerTaxObligationFulfillmentArrangementControlActionRequest customerTaxObligationFulfillmentArrangementControlActionRequest = null;


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
   * Get customerTaxObligationFulfillmentArrangementControlActionRequest
   * @return customerTaxObligationFulfillmentArrangementControlActionRequest
  **/

  public CRCustomerTaxObligationFulfillmentArrangementControlInputModelCustomerTaxObligationFulfillmentArrangementControlActionRequest getCustomerTaxObligationFulfillmentArrangementControlActionRequest() {
    return customerTaxObligationFulfillmentArrangementControlActionRequest;
  }

  public void setCustomerTaxObligationFulfillmentArrangementControlActionRequest(CRCustomerTaxObligationFulfillmentArrangementControlInputModelCustomerTaxObligationFulfillmentArrangementControlActionRequest customerTaxObligationFulfillmentArrangementControlActionRequest) {
    this.customerTaxObligationFulfillmentArrangementControlActionRequest = customerTaxObligationFulfillmentArrangementControlActionRequest;
  }


}

