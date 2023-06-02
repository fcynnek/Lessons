var usernameTextbox = document.querySelector('#username')
var passwordTextbox = document.querySelector('#password')
var confirmPasswordTb = document.querySelector('#confirmPassword')
var loginButton = document.querySelector('#login')
var eyeIcons = document.querySelectorAll('.fa-eye')
// .fa-eye from fontawesome eye icon class name (dot) to signify that it is selecting by class

eyeIcons.forEach((eyeIcon) => {
    eyeIcon.addEventListener('click', () => {
        if (eyeIcon.classList.contains('fa-eye')) {
            eyeIcon.classList.replace('fa-eye', 'fa-eye-slash')
            if (eyeIcon.getAttribute('id') === 'passwordEyeIcon') {
                passwordTextbox.type = 'text'
            } else {
                confirmPasswordTb.type = 'text'
            }
        } else {
            eyeIcon.classList.replace('fa-eye-slash', 'fa-eye')
            if (eyeIcon.getAttribute('id') === 'passwordEyeIcon') {
                passwordTextbox.type = 'password'
            } else {
                confirmPasswordTb.type = 'password'
            }
        }
    })
})

// demo code:

//var myPromise = new Promise((resolve, reject) => {
//    let i = 1

//    if (i === 1) {
//        resolve("hey, i ===1, so we're cool!")
//    } else {
//        reject("Absolutely fail. i != 1")
//    }
//})

//myPromise.then((message) => {
//    console.log(message)
//}).catch((message) => {
//    console.log(message)
//})

usernameTextbox.addEventListener('blur', () => {
    var user = {
        'username': usernameTextbox.value
        // 'password': passwordTextbox.value
        // no need for password because we're not validating it now
    }
    checkIfUserExists(user)
})

// for asynchronous to work, the method needs to be in its own function
async function checkIfUserExists(user) {
    //promise code:
    let responseEntity = await fetch('/users/exists', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    })
    // promise resoluation and returns object
    let userExists = await responseEntity.json()
    // no longer need for the below code because we are now setting a synchronous code with let/await
    //.then((responseEntity) => responseEntity.json())
    //.then((data) => {
    //if (data === true) {
    if (userExists === true) {
        // == checks for value
        // === checks for value and type
        console.log('Username already exists')
        usernameTextbox.focus()
        usernameTextbox.select()
        //showErrorAnimation(() => {
        //    console.log('right now at the callback function')
        //    usernameTextbox.style.backgroundColor = 'rgb(255,255,255)'
        //})
        showErrorAnimation().then((message) => {
            console.log('right now at the callback function')
            console.log(message)
            usernameTextbox.style.backgroundColor = 'rgb(255,255,255)'
        })
        //} else {
        //    usernameTextbox.style.backgroundColor = 'rgb(255,255,255)'
    }
}

function showErrorAnimation() {
    return new Promise((resolve, reject) => {
        //function showErrorAnimation (callback) {
        console.log('right now at the showErrorAnimation function')
        var i = 0
        var animationInterval = setInterval(() => {
            i++
            usernameTextbox.style.backgroundColor = 'rgb(${i},0,0)'
            if (i === 255) {
                clearInterval(animationInterval)
                console.log('done with the animation function')
                //callback()
            }
        }, 5)
    })
}
