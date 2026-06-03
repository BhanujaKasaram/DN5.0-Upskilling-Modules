let seats = 10;
let eventDate = new Date("2026-12-15");
let today = new Date();

if(eventDate > today && seats > 0){
    console.log("Event Available");
}else{
    console.log("Event Not Available");
}

const events = ["Music","Workshop","Sports"];

events.forEach(function(event){
    console.log(event);
});

try{
    let registration = true;

    if(!registration){
        throw "Registration Failed";
    }

    console.log("Registration Successful");

}catch(error){
    console.log(error);
}