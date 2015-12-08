/**
 * Created by Администратор on 07.12.2015.
 */
$(document).ready(function(){

    function addBuilding(){
        $("#addForm").css("display","none") ;
        var name=$("#nameField").val();
        console.log(name);
        $.ajax({
            type:"POST",
            data:"name="+name,
            url:"resources/building",
            dataType:"json",
            success :  function(data){
                $("#content").append("<div class='entity'>"+
                "<div class='del-pane' >" +
                "<input type='hidden' value="+data.id +" /> &#10006;"+
                "</div>"+
                "<div id='f-name'><a href='rooms.html'><span>"+data.name+"</span></a></div>" +
                " <div id='edit-pane' class='active'>" +
                "<a href=#edit' >&#9998;edit</a>"+
                "</div></div>");
            }
        });
    }


    $(".add").click(function(){
        $("#addForm").css("display","block") ;
    });

    $("#addButton").click(addBuilding);
    $("#cancel").click(function(){
        $("#addForm").css("display","none") ;
    });

    $("#addForm").click(function(e){
        if (e.target === this){
            $(this).css("display","none") ;
        }
    });
    $(".del-pane").click(function(e){
        console.log("on delete : ");

        var id = $(this).children(":first").val();
        var currentElement = $(this);
        console.log("on delete : "+id);
        $.ajax({
            type:"DELETE",
            url:"resources/building?id="+id,
            dataType:"json",
            success :  function(data){
                currentElement.parent().remove();
            }
        });
    });

});