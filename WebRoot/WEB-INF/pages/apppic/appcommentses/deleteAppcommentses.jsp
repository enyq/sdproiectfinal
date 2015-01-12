<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.apppic-resources"/>
<html>
<head>
<title>View <fmt:message key="apppic.title"/> <fmt:message key="appcomments.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="navigation.view"/> <fmt:message key="appcomments.title"/></h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/selectApppic?apppicidKey=${apppic_apppicid}&"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appcomments.appcommentsid.title"/>:
						</td>
						<td>
							${appcomments.appcommentsid}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appcomments.commenttext.title"/>:
						</td>
						<td>
							${appcomments.commenttext}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="appcomments.commentsdate.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${appcomments.commentsdate.time}"/>
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteApppicAppcommentses?apppic_apppicid=${apppic_apppicid}&related_appcommentses_appcommentsid=${appcomments.appcommentsid}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>
