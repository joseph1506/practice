<%@ page import="com.bt.andes.sqe.multisite.bulkconfig.context.UserHolder" %>
<%@ page import="com.bt.andes.sqe.prodsqe.common.util.SqeApplicationUtil" %>
<%@ page errorPage="uiError.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title>BulkConfiguration</title>
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>
    <link type="text/css" href="css/angular/core_extjs.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="ext-4.0.7/resources/css/ext-all.css"/>
    <link rel="stylesheet" type="text/css" href="css/bulkImages.css"/>
    <link rel="stylesheet" type="text/css" href="ext-4.0.7/examples/ux/css/CheckHeader.css">
    <link rel="stylesheet" type="text/css" href="sqeapp/css/bulk-override.css"/>
    <!--[if gte IE 9]>
    <link rel="stylesheet" type="text/css" href="sqeapp/css/ext-ie11.css"/>
    <![endif]-->
    <style type="text/css">
        .x-grid-row .custom-column {
            background-color: #c6d7ff;
        }

        /*@media all and (-ms-high-contrast: none), (-ms-high-contrast: active) {
            *//* IE10+ CSS styles go here *//*
            .x-panal-header-default {
                line-height: 21px;
            }

            .x-box-inner {
                position: static;
            }

            .x-panel-header-text-default {
                margin-left: 25px;
                font-weight:bold;
                color:#04408c;
                font-family: tahoma, arial, verdana, sans-serif;
            }
        }*/
    </style>
    <script type="text/javascript" src="ext-4.0.7/ext-all.js"></script>
    <script type="text/javascript" src="sqeapp/functions/renderer.js"></script>
    <script type="text/javascript" src="sqeapp/functions/functions.js"></script>
    <script type="text/javascript" src="sqeapp/functions/revalidation.js"></script>
    <script type="text/javascript" src="sqeapp/locale/sqe-lang-en.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/ApeComments/apecomments.js?nocache"></script>

    <script type="text/javascript">
        var journeyType = '<%=session.getAttribute("journeyType") %>';
        var quoteHeaderId = ${quoteId};
        //var autoSaveOn=true;
        var requestPath = "<%=request.getContextPath()%>";
        var checkSessionUrl = requestPath + '/jsp/sessioncheck/check_session.jsp';
        var extendSessionUrl = requestPath + '/jsp/sessioncheck/extend_session.jsp';
        var sessionTimeoutInMillis = ${sessionTimeoutInMillis};
        var timeToExtendTheSessionInMillis = ${timeToExtendTheSessionInMillis};
        var customerId = ${customerId};
        var bfgCustomerId = "<%=session.getAttribute("bfgCustomerId") %>";
        var currency = "<%=session.getAttribute("expedioCurrency") %>";
        var quoteName = "<%=session.getAttribute("quoteName") %>";
        var expedioQuoteId = "<%=session.getAttribute("expedioQuoteId") %>";
        var customerName = "<%=session.getAttribute("customerName") %>";
        var salesChannelName = "<%=session.getAttribute("salesChannelName") %>";
        var userName = "<%=session.getAttribute("userName") %>";
        var quickProdConfigWindow = '';
        var manageNonStandard = <%=session.getAttribute("manageNonStandard") %>;
        var PAGE_CONTEXT = {
            ppsrParams: {
                rowData: '',
                referenceDataKey: '',
                legType: ''
            },
            rowIndex: 0,
            supplier: ''
        };
        window.onbeforeunload = confirmExit;

        function confirmExit() {
            if (((window.event.clientX < 0) && (window.event.clientY < -50)) ||
                    (((window.event.clientX > 0) || (window.event.clientY < 0) || (window.event.clientX < -80)) ))
                event.returnValue = "There's still unsaved data on the page!";
        }
        Ext.apply(Ext, {
            isIE: true,
            isIE11: true,
            ieVersion: 11
        });
    </script>

