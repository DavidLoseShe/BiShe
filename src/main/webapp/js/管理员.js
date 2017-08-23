/**
 * Created by d on 2017/7/27.
 */
$(function () {

});

var TableInit = function () {
    var oTableInit = new Object();
    //初始化Table
    oTableInit.SInit = function (aurl) {

        $.ajax({
            url: aurl,
            type: "post",
            dataType: "json",
            success: function (value) {

                var obj = [];
                $.each(value.activityInformationList, function (i, d) {
                    obj.push(d);
                    // alert(obj.coursename);
                });
                $table = $('#tb_departments').bootstrapTable(
                    {
                        data: obj, //最终的JSON数据放在这里
                        height: 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                        toolbar: '#toolbar',
                        striped: true,
                        cache: false,
                        sortable: false, //是否启用排序
                        sortOrder: "asc", //排序方式
                        pagination: true,
                        pageNumber: 1,
                        pageSize: 9,
                        pageList: [ 9,10,20],
                        search: true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
                        strictSearch: false,//
                        searchAlign: 'right',
                        showColumns: true, //是否显示所有的列
                        showRefresh: false,
                        showExport: true, //是否显示导出
                        clickToSelect: true, //是否启用点击选中行
                        exportDataType: "selected", //basic', 'all', 'selected'.
                        sidePagination: "client",
                        editable: true,
                        uniqueId: "activityId", //每一行的唯一标识，一般为主键列
                        showToggle: true, //是否显示详细视图和列表视图的切换按钮
                        cardView: false, //是否显示详细视图
                        detailView: false,
                        minimumCountColumns: 1, //最少允许的列数


                        /*                rowStyle : function(row, index) {
                         //这里有5个取值代表5中颜色['active', 'success', 'info', 'warning', 'danger'];
                         var strclass = "";
                         if (row.ORDER_STATUS == "待排产") {
                         strclass = 'success';//还有一个active
                         } else if (row.ORDER_STATUS == "已删除") {
                         strclass = 'danger';
                         } else {
                         return {};
                         }
                         return {
                         classes : strclass
                         }
                         },*/
                        /*                onEditableSave : function(field, row,
                         oldValue, $el) {
                         $.ajax({
                         type : "post",
                         url : "/Editable/Edit",
                         data : {
                         strJson : JSON.stringify(row)
                         },
                         success : function(data, status) {
                         if (status == "success") {
                         alert("编辑成功");
                         }
                         },
                         error : function() {
                         alert("Error");
                         },
                         complete : function() {

                         }
                         });
                         },*/
                        columns: [
                            /*  {
                             checkbox : true
                             },*/
                            {
                                title: '序号',//标题  可不加
                                width:30,
                                formatter: function (value,
                                                     row, index) {
                                    return index + 1;
                                }
                            }, {

                                field: 'activityId', //列ID同时也是指定要显示的数据的ID
                                title: 'id',
                                width:30,
                                align: 'center',
                                valign: 'middle',
                                sortable: true,
                            }, {
                                field: 'activityKind',
                                title: '活动类别',
                                width:30,
                                align: 'center',
                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'activityName',
                                title: '活动名称',

                                align: 'center',
                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'activityContent',
                                title: '活动内容',

                                align: 'center',
                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'activityAddress',
                                title: '活动地址',//标题
                                align: 'center',
                                valign: 'middle',
                                sortable: true
                            },{
                                field: 'activityStartTime',
                                title: '活动开始时间',
                                align: 'center',

                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'activityEndTime',
                                title: '活动结束时间',
                                align: 'center',

                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'activityPeopleId',
                                title: '活动发布人',
                                align: 'center',

                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'activityTime',
                                title: '活动发布时间',

                                align: 'center',
                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'activityState',
                                title: '状态',
                                align: 'center',

                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'operate',
                                title: '操作',
                                align: 'center',

                                valign: 'middle',
                                formatter: operateFormatter,
                                events: operateEvents
                            }]

                    });
            }
        });
        function operateFormatter(value, row, index) {
            return [
                '<a class="like" href="javascript:void(0)" title="Like">',
                '<i class="glyphicon glyphicon-heart"></i>',
                '</a> ',
                '<a class="remove" href="javascript:void(0)" title="Remove">',
                '<i class="glyphicon glyphicon-remove"></i>',
                '</a>'
            ].join('');
        }

        window.operateEvents = {
            'click .like': function (e, value, row, index) {
                alert('You click like action, row: ' + JSON.stringify(row.activityAddress));
            },
            'click .remove': function (e, value, row, index) {
                $table.bootstrapTable('remove', {
                    field: 'activityAddress',
                    values: [row.activityAddress]
                });
            }

        }
    }
    return oTableInit;
}
var StudentTable = function () {
    var studentTable = new Object();
    //初始化Table
    studentTable.Init = function (aur2) {
        $.ajax({
            url: aur2,
            type: "post",
            dataType: "json",
            success: function (value) {

                var obj = [];
                $.each(value.studentinformationList, function (i, d) {
                    obj.push(d);
                });
                $table = $('#tb_departments').bootstrapTable(
                    {
                        data: obj, //最终的JSON数据放在这里
                        height: 500, //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
                        toolbar: '#toolbar',
                        striped: true,
                        cache: false,
                        sortable: false, //是否启用排序
                        sortOrder: "asc", //排序方式
                        pagination: true,
                        pageNumber: 1,
                        pageSize: 9,
                        pageList: [ 9,10,20],
                        search: true, //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
                        strictSearch: false,//
                        searchAlign: 'right',
                        showColumns: true, //是否显示所有的列
                        showRefresh: false,
                        showExport: true, //是否显示导出
                        clickToSelect: true, //是否启用点击选中行
                        exportDataType: "selected", //basic', 'all', 'selected'.
                        sidePagination: "client",
                        editable: true,
                        uniqueId: "studentId", //每一行的唯一标识，一般为主键列
                        showToggle: true, //是否显示详细视图和列表视图的切换按钮
                        cardView: false, //是否显示详细视图
                        detailView: false,
                        minimumCountColumns: 1, //最少允许的列数
                        columns: [
                            /*  {
                             checkbox : true
                             },*/
                            {
                                title: '序号',//标题  可不加
                                width:30,
                                formatter: function (value,
                                                     row, index) {
                                    return index + 1;
                                }
                            }, {

                                field: 'studentId', //列ID同时也是指定要显示的数据的ID
                                title: 'studentId',
                                align: 'center',
                                valign: 'middle',
                                sortable: true,
                            }, {
                                field: 'studentName',
                                title: '学生姓名',
                                align: 'center',
                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'studentClass',
                                title: '学生班级',

                                align: 'center',
                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'stduentQq',
                                title: '学生qq',

                                align: 'center',
                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'studentSay',
                                title: '个性签名',
                                align: 'center',

                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'studentflower',
                                title: '鲜花数',
                                align: 'center',

                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'studentLoginTime',
                                title: '上次登录时间',
                                align: 'center',
                                valign: 'middle',
                                sortable: true
                            }, {
                                field: 'operate',
                                title: '操作',
                                align: 'center',

                                valign: 'middle',
                                formatter: operateFormatter,
                                events: operateEvents
                            }]

                    });
            }
        });
        function operateFormatter(value, row, index) {
            return [
                '<a class="like" href="javascript:void(0)" title="Like">',
                '<i class="glyphicon glyphicon-heart"></i>',
                '</a> ',
                '<a class="remove" href="javascript:void(0)" title="Remove">',
                '<i class="glyphicon glyphicon-remove"></i>',
                '</a>'
            ].join('');
        }

        window.operateEvents = {
            'click .like': function (e, value, row, index) {
             alert('You click like action, row: ' + JSON.stringify(row.activityAddress));
             },
             'click .remove': function (e, value, row, index) {
             $table.bootstrapTable('remove', {
             field: 'activityAddress',
             values: [row.activityAddress]
             });
             }

        }
    }
    return studentTable;
}
function ActivityInformationTable() {
    $("#table").html("<table id='tb_departments'></table>");

    var oTable = new TableInit();
    oTable.SInit("AdminActivityAdminQueryActivityInfoAction.action");
}
function StudentInformationTable() {
    $("#table").html("<table id='tb_departments'></table>");
    var student =new StudentTable();
    student.Init("AdminStudentAdminQueryStudentInfoAction.action");
}