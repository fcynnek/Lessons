var submitBtn = document.querySelector('#submitBtn')
var users = []

submitBtn.addEventListener('click', () => {
	var username = document.querySelector("#username")
	var password = document.querySelector("#password")

	if (username.value == '' || password.value == '') {
		alert("Please enter a valid username and password")
	} else {
		console.log("Inputs look valid, proceed with form submission")
		var user = {
			"username": username.value,
			"password": password.value
		}
		users.push(user)
	}
})

username.addEventListener('blur', () => {
	var username = document.querySelector('#username')
	var password = document.querySelector("#password")
	var user = {
		"username": username.value,
		"password": password.value
	}
	
//	fetch('http://localhost:8080/users/exists?username=${username.value}&password=${password.value}')
//  we do not pass the post values in the URL params
	fetch('http://localhost:8080/users/exists' , {
		method: "POST",
		headers: {
			"Content-Type": "application/json"
		},
//		instead of passing each value below, we can create a object variable (line 23) that we can then use it in the body
//		body: `{
//			"username": "${username.value}",
//			"password": "${password.vlue}
//		}`
		body: JSON.stringify(user)
	})
		.then((response) => {
			console.log(response)
			return response.json()
		})
		.then((responseJson) => {
			console.log(responseJson)
		})
})