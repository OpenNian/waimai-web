<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/commons/include.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理|后台管理系统</title>
<link href="/resources/css/style.default.css" rel="stylesheet">
<link href="/resources/css/jquery.datatables.css" rel="stylesheet">
<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
  <script src="js/html5shiv.js"></script>
  <script src="js/respond.min.js"></script>
  <![endif]-->
<script type="text/javascript">
	var update = function(obj){
		var roleName = $(obj).attr("name");
		var url = '${ctx}admin/sys/role_updatePre.do?pageNo=${pageNo}&name='+roleName;
		art.dialog.open(url,{
			title:'编辑角色信息',
			id:'bianji',
			width:500,
			resize: false
			});
		};
		
		var tianjia = function(){
			var url = "${ctx}admin/sys/role/add.jsp?pageNo=${pageNo}";
			art.dialog.open(url,{
				title:'添加角色',
				id:'tianjia',
				width: 500,
				resize: false
			});
		};
		
		var del = function(obj){
			var roleName = $(obj).attr("name");
			art.dialog.confirm('确定删除此角色',function(){
				var url = '${ctx}admin/sys/role_del.do?pageNo=${pageNo}&name='+roleName;
				window.location.href=url;
			});
		};
		
		function qxfp(){
			window.location.href = '${ctx}admin/sys/role/qxfp.jsp';
		}
		
</script>
</head>
<body>
	<!-- Preloader -->
	<div id="preloader">
	    <div id="status"><i class="fa fa-spinner fa-spin"></i></div>
	</div>
	<section>
	<jsp:include page="/WEB-INF/admin/commons/left.jsp"/>
	<div class="mainpanel">
	<jsp:include page="/WEB-INF/admin/commons/headerbar.jsp"/>    
	<jsp:include page="/WEB-INF/admin/commons/pageheader.jsp"/>
	<div class="contentpanel">
    	<div class="row">
    	<div class="panel panel-default">
    		<div class="panel-body">
    			<div class="table-responsive">
    				<div role="grid" class="dataTables_wrapper" id="table2_wrapper"><div id="table2_length" class="dataTables_length"><label>Show <select name="table2_length" size="1" aria-controls="table2" style="display: none;"><option value="10" selected="selected">10</option><option value="25">25</option><option value="50">50</option><option value="100">100</option></select><div class="chosen-container chosen-container-single chosen-container-single-nosearch" style="width: 55px;" title=""><a tabindex="-1" class="chosen-single"><span>10</span><div><b></b></div></a><div class="chosen-drop"><div class="chosen-search"><input type="text" autocomplete="off" readonly=""></div><ul class="chosen-results"></ul></div></div> entries</label></div><div class="dataTables_filter" id="table2_filter"><label>Search: <input type="text" aria-controls="table2"></label></div><table id="table2" class="table dataTable" aria-describedby="table2_info">
              <thead>
                 <tr role="row">
                 <th role="columnheader" tabindex="0" aria-controls="table2" 
                 rowspan="1" colspan="1" style="width: 164px;" aria-sort="ascending" 
                 aria-label="Rendering engine: activate to sort column descending">序号</th>
                 <th role="columnheader" tabindex="0" aria-controls="table2" 
                 rowspan="1" colspan="1" style="width: 164px;" aria-sort="ascending" 
                 aria-label="Rendering engine: activate to sort column descending">角色名</th>
                 <th role="columnheader" tabindex="0" aria-controls="table2" 
                 rowspan="1" colspan="1" style="width: 164px;" aria-sort="ascending" 
                 aria-label="Rendering engine: activate to sort column descending">创建日期</th>
                 <th class="table-action" role="columnheader" tabindex="0" aria-controls="table2" rowspan="1" 
                 colspan="1" style="width: 99px;" 
                 aria-label="CSS grade: activate to sort column ascending">操作</th></tr>
              </thead>
           <tbody role="alert" aria-live="polite" aria-relevant="all">
           		<c:forEach items="${page.result }" var="item" varStatus="status">
           			<tr class="gradeA odd">
	           			<td class="  sorting_1">${(page.currentPageIndex-1)*(page.pageSize)+status.index+1 }</td>
	                    <td class="  sorting_1">${item.desc }</td>
	                    <td class="  sorting_1">
	                    <fmt:formatDate value="${item.createDate }" pattern="yyyy-MM-dd HH:mm:ss"/>
	                    </td>
	                    <td class="table-action">
	                    	<a href="#">
	                    		<i class="fa fa-pencil"></i>
	                    	</a>
	                    	<a class="delete-row" href="#"><i class="fa fa-trash-o"></i></a>
	                    </td>
                 	</tr>
           		</c:forEach>
                 </tbody>
                 </table>
                 <c:import url="/WEB-INF/admin/commons/page.jsp">
             			<c:param name="url" value="background/sys/role/"/>
             		</c:import>
                 </div>
    			</div>
    		</div>
    	</div>
    	</div>
    </div>
    </div>
	</section>
	<script src="/resources/js/jquery-1.10.2.min.js"></script>
	<script src="/resources/js/jquery-migrate-1.2.1.min.js"></script>
	<script src="/resources/js/bootstrap.min.js"></script>
	<script src="/resources/js/modernizr.min.js"></script>
	<script src="/resources/js/jquery.sparkline.min.js"></script>
	<script src="/resources/js/toggles.min.js"></script>
	<script src="/resources/js/retina.min.js"></script>
	<script src="/resources/js/jquery.cookies.js"></script>
	
	<script src="/resources/js/jquery.datatables.min.js"></script>
	<script src="/resources/js/chosen.jquery.min.js"></script>
	
	<script src="/resources/js/custom.js"></script>
</body>
</html>