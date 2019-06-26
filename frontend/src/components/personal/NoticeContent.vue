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

      <div class="allContent">
          <div class="title">
             <p>제목</p>
            </div>
            <div class="exeptTitle">
            <div class="area">
                <p>기업명 ... 직군 - 신입/경력/무관</p>
             </div> 
            <div class="content">
               <p>내용내용내용</p>
            </div>
            <div class="tag">
               <p>#태그1 #태그2...</p>
                </div>
                <div class="apply">
                    <a @click="apply"  class="btn btn-primary btn-sm">지원하기</a>
        </div>
        </div>
    </div>
    
    <div class="btn">
         <router-link to="/upload"  class="btn btn-primary btn-sm">업로드</router-link>
          <router-link to="/modify"  class="btn btn-primary btn-sm">수정</router-link>
            <a @click="deleting"  class="btn btn-primary btn-sm">삭제</a>
    </div>



    </div>
    </div>
</template>

<script>
export default {
    methods:{
        apply(){
            alert("지원 완료");
            //지원메소드
        },
        deleting(){
            alert("삭제 완료");
            //삭제메소드+공고목록으로
        }
    }
}
</script>


<style scoped>
#router{
    color: rgb(66, 65, 65);
     margin:10%;
     
}
#grid{
  display:grid;
    grid-template-columns:20% 1fr;
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


.notnav{
    margin:5%;
}
.exeptTitle{
    border: solid  #c9e1f5 1px;
    height:500px;
    padding:10px;
    
}
.title{
     border: solid  #c9e1f5 1px;
    margin-bottom:10px;
    font-size:20px;
    font-weight: bold;
}
.area{
     margin-bottom:10px;
    
}
.content{
     margin-bottom:10px;
     font-size:15px;
     font-weight: bold;
}
.tag{
     margin-bottom:10px;
     color:rgb(90, 88, 88);
}
.apply{
     margin-left:45%;
}
</style>
