package com.hahnekamp.message;

import lombok.Data;

import java.time.Instant;
import java.util.Date;

/**
 * Created by rainerh on 28.05.17.
 */
@Data
public class ProductsRequest extends BaseRequest {
  private Instant validFrom;
  private Date validTo;
}
