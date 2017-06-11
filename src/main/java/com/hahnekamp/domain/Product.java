package com.hahnekamp.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by rainerh on 28.05.17.
 */
@Data
public class Product {
  private String code;
  private String groupName;
  private int amountInStock;
  private BigDecimal price;
}
