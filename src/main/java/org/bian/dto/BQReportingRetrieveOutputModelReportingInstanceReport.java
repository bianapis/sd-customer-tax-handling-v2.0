package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReportingRetrieveOutputModelReportingInstanceReport
 */
public class BQReportingRetrieveOutputModelReportingInstanceReport   {
  private Object reportingInstanceReportRecord = null;

  private String reportingInstanceReportType = null;

  private String reportingInstanceReportParameters = null;

  private Object reportingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return reportingInstanceReportRecord
  **/

  public Object getReportingInstanceReportRecord() {
    return reportingInstanceReportRecord;
  }

  public void setReportingInstanceReportRecord(Object reportingInstanceReportRecord) {
    this.reportingInstanceReportRecord = reportingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return reportingInstanceReportType
  **/

  public String getReportingInstanceReportType() {
    return reportingInstanceReportType;
  }

  public void setReportingInstanceReportType(String reportingInstanceReportType) {
    this.reportingInstanceReportType = reportingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return reportingInstanceReportParameters
  **/

  public String getReportingInstanceReportParameters() {
    return reportingInstanceReportParameters;
  }

  public void setReportingInstanceReportParameters(String reportingInstanceReportParameters) {
    this.reportingInstanceReportParameters = reportingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return reportingInstanceReport
  **/

  public Object getReportingInstanceReport() {
    return reportingInstanceReport;
  }

  public void setReportingInstanceReport(Object reportingInstanceReport) {
    this.reportingInstanceReport = reportingInstanceReport;
  }


}

