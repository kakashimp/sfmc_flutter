package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new com.dribba.sfmc_flutter.SfmcFlutterPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin sfmc_flutter, com.dribba.sfmc_flutter.SfmcFlutterPlugin", e);
    }
  }
}
