
var login = {
		login :function(){
			var submitData = {
					username :$("#username").val(),
					password:$("#password").val()
				}
				$.post({
				    url:'login',
				    data:submitData,
				    cache:false,//false是不缓存，true为缓存
				    async:true,//true为异步，false为同步
				    beforeSend:function(){
				        //请求前
				    },
				    success:function(result){
				    	window.location.href ="/ssm/"
				        console.log(result);
				    },
				    complete:function(){
				        //请求结束时
				    },
				    error:function(){
				        //请求失败时
				    }
				})
		}	
}
/*function login(){
	
}*/