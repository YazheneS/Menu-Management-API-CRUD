1.Project Setup 

Java 24
Maven
VS Code



2.API documentation

api.http

### Create Item
POST http://localhost:8081/api/items
Content-Type: application/json

{
  "name": "Tea",
  "price": 20,
  "category": "Drinks",
  "availability": true
}
### Get All Items
GET http://localhost:8081/api/items
### Update Item
PUT http://localhost:8081/api/items/1
Content-Type: application/json

{
  "name": "Coffee",
  "price": 30,
  "category": "Drinks",
  "availability": true
}
### Delete Item
DELETE http://localhost:8081/api/items/1



Name: Yazhene S
Email: yazh.yazhene@gmail.com 