<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/resources/common/taglibs.jsp"%>
<html lang="en">
<head>
<%@ include file="/resources/common/meta.jsp"%>
<title>Identity Manager IAM</title>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<script type="text/javascript" src="<c:url value='/resources/js/jquery-1.11.2.min.js'/>"></script>
  <!-- Bootstrap CSS -->
  <!-- Bootstrap CSS -->
  <link href="<c:url value='/resources/bootstrap/bower_components/bootstrap/dist/css/bootstrap.min.css'/>" rel="stylesheet">
  <link href="<c:url value='/resources/bootstrap/bower_components/metisMenu/dist/metisMenu.min.css'/>" rel="stylesheet">
  <link href="<c:url value='/resources/bootstrap/dist/css/timeline.css'/>" rel="stylesheet">
  <link href="<c:url value='/resources/bootstrap/dist/css/sb-admin-2.css'/>" rel="stylesheet">
  <link href="<c:url value='/resources/bootstrap/bower_components/font-awesome/css/font-awesome.min.css'/>" rel="stylesheet" type="text/css">
  <link href="<c:url value='/resources/js/fancytree/skin/ui.fancytree.css'/>" rel="stylesheet" type="text/css" />
  <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
  <![endif]-->
  <!-- Kendo UI CSS -->
  <!-- 
  <link href="<c:url value='/resources/kendoui/styles/kendo.common.min.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/kendoui/styles/kendo.common-bootstrap.min.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/kendoui/styles/kendo.bootstrap.min.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/kendoui/styles/kendo.dataviz.min.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/kendoui/styles/kendo.dataviz.bootstrap.min.css'/>" rel="stylesheet" type="text/css" />
   -->
  <link href="<c:url value='/resources/kendoui/styles/kendo.common.min-v2017.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/kendoui/styles/kendo.common-bootstrap.min-v2017.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/kendoui/styles/kendo.bootstrap.min-v2017.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/kendoui/styles/kendo.dataviz.min-v2017.css'/>" rel="stylesheet" type="text/css" />
  <link href="<c:url value='/resources/kendoui/styles/kendo.dataviz.bootstrap.min-v2017.css'/>" rel="stylesheet" type="text/css" />
   
  <!-- tooltipster CSS -->
  <link href="<c:url value='/resources/js/tooltipster/tooltipster.bundle.min.css'/>" rel="stylesheet">
  
  <link href="<c:url value='/resources/css/common.css'/>" rel="stylesheet">
  
  
  <script type="text/javascript" src="<c:url value='/resources/js/ui/jquery-ui-1.10.4.min.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/jquery.validate.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/jquery.form.min.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/bootstrap-filestyle.min.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/bootstrap/bower_components/bootstrap/dist/js/bootstrap.min.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/bootstrap/bower_components/metisMenu/dist/metisMenu.min.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/bootstrap/dist/js/sb-admin-2.js'/>"></script>
  <!-- JSZIP for Excel Export -->
  <script type="text/javascript" src="<c:url value='/resources/js/jszip/jszip.min.js'/>"></script>
  <!-- 
  <script type="text/javascript" src="<c:url value='/resources/js/kendo.all.min.js'/>"></script>
   -->
  <script type="text/javascript" src="<c:url value='/resources/js/kendo.all.min-v2017.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/common.js'/>"></script>
  <script type="text/javascript" src="<c:url value='/resources/js/messages/kendo.messages.ko-KR.min.js'/>"></script>
  
  <!-- tooltipster -->
  <script type="text/javascript" src="<c:url value='/resources/js/tooltipster/tooltipster.bundle.min.js'/>"></script>

<link href="<c:url value='/resources/css/jquery-confirm.min.css'/>" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<c:url value='/resources/js/jquery-confirm.min.js'/>"></script>
<script type="text/javascript">

function getDate(date) {
	return date.substring(0,10);
}

