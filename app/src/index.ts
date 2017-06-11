import * as request from "request";
import * as _ from "lodash";
import ProductsRequest = endpoint.ProductsRequest;
import ProductsResponse = endpoint.ProductsResponse;
import {error} from "util";


function requestServer(data: ProductsRequest): Promise<ProductsResponse> {
  return new Promise<ProductsResponse>((resolve, reject) =>
    request.get("http://localhost:8080/products", (error, response) => {
      if (error) {
        reject(error);
      }
      else {
        resolve(JSON.parse(response.body));
      }
    })
  );
}

let requestData: ProductsRequest = {
  region: "CENTRAL_EUROPE",
  validFrom: new Date(2017, 0, 1),
  validTo: new Date(2017, 1, 1)
};

requestServer(requestData)
  .then(
    productsResponse => _.map(productsResponse.products)
      .forEach(product => console.log(product.code + " á " + product.price)),
    error => console.error("Error occured. Please check that the server is running")
  );
