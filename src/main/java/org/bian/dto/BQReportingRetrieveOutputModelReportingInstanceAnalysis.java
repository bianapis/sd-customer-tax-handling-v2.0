package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReportingRetrieveOutputModelReportingInstanceAnalysis
 */
public class BQReportingRetrieveOutputModelReportingInstanceAnalysis   {
  private Object reportingInstanceAnalysisRecord = null;

  private String reportingInstanceAnalysisReportType = null;

  private String reportingInstanceAnalysisParameters = null;

  private Object reportingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return reportingInstanceAnalysisRecord
  **/

  public Object getReportingInstanceAnalysisRecord() {
    return reportingInstanceAnalysisRecord;
  }

  public void setReportingInstanceAnalysisRecord(Object reportingInstanceAnalysisRecord) {
    this.reportingInstanceAnalysisRecord = reportingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return reportingInstanceAnalysisReportType
  **/

  public String getReportingInstanceAnalysisReportType() {
    return reportingInstanceAnalysisReportType;
  }

  public void setReportingInstanceAnalysisReportType(String reportingInstanceAnalysisReportType) {
    this.reportingInstanceAnalysisReportType = reportingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return reportingInstanceAnalysisParameters
  **/

  public String getReportingInstanceAnalysisParameters() {
    return reportingInstanceAnalysisParameters;
  }

  public void setReportingInstanceAnalysisParameters(String reportingInstanceAnalysisParameters) {
    this.reportingInstanceAnalysisParameters = reportingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return reportingInstanceAnalysisReport
  **/

  public Object getReportingInstanceAnalysisReport() {
    return reportingInstanceAnalysisReport;
  }

  public void setReportingInstanceAnalysisReport(Object reportingInstanceAnalysisReport) {
    this.reportingInstanceAnalysisReport = reportingInstanceAnalysisReport;
  }


}

