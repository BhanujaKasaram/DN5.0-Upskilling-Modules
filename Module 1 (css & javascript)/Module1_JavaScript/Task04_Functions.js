function addEvent(name){
    console.log(name + " Added");
}

function registerUser(name){
    console.log(name + " Registered");
}

function filterEventsByCategory(category){
    console.log("Filtering " + category);
}

function registrationCounter(){
    let count = 0;

    return function(){
        count++;
        return count;
    };
}

const counter = registrationCounter();

console.log(counter());