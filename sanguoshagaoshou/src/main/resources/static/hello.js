$(document).ready(function() {
    $.ajax({
        url: "http://localhost:8080/greeting"
    }).then(function(data, status, jqxhr) {
       $('.greeting-id').append(data.bloodPoint);
       $('.greeting-content').append(data.name);
       console.log(jqxhr);
    });
});
