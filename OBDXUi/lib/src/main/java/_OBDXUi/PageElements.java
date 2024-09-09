package _OBDXUi;


import org.openqa.selenium.By;

public class PageElements {

	//Login Page Elements
	public static final By login_username = By.xpath("//android.widget.EditText[@resource-id=\"login_username|input\"]");
	public static final By login_password = By.xpath("//android.widget.EditText[@resource-id=\"login_password|input\"]");
	public static final By login_button = By.xpath("//android.widget.Button[@text=\"Log In\"]");
	
	//Show Balance
	public static final By show_balance = By.xpath("//android.widget.TextView[@text=\"SHOW BALANCE\"]");
	
	//View Statement
	public static final By viewstatement = By.xpath("//android.widget.Button[@text=\"Transactions\"]");
	public static final By payment_record = By.xpath("//android.widget.TextView[@text=\"Download\"]");
	
	//account card
	public static final By star = By.xpath("//android.widget.Image[@text=\"untoggled-star\"]");
	
	//Fund Transfer
	public static final By sendmoney = By.xpath("//android.widget.TextView[@text=\"Send Money\"]");
	public static final By bene = By.xpath("//android.widget.TextView[@text=\"Samad Ali\"]");
	public static final By amount = By.xpath("//android.widget.EditText[@resource-id=\"specific-amount|input\"]");
	public static final By comments = By.xpath("//android.widget.EditText[@resource-id=\"transactionComments|input\"]");
	public static final By next_button = By.xpath("//android.widget.Button[@text=\"Next\"]");
	public static final By sendnow = By.xpath("//android.widget.Button[@text=\"Send Now\"]");
	public static final By makeanothertransfer = By.xpath("//android.widget.Button[@text=\"Make Another Transfer\"]");
	public static final By homebutton = By.xpath("//android.widget.Image[@resource-id=\"home-icon\"]");
	public static final By vendorpurpose = By.xpath("//android.widget.TextView[@text=\"Vendor\"]");
	
	//New Bene Pay
	public static final By newaccount = By.xpath("//android.widget.Button[@text=\"Send money to a new account\"]");
	public static final By search = By.xpath("//android.widget.EditText");
	public static final By HBLKonnect = By.xpath("//android.widget.TextView[@text=\"HBL KONNECT\"]");
	public static final By accountnumber = By.xpath("//android.widget.EditText");
	public static final By titlefetchbutton = By.xpath("//android.widget.Button[@text=\"Fetch Account Details\"]");
	
	//Bill Payment
	public static final By billbutton = By.xpath("//android.view.View[@text=\"Bill Payments\"]");
	public static final By newpayment = By.xpath("//android.widget.Button[@text=\"Make a New Payment\"]");
	public static final By ssgc = By.xpath("//android.widget.TextView[@text=\"SSGC\"]");
	public static final By customerno = By.xpath("//android.widget.EditText[@resource-id=\"ConsumerValue41|input\"]") ;
	public static final By fetchbill = By.xpath("//android.widget.Button[@text=\"Fetch Bill Details\"]");
	public static final By paynow = By.xpath("//android.widget.Button[@text=\"Pay Now\"]");
	public static final By save = By.xpath("//android.widget.Image[@text=\"save-icon\"]");
	
	//Raast
	public static final By raastbutton = By.xpath("//android.widget.TextView[@text=\"Raast Payment\"]");
	public static final By makenewtransfer = By.xpath("//android.widget.Button[@text=\"Make a New Transfer\"]");
	public static final By raastid = By.xpath("//android.widget.EditText[@resource-id=\"internalAccNumberID|input\"]");
	public static final By addpayee = By.xpath("//android.widget.Button[@text=\"Add to Payee List\"]");
	public static final By accounttabbtn = By.xpath("//android.widget.TextView[@resource-id=\"iban\"]");
	public static final By ibanradiobtn = By.xpath("//android.widget.RadioButton[@resource-id=\"ui-id-133|rb\"]");
	public static final By ibanpre = By.xpath("//android.widget.EditText[@resource-id=\"ibanPrefixDomestic2|input\"]");
	public static final By ibanbank = By.xpath("//android.widget.EditText[@resource-id=\"ibanPrefix|input\"]");
	public static final By ibannumber = By.xpath("//android.widget.EditText[@resource-id=\"internalAccNumberIDIBAN|input\"]");
	public static final By purpose = By.xpath("//android.widget.EditText[@resource-id=\"bottomButton|input\"]");
	public static final By anotherraasttrans = By.xpath("//android.widget.Button[@text=\"Make Another Raast Transfer\"]");
	
	//Card Management
	public static final By cardmanagement = By.xpath("//android.widget.TextView[@text=\"Card Management\"]");
	public static final By cardpermission = By.xpath("//android.widget.TextView[@text=\"Card Permissions\"]");
	public static final By permissiontoggle1 = By.xpath("(//android.view.View[@resource-id=\"switch\"])[2]/android.view.View/android.view.View/android.widget.ToggleButton");
	public static final By permissiontoggle2 = By.xpath("(//android.view.View[@resource-id=\"switch\"])[6]/android.view.View/android.view.View/android.widget.ToggleButton");
	public static final By cardblocktoggle = By.xpath("//android.widget.ToggleButton");
	
