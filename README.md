![image](https://github.com/user-attachments/assets/6f2da9b8-d0c5-470e-bca9-ea22dd388dd0)
# JSON SERVER

## To install JSON SERVER

- Steps to run JSON SERVER
1. Install JSON SERVER with this command line
```shell
$ npm install -g json-server
```

2. Create a new db.json file with some demo data:
```json
{
  "users": [
    { "id": 1, "name": "Andrés", "email": "andres@example.com" },
    { "id": 2, "name": "Laura", "email": "laura@example.com" }
  ],
  "products": [
    { "id": 1, "name": "Laptop", "price": 1200 },
    { "id": 2, "name": "Mouse", "price": 30 }
  ]
}
```

3. Run the server: In the root path run this command line:
```shell
$ json-server --watch db.json --port 3000
```
4. Check the server status, something like this
```shell
Press CTRL-C to stop
Watching db.json...

♡⸜(˶˃ ᵕ ˂˶)⸝♡

Index:
http://localhost:3000/

Static files:
Serving ./public directory if it exists

Endpoints:
http://localhost:3000/users
http://localhost:3000/products
```

5. Check in any browser or Postman these demo endpoints
```shell
GET: http://localhost:3000/users
POST: http://localhost:3000/users
PUT: http://localhost:3000/users/1
PATCH: http://localhost:3000/users/1
DELETE: http://localhost:3000/users/1
```

