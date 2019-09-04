package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord;
import org.bian.dto.BQReportingRetrieveOutputModelReportingInstanceAnalysis;
import org.bian.dto.BQReportingRetrieveOutputModelReportingInstanceRecord;
import org.bian.dto.BQReportingRetrieveOutputModelReportingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReportingRetrieveOutputModel
 */
public class BQReportingRetrieveOutputModel   {
  private BQReportingRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord = null;

  private BQReportingRetrieveOutputModelReportingInstanceRecord reportingInstanceRecord = null;

  private String reportingRetrieveActionTaskReference = null;

  private Object reportingRetrieveActionTaskRecord = null;

  private String reportingRetrieveActionResponse = null;

  private BQReportingRetrieveOutputModelReportingInstanceReport reportingInstanceReport = null;

  private BQReportingRetrieveOutputModelReportingInstanceAnalysis reportingInstanceAnalysis = null;


  /**
   * Get customerTaxObligationFulfillmentArrangementInstanceRecord
   * @return customerTaxObligationFulfillmentArrangementInstanceRecord
  **/

  public BQReportingRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord getCustomerTaxObligationFulfillmentArrangementInstanceRecord() {
    return customerTaxObligationFulfillmentArrangementInstanceRecord;
  }

  public void setCustomerTaxObligationFulfillmentArrangementInstanceRecord(BQReportingRetrieveOutputModelCustomerTaxObligationFulfillmentArrangementInstanceRecord customerTaxObligationFulfillmentArrangementInstanceRecord) {
    this.customerTaxObligationFulfillmentArrangementInstanceRecord = customerTaxObligationFulfillmentArrangementInstanceRecord;
  }


  /**
   * Get reportingInstanceRecord
   * @return reportingInstanceRecord
  **/

  public BQReportingRetrieveOutputModelReportingInstanceRecord getReportingInstanceRecord() {
    return reportingInstanceRecord;
  }

  public void setReportingInstanceRecord(BQReportingRetrieveOutputModelReportingInstanceRecord reportingInstanceRecord) {
    this.reportingInstanceRecord = reportingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reporting instance retrieve service call 
   * @return reportingRetrieveActionTaskReference
  **/

  public String getReportingRetrieveActionTaskReference() {
    return reportingRetrieveActionTaskReference;
  }

  public void setReportingRetrieveActionTaskReference(String reportingRetrieveActionTaskReference) {
    this.reportingRetrieveActionTaskReference = reportingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return reportingRetrieveActionTaskRecord
  **/

  public Object getReportingRetrieveActionTaskRecord() {
    return reportingRetrieveActionTaskRecord;
  }

  public void setReportingRetrieveActionTaskRecord(Object reportingRetrieveActionTaskRecord) {
    this.reportingRetrieveActionTaskRecord = reportingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return reportingRetrieveActionResponse
  **/

  public String getReportingRetrieveActionResponse() {
    return reportingRetrieveActionResponse;
  }

  public void setReportingRetrieveActionResponse(String reportingRetrieveActionResponse) {
    this.reportingRetrieveActionResponse = reportingRetrieveActionResponse;
  }


  /**
   * Get reportingInstanceReport
   * @return reportingInstanceReport
  **/

  public BQReportingRetrieveOutputModelReportingInstanceReport getReportingInstanceReport() {
    return reportingInstanceReport;
  }

  public void setReportingInstanceReport(BQReportingRetrieveOutputModelReportingInstanceReport reportingInstanceReport) {
    this.reportingInstanceReport = reportingInstanceReport;
  }


  /**
   * Get reportingInstanceAnalysis
   * @return reportingInstanceAnalysis
  **/

  public BQReportingRetrieveOutputModelReportingInstanceAnalysis getReportingInstanceAnalysis() {
    return reportingInstanceAnalysis;
  }

  public void setReportingInstanceAnalysis(BQReportingRetrieveOutputModelReportingInstanceAnalysis reportingInstanceAnalysis) {
    this.reportingInstanceAnalysis = reportingInstanceAnalysis;
  }


}

