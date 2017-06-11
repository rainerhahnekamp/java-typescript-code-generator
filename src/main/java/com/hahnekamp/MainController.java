package com.hahnekamp;

import com.hahnekamp.domain.Product;
import com.hahnekamp.message.ProductsResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Created by rainerh on 28.05.17.
 */
@RestController
public class MainController {
  @RequestMapping(path = "products")
  public ProductsResponse getProducts() {
    Product foo = new Product();
    foo.setAmountInStock(5);
    foo.setCode("product-foo");
    foo.setGroupName("group-01");
    foo.setPrice(new BigDecimal("5.31"));

    Product bar = new Product();
    bar.setAmountInStock(3);
    bar.setCode("product-bar");
    bar.setGroupName("group-01");
    bar.setPrice(new BigDecimal("28.99"));

    ProductsResponse returner = new ProductsResponse();
    returner.setProducts(Arrays.asList(foo, bar));

    return returner;
  }
}
