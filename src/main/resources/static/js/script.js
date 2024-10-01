

let currentTheater = getTheme();
console.log(currentTheater)
changeTheme();
function changeTheme() {
    document.querySelector('html').classList.add(currentTheater);
    const chnagebtn=document.querySelector('#thene_change_button');
    chnagebtn.addEventListener("click",(event)=>{
        document.querySelector('html').classList.remove(currentTheater);
        if(currentTheater==="dark"){
            currentTheater="light"
        }else{
             currentTheater="dark"
        }
        setTheme(currentTheater);
        document.querySelector('html').classList.add(currentTheater);
    })
}

//set theme is  localStore 
function setTheme(theme) {
    localStorage.setItem("theme",theme);
}

//get theme is  localStore 
function getTheme() {
    let theme =localStorage.getItem("theme");
   return theme ? theme:"light";
}