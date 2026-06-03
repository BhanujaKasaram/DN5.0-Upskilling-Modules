let events = [];

events.push("Music Event");
events.push("Workshop");

let musicEvents = events.filter(function(event){
    return event.includes("Music");
});

console.log(musicEvents);

let cards = events.map(function(event){
    return "Event : " + event;
});

console.log(cards);