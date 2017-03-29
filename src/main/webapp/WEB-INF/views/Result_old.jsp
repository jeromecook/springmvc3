<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<div class="search-container">				
			<c:set var="listing" scope="request" value="${featured}"/>
			<iFrame src='<c:out value="${listing}"/>' height="1000" ></iframe>					
		</div>
		</body>
		</html>		