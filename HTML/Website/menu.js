<<<<<<< HEAD
document.addEventListener('DOMContentLoaded', function() {
const github = document.getElementById('github-button');
const showbutton = document.getElementById('show-button');
const menu = document.getElementById('menu');

github.addEventListener('click', function(){
    window.location.href = 'https://github.com/Kur9ix?tab=repositories';
});

showbutton.addEventListener('click', function(){
    if(menu.style.display === 'none'){
        menu.style.display = 'block';
    } else{
        menu.style.display = 'none'
    }
});
});
=======
>>>>>>> 9197a51f469af01d2d48bf4f4d990f72a7f16ffe

