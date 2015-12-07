/**
 * Created by Администратор on 07.12.2015.
 */
$(document).ready(function(){

    function addBuilding(){
        $("#addForm").css("display","none") ;
        var name=$("#name").val();
        $.ajax({
            type:"POST",
            data:"",
            url:"",
            dataType:"json",
            success :  function(data){
                $("#content").append("<div class='entity'>"+
                "<div id='del-pane'>" +
                " <a href=#del'>&#10006;</a>"+
                "</div>"+
                "<div id='f-name'><a href='rooms.html'><span>data.name</span></a></div>" +
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
    })


});