<template>
<div id="grid">


      <div class="nav">    
        <ul id="navi">
          <li><router-link to="/" id=router>Home</router-link></li>
          <li><router-link to="/noticeList" id=router>Notice</router-link></li>
          <li><router-link to="/" id=router>Contact</router-link></li>
          <li><router-link to="/" id=router>About</router-link></li>
        </ul>
      </div>  

  <div class="notnav">

      <div class="input-group">
        <div class="search" >
        <input type="text" class="form-control" placeholder="지역, 직무 등 키워드를 입력해주세요." />
        </div>
        <div>
          <a href="#" id ="btn-search" class="btn btn-primary" > 검색 </a>         
        </div>
      </div> 


  <div class="row">
    <span class="row1">
      <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <h2 class="card-title">Card One</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
          </div>
          <div class="card-footer">
            <router-link to="/noticeContent"  class="btn btn-primary btn-sm">More Info</router-link>
          </div>
        </div>
      </div>
      <!-- /.col-md-4 -->
      <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <h2 class="card-title">Card Two</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quod tenetur ex natus at dolorem enim! Nesciunt pariatur voluptatem sunt quam eaque, vel, non in id dolore voluptates quos eligendi labore.</p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary btn-sm">More Info</a>
          </div>
        </div>
      </div>
      <!-- /.col-md-4 -->
      <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <h2 class="card-title">Card Three</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary btn-sm">More Info</a>
          </div>
        </div>
      </div>
      </span>
      <!-- /.col-md-4 -->

      <span class="row2">
 <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <h2 class="card-title">Card Three</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary btn-sm">More Info</a>
          </div>
        </div>
      </div>

       <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <h2 class="card-title">Card Three</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary btn-sm">More Info</a>
          </div>
        </div>
      </div>

            <div class="col-md-4 mb-5" id="card">
        <div class="cardAll">
          <div class="card-body">
            <h2 class="card-title">Card Three</h2>
            <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem magni quas ex numquam, maxime minus quam molestias corporis quod, ea minima accusamus.</p>
          </div>
          <div class="card-footer">
            <a href="#" class="btn btn-primary btn-sm">More Info</a>
          </div>
        </div>
      </div>
    </span>
</div>
      <div class="page">
        <h3>페이징 넣어야함</h3>
        </div>
      </div>


    
    </div>
</template>

<script>
  
</script>

<style scoped>
#btn-search{
width: 50px;
height:30px;
padding:5px;
}
.nav{  
  background-color: #c9e1f5;  
  height:1200px;
  padding-top:30%;
  padding-bottom:50%;
   margin:0;  
   font-size: 30px;
   font-weight: 800;
   
}
ul#navi{
  list-style-type: none; 
  
  
}

ul #navi li {
 
  display: block;  
  
}
#router{
    color: rgb(66, 65, 65);
     margin:10%;
     
}
#card{
  width:30%;
  height: 250px;
  padding:2%;
  
}
.cardAll{
background-color:#e1ecf5;

}
.card-body{
  height: 200px;
  padding:10px;
}
.input-group{
  padding-left:5%;
  padding-top:50px;
  margin-bottom:20px;
}
.search{
 width:300px;
 
}
.row1{
  margin-bottom:100px;
  }
.row2{
  margin-bottom:100px;
}
.page{
  margin-left: 10%;
}

.row{
  padding-left: 5%;
  
}
#grid{
  display:grid;
    grid-template-columns:20% 1fr;
}
</style>
