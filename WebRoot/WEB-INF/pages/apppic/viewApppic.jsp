<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.apppic-resources"/>
<html>
<head>
<title>View <fmt:message key="apppic.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="apppic.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexApppic"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="apppic.apppicid.title"/>:
						</td>
						<td>
							${apppic.apppicid}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="appusers.title"/></h1>
					
						<c:if test='${apppic.appusers != null}'>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td  class="label">
							<fmt:message key="appusers.appuserid.title"/>:
						</td>
						<td>
							${apppic.appusers.appuserid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="appusers.name.title"/>:
						</td>
						<td>
							${apppic.appusers.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="appusers.username.title"/>:
						</td>
						<td>
							${apppic.appusers.username}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="appusers.password.title"/>:
						</td>
						<td>
							${apppic.appusers.password}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="appusers.address.title"/>:
						</td>
						<td>
							${apppic.appusers.address}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="appusers.email.title"/>:
						</td>
						<td>
							${apppic.appusers.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="appusers.phonenr.title"/>:
						</td>
						<td>
							${apppic.appusers.phonenr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td  class="label">
							<fmt:message key="appusers.birthdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${apppic.appusers.birthdate.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/editApppicAppusers?apppic_apppicid=${apppic.apppicid}&appusers_appuserid=${apppic.appusers.appuserid}&"><span><img src="images/icons/edit.gif" /><fmt:message key="navigation.edit"/></span></a></div>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/confirmDeleteApppicAppusers?apppic_apppicid=${apppic.apppicid}&related_appusers_appuserid=${apppic.appusers.appuserid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
						</c:if>
						<c:if test='${apppic.appusers == null}'>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newApppicAppusers?apppic_apppicid=${apppic.apppicid}&"><span><img src="images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="appusers.title"/></span></a></div>
						</c:if>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="appcomments.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newApppicAppcommentses?apppic_apppicid=${apppic.apppicid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="appcomments.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="appcomments.appcommentsid.title"/></th>
						<th class="thead"><fmt:message key="appcomments.commenttext.title"/></th>
						<th class="thead"><fmt:message key="appcomments.commentsdate.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${apppic.appcommentses}" var="current"  varStatus="i">	
						<c:choose>
							<c:when test="${(i.count) % 2 == 0}">
					    		<c:set var="rowclass" value="rowtwo"/>
							</c:when>
							<c:otherwise>
					    		<c:set var="rowclass" value="rowone"/>
							</c:otherwise>
						</c:choose>
					<tr class="${rowclass}">
						<td nowrap="nowrap">
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectApppicAppcommentses?apppic_apppicid=${apppic.apppicid}&appcommentses_appcommentsid=${current.appcommentsid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editApppicAppcommentses?apppic_apppicid=${apppic.apppicid}&appcommentses_appcommentsid=${current.appcommentsid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteApppicAppcommentses?apppic_apppicid=${apppic.apppicid}&related_appcommentses_appcommentsid=${current.appcommentsid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.appcommentsid}
						&nbsp;
						</td>
						<td>
							${current.commenttext}
						&nbsp;
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${current.commentsdate.time}"/>
						&nbsp;
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>