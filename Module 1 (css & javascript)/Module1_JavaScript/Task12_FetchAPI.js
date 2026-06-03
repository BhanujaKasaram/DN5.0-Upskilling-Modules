setTimeout(function(){

    fetch("https://jsonplaceholder.typicode.com/posts",{
        method:"POST",
        body:JSON.stringify({
            name:"John"
        }),
        headers:{
            "Content-Type":"application/json"
        }
    })
    .then(response => response.json())
    .then(data => console.log(data));

},2000);