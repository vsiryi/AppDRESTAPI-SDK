RESTAccess
===========

The RESTAccess is a class that allows access to AppDynamics' REST api. The intention
is to provide a easy method to to access the AppDynamics Controller REST service. The
core class is org.appdynamics.appdrestapi.RESTAccess.

Usage:
-----

```java

String controller="acme.saas.appdynamics.com";
String port="443";
boolean useSSL=true;
String user="appDUser";
String passwd="secret";
String account="acme";

 /*
 This will create the instance of the RESTAccess which is able to execute REST calls.
 If the controller is single tenant the accout is 'customer1'.
 */
RESTAccess access=new RESTAccess(controller,port,useSSL,user,passwd,account);


// To get the list of applications all you need to run the following.

System.out.println(access.getApplications());

int appId = access.getApplications().getApplications().get(0).getId();
String app=new String(appId);

Calendar calendarNow=java.util.Calendar.getInstance();
Calendar calendarStart=java.util.Calendar.getInstance();
calendarStart.add(java.util.Calendar.MINUTE, -10);

/*
   Choose the ID of one of the application listed and you can request the event objects
by calling access.getEvents, additionally the event types and severity needs to be provided.
*/

System.out.println(access.getEvents(app,"APPLICATION_ERROR,DIAGNOSTIC_SESSION", "INFO,WARN,ERROR",calendarStart.getTimeInMillis(), calendarNow.getTimeInMillis()));
```