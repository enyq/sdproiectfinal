<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.appusers-resources"/>
<html>
<head>
<title>View <fmt:message key="appusers.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="appusers.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexAppusers"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appusers.appuserid.title"/>:
						</td>
						<td>
							${appusers.appuserid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appusers.name.title"/>:
						</td>
						<td>
							${appusers.name}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appusers.username.title"/>:
						</td>
						<td>
							${appusers.username}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appusers.password.title"/>:
						</td>
						<td>
							${appusers.password}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appusers.address.title"/>:
						</td>
						<td>
							${appusers.address}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appusers.email.title"/>:
						</td>
						<td>
							${appusers.email}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appusers.phonenr.title"/>:
						</td>
						<td>
							${appusers.phonenr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appusers.birthdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${appusers.birthdate.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
			<div class="spacer">&nbsp;</div>
			<h1><fmt:message key="apppic.title"/></h1>
					
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newAppusersApppics?appusers_appuserid=${appusers.appuserid}&"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="apppic.title"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<thead>
					<tr>
						<th class="thead">&nbsp;</th>
						<th class="thead"><fmt:message key="apppic.apppicid.title"/></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${appusers.apppics}" var="current"  varStatus="i">	
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
							<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectAppusersApppics?appusers_appuserid=${appusers.appuserid}&apppics_apppicid=${current.apppicid}&"><img src="images/icons/view.gif" /></a>
							<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editAppusersApppics?appusers_appuserid=${appusers.appuserid}&apppics_apppicid=${current.apppicid}&"><img src="images/icons/edit.gif" /></a>
							<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteAppusersApppics?appusers_appuserid=${appusers.appuserid}&related_apppics_apppicid=${current.apppicid}&"><img src="images/icons/delete.gif" /></a>
						</td>
						<td>
							${current.apppicid}
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