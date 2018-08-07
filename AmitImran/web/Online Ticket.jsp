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
background-color:white;
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
        <div class="main">
            <h1><font color="red">Sound And Stage Entertainment</h1>
            
            <a class="action action--buy" href="AlertsUpdates.jsp" role="button">Alerts & Updates !!!</a>
            
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
               <FORM name="form1" onsubmit="return validate();">
<TABLE>
<TR>
<TH colspan="2">Book Your Tickets Online</TH>
</TR>
<TD>Name</TD>
<TD><INPUT type="text" name="usrname" placeholder="Enter Your Name" required></TD>
</TR>
<TR> 
<TD> Date of Bookings</TD>
<TD><INPUT type="date" id="bookingdate" required 
onchange="compareDate();"></TD>
</TR>
<TR>
<TD>Movie</TD>
<TD><SELECT id="sel">
<OPTION value="0">Select Movie</OPTION>
<OPTGROUP label="Romantic">
<OPTION value="1">Sultan</OPTION>
<OPTION value="2">Barfi</OPTION>
<OPTION value="3">3 Idiots</OPTION>
<OPTION value="4">Baghban</OPTION>
</OPTGROUP>
<OPTGROUP label="Action"> 
<OPTION value="3">Dhoom</OPTION>
<OPTION value="4">Dhoom 2</OPTION>
<OPTION value="4">Dhoom 3</OPTION>
</OPTGROUP>
<OPTGROUP label="Thriller">
<OPTION value="5">Wanted</OPTION>
<OPTION value="6">ByPass</OPTION>
<OPTION value="6">Kick</OPTION>
<OPTION value="6">Bang Bang</OPTION>
<OPTION value="6">Dabang</OPTION>
</OPTGROUP>
</SELECT></TD>
</TR>
<TR>
<TD>Show Timings</TD>
<TD><SELECT id="timing">
<OPTION value="7">Select Time</OPTION>
<OPTION value="8">09:30AM</OPTION>
   <OPTION value="9">11:30AM</OPTION> 
<OPTION value="10">1:30PM</OPTION>
<OPTION value="10">03:30PM</OPTION> 
<OPTION value="10">05:30PM</OPTION> 
<OPTION value="10">07:30PM</OPTION> 
<OPTION value="10">09:30PM</OPTION>
<OPTION value="10">10:30PM</OPTION> 

</SELECT></TD>
</TR>
<TR>
<TD>Select Class</TD>
<TD>
<INPUT type="Radio" name="RB" required" onclick="check();">Platinum</INPUT>
<INPUT type="Radio" name="RB" required onclick="check();">Gold</INPUT>
<INPUT type="Radio" name="RB" required onclick="check();">Exclusive</INPUT>
</TD>
</TR>
<TR>
<TD>Price </TD>
<TD><INPUT type="text" name="price" disabled> </TD>
</TR>
<TR>
<TD>Number of Tickets</TD> 
<TD><INPUT type="text" name="num" placeholder="Enter Tickets" required onchange="total();" onkeypress="checkNum();"> </TD>
</TR>
<TR>
<TD>Total Price</TD> 
<TD><INPUT TYPE="text" NAME="totalprice" disabled> </TD> 
</TR>
<TR>
<TD>
<INPUT ID="submit" type="submit" onclick="sub();"></Td><Td>
<INPUT type="reset">
</TD>
</TR>
</TABLE>
</FORM>
            </div>
            
            
           
        </div>
    </body>
</html>
