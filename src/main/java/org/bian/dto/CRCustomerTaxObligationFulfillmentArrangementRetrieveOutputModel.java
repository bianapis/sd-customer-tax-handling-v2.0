package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModel   {
  private CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord = null;

  private String customerTaxObligationFulfillmentArrangementRetrieveActionTaskReference = null;

  private Object customerTaxObligationFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String customerTaxObligationFulfillmentArrangementRetrieveActionResponse = null;

  private CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord customerTaxObligationFulfillmentArrangementInstanceReportRecord = null;

  private CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis customerTaxObligationFulfillmentArrangementInstanceAnalysis = null;


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceRecord
   * @return customerTaxObligationFulfillmentArrangementInstanceRecord
  **/

  public CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord getCustomerTaxObligationFulfillmentArrangementInstanceRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceRecord(CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceRecord = customerTaxObligationFulfillmentArrangementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Tax Obligation Fulfillment Arrangement instance retrieve service call 
   * @return customerTaxObligationFulfillmentArrangementRetrieveActionTaskReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementRetrieveActionTaskReference() {
    return customerTaxObligationFulfillmentArrangementRetrieveActionTaskReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementRetrieveActionTaskReference(String customerTaxObligationFulfillmentArrangementRetrieveActionTaskReference) {
    this.customerTaxObligationFulfillmentArrangementRetrieveActionTaskReference = customerTaxObligationFulfillmentArrangementRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerTaxObligationFulfillmentArrangementRetrieveActionTaskRecord
  **/

  public Object getCustomerTaxObligationFulfillmentArrangementRetrieveActionTaskRecord() {
    return customerTaxObligationFulfillmentArrangementRetrieveActionTaskRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementRetrieveActionTaskRecord(Object customerTaxObligationFulfillmentArrangementRetrieveActionTaskRecord) {
    this.customerTaxObligationFulfillmentArrangementRetrieveActionTaskRecord = customerTaxObligationFulfillmentArrangementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerTaxObligationFulfillmentArrangementRetrieveActionResponse
  **/

  public String getCustomerTaxObligationFulfillmentArrangementRetrieveActionResponse() {
    return customerTaxObligationFulfillmentArrangementRetrieveActionResponse;
  }

  public void setCustomerTaxObligationFulfillmentArrangementRetrieveActionResponse(String customerTaxObligationFulfillmentArrangementRetrieveActionResponse) {
    this.customerTaxObligationFulfillmentArrangementRetrieveActionResponse = customerTaxObligationFulfillmentArrangementRetrieveActionResponse;
  }


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceReportRecord
   * @return customerTaxObligationFulfillmentArrangementInstanceReportRecord
  **/

  public CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord getCustomerTaxObligationFulfillmentArrangementInstanceReportRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceReportRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceReportRecord(CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord customerTaxObligationFulfillmentArrangementInstanceReportRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceReportRecord = customerTaxObligationFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceAnalysis
   * @return customerTaxObligationFulfillmentArrangementInstanceAnalysis
  **/

  public CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis getCustomerTaxObligationFulfillmentArrangementInstanceAnalysis() {
    return customerTaxObligationFulfillmentArrangementInstanceAnalysis;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceAnalysis(CRCustomerTaxObligationFulfillmentArrangementRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis customerTaxObligationFulfillmentArrangementInstanceAnalysis) {
    this.customerTaxObligationFulfillmentArrangementInstanceAnalysis = customerTaxObligationFulfillmentArrangementInstanceAnalysis;
  }


}

