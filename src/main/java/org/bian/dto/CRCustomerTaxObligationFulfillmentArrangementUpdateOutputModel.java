package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementUpdateOutputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementUpdateOutputModel   {
  private CRCustomerTaxObligationFulfillmentArrangementUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord = null;

  private String customerTaxObligationFulfillmentArrangementUpdateActionTaskReference = null;

  private Object customerTaxObligationFulfillmentArrangementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceRecord
   * @return customerTaxObligationFulfillmentArrangementInstanceRecord
  **/

  public CRCustomerTaxObligationFulfillmentArrangementUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord getCustomerTaxObligationFulfillmentArrangementInstanceRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceRecord(CRCustomerTaxObligationFulfillmentArrangementUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceRecord = customerTaxObligationFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerTaxObligationFulfillmentArrangementUpdateActionTaskReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementUpdateActionTaskReference() {
    return customerTaxObligationFulfillmentArrangementUpdateActionTaskReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementUpdateActionTaskReference(String customerTaxObligationFulfillmentArrangementUpdateActionTaskReference) {
    this.customerTaxObligationFulfillmentArrangementUpdateActionTaskReference = customerTaxObligationFulfillmentArrangementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerTaxObligationFulfillmentArrangementUpdateActionTaskRecord
  **/

  public Object getCustomerTaxObligationFulfillmentArrangementUpdateActionTaskRecord() {
    return customerTaxObligationFulfillmentArrangementUpdateActionTaskRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementUpdateActionTaskRecord(Object customerTaxObligationFulfillmentArrangementUpdateActionTaskRecord) {
    this.customerTaxObligationFulfillmentArrangementUpdateActionTaskRecord = customerTaxObligationFulfillmentArrangementUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