function approveHistoryGridFn() {
	return $("#main_approvehistory_grid").kendoGrid({
		noRecords: {
			template: "<br/><p><i class='fa fa-info-circle'></i> 신청 이력이 없습니다.</p>"
		},
		dataSource: {
			transport: {
				read: {
					url: "${contextPath}/approveHistory/list",
					dataType: "json",
					type: "POST",
					cache: false
				},
				parameterMap: function (data, type) {
					if(type = "read"){
						var values = data;
						values["sort"] = JSON.stringify(values["sort"]);
						values["REQID"] = $("#reqUserId").val();
						if($("#main_approvehistory_search_requestid").val()) values["REQUSERID"] = $("#main_approvehistory_search_requestid").val();
						if($("#main_approvehistory_search_requestusername").val()) values["REQUSERNM"] = $("#main_approvehistory_search_requestusername").val();
						if($("#main_approvehistory_search_requeststatus").val()) values["REQSTATUS"] = $("#main_approvehistory_search_requeststatus").val();
						if($("#main_approvehistory_search_requestperiod").val()) values["REQPERIOD"] = $("#main_approvehistory_search_requestperiod").val();
						if($("#main_approvehistory_search_requesttype").val()) values["REQTYPE"] = $("#main_approvehistory_search_requesttype").val();
						if($("#main_approvehistory_search_requestcontents").val()) values["REQCONTENTS"] = $("#main_approvehistory_search_requestcontents").val();
						if($("#startDt").val()) values["STARTDT"] = $("#startDt").val();
						if($("#endDt").val()) values["ENDDT"] = $("#endDt").val();
						return values;
					}
				}
			},
			schema: {
				data: "list", 				// records are returned in the "data" field of the response
				total: "totalRecords" 		// total number of records is in the "total" field of the response
			},
			serverPaging: true,
			serverSorting: true,
			serverFiltering: false
		},
		sortable: true,
		pageable: {
			pageSize: 10,
			pageSizes: [5, 10, 20, 100],
			buttonCount: 10
		},
		selectable: true,
		change: onChangeApproveHistory,
		dataBound: onDataBoundApproveHistory,
		resizable: true,
		columnMenu: true,
		columns: [
            { field: "reqId", hidden: true },
            { field: "reqType", hidden: true },
            { field: "reqUserId", title: "<font style='font-size:14px;font-weight:bold;'>신청자 사번</font>"},
			{ field: "usrNm", title: "<font style='font-size:14px;font-weight:bold;'>신청자 이름</font>"},
			{ field: "reqContents", title: "<font style='font-size:14px;font-weight:bold;'>신청 사유</font>"},
			{ field: "reqDt", title: "<font style='font-size:14px;font-weight:bold;'>요청 날짜</font>", template: "#=getDate(reqDt) #"},
			{ field: "appprStat", title: "<font style='font-size:14px;font-weight:bold;'>승인 상태</font>",template: "#=getApproveType(appprStat) #"},  
			{ field: "apprDt", title: "<font style='font-size:14px;font-weight:bold;'>승인 날짜</font>", template: "#=getDate(apprDt) #"},
			{ field: "reqTypeNm", title: "<font style='font-size:14px;font-weight:bold;'>신청 타입</font>", template: "#=getReqTypeNm(reqType) #"}
		]
	}).data("kendoGrid");
}

function onChangeApproveHistory(arg) {
	$("#main_useradd_delete_btn").removeAttr("disabled");
}

function onDataBoundApproveHistory(arg) {
	$("#main_useradd_delete_btn").attr("disabled", "disabled");
}

function getReqTypeNm(arg) {
	if(arg == 'A'){
		return "사용자 신청";
	} else if(arg == 'E') {
		return "사용자 유효기간 변경";
	} else if(arg == 'R') {
		return "사용자 퇴사 처리";
	}
}

function getApproveType(arg) {
	if(arg == '00'){
		return  "결재생략";
	}else if(arg == '01') {
		return  "작성중";
	}else if(arg == '02') {
		return  "결재생략";
	}else if(arg == '03') {
		return  "승인신청";
	}else if(arg == '04') {
		return  "승인신청접수";
	}else if(arg == '05') {
		return  "승인결재중";
	}else if(arg == '06') {
		return  "결재완료";
	}else if(arg == '07') {
		return  "반려";
	}else if(arg == '08') {
		return  "취소";
	}
}

