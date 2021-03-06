<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@include file="/WEB-INF/commons/include.jsp" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品编辑|GELAIMEI Furniture后台管理系统</title>
<%@include file="/WEB-INF/admin/commons/jsCss.jsp" %>
 <%@include file="/WEB-INF/admin/commons/listJsCss.jsp" %>
<link href="${ctx }resources/js/skins/blue.css" rel="stylesheet"/>
<script type="text/javascript" src="${ctx }resources/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${ctx }resources/js/jquery.validate.js"></script>
<script type="text/javascript" src="${ctx }resources/js/jquery.metadata.js"></script>
<script type="text/javascript" src="${ctx }resources/js/validatePlugin/jquery.validatePlugin.js"></script>
<link rel="stylesheet" type="text/css" href="${ctx }resources/css/style.css" />
<style type="text/css">
	select.form-control{
		display: inline-block;
		width:35%;
	}
	body{
	font-size: 12px;
	font-family: Arial, Tahoma, Verdana;
}
</style>
<script type="text/javascript">
$(document).ready(function(){
	$("#form").validate({
		rules:{
			"enName":{
				required:true,
				rangelength:[1,50]
			},
			"childC":{
				required:true
			}
		},
		messages:{
			"enName":{
				required:"商品名称不能为空！",
				rangelength:jQuery.format("名称长度在{0}与{1}之间")
			},
			"childC":{
				required:"商品分类不能为空！"
			}
		}
	});
	changePC(${model.category.parent.id});
});
function changePC(pid){
		var url = "${ctx}admin/goods/category_getCCate.do?pid="+pid;
		$.getJSON(url,function(returnJson){
			var json = $(returnJson);
			var str = "";
			for(var i=0;i<json.length;i++){
				str+="<option value="+json.get(i)[0];
				if(json.get(i)[0]==${model.category.id}){
					str+=" selected "
				}
				str+=">"+json.get(i)[1]+"</option>";
			}
			$("#childC").html(str);
		});
}
</script>
</head>
<body>
<jsp:include page="/WEB-INF/admin/commons/header.jsp"/>
	<jsp:include page="/WEB-INF/admin/commons/left.jsp">
		<jsp:param value="8" name="menuId"/>
		<jsp:param value="商品管理" name="menuName"/>
		<jsp:param value="编辑商品" name="menuSubName"/>
	</jsp:include>
	<section id="main" class="column">
		<article class="module width_full">
		<header>
		<h3 class="tabs_involved">编辑商品</h3>
		</header>
		<div class="tab_container">
		<div id="tab1" class="tab_content">
	<form id="form" class="form-horizontal" action="${ctx }admin/goods/product_update.do" method="post" enctype="multipart/form-data">
            <div class="form-group">
			<label for="enName" class="col-sm-2 control-label">商品名称</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" placeholder="商品名称" id="enName" name="enName" value="${model.enName }"/>
			</div>
		</div>
		<div class="form-group">
             	<label for="introduce" class="col-sm-2 control-label">商品介绍</label>
             	<div class="col-sm-6">
            		<textarea class="form-control" rows="3" id="introduce" name="introduce">${model.introduce }</textarea>
            	</div>
             </div>
             <div class="form-group">
            	<label for="photo" class="col-sm-2 control-label">商品图片</label>
            	<div class="col-sm-10">
            		<img alt="${model.enName }" width="50px" height="50px" title="${model.enName }" src="${ctx }resources/${model.picUrl}" >
	            	<input type="file" name="photo" id="photo" title="点击更换商品图片"/>
            	</div>
            </div>
            <div class="form-group">
            	<label for="category" class="col-sm-2 control-label">商品分类</label>
            	<div class="col-sm-6">
            	<select name="parents" id="parents" class="form-control" onchange="changePC(this.value);">
	            <c:forEach items="${parents }" var="parent">
	            	<option value="${parent[0] }"
	            			<c:if test="${parent[0] eq model.category.parent.id }">
	            				selected="selected"
	            			</c:if>
	            		>
	            			${parent[1] }
	            		</option>
		            </c:forEach>
	            </select>
            <select class="form-control"  name="childC" id="childC"></select>
            	</div>
            </div>
			
			<div class="form-group">
            	<div class="col-sm-offset-2 col-sm-10">
            		<div class="checkbox">
            			<label>
		            		<input name="hot" type="checkbox" <c:choose>
			 		<c:when test="${model.hot }">
			 			checked="checked"
			 		</c:when>
			 	</c:choose>/>是否热门（勾选表示热门）
		            	</label>
            		</div>
            	</div>
            </div>
            
             <input type="hidden" name="id" value="${model.id }"/>
             <input type="hidden" name="pageNo" value="${pageNo }"/>
            <div class="form-group">
            	<div class="col-sm-offset-2 col-sm-10">
              <button class="btn btn-info" type="submit">提交</button>&nbsp;&nbsp;&nbsp;
              &nbsp;&nbsp;&nbsp;<button class="btn btn-default" type="reset">重置</button>
              </div>
            </div>
          </form>
          </div>
          </div>
          </article>
          </section>
</body>
</html>