package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAnalysisExchangeInputModelAnalysisExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQReportingExchangeInputModel
 */
public class BQReportingExchangeInputModel   {
  private String customerTaxObligationFulfillmentArrangementInstanceReference = null;

  private String reportingInstanceReference = null;

  private Object reportingExchangeActionTaskRecord = null;

  private BQAnalysisExchangeInputModelAnalysisExchangeActionRequest reportingExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Tax Obligation Fulfillment Arrangement instance 
   * @return customerTaxObligationFulfillmentArrangementInstanceReference
  **/

  public String getCustomerTaxObligationFulfillmentArrangementInstanceReference() {
    return customerTaxObligationFulfillmentArrangementInstanceReference;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceReference(String customerTaxObligationFulfillmentArrangementInstanceReference) {
    this.customerTaxObligationFulfillmentArrangementInstanceReference = customerTaxObligationFulfillmentArrangementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reporting instance 
   * @return reportingInstanceReference
  **/

  public String getReportingInstanceReference() {
    return reportingInstanceReference;
  }

  public void setReportingInstanceReference(String reportingInstanceReference) {
    this.reportingInstanceReference = reportingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return reportingExchangeActionTaskRecord
  **/

  public Object getReportingExchangeActionTaskRecord() {
    return reportingExchangeActionTaskRecord;
  }

  public void setReportingExchangeActionTaskRecord(Object reportingExchangeActionTaskRecord) {
    this.reportingExchangeActionTaskRecord = reportingExchangeActionTaskRecord;
  }


  /**
   * Get reportingExchangeActionRequest
   * @return reportingExchangeActionRequest
  **/

  public BQAnalysisExchangeInputModelAnalysisExchangeActionRequest getReportingExchangeActionRequest() {
    return reportingExchangeActionRequest;
  }

  public void setReportingExchangeActionRequest(BQAnalysisExchangeInputModelAnalysisExchangeActionRequest reportingExchangeActionRequest) {
    this.reportingExchangeActionRequest = reportingExchangeActionRequest;
  }


}

