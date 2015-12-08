/**
 * Created by Администратор on 07.12.2015.
 */



$("#cancel").click(function(){
    $("#superForm").remove();
});


$(".add").click(function(){
    $("body").append(
        "<div id='superForm'>"+
        "<div id='superCont'>"+
        "<input id='nameField' type='text' name='name'><br>"+
        "<input id='addButton' class='button' type='button' onclick='addBuilding()' value='ok'> <input id='cancel' class='button' onclick='cancelOption()'  type='button' value='cancel'>"+
        "</div>"+
        "</div>"
    );
});




$("#superForm").click(function(e){
    if (e.target === this){
        $(this).remove() ;
    }
});

function cancelOption(){
    $('#superForm').remove();
}

$(".del-pane").click(function(e){
    console.log("on delete : ");

    var id = $(this).parent().children(":first").val();
    var currentElement = $(this);
    console.log("on delete : "+id);
    $.ajax({
        type:"DELETE",
        url:"resources/buildings/"+id,
        dataType:"json",
        success :  function(data){
            currentElement.parent().remove();
        }
    });
});
$(".edit-pane").click(function(){
    var id = $(this).parent().children(":first").val();
    $("body").append(
        "<div id='superForm'>"+
        "<div id='superCont'>"+
        "<input id='editField' type='text'/>"+
        "<input id='confirmEdit' onclick='sendUpdate()' type='button' class='button' value='ok'/>"+
        "<input id='cancelEdit' type='button' onclick='cancelEdit()' class='button' value='cancel'/>"+
        "<input id='hide' type='hidden' value="+$(this).parent()+"/>"+
        "<input id='oldId' type='hidden' value="+id+"/>"+
        "</div>"+
        "</div>"
    );
});

function cancelEdit(){
    $("#superForm").remove();
};

function sendUpdate(){
    var old=$(this).parent().children("#hide").val();
    var id=$(this).parent().children("#oldId").val();
    var newName=$("#editField").val();
    $.ajax({
        type:"POST",
        data:{"id":id,"name":newName},
        url:"resources/buildings",
        dataType:"json",
        success :  function(data){
            old.remove();
            $(".add").before("<div class='entity'>"+
            "<div class='del-pane' >" +
            "<input type='hidden' value="+id +" /> &#10006;"+
            "</div>"+
            "<div id='f-name'><a href='rooms.html'><span>"+newName+"</span></a></div>" +
            " <div id='edit-pane' class='active'>" +
            "<a href=#edit' >&#9998;edit</a>"+
            "</div></div>");
            $("#superForm").remove();
        }
    });
};



function addBuilding(){
    var name=$("#nameField").val();
    console.log(name);
    $.ajax({
        type:"POST",
        data:"name="+name,
        url:"resources/buildings",
        dataType:"json",
        success :  function(data){
            $(".add").before("<div class='entity'>"+
            "<div class='del-pane' >" +
            "<input type='hidden' value="+data.id +" /> &#10006;"+
            "</div>"+
            "<div id='f-name'><a href='rooms.html'><span>"+data.name+"</span></a></div>" +
            " <div id='edit-pane' class='active'>" +
            "<a href=#edit' >&#9998;edit</a>"+
            "</div></div>");
            $("#superForm").remove();
        }
    });
}
