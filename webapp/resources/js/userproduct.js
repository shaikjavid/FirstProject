$(document).ready(function(){
var path="http://localhost:8080/javidmobiles/resources/images/";
  $("#productstable").DataTable({
 "ajax": {
   "url": "http://localhost:8080/javidmobiles/adminproducts/all",
   "dataSrc": ""
 },
 "columns": [
          { "data": "productName" },
          { "data": "",
        "render":function(data,type,row)
        {
         return "&#8360;."+row.productPrice+"";
          }  
          
          },
  
          
          {data:"productName",
         mRender:function(data,type,row){
         return '<img src="'+path+data+'.jpg" width="25px" height="25px"></img>';
         }
          },
          
          {"data":"productId",
         "render":function(data,type,row){
         return "<a href='http://localhost:8080/javidmobiles/"+row.productId+"/viewproduct' class='btn btn-primary'>View</a>";
         }
          },
       
         {"data":"",
         "render":function(data,type,row){
         return "<a href='http://localhost:8080/javidmobiles/"+row.productId+"/AddtoCart' class='btn btn-primary'>AddCart</a>";
         }
          }  
                    
      ]
  });
    
    
});
