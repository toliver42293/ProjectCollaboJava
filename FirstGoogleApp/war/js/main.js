saveModal = function(field) {
	if (field == 'aboutMeText') {
		// console.log("AboutMe");
		// var text = document.getElementById("modalTextAboutMe").value;
		document.getElementById(field).innerHTML = document
				.getElementById("modalTextAboutMe").value;
		$.post('updateInfo', $('#modalFormAboutMe').serialize());
	}
	if (field == 'hobbiesText') {
		// console.log("Hobbies");
		// var text = document.getElementById("modalTextHobbies").value;
		document.getElementById(field).innerHTML = document
				.getElementById("modalTextHobbies").value;
		$.post('updateInfo', $('#modalFormHobbies').serialize());
	}
	if (field == 'interestsText') {
		// console.log("Interests");
		// var text = document.getElementById("modalTextInterests").value;
		document.getElementById(field).innerHTML = document
				.getElementById("modalTextInterests").value;
		$.post('updateInfo', $('#modalFormInterests').serialize());
	}
}

validateFriends = function(numFriends, friends) {
	var friendsList = document.getElementById("friendsList");
	if(numFriends == 0){
		friendsList.innerHTML = "You have no friends";
	}else{
		var list = "";
		var friendsNew = friends.replace("[", "").replace("]", "");
		var array = friendsNew.split(",");
		for(var i = 0; i < numFriends; i++){
			list += "<div class='col-xs-4 col-sm-4 col-md-4'>" +
					"<a href='#' class='thumbnail' style='text-align:center;max-width: 313px'>" +
							"<img src='/img/userDefault.png' alt='...' style='margin-bottom: 10px' />" +
									"<b>" + array[i] + "</b>" +
									"</a>" +
									"</div>"
		}
		friendsList.innerHTML = list;
	}
}