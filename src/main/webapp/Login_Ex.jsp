   <html>
   <head>
<title>Login</title>
<meta charset='utf-8'>
	<link rel='shortcut icon' href='fav.jpg' type='image' />
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>
	<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js'></script>
	<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>

<style>
.login{
    
    border: 10px solid skyblue;
    margin-top:150px;
    margin-left:400px;
    padding:50px;
    width:600px;
    background-color:white;
}
.bt{
    width:150px;
}
body {
    background-image: url("http://www.bringingtheworldthemadness.com/img/intro-background.jpg");
}
select{
    width:150px;
}
</style>

   </head>

<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#"><img src="fav.jpg" width="50" height="50"></a>
    </div>
    
      <a href="Home.jsp"> <button class="btn btn-success">Home</button></a></li>
     

   <a href="Login.jsp" <button class="btn btn-Warning navbar-btn">Sign UP</button></a>
  </div>
</nav>

<div class="login" align="center">

    <form action="eventregister.jsp" method="post">  
    <label for="username">User Name:</label>
   <input required placeholder="UserName" type="text" name="username" id="username"/><br/><br/> 
   <label for="username">Password:</label> 
    <input required placeholder="password" type="password" name="userpass"/><br/><br/>  

      <button type="submit" class="btn btn-primary bt">Sign in</button> 
    
    </form>  

    </div>
    </body>
    </html>