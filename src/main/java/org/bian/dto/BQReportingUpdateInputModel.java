package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQReportingUpdateInputModelReportingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReportingUpdateInputModel
 */
public class BQReportingUpdateInputModel   {
  private BQReportingUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord = null;

  private String customerTaxObligationFulfillmentArrangementInstanceReference = null;

  private String reportingInstanceReference = null;

  private BQReportingUpdateInputModelReportingInstanceRecord reportingInstanceRecord = null;

  private Object reportingUpdateActionTaskRecord = null;

  private String reportingUpdateActionRequest = null;


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceRecord
   * @return customerTaxObligationFulfillmentArrangementInstanceRecord
  **/

  public BQReportingUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord getCustomerTaxObligationFulfillmentArrangementInstanceRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceRecord(BQReportingUpdateInputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceRecord = customerTaxObligationFulfillmentArrangementInstanceRecord;
  }


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
   * Get reportingInstanceRecord
   * @return reportingInstanceRecord
  **/

  public BQReportingUpdateInputModelReportingInstanceRecord getReportingInstanceRecord() {
    return reportingInstanceRecord;
  }

  public void setReportingInstanceRecord(BQReportingUpdateInputModelReportingInstanceRecord reportingInstanceRecord) {
    this.reportingInstanceRecord = reportingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return reportingUpdateActionTaskRecord
  **/

  public Object getReportingUpdateActionTaskRecord() {
    return reportingUpdateActionTaskRecord;
  }

  public void setReportingUpdateActionTaskRecord(Object reportingUpdateActionTaskRecord) {
    this.reportingUpdateActionTaskRecord = reportingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return reportingUpdateActionRequest
  **/

  public String getReportingUpdateActionRequest() {
    return reportingUpdateActionRequest;
  }

  public void setReportingUpdateActionRequest(String reportingUpdateActionRequest) {
    this.reportingUpdateActionRequest = reportingUpdateActionRequest;
  }


}

