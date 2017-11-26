(function (){
	window.onload=function(){
		document.getElementById("wage").onchange = titheChange;
		document.getElementById("tithe").onchange = leftOverChange;
		document.getElementById("save").onchange = leftOverChange;
		document.getElementById("car").onchange = leftOverChange;
		document.getElementById("phone").onchange = leftOverChange;
		document.getElementById("groc").onchange = leftOverChange;
		document.getElementById("out").onchange = leftOverChange;
		document.getElementById("inter").onchange = leftOverChange;
		document.getElementById("pock").onchange = leftOverChange;
	};
		
	function titheChange () {
		var wage = document.getElementById("wage").value;
		var tithe = wage * 0.1;
		document.getElementById("tithe").value = tithe;
	}
	
	function leftOverChange () {
		var wage1 = document.getElementById("wage").value;
		var tithe = document.getElementById("tithe").value;
		var save = document.getElementById("save").value;
		var car = document.getElementById("car").value;
		var phone = document.getElementById("phone").value;
		var groc = document.getElementById("groc").value;
		var out = document.getElementById("out").value;
		var inter = document.getElementById("inter").value;
		var poc = document.getElementById("pock").value;
		var leftOver = wage1 - tithe - save - car - phone - groc - out - inter - poc;
		document.getElementById("left").value = leftOver;
	}
})()
