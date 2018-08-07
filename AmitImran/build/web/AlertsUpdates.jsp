<!DOCTYPE html>
<html>
    <head>
        <title>Payment Form Widget Flat Responsive Widget Template :: w3layouts</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Payment Form Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <link href="css/paystyle.css" rel="stylesheet" type="text/css" media="all" />
        <link href='//fonts.googleapis.com/css?family=Fugaz+One' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Alegreya+Sans:400,100,100italic,300,300italic,400italic,500,500italic,700,700italic,800,800italic,900,900italic' rel='stylesheet' type='text/css'>
        <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>
        <script type="text/javascript" src="js/jquery.min.js"></script>
        <SCRIPT>
var date = new Date();
var month = date.getMonth()+1;
var day = date.getDate();
var year = date.getFullYear();
var output= month + '/' +day + '/' + year;
function compareDate()
{
	if(Date.parse(document.form1.bookingdate.value)<Date.parse(output)){
		alert("You cannot select a date less than the current date");
		}
}
function checkNum() 
{
	x = event.charCode;
	if (( x >= 65  && x <=90) || (x >= 97 && x <=122))
	{
		alert("Enter Numeric Value");
		document.form1.num.value='';
	}
}
function total()
{
	if(document.form1.num.value>20)
	{
		alert("You cannot book more than 20 tickets at a time");
		document.form1.num.value='';
	}
	else
	document.form1.totalprice.value=(document.form1.price.value)*(document.form1.num.value);
}
function check()
{
	for( i = 0; i <= document.form1.RB.length; i++ ){

		if(document.form1.RB[0].checked==true) {
 			 document.form1.price.value=100;
		}else if(document.form1.RB[1].checked==true) {
 			 document.form1.price.value=140;
		}else if(document.form1.RB[2].checked==true) {
			 document.form1.price.value=200;
		}
}
}
function sub()
{
	if((document.form1.usrname.value!='')&&(document.form1.num.value!='')&&(Date.parse(document.form1.bookingdate.value)>Date.parse(output))&&(document.form1.sel.value!=0)&&(document.form1.timing.value!=7))
	{
		alert("Your tickets have been booked.");
	}
}
function validate()
{
	if((document.form1.sel.value==0)||(document.form1.timing.value==7)||(Date.parse(document.form1.bookingdate.value)<Date.parse(output)))
	{
		alert("Please select the date, movie name, and movie timings.");
		return false
	}
	else
	return true
}
</SCRIPT>

<STYLE type="text/css">
#submit{
margin-left:100px;
}
th{
font-size:20px;
background-color:green;
}
td{
text-align:left;
font-size:20px;
}
table{
border:1px solid green;
}
form{
float:left;
margin-right:20px;
}
p{
font-size:20px;}
h2{
background-color:green;
border:1px solid green;
margin-left:460px;}
.auto-style{
/* Chrome  */
overflow-x:-webkit-marquee;
-webkit-marquee-direction: up;
-webkit-marquee-style: scroll;
-webkit-marquee-speed:normal;
-webkit-marquee-increment: small;
-webkit-marquee-repetition: infinite;
}
</STYLE>
    </head>
    <body>
        
       <h1><font color="red"></h1>
            <div class="content">

                <script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
                <script type="text/javascript">
                    $(document).ready(function () {
                        $('#horizontalTab').easyResponsiveTabs({
                            type: 'default', //Types: default, vertical, accordion           
                            width: 'auto', //auto or any width like 600px
                            fit: true   // 100% fit in a container
                        });
                    });

                </script>
<DIV class="auto-style">
    <br></br>
<P><font color="red">New Payment Options has been introduced for ticket bookings.</P>
<br></br>
<P>Mobile Booking is now resumed w.e.f. 22-July-2018.</P>
<br></br>
<P>ID proof is required for getting student concession on tickets.</P>
<br></br>
<P>Ticket Bookings On Mobile: Now book your movie ticket -ANYWHERE ANYTIME through your Mobile Phones. </P>
<br></br>
<P>You are advised not to carry inflammable/dangerous/explosive articles as part of their luggage and also to desist from smoking in the movie halls. Please update your mobile number in our profile to receive SMS alerts for your ticket booking.</P>
<br></br>
<P>Never purchase e-ticket from unauthorized agents or persons.</P>
<br></br>
<P>No refund will be granted on cancellation of tickets .</P><br></br></DIV>
                
    </body>
</html>