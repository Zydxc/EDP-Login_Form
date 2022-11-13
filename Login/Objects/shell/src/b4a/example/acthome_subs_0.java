package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class acthome_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (acthome) ","acthome",1,acthome.mostCurrent.activityBA,acthome.mostCurrent,20);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.acthome.remoteMe.runUserSub(false, "acthome","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 20;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 24;BA.debugLine="drawer.Initialize(Me,\"\",Activity,75%x)";
Debug.ShouldStop(8388608);
acthome.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_initialize" /*RemoteObject*/ ,acthome.mostCurrent.activityBA,(Object)(acthome.getObject()),(Object)(BA.ObjectToString("")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.B4XViewWrapper"), acthome.mostCurrent._activity.getObject()),(Object)(acthome.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),acthome.mostCurrent.activityBA)));
 BA.debugLineNum = 25;BA.debugLine="drawer.CenterPanel.LoadLayout(\"home\")";
Debug.ShouldStop(16777216);
acthome.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_getcenterpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("home")),acthome.mostCurrent.activityBA);
 BA.debugLineNum = 26;BA.debugLine="drawer.LeftPanel.LoadLayout(\"sidemenu\")";
Debug.ShouldStop(33554432);
acthome.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_getleftpanel" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("sidemenu")),acthome.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("Activity_Pause (acthome) ","acthome",1,acthome.mostCurrent.activityBA,acthome.mostCurrent,35);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.acthome.remoteMe.runUserSub(false, "acthome","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 35;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("Activity_Resume (acthome) ","acthome",1,acthome.mostCurrent.activityBA,acthome.mostCurrent,31);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.acthome.remoteMe.runUserSub(false, "acthome","activity_resume");}
 BA.debugLineNum = 31;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private drawer As B4XDrawer";
acthome.mostCurrent._drawer = RemoteObject.createNew ("b4a.example.b4xdrawer");
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _label1_click() throws Exception{
try {
		Debug.PushSubsStack("Label1_Click (acthome) ","acthome",1,acthome.mostCurrent.activityBA,acthome.mostCurrent,39);
if (RapidSub.canDelegate("label1_click")) { return b4a.example.acthome.remoteMe.runUserSub(false, "acthome","label1_click");}
 BA.debugLineNum = 39;BA.debugLine="Private Sub Label1_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 40;BA.debugLine="drawer.LeftOpen=True";
Debug.ShouldStop(128);
acthome.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,acthome.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Label2_Click (acthome) ","acthome",1,acthome.mostCurrent.activityBA,acthome.mostCurrent,43);
if (RapidSub.canDelegate("label2_click")) { return b4a.example.acthome.remoteMe.runUserSub(false, "acthome","label2_click");}
 BA.debugLineNum = 43;BA.debugLine="Private Sub Label2_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="drawer.LeftOpen=False";
Debug.ShouldStop(2048);
acthome.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,acthome.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Label4_Click (acthome) ","acthome",1,acthome.mostCurrent.activityBA,acthome.mostCurrent,47);
if (RapidSub.canDelegate("label4_click")) { return b4a.example.acthome.remoteMe.runUserSub(false, "acthome","label4_click");}
 BA.debugLineNum = 47;BA.debugLine="Private Sub Label4_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="StartActivity(ActFree)";
Debug.ShouldStop(32768);
acthome.mostCurrent.__c.runVoidMethod ("StartActivity",acthome.processBA,(Object)((acthome.mostCurrent._actfree.getObject())));
 BA.debugLineNum = 49;BA.debugLine="drawer.LeftOpen=False";
Debug.ShouldStop(65536);
acthome.mostCurrent._drawer.runClassMethod (b4a.example.b4xdrawer.class, "_setleftopen" /*RemoteObject*/ ,acthome.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 50;BA.debugLine="Activity.Finish";
Debug.ShouldStop(131072);
acthome.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}