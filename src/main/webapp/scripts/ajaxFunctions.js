function ajax1(select, targetDiv) {

    var id = select.value;

    $.ajax({
        url: "/ajax/ajax1",
        data: "id=" + id,
        type: "GET",
        dataType: "html",

        success: function (data) {
            $('#' + targetDiv + '')[0].innerHTML = data;
        }
        ,
        error: function () {
            alert('Error');
        }
    })
}

function ajax2(link, targetDiv) {

    var href = link.innerHTML;

    $.ajax({
        url: href,
        type: "POST",
        dataType: "html",
        success: function (data) {
            $('#' + targetDiv + '')[0].innerHTML = data;
        }
        ,
        error: function () {
            alert('Error');
        }
    })
}

function ajax3(select) {

    var id = select.value;
    var x;

    $.ajax({
        type: "GET",
        url: "/ajax/ajax2",
        dataType: "xml",
        success: function (xml) {
            x = xml.documentElement.getElementsByTagName('usuario');
            for (var i = 0; i < x.length; i++) {
                if(x[i].getAttribute('id') == id){
                    $('#provDiv')[0].innerHTML = x[i].getElementsByTagName('provincia')[0].firstChild.nodeValue;
                    $('#ciudadDiv')[0].innerHTML = x[i].getElementsByTagName('ciudad')[0].firstChild.nodeValue;
                    $('#dirDiv')[0].innerHTML = x[i].getElementsByTagName('direccion')[0].firstChild.nodeValue;
                }
            }
        }
        ,
        error: function () {
            alert("The XML File could not be processed correctly.");
        }
    });
}
