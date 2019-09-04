package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQConsolidationUpdateInputModelConsolidationInstanceRecordProductInstanceReference;

import javax.validation.Valid;
  
/**
 * BQConsolidationUpdateInputModelConsolidationInstanceRecord
 */
public class BQConsolidationUpdateInputModelConsolidationInstanceRecord   {
  private BQConsolidationUpdateInputModelConsolidationInstanceRecordProductInstanceReference productInstanceReference = null;

  private String customerTaxHandlingConsolidationWorkProducts = null;


  /**
   * Get productInstanceReference
   * @return productInstanceReference
  **/

  public BQConsolidationUpdateInputModelConsolidationInstanceRecordProductInstanceReference getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(BQConsolidationUpdateInputModelConsolidationInstanceRecordProductInstanceReference productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the consolidation 
   * @return customerTaxHandlingConsolidationWorkProducts
  **/

  public String getCustomerTaxHandlingConsolidationWorkProducts() {
    return customerTaxHandlingConsolidationWorkProducts;
  }

  public void setCustomerTaxHandlingConsolidationWorkProducts(String customerTaxHandlingConsolidationWorkProducts) {
    this.customerTaxHandlingConsolidationWorkProducts = customerTaxHandlingConsolidationWorkProducts;
  }


}