</head>
<body id="bulk-ivpn-ext">

    <div id="loadingImage" class="loadingImage">
        <img src="images/loading.gif">
    </div>
    <input type="hidden" id="quoteId" name="quoteId" value="<%=session.getAttribute("quoteId") %>"/>
    <input type="hidden" id="sessionTimeoutInMillis" name="sessionTimeoutInMillis" value="<%=session.getAttribute("sessionTimeoutInMillis") %>"/>
    <input type="hidden" id="timeToExtendTheSessionInMillis" name="timeToExtendTheSessionInMillis" value="<%=session.getAttribute("timeToExtendTheSessionInMillis") %>"/>
    <input type="hidden" id="quoteVersion" value='<%=session.getAttribute("quoteVersion")%>'/>
    <input type="hidden" id="quoteName" value='<%=session.getAttribute("quoteName") %>'/>
    <input type="hidden" id="expedioQuoteId" value='<%=session.getAttribute("expedioQuoteId") %>'/>
    <input type="hidden" id="customerName" name="customerName" value='<%=session.getAttribute("customerName") %>'/>
    <input type="hidden" name="userRole" id="userRole" value="<%=UserHolder.getUserRole()%>"/>
    <input type="hidden" name="siebelId" id="siebelId" value="<%=session.getAttribute("siebelId") %>"/>
    <input type="hidden" name="guid" id="guid" value="${sessionScope.guid}"/>
    <input type="hidden" name="activateIfcFilter" id="activateIfcFilter" value="${activateIfcFilter}"/>
    <input type="hidden" name="autoSaveTimeIntervel" id="autoSaveTimeIntervel" value="${autoSaveTimeIntervel}"/>
    <input type="hidden" name="autoSaveOn" id="autoSaveOn" value="${autoSaveOn}"/>
    <input type="hidden" name="productId" id="productId" value="${productId}"/>
    <input type="hidden" name="managedSolutionsFlag" id="managedSolutionsFlag" value="<%=session.getAttribute("managedSolutionsFlag") %>"/>
    <input type="hidden" name="currency" id="currency" value="<%=session.getAttribute("expedioCurrency") %>"/>
    <input type="hidden" name="bfgSiteId" id="bfgSiteId" value="<%=session.getAttribute("bfgSiteId") %>"/>
    <input type="hidden" name="manageNonStandard" id="manageNonStandard" value="<%=session.getAttribute("manageNonStandard") %>"/>
    <input type="hidden" name="userName" id="userName" value="<%=session.getAttribute("userName") %>"/>
    <input type="hidden" name="salesChannelName" id="salesChannelName" value="<%=session.getAttribute("salesChannelName") %>"/>
    <input type="hidden" name="ein" id="ein" value="<%=session.getAttribute("ein") %>"/>
    <input type="hidden" name="mbpFlag" id="mbpFlag" value="${mbpFlag}"/>
    <input type="hidden" name="mbpEnabled" id="mbpEnabled" value="${mbpEnabled}"/>
    <input type="hidden" name="mbpSupplierType" id="mbpSupplierType" value="${mbpSupplierType}"/>

    <form method="post">
        <input type="hidden" id="siteText" name="siteText" value=""/>
        <input type="hidden" id="quoteHeaderId" name="qoteHeaderid" value="<%=session.getAttribute("quoteHeaderId") %>"/>
        <input type="hidden" id="customerId" name="customerId" value="<%=session.getAttribute("customerId") %>"/>
        <input type="hidden" id="bfgCustomerId" name="bfgCustomerId" value="<%=session.getAttribute("bfgCustomerId") %>"/>
        <input type="hidden" id="comingFrom" name="comingFrom" value="newBulkUI"/>
        <input type="hidden" name="salesChannelType" id="salesChannelType" value="<%=UserHolder.getSalesChannelType()%>"/>
        <input type="hidden" id="journeyType" name="journeyType" value="<%=session.getAttribute("journeyType") %>"/>
    </form>
    <form name="login_page_form" action="<%=SqeApplicationUtil.getUrl("EXPEDIO_LOGIN_URL")%>" target="_parent"></form>
    <script type="text/javascript" src="app.js"></script>
</body>
</html>
