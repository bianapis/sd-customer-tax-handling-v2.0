package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQAnalysisUpdateInputModelAnalysisInstanceRecord
 */
public class BQAnalysisUpdateInputModelAnalysisInstanceRecord   {
  private String customerTaxHandlingAnalysisWorkProducts = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced to develop the customer tax position/statement that is used for reporting 
   * @return customerTaxHandlingAnalysisWorkProducts
  **/

  public String getCustomerTaxHandlingAnalysisWorkProducts() {
    return customerTaxHandlingAnalysisWorkProducts;
  }

  public void setCustomerTaxHandlingAnalysisWorkProducts(String customerTaxHandlingAnalysisWorkProducts) {
    this.customerTaxHandlingAnalysisWorkProducts = customerTaxHandlingAnalysisWorkProducts;
  }


}

