$(document).ready(function(){
	
  $("#categorytable").DataTable({
	
	  "ajax": {
		    "url": "http://localhost:8080/javidmobiles/categories/all",
		    "dataSrc": ""
		  },
	  "columns": [
		
		  { "data": "categoryid"},
		  {"data": "catname"},
          {"data":null,
        	  "render":function(data,type,row){
        		  return "<a href='http://localhost:8080/javidmobiles/"+row.categoryid+"/editcategory' class='btn btn-primary'>Edit</a>";
        	  }
          },
          
          {"data":null,
        	  "render":function(data,type,row){
        		  return "<a href='http://localhost:8080/javidmobiles/"+row.categoryid+"/deletecategory' class='btn btn-primary'>Delete</a>";
        	  }
          }
                
      ]
  });
    
    
});