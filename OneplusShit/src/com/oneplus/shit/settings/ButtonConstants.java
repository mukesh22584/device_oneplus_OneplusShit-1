/*
 * Copyright (C) 2017 The MoKee Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.oneplus.shit.settings;

import java.util.HashMap;
import java.util.Map;

public class ButtonConstants {

    public static final String ACTION_UPDATE_SLIDER_SETTINGS
            = "com.oneplus.shit.settings.UPDATE_SLIDER_SETTINGS";

    public static final String ACTION_UPDATE_SLIDER_POSITION
            = "com.oneplus.shit.settings.UPDATE_SLIDER_POSITION";

    // Broadcast action for settings update
    static final String UPDATE_PREFS_ACTION = "com.oneplus.shit.settings.UPDATE_SETTINGS";

    // Preference keys
    public static final String SLIDER_PANEL_KEY = "notification_slider";
    public static final String SLIDER_USAGE_KEY = "slider_usage";
    public static final String SLIDER_ACTION_TOP_KEY = "action_top_position";
    public static final String SLIDER_ACTION_MIDDLE_KEY = "action_middle_position";
    public static final String SLIDER_ACTION_BOTTOM_KEY = "action_bottom_position";

    // Slider nodes
    public static final String SLIDER_STATE_NODE
            = "/sys/class/switch/tri-state-key/state";

    public static final String SLIDER_FOR_NOTIFICATION = "1";
    public static final String SLIDER_FOR_FLASHLIGHT = "2";
    public static final String SLIDER_FOR_BRIGHTNESS = "3";
    public static final String SLIDER_FOR_ROTATION = "4";
    public static final String SLIDER_FOR_RINGER = "5";
    public static final String NOTIF_SLIDER_FOR_NOTIFICATION_RINGER = "6";
    public static final String SLIDER_FOR_CAFFEINE = "7";

    public static final int KEY_SLIDER_TOP = 601;
    public static final int KEY_SLIDER_MIDDLE = 602;
    public static final int KEY_SLIDER_BOTTOM = 603;

    // Screen off Gesture actions
    static final int ACTION_FLASHLIGHT = 1;
    static final int ACTION_CAMERA = 2;
    static final int ACTION_BROWSER = 3;
    static final int ACTION_DIALER = 4;
    static final int ACTION_EMAIL = 5;
    static final int ACTION_MESSAGES = 6;
    static final int ACTION_PLAY_PAUSE_MUSIC = 7;
    static final int ACTION_PREVIOUS_TRACK = 8;
    static final int ACTION_NEXT_TRACK = 9;
    static final int ACTION_VOLUME_DOWN = 10;
    static final int ACTION_VOLUME_UP = 11;

    public static final String EXTRA_SLIDER_USAGE = "usage";
    public static final String EXTRA_SLIDER_ACTIONS = "actions";
    public static final String EXTRA_SLIDER_POSITION = "position";

    // Broadcast extra: keycode mapping (int[]: key = gesture ID, value = keycode)
    static final String UPDATE_EXTRA_KEYCODE_MAPPING = "keycode_mappings";
    // Broadcast extra: assigned actions (int[]: key = gesture ID, value = action)
    static final String UPDATE_EXTRA_ACTION_MAPPING = "action_mappings";

    // Holds <preference_key> -> <proc_node> mapping
    static final Map<String, String> sStringNodePreferenceMap = new HashMap<>();

    // Holds <preference_key> -> <default_values> mapping
    static final Map<String, Object> sNodeDefaultMap = new HashMap<>();
}
