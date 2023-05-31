var usernameTextbox = document.querySelector('#username')
var passwordTextbox = document.querySelector('#password')
var loginButton = document.querySelector('#login')

var user = {
    'username': usernameTextbox.value,
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
            alert('Username already exists')
            // usernameTextbox.focus()
            usernameTextbox.select()
        } 
    })
})