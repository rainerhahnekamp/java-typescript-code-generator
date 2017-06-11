package com.hahnekamp.message;

import com.hahnekamp.domain.Product;
import lombok.Data;

import java.util.List;

/**
 * Created by rainerh on 28.05.17.
 */
@Data
public class ProductsResponse {
  private List<Product> products;
}
