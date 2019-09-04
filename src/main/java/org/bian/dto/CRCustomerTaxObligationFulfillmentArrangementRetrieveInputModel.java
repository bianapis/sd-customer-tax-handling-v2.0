package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis;
import org.bian.dto.CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModel
 */
public class CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModel   {
  private Object customerTaxObligationFulfillmentArrangementRetrieveActionTaskRecord = null;

  private String customerTaxObligationFulfillmentArrangementRetrieveActionRequest = null;

  private CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord customerTaxObligationFulfillmentArrangementInstanceReportRecord = null;

  private CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis customerTaxObligationFulfillmentArrangementInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerTaxObligationFulfillmentArrangementRetrieveActionRequest
  **/

  public String getCustomerTaxObligationFulfillmentArrangementRetrieveActionRequest() {
    return customerTaxObligationFulfillmentArrangementRetrieveActionRequest;
  }

  public void setCustomerTaxObligationFulfillmentArrangementRetrieveActionRequest(String customerTaxObligationFulfillmentArrangementRetrieveActionRequest) {
    this.customerTaxObligationFulfillmentArrangementRetrieveActionRequest = customerTaxObligationFulfillmentArrangementRetrieveActionRequest;
  }


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceReportRecord
   * @return customerTaxObligationFulfillmentArrangementInstanceReportRecord
  **/

  public CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord getCustomerTaxObligationFulfillmentArrangementInstanceReportRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceReportRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceReportRecord(CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceReportRecord customerTaxObligationFulfillmentArrangementInstanceReportRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceReportRecord = customerTaxObligationFulfillmentArrangementInstanceReportRecord;
  }


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceAnalysis
   * @return customerTaxObligationFulfillmentArrangementInstanceAnalysis
  **/

  public CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis getCustomerTaxObligationFulfillmentArrangementInstanceAnalysis() {
    return customerTaxObligationFulfillmentArrangementInstanceAnalysis;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceAnalysis(CRCustomerTaxObligationFulfillmentArrangementRetrieveInputModelCustomerTaxObligationFulfillmentArrangementInstanceAnalysis customerTaxObligationFulfillmentArrangementInstanceAnalysis) {
    this.customerTaxObligationFulfillmentArrangementInstanceAnalysis = customerTaxObligationFulfillmentArrangementInstanceAnalysis;
  }


}