	//Pay Order
	public static final By payorderbutton = By.xpath("//android.widget.TextView[@text=\"Request Pay Order\"]");
	public static final By benename = By.xpath("//android.widget.EditText[@resource-id=\"DraftFavouring10|input\"]");
	public static final By cnic = By.xpath("//android.widget.EditText[@resource-id=\"CNIC|input\"]");
	public static final By mobilenumber = By.xpath("//android.widget.EditText[@resource-id=\"tel|input\"]");
	public static final By payorderamount = By.xpath("//android.webkit.WebView[@text=\"Pay Order Amount - Meezan Bank\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.widget.EditText");
	public static final By requestpayorder = By.xpath("//android.widget.Button[@text=\"Request Pay Order\"]");
	
	//Zakat and Sadqat
	public static final By zakatnsadqat = By.xpath("//android.widget.TextView[@text=\"Zakat & Sadqaat\"]");
	public static final By zakatbene = By.xpath("//android.widget.TextView[@text=\"Shaukat Khanum Memorial Trust\"]");
	public static final By zakatamount = By.xpath("//android.widget.EditText[@resource-id=\"specific-amount|input\"]");
	public static final By payzakat = By.xpath("//android.widget.Button[@text=\"Pay Zakat Now\"]");
	public static final By makeanotherdonation = By.xpath("//android.widget.Button[@text=\"Make Another Donation\"]");
	public static final By sadqatbutton = By.xpath("//android.widget.TextView[@resource-id=\"sadaqat\"]");
	public static final By sadqatbene = By.xpath("//android.widget.TextView[@text=\"Alkhidmat Foundation\"]");
	public static final By accselectiontoggle = By.xpath("//android.widget.Image[@resource-id=\"avatar-image-upload\"]");
	public static final By accselection = By.xpath("//android.widget.TextView[@text=\"SARFARAZ UR REHMAN/FARAH NAZ\"]");
	public static final By paysadqa = By.xpath("//android.widget.Button[@text=\"Pay Sadqa Now\"]");
	
	//options and settings
	public static final By optionslistbutton = By.xpath("//android.widget.Image[@text=\"hamburger-icon\"]");
	public static final By myprofilebutton = By.xpath("//android.view.MenuItem[@text=\"My Profile\"]");
	public static final By profilewaitfinder = By.xpath("//android.widget.TextView[@text=\"sarfarazurrehman5@gmail.com\"]");
	public static final By backarrow = By.xpath("//android.widget.Image[@text=\"back-arrow-white\"]");
	public static final By myaccountsbutton = By.xpath("//android.view.MenuItem[@text=\"My Accounts\"]");
	public static final By viewdetails1 = By.xpath("(//android.widget.Button[@text=\"View Details\"])[1]");
	public static final By viewtransactions = By.xpath("//android.widget.Button[@text=\"View Transactions\"]");
	public static final By viewdetails2 = By.xpath("(//android.widget.Button[@text=\"View Details\"])[2]");
	public static final By settingsbutton = By.xpath("//android.view.MenuItem[@text=\"Settings\"]");
	public static final By changeotppref = By.xpath("//android.widget.TextView[@text=\"Change OTP Preference\"]");
	public static final By smsandemail = By.xpath("//android.widget.RadioButton[@text=\"SMS and Email(Both)\"]");
	public static final By savechanges = By.xpath("//android.widget.Button[@text=\"Save Changes\"]");
	public static final By manageregistereddevices = By.xpath("//android.widget.TextView[@text=\"Manage Registered Devices\"]");
	public static final By remove = By.xpath("(//android.widget.TextView[@resource-id=\"switch\"])[3]");
	public static final By managebiodevices = By.xpath("//android.view.View[@text=\"Manage Biometric Login\"]/android.view.View/android.view.View");
	public static final By accmanagementbutton = By.xpath("//android.widget.TextView[@text=\"Account Management\"]");
	public static final By accmanageselection = By.xpath("//android.webkit.WebView[@text=\"Account Selection - Meezan Bank\"]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View[3]/android.view.View/android.view.View[4]/android.view.View");
	public static final By limitmanagementbutton = By.xpath("//android.widget.TextView[@text=\"Limit Management\"]");
	public static final By meezantomeezanlimit = By.xpath("//android.widget.TextView[@text=\"Meezan to Meezan\"]");
	public static final By apply = By.xpath("//android.widget.Button[@text=\"Apply\"]");
	public static final By meezantootherlimit = By.xpath("//android.widget.TextView[@text=\"Meezan to Other Banks\"]");
	public static final By changepassword = By.xpath("//android.widget.TextView[@text=\"Change Password\"]");
	public static final By currentpassword = By.xpath("//android.widget.EditText");
	public static final By newpassword1 = By.xpath("//android.widget.EditText[@resource-id=\"pwd|input\"]");
	public static final By newpassword2 = By.xpath("//android.widget.EditText[@resource-id=\"newpwd|input\"]");
	public static final By updatepassword = By.xpath("//android.widget.Button[@text=\"Update Password\"]");
	
}

