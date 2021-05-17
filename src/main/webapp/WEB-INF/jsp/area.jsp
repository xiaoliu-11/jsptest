<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <script src="https://cdn.staticfile.org/jquery/1.10.2/jquery.min.js">
    </script>
    <script type="text/javascript">


        function getCity(){
            var pr_name = $("#province").val();
            console.log(pr_name);
            $("#city").html('<option value="">----请选择城市----</option>');
            $.ajax({
                url : "${pageContext.request.contextPath}/getCity/"+pr_name,
                type : "GET",
                dataType : "json",
                success : function(data){
                    if(data!=null){
                        $(data).each(function(index){
                            $("#city").append(
                                '<option value="'+data[index].city+'">'+data[index].city+'</option>'
                            );
                        });
                    }
                }
            });
        }
        function testJson2(){
            var ci_name = $("#city option:selected").val();
            $("#county").html('<option value="">--请选择县城--</option>');
            $.ajax({
                url : "${pageContext.request.contextPath }/getArea/"+ci_name,
                type : "GET",
                dataType : "json",
                success : function(data){
                    if(data!=null){
                        $(data).each(function(index){
                            $("#county").append(
                                '<option value="'+data[index].area+'">'+data[index].area+'</option>'
                            );
                        });
                    }
                }
            });
        }
    </script>
</head>
<body>

<select name="province"  id="province"  onclick="getCity()" >
    <option value="" >请选择省份</option>
    <c:forEach items="${provinces}" var="c1">
        <option value="${c1.province}">${c1.province}</option>
    </c:forEach>
</select>
<select name="city" id="city" onclick="testJson2()">
    <option value="">请选择城市</option>
</select>
<select name="county" id="county" >
    <option value="">请选择县城</option>
</select>
</body>
</html>
