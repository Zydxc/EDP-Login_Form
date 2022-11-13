B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Private xui As XUI
	Public CorrectHeight As Int
	Public HeightChangedFired As Boolean
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	Private Button1 As Button
	Private EditText1 As EditText
	Private EditText2 As EditText
End Sub

Sub Activity_Create(FirstTime As Boolean)
	Activity.LoadLayout("Act1")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Button1_Click
	If EditText1.Text == "Diadula" And EditText2.Text == "BSIT3A" Then
		StartActivity(ActHome)
		ToastMessageShow("Login Succesful", True)
	
	Else
		MsgboxAsync("Invalid Authentication", "Login in Form")
	End If
	EditText1.Text = ""
	EditText2.Text = ""
End Sub
