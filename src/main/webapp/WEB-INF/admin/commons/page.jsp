<%@page import="java.net.URLEncoder"%>
<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/commons/include.jsp" %>
<c:if test="${not empty page}">
			<div class="dataTables_info" id="table2_info">Showing ${(page.currentPageIndex-1)*(page.pageSize)+1 } to 
                 ${(page.currentPageIndex*page.pageSize)>page.totalRowNum?page.totalRowNum:(page.currentPageIndex*page.pageSize)} 
                 of ${page.totalRowNum } entries</div>
                 <div class="dataTables_paginate paging_full_numbers" id="table2_paginate">
                 <c:if test="${page.hasFirst}">
                <a class="first paginate_button" href="${ctx}${param.url}/1" tabindex="0" id="table2_first">首页</a>
                </c:if>
                <c:if test="${page.hasPrev}">
                 <a class="previous paginate_button" tabindex="0" id="table2_previous">Previous</a>
                 </c:if>
                 <span>
                 <c:forEach begin="${page.startPageIndex}" end="${page.endPageIndex}"
						var="i">
						<c:choose>
							<c:when test="${i==page.currentPageIndex}">
                 				<a class="paginate_active" tabindex="0" title="${i }">${i }</a>
                 			</c:when>
                 			<c:otherwise>
                 				<a class="paginate_button" href="${ctx}${param.url}${i }.htm" tabindex="0" title="${i }">${i }</a>
                 			</c:otherwise>
                 		</c:choose>
                 </c:forEach>
                 </span>
                 <c:if test="${page.hasNext}">
                 <a class="next paginate_button" tabindex="0" id="table2_next">Next</a>
                 </c:if>
                 <c:if test="${page.hasLast}">
                 <a class="last paginate_button" tabindex="0" id="table2_last">Last</a>
                 </c:if>
                 </div>
</c:if>                 