$(document).ready(function() {
	
	$("#userAdd_bulk_form").find("button.btn-dt10").click(function(e) {
		$("#usrreg-usr-search-window").load("${contextPath}/login/usrSearch", {callBackFnc: 'setUsrField'});
	});

	$( "#main_approvehistory_search_btn" ).click(function(e) {

		if(!$("#startDt").val()){
			alert("시작날짜를 지정 해주세요.");
			return;
		}
		if(!$("#endDt").val()){
			alert("종료날짜를 지정 해주세요.");
			return;
		}
		
		approveHistoryGrid.dataSource.page(1);
	});
	
	$("#main_approvehistory_search_cond").find("select.form-control").change(function(e) {
		approveHistoryGrid.dataSource.page(1);
	});
	
	$("#main_approvehistory_search_cond").find("input.form-control").keypress(function (e) {
		var key = e.which;
		if(key == 13) {  // the enter key code
			if(!$("#startDt").val()){
				alert("시작날짜를 지정 해주세요.");
				return;
			}
			if(!$("#endDt").val()){
				alert("종료날짜를 지정 해주세요.");
				return;
			}
			
			approveHistoryGrid.dataSource.page(1);
		}
	});

	$("#main_approvehistory_grid").on("dblclick","tr.k-state-selected",function(){
		var commonApproveHistorySearchGrid = $("#main_approvehistory_grid").data("kendoGrid");
		var selectedItem = commonApproveHistorySearchGrid.dataItem(commonApproveHistorySearchGrid.select());
    	if(typeof(selectedItem) !== 'undefined' && selectedItem !== null) {
        	console.log(selectedItem.reqId + "/" + selectedItem.reqType);
    		$("#main-approvehistory-detail-window").load("${contextPath}/approveHistory/detail", {reqId : selectedItem.reqId,reqType : selectedItem.reqType});
    		
    	}
	});
	
	approveHistoryGrid = approveHistoryGridFn();
	
	
	$("#main_approvehistory_refresh_btn").removeAttr("disabled");

	$("#main_approvehistory_refresh_btn").click(function(e) {

		approveHistoryGrid.dataSource.filter({});
		var options = localStorage["APPROVEHISTORYMAIN"];
        if (options) {
        	approveHistoryGrid.setOptions(JSON.parse(options));
        }
		
	});
	
	if (!$("input.dlgt-start").data("kendoDatePicker")
			|| !$("input.dlgt-end").data("kendoDatePicker")) {
		var now = new Date();
		now.setDate(now.getDate()-90);
		var mainApvpDlgtStart = $("input.dlgt-start").kendoDatePicker({
   	    	value: now,
   	        format: "yyyy-MM-dd",
   	        change: function() {
   	        	var endDateObj = $("input.dlgt-end").data("kendoDatePicker");
       	    	var startDate = this.value(),
       	        endDate = endDateObj.value();
       	        if (startDate) {
       	            startDate = new Date(startDate);
       	            startDate.setDate(startDate.getDate());
       	         	endDateObj.min(startDate);
       	        } else if (endDate) {
       	        	this.max(new Date(endDate));
       	        } else {
       	            endDate = new Date();
       	            this.max(endDate);
       	         	endDateObj.min(endDate);
       	        }
       	    }
   	    }).data("kendoDatePicker");
		
		var mainApvpDlgtEnd = $("input.dlgt-end").kendoDatePicker({
   	    	value: new Date(),
   	        format: "yyyy-MM-dd",
   	        change: function() {
   	        	var startDateObj = $("input.dlgt-start").data("kendoDatePicker");
       	        var endDate = this.value(),
       	        startDate = startDateObj.value();

       	        if (endDate) {
       	            endDate = new Date(endDate);
       	            endDate.setDate(endDate.getDate());
       	         	startDateObj.max(endDate);
       	        } else if (startDate) {
       	        	this.min(new Date(startDate));
       	        } else {
       	            endDate = new Date();
       	         	startDateObj.max(endDate);
       	            this.min(endDate);
       	        }
       	    }
   	    }).data("kendoDatePicker");
		
	}
	
	$( "#main_approvehistory_detail_btn" ).click(function(e) {
		var commonApproveHistorySearchGrid = $("#main_approvehistory_grid").data("kendoGrid");
		var selectedItem = commonApproveHistorySearchGrid.dataItem(commonApproveHistorySearchGrid.select());
    	if(typeof(selectedItem) !== 'undefined' && selectedItem !== null) {
        	console.log(selectedItem.reqId + "/" + selectedItem.reqType);
    		$("#main-approvehistory-detail-window").load("${contextPath}/approveHistory/detail", {reqId : selectedItem.reqId,reqType : selectedItem.reqType});
    		
    	}
	});
	
});


</script>
<style type="text/css">
	body {
		background-color: white;
	}
	span.dlgt-start {
		float: left;
	}
	span.dlgt-end {
		float: right;
	}
</style>
</head>

<div class="row">
	<div class="col-lg-12">
		<div class="panel panel-default" style="margin-top: 12px;">
			<div id="main_approvehistory_search_cond" class="panel-body">
				<div class="row">
					<div class="col-md-2" style="text-align: right;">
						<label>신청자 사번 </label>
					</div>
					<div class="col-md-3" style="text-align: left;">
						<div class="form-group">
							<input id="main_approvehistory_search_requestid" class="form-control input-sm" />
						</div>
					</div>
					<div class="col-md-2" style="text-align: right;">
						<label>신청자 이름</label>
					</div>
					<div class="col-md-3" style="text-align: left;">
						<div class="form-group">
							<input id="main_approvehistory_search_requestusername" class="form-control input-sm" />
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2" style="text-align: right;">
						<label>승인 상태 </label>
					</div>
					<div class="col-md-3" style="text-align: left;">
						<div class="form-group">
							<select id="main_approvehistory_search_requeststatus" class="form-control input-sm">
								<option value="" selected>전체</option>
								<option value="03">승인신청</option>
								<option value="06">결재완료</option>
								<option value="07">반려</option>
							</select>
						</div>
					</div>
					
					<div class="col-md-2" style="text-align: right;">
						<label>요청 날짜 </label>
					</div>
					
					<div class="col-md-3" style="text-align: left;">
						<div class="form-group">
							<input type="text" class="dlgt-dt dlgt-start" id="startDt" name="startDt" /> ~ <input type="text" class="dlgt-dt dlgt-end" id="endDt" name="endDt" />
							<!-- <select id="main_approvehistory_search_requestperiod" class="form-control input-sm">
								<option value="all" selected>전체</option>
								<option value="last1week">지난1주</option>
								<option value="last1month">지난1달</option>
								<option value="last6month">지난 6개월</option>
								<option value="last1year">지난 1년</option>
							</select> -->
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-md-2" style="text-align: right;">
						<label>신청 타입 </label>
					</div>
					<div class="col-md-3" style="text-align: left;">
						<div class="form-group">
							<select id="main_approvehistory_search_requesttype" class="form-control input-sm">
								<option value="" selected>전체</option>
								<option value="A">사용자 신청</option>
								<option value="E">사용자 유효기간 변경</option>
								<option value="R">사용자 퇴사 처리</option>
								
							</select>
						</div>
					</div>
					<div class="col-md-2" style="text-align: right;">
						<label>신청 사유</label>
					</div>
					<div class="col-md-3" style="text-align: left;">
						<div class="form-group">
							<input id="main_approvehistory_search_requestcontents" class="form-control input-sm" />
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>

	<div id="main-approvehistory-detail-window"></div>
<!-- 	<div class="row" style="margin-left: 120px; margin-right: 120px;">
		<div class="col-lg-12">
			<div class="panel panel-default" style="margin-top: 12px;">
				<div class="panel-body" style="text-align: center;">
					<h3>
						<i class="fa fa-edit"></i> 사용자 신청 / 유효기간 변경 신청 / 퇴사 신청
					</h3>
				</div>
			</div>
		</div>
	</div> -->
	<input type="hidden" name="reqUserId" id="reqUserId" value="${reqUserId }">
		<div class="panel panel-default"  style="margin-top:12px;">
			<div class="panel-body">
				<div class="row">
					<div class="col-md-6" style="text-align: left;">
						<p>
							<button id="main_approvehistory_refresh_btn" type="button" class="btn btn-primary btn-sm"><i class="fa fa-refresh"></i> 새로고침</button>
							<button id="main_approvehistory_detail_btn" type="button" class="btn btn-primary btn-sm"><i class="fa fa-edit"></i> 상세내역</button>
						</p>
					</div>
					<div class="col-md-6" style="text-align: right;">
			              <button id="main_approvehistory_search_btn" type="button" class="btn btn-primary btn-sm" style="width:160px;"><i class="fa fa-search"></i> 검색 </button>
					</div>
				</div>
				<div id="main_approvehistory_grid" class="ra-section"></div>
			</div>
		</div>
	<hr>
	


</html>