var usernameTextbox = document.querySelector('#username')
var passwordTextbox = document.querySelector('#password')
var loginButton = document.querySelector('#login')

var user = {
    'username': usernameTextbox.value
    // 'password': passwordTextbox.value
    // no need for password because we're not validating it now
}

usernameTextbox.addEventListener('blur', () => {
    fetch('/users/exists', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(user)
    }).then((responseEntity) => responseEntity.json())
    .then((data) => {
        if (data === true) {
        // == checks for value
        // === checks for value and type
            console.log('Username already exists')
            usernameTextbox.focus()
            usernameTextbox.select()
            showErrorAnimation(() => {
                console.log('right now at the callback function')
            })
        } else {
            usernameTextbox.style.backgroundColor = 'rgb(255,255,255)'
        }
    })
})

function showErrorAnimation (callback) {
    console.log('right now at the showErrorAnimation function')
    var i = 0
    var animationInterval = setInterval(() => {
        i++
        usernameTextbox.style.backgroundColor = 'rgb(${i},0,0)'
        if (i === 255) {
            clearInterval(animationInterval)
            console.log('done with the animation function')
            callback()
        }
    }, 5)

}