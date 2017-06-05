<!DOCTYPE html>
<html>
<head>
<style>
div.gallery {
    border: 1px solid #ccc;
}

div.gallery:hover {
    border: 1px solid #777;
}

div.gallery img {
    width: 100%;
    height: auto;
}

div.desc {
    padding: 15px;
    text-align: center;
}

* {
    box-sizing: border-box;
}

.responsive {
    padding: 0 6px;
    float: left;
    width: 24.99999%;
}

@media only screen and (max-width: 700px){
    .responsive {
        width: 49.99999%;
        margin: 6px 0;
    }
}

@media only screen and (max-width: 500px){
    .responsive {
        width: 100%;
    }
}

body {
    background-color: 	#5F9EA0;
}
</style>
</head>
<body>

<h2 style="color:	#DC143C;"><center>Iphone Gallery</center></h2>
<div class="responsive">
  <div class="gallery">
     <img src="resources/images/h.jpg" alt="" width="600" height="600">
    <div class="desc">Iphone-4s</div>
  </div>
</div>
<div class="responsive">
  <div class="gallery">
   <img src="resources/images/a.jpg" alt="" width="300" height="200"> 
    <div class="desc">Iphone-5c</div>
  </div>
</div>
<div class="responsive">
  <div class="gallery">
      <img src="resources/images/b.jpg" alt="" width="600" height="600">
    <div class="desc">Iphone-5s</div>
  </div>
</div>

<div class="responsive">
  <div class="gallery">
    <img src="resources/images/c.png" alt="" width="600" height="600">
    <div class="desc">Iphone-6</div>
  </div>
</div>
<div class="responsive">
  <div class="gallery">
  <img src="resources/images/d.jpg" alt="" width="600" height="600">
    <div class="desc">Iphone-6plus</div>
  </div>
</div>
<div class="responsive">
  <div class="gallery">
     <img src="resources/images/g.jpg" alt="" width="600" height="600">
    <div class="desc">Iphone-6s</div>
  </div>
</div>
<div class="responsive">
  <div class="gallery"> 
     <img src="resources/images/e.jpg" alt="" width="600" height="600">
    <div class="desc">Iphone-7</div>
  </div>
</div>
<div class="responsive">
  <div class="gallery">
     <img src="resources/images/f.jpg" alt="" width="600" height="600">
    <div class="desc">Iphone-7plus</div>
  </div>
</div>







</body>
</html>
