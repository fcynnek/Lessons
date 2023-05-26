var submitBtn = document.querySelector('#submitBtn')
var username = document.querySelector('#username')
var users = []

submitBtn.addEventListener('click', () => {
	var username = document.querySelector("#username")
	var password = document.querySelector("#password")

	if (username.value == '' || password.value == '') {
		alert("Please enter a valid username and password")
	} else {
		console.log("Inputs look valid, proceed with form submission")
		var user = {
			"username" : username.value,
			"password" : password.value
		}
		users.push(user)
	}
})

username.addEventListener('blur',  () => {
	fetch('http://localhost:8080/users/exists')
	.then((response) => {
		console.log(response)
	})
})