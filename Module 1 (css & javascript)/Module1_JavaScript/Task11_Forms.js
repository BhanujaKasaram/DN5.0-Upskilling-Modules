document.getElementById("form").addEventListener("submit",function(event){

    event.preventDefault();

    const name = this.elements["name"].value;
    const email = this.elements["email"].value;

    if(name === "" || email === ""){
        alert("Fill all fields");
    }else{
        alert("Form Submitted");
    }

});