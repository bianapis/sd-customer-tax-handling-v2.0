package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReportingExchangeOutputModel
 */
public class BQReportingExchangeOutputModel   {
  private String reportingExchangeActionTaskReference = null;

  private Object reportingExchangeActionTaskRecord = null;

  private String reportingExchangeActionResponse = null;

  private String reportingInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reporting instance exchange service call 
   * @return reportingExchangeActionTaskReference
  **/

  public String getReportingExchangeActionTaskReference() {
    return reportingExchangeActionTaskReference;
  }

  public void setReportingExchangeActionTaskReference(String reportingExchangeActionTaskReference) {
    this.reportingExchangeActionTaskReference = reportingExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return reportingExchangeActionResponse
  **/

  public String getReportingExchangeActionResponse() {
    return reportingExchangeActionResponse;
  }

  public void setReportingExchangeActionResponse(String reportingExchangeActionResponse) {
    this.reportingExchangeActionResponse = reportingExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Reporting instance (e.g. accepted, rejected, verified) 
   * @return reportingInstanceStatus
  **/

  public String getReportingInstanceStatus() {
    return reportingInstanceStatus;
  }

  public void setReportingInstanceStatus(String reportingInstanceStatus) {
    this.reportingInstanceStatus = reportingInstanceStatus;
  }


}

