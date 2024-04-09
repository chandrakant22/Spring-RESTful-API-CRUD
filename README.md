Test API
<b>1] Create User</b>
POST : http://localhost:8080/users
Body-> raw -> JSON
{
  "name": "ram",
  "email": "ram22@gmail.com"
}

<b>2] Get All Users</b>
GET : http://localhost:8080/users

<b>3] Get One User</b>
GET : http://localhost:8080/users/1

<b>4] Update User</b>
POST : http://localhost:8080/users/1
Body-> raw -> JSON
{
  "name": "sham",
  "email": "sham@gmail.com"
}
