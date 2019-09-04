package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReportingRetrieveInputModelReportingInstanceAnalysis;
import org.bian.dto.BQReportingRetrieveInputModelReportingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReportingRetrieveInputModel
 */
public class BQReportingRetrieveInputModel   {
  private Object reportingRetrieveActionTaskRecord = null;

  private String reportingRetrieveActionRequest = null;

  private BQReportingRetrieveInputModelReportingInstanceReport reportingInstanceReport = null;

  private BQReportingRetrieveInputModelReportingInstanceAnalysis reportingInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return reportingRetrieveActionRequest
  **/

  public String getReportingRetrieveActionRequest() {
    return reportingRetrieveActionRequest;
  }

  public void setReportingRetrieveActionRequest(String reportingRetrieveActionRequest) {
    this.reportingRetrieveActionRequest = reportingRetrieveActionRequest;
  }


  /**
   * Get reportingInstanceReport
   * @return reportingInstanceReport
  **/

  public BQReportingRetrieveInputModelReportingInstanceReport getReportingInstanceReport() {
    return reportingInstanceReport;
  }

  public void setReportingInstanceReport(BQReportingRetrieveInputModelReportingInstanceReport reportingInstanceReport) {
    this.reportingInstanceReport = reportingInstanceReport;
  }


  /**
   * Get reportingInstanceAnalysis
   * @return reportingInstanceAnalysis
  **/

  public BQReportingRetrieveInputModelReportingInstanceAnalysis getReportingInstanceAnalysis() {
    return reportingInstanceAnalysis;
  }

  public void setReportingInstanceAnalysis(BQReportingRetrieveInputModelReportingInstanceAnalysis reportingInstanceAnalysis) {
    this.reportingInstanceAnalysis = reportingInstanceAnalysis;
  }


}

