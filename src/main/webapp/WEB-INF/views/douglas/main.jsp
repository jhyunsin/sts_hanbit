<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/top.jsp"/>
<jsp:include page="../global/header.jsp"/>
<jsp:include page="../global/navi.jsp"/>
<link rel="stylesheet" href="${css}/douglas.css"/>
<div id = "container">
<section>
	<button id="bt_bom">BOM(browser Object Model)</button> <br />
	<button id="bt_dom">DOM(document Object Model)</button> <br />
	<button id="bt_kaup">KAUP</button> <br />
	<button id="bt_account">CREATOR</button> <br />
	
</section>

</div>
 <jsp:include page = "../global/footer.jsp"/>
<jsp:include page = "../global/end.jsp"/>
<script src="${js}/douglas.js"></script>
<script type="text/javascript">
   douglas.init();
  </script>