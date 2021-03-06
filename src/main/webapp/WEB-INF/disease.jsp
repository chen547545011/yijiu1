<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    
    <title>My JSP 'index.jsp' starting page</title>
	
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="app/css/bootstrap.min.css"> 
    <link rel="stylesheet" href="app/css/bootstrap-table.min.css">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   <div class="container">
   <!--   <div>
        <label>纵向数目: </label><input id="cells" type="text" placeholder="Cells" value="5">
        <label>横向数目: </label><input id="rows" type="text" placeholder="Rows" value="100">
        <button id="build" class="btn btn-default">确定</button>
    </div>-->
    <table id="table"
           data-toggle="table"
           data-url="data/data1.json"
           data-show-columns="true"
           data-search="true"
           data-show-refresh="true"
           data-show-toggle="true"
           data-pagination="true"
           data-height="400"
           data-width="200">
        <thead>
        <tr>
            <th data-field="head" >头面躯体</th>
            <th data-field="internal">内科</th>
            <th data-field="women">妇儿科</th>
            <th data-field="out">皮伤外科</th>
            <th data-field="organs">五官科</th>
            <th data-field="hurry">急症</th>
            <th data-field="else">其他</th>
        </tr>
        </thead>
    </table>
</div>
<script src="app/js/jquery.min.js"></script>
<script src="app/js/bootstrap.min.js"></script>
<!--<script src="assets/bootstrap2.3/js/bootstrap.min.js"></script>-->
<script src="app/js/tableExport.js"></script>
<script src="app/js/jquery.base64.js"></script>
<script src="app/js/bootstrap-table.js"></script>
<script src="app/js/bootstrap-table-export.js"></script>
<script>
    $(function () {
        $('#build').click(build);//.trigger('click');
        $('#cells, #rows').keyup(function (e) {
            if (e.keyCode === 13) {
                build();
            }
        });
    });

    function build() {
        var cells = $('#cells').val(),
            rows = $('#rows').val(),
            i, j, row,
            columns = [],
            data = [];

        for (i = 0; i < cells; i++) {
            columns.push({
                field: 'field' + i,
                title: 'Cell' + i
            });
        }
        for (i = 0; i < rows; i++) {
            row = {};
            for (j = 0; j < cells; j++) {
                row['field' + j] = 'Row-' + i + '-' + j;
            }
            data.push(row);
        }
        $('#table').bootstrapTable('destroy').bootstrapTable({
            columns: columns,
            data: data
        });
    }

    function idFormatter(value) {
        return value + 100;
    }
</script>
  </body>
</html>
