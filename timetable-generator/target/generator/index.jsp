
<html>
<body>
<h2>Hello World!</h2>


<%!
    public void jspDestroy(){
        System.out.println("Destroy> is callled = " + true);
    }
%>


<%!
    String someOutput() {
        return "Some output";
    }
%>
<% someOutput();
 int a = 5;
    a++;
    //


%>
<%= 5%>
</body>


</html>
