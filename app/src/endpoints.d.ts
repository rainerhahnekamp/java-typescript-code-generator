// Generated using typescript-generator version 1.25.322 on 2017-06-11 18:25:43.

declare namespace endpoint {

    interface ProductsRequest extends BaseRequest {
        validFrom: Date;
        validTo: Date;
    }

    interface ProductsResponse {
        products: Product[];
    }

    interface BaseRequest {
        region: Region;
    }

    interface Product {
        code: string;
        groupName: string;
        amountInStock: number;
        price: number;
    }

    type Region = "CENTRAL_EUROPE" | "SCANDINAVIA" | "UK";

}
