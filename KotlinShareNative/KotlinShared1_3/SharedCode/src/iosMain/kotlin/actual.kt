package org.kotlin.mpp.mobile

import platform.UIKit.UIDevice


actual fun platformName(): String {

    return UIDevice.currentDevice.systemName() +
            " " +
            UIDevice.currentDevice.systemVersion
}
//
//fun sendGet() {
//    val url = URL("http://www.google.com/")
//
//    with(url.openConnection() as HttpURLConnection) {
//        requestMethod = "GET"  // optional default is GET
//
//        println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")
//
//        inputStream.bufferedReader().use {
//            it.lines().forEach { line ->
//                println(line)
//            }
//        }
//    }
//}