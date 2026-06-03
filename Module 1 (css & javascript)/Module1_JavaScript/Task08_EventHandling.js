function register(){
    alert("Registered");
}

function filterCategory(){
    console.log("Category Changed");
}

document.getElementById("search").addEventListener("keydown",function(){
    console.log("Searching");
});