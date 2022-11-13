package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class launch_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (launch) ","launch",3,launch.mostCurrent.activityBA,launch.mostCurrent,19);
if (RapidSub.canDelegate("activity_create")) { return b4a.example.launch.remoteMe.runUserSub(false, "launch","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 19;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 22;BA.debugLine="Logowidth = Activity.width/2";
Debug.ShouldStop(2097152);
launch._logowidth = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {launch.mostCurrent._activity.runMethod(true,"getWidth"),RemoteObject.createImmutable(2)}, "/",0, 0));
 BA.debugLineNum = 23;BA.debugLine="LaunchTimer.Initialize(\"Timer1\", 3000)";
Debug.ShouldStop(4194304);
launch._launchtimer.runVoidMethod ("Initialize",launch.processBA,(Object)(BA.ObjectToString("Timer1")),(Object)(BA.numberCast(long.class, 3000)));
 BA.debugLineNum = 24;BA.debugLine="LaunchTimer.Enabled=True";
Debug.ShouldStop(8388608);
launch._launchtimer.runMethod(true,"setEnabled",launch.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 25;BA.debugLine="Activity.LoadLayout(\"Launch\")";
Debug.ShouldStop(16777216);
launch.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("Launch")),launch.mostCurrent.activityBA);
 BA.debugLineNum = 27;BA.debugLine="img_launch.SetLayout(Activity.Width-75%x,(Activit";
Debug.ShouldStop(67108864);
launch.mostCurrent._img_launch.runVoidMethod ("SetLayout",(Object)(RemoteObject.solve(new RemoteObject[] {launch.mostCurrent._activity.runMethod(true,"getWidth"),launch.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),launch.mostCurrent.activityBA)}, "-",1, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {launch.mostCurrent._activity.runMethod(true,"getHeight"),RemoteObject.createImmutable(2)}, "/",0, 0)),(RemoteObject.solve(new RemoteObject[] {launch._logowidth,RemoteObject.createImmutable(2)}, "/",0, 0))}, "-",1, 0))),(Object)(launch._logowidth),(Object)(launch._logowidth));
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
		Debug.PushSubsStack("Activity_Pause (launch) ","launch",3,launch.mostCurrent.activityBA,launch.mostCurrent,40);
if (RapidSub.canDelegate("activity_pause")) { return b4a.example.launch.remoteMe.runUserSub(false, "launch","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 40;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Activity_Resume (launch) ","launch",3,launch.mostCurrent.activityBA,launch.mostCurrent,36);
if (RapidSub.canDelegate("activity_resume")) { return b4a.example.launch.remoteMe.runUserSub(false, "launch","activity_resume");}
 BA.debugLineNum = 36;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 15;BA.debugLine="Dim Logowidth As Int";
launch._logowidth = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 16;BA.debugLine="Private img_launch As ImageView";
launch.mostCurrent._img_launch = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim LaunchTimer As Timer";
launch._launchtimer = RemoteObject.createNew ("anywheresoftware.b4a.objects.Timer");
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _timer1_tick() throws Exception{
try {
		Debug.PushSubsStack("Timer1_Tick (launch) ","launch",3,launch.mostCurrent.activityBA,launch.mostCurrent,31);
if (RapidSub.canDelegate("timer1_tick")) { return b4a.example.launch.remoteMe.runUserSub(false, "launch","timer1_tick");}
 BA.debugLineNum = 31;BA.debugLine="Sub Timer1_Tick";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 32;BA.debugLine="StartActivity(\"Main\")";
Debug.ShouldStop(-2147483648);
launch.mostCurrent.__c.runVoidMethod ("StartActivity",launch.processBA,(Object)((RemoteObject.createImmutable("Main"))));
 BA.debugLineNum = 33;BA.debugLine="LaunchTimer.Enabled=False";
Debug.ShouldStop(1);
launch._launchtimer.runMethod(true,"setEnabled",launch.mostCurrent.__c.getField(true,"False"));
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
}