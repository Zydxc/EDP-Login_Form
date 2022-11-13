package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class actfree_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (actfree) ","actfree",2,actfree.mostCurrent.activityBA,actfree.mostCurrent,18);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.actfree.remoteMe.runUserSub(false, "actfree","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 18;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 21;BA.debugLine="drawer.Initialize(Me,\"\",Activity,75%x)";
Debug.ShouldStop(1048576);
actfree.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_initialize" /*RemoteObject*/ ,actfree.mostCurrent.activityBA,(Object)(actfree.getObject()),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), actfree.mostCurrent._activity.getObject()),(Object)(actfree.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),actfree.mostCurrent.activityBA)));
 BA.debugLineNum = 22;BA.debugLine="drawer.CenterPanel.LoadLayout(\"freeedu\")";
Debug.ShouldStop(2097152);
actfree.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_getcenterpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("freeedu")),actfree.mostCurrent.activityBA);
 BA.debugLineNum = 23;BA.debugLine="drawer.LeftPanel.LoadLayout(\"sidemenu\")";
Debug.ShouldStop(4194304);
actfree.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_getleftpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("sidemenu")),actfree.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (actfree) ","actfree",2,actfree.mostCurrent.activityBA,actfree.mostCurrent,33);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.actfree.remoteMe.runUserSub(false, "actfree","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (actfree) ","actfree",2,actfree.mostCurrent.activityBA,actfree.mostCurrent,29);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.actfree.remoteMe.runUserSub(false, "actfree","activity_resume");}
 BA.debugLineNum = 29;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Private drawer As B4XDrawer";
actfree.mostCurrent._drawer = RemoteObject.createNew ("b4a.example.b4xdrawer");
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _label1_click() throws Exception{
try {
		Debug.PushSubsStack("Label1_Click (actfree) ","actfree",2,actfree.mostCurrent.activityBA,actfree.mostCurrent,36);
if (RapidSub.canDelegate("label1_click")) { return b4a.example.actfree.remoteMe.runUserSub(false, "actfree","label1_click");}
 BA.debugLineNum = 36;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 37;BA.debugLine="drawer.LeftOpen=True";
Debug.ShouldStop(16);
actfree.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,actfree.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label2_click() throws Exception{
try {
		Debug.PushSubsStack("Label2_Click (actfree) ","actfree",2,actfree.mostCurrent.activityBA,actfree.mostCurrent,40);
if (RapidSub.canDelegate("label2_click")) { return b4a.example.actfree.remoteMe.runUserSub(false, "actfree","label2_click");}
 BA.debugLineNum = 40;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="StartActivity(ActHome)";
Debug.ShouldStop(256);
actfree.mostCurrent.__c.runVoidMethod ("StartActivity",actfree.processBA,(Object)((actfree.mostCurrent._acthome.getObject())));
 BA.debugLineNum = 42;BA.debugLine="drawer.LeftOpen=False";
Debug.ShouldStop(512);
actfree.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,actfree.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 43;BA.debugLine="Activity.Finish";
Debug.ShouldStop(1024);
actfree.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _label4_click() throws Exception{
try {
		Debug.PushSubsStack("Label4_Click (actfree) ","actfree",2,actfree.mostCurrent.activityBA,actfree.mostCurrent,46);
if (RapidSub.canDelegate("label4_click")) { return b4a.example.actfree.remoteMe.runUserSub(false, "actfree","label4_click");}
 BA.debugLineNum = 46;BA.debugLine="Private Sub Label4_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 47;BA.debugLine="drawer.LeftOpen=False";
Debug.ShouldStop(16384);
actfree.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,actfree.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}