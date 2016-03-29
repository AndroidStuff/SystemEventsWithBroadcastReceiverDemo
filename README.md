# SystemEventsWithBroadcastReceiverDemo

## About

A project to showcase handling Android's System Events with Broadcast Receiver API

## Broadcast Receiver API
* Is great for listening system events that deals with changes in phone state.
* When something is changed in the phone state, an intent is created by the Android OS to manage the switch from your app to phone app.
* So, Broadcast Receivers are the receivers of Broadcast Intents
* Thus System events are handled using an intent-based pub-sub mechanism.
* Technically speaking, Broadcast Receivers registers for certain intents with the Android System and gets notified when intent happens (say, when SMS arrives, when phone rings, etc).

## 3 Steps to Handling System Events
1. Grant permission to the app to deal with that system level event by configuring permissions in app's manifest file using `<uses-permission>` tag
2. Create a Java class that extends `BroadcastReceiver` and implements `onReceive(Context context, Intent intent)`. This class acts as the event handler for the said event
3. Register the Broadcast Receiver Java class in the app’s manifest file using `<receiver>` tag (You can also do this programatically, but the manifest file thingy is easier) 