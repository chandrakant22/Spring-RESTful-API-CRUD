Test API<br>
<b>1] Create User</b><br>
POST : http://localhost:8080/users<br>
Body-> raw -> JSON<br>
{<br>
  "name": "ram",<br>
  "email": "ram22@gmail.com"<br>
}<br>
<br>
<b>2] Get All Users</b><br>
GET : http://localhost:8080/users<br>
<br>
<b>3] Get One User</b><br>
GET : http://localhost:8080/users/1<br>
<br>
<b>4] Update User</b><br>
POST : http://localhost:8080/users/1<br>
Body-> raw -> JSON<br>
{<br>
  "name": "sham",<br>
  "email": "sham@gmail.com"<br>
}<br>
