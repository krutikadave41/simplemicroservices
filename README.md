# simplemicroservices

This project contains 3 microservices

1) EurekaServer for registering microservices
URL: http://localhost:8761/

2) CatalogService that returns list of items
URL: http://localhost:8088/api/items

3) BrandService that returns list of top brands by calling the CatalogService and checking which brands have ratings greater than 3.
URL: http://localhost:8089/api/topbrands
This service uses FeignClient to call CatalogService by defining a CatalogServiceProxy interface & defining the @RequestMapping wih method type and url.


Both services are registered to Eureka Server.

Enhancements to be added::
1) Adding Hystrix circuit breaker for defining fallback method in BrandService
2) CatalogService to be providing CRUD for items instead of returning a static hard-coded list
3) Exception Handling with ControllerAdvice
4) Code Optimization
