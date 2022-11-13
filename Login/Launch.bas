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
	Dim LaunchTimer As Timer
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Dim Logowidth As Int
	Private img_launch As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	'Activity.LoadLayout("Layout1")
	Logowidth = Activity.width/2
	LaunchTimer.Initialize("Timer1", 3000)
	LaunchTimer.Enabled=True
	Activity.LoadLayout("Launch")
	
	img_launch.SetLayout(Activity.Width-75%x,(Activity.Height/2)-(Logowidth/2),Logowidth,Logowidth)
	
End Sub

Sub Timer1_Tick
	StartActivity("Main")
	LaunchTimer.Enabled=False
	
End Sub
Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
