// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.text.TextUtils;
import android.util.Log;
import java.util.UUID;

public class AudioEffectsJB
{

    private static int EFFECT_AUTO = 0;
    private static int EFFECT_NONE = 0;
    private static int EFFECT_PLATFORM = 0;
    private static int EFFECT_WEBRTC = 0;
    private static final UUID SOFTWARE_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID SOFTWARE_AUTOMATIC_GAIN_CONTROL = UUID.fromString("aa8130e0-66fc-11e0-bad0-0002a5d5c51b");
    private static final UUID SOFTWARE_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final String TAG = "AudioEffectsJB";
    private static boolean _isInitialized = false;
    private static Boolean _shouldUsePlatformAcousticEchoCanceler = null;
    private static Boolean _shouldUsePlatformAutomaticGainControl = null;
    private static Boolean _shouldUsePlatformNoiseSuppressor = null;
    private static Boolean _shouldUseWebRTCAcousticEchoCanceler = null;
    private static Boolean _shouldUseWebRTCAutomaticGainControl = null;
    private static Boolean _shouldUseWebRTCNoiseSuppressor = null;
    private static int _useAcousticEchoCancelerMode;
    private static int _useAutomaticGainControlMode;
    private static int _useNoiseSuppressorMode;
    private AutomaticGainControl _autoGainController;
    private AcousticEchoCanceler _echoCanceler;
    private NoiseSuppressor _noiseSuppressor;

    public AudioEffectsJB()
    {
        _echoCanceler = null;
        _autoGainController = null;
        _noiseSuppressor = null;
    }

    private static void assertIsTrue(boolean flag)
    {
        if (!flag)
        {
            throw new AssertionError("Expected condition to be true");
        } else
        {
            return;
        }
    }

    public static void initialize(String s, String s1, String s2)
    {
        _useNoiseSuppressorMode = mapMode(s);
        _useAcousticEchoCancelerMode = mapMode(s1);
        _useAutomaticGainControlMode = mapMode(s2);
        _isInitialized = true;
    }

    private static boolean isAtLeastJB()
    {
        return android.os.Build.VERSION.SDK_INT >= 16;
    }

    private static int mapMode(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return EFFECT_AUTO;
        }
        if (s.equalsIgnoreCase("auto"))
        {
            return EFFECT_AUTO;
        }
        if (s.equalsIgnoreCase("platform"))
        {
            return EFFECT_PLATFORM;
        }
        if (s.equalsIgnoreCase("webrtc"))
        {
            return EFFECT_WEBRTC;
        }
        if (s.equalsIgnoreCase("none"))
        {
            return EFFECT_NONE;
        } else
        {
            return EFFECT_AUTO;
        }
    }

    public static boolean shouldUsePlatformAcousticEchoCanceler()
    {
label0:
        {
            boolean flag;
label1:
            {
                boolean flag1 = false;
                assertIsTrue(_isInitialized);
                if (_shouldUsePlatformAcousticEchoCanceler != null)
                {
                    break label0;
                }
                if (_useAcousticEchoCancelerMode != EFFECT_AUTO)
                {
                    flag = flag1;
                    if (_useAcousticEchoCancelerMode != EFFECT_PLATFORM)
                    {
                        break label1;
                    }
                }
                flag = flag1;
                if (isAtLeastJB())
                {
                    flag = flag1;
                    if (AcousticEchoCanceler.isAvailable())
                    {
                        flag = true;
                        android.media.audiofx.AudioEffect.Descriptor adescriptor[] = AudioEffect.queryEffects();
                        int j = adescriptor.length;
                        for (int i = 0; i < j; i++)
                        {
                            if (adescriptor[i].uuid.equals(SOFTWARE_ACOUSTIC_ECHO_CANCELER))
                            {
                                flag = false;
                            }
                        }

                    }
                }
            }
            Object obj = Boolean.valueOf(flag);
            _shouldUsePlatformAcousticEchoCanceler = ((Boolean) (obj));
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(obj).length() + 39)).append("shouldUsePlatformAcousticEchoCanceler: ").append(((String) (obj)));
        }
        return _shouldUsePlatformAcousticEchoCanceler.booleanValue();
    }

    public static boolean shouldUsePlatformAutomaticGainControl()
    {
label0:
        {
            boolean flag;
label1:
            {
                boolean flag1 = false;
                assertIsTrue(_isInitialized);
                if (_shouldUsePlatformAutomaticGainControl != null)
                {
                    break label0;
                }
                if (_useAutomaticGainControlMode != EFFECT_AUTO)
                {
                    flag = flag1;
                    if (_useAutomaticGainControlMode != EFFECT_PLATFORM)
                    {
                        break label1;
                    }
                }
                flag = flag1;
                if (isAtLeastJB())
                {
                    flag = flag1;
                    if (AutomaticGainControl.isAvailable())
                    {
                        flag = true;
                        android.media.audiofx.AudioEffect.Descriptor adescriptor[] = AudioEffect.queryEffects();
                        int j = adescriptor.length;
                        for (int i = 0; i < j; i++)
                        {
                            if (adescriptor[i].uuid.equals(SOFTWARE_AUTOMATIC_GAIN_CONTROL))
                            {
                                flag = false;
                            }
                        }

                    }
                }
            }
            Object obj = Boolean.valueOf(flag);
            _shouldUsePlatformAutomaticGainControl = ((Boolean) (obj));
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(obj).length() + 39)).append("shouldUsePlatformAutomaticGainControl: ").append(((String) (obj)));
        }
        return _shouldUsePlatformAutomaticGainControl.booleanValue();
    }

    public static boolean shouldUsePlatformNoiseSuppressor()
    {
label0:
        {
            boolean flag;
label1:
            {
                boolean flag1 = false;
                assertIsTrue(_isInitialized);
                if (_shouldUsePlatformNoiseSuppressor != null)
                {
                    break label0;
                }
                if (_useNoiseSuppressorMode != EFFECT_AUTO)
                {
                    flag = flag1;
                    if (_useNoiseSuppressorMode != EFFECT_PLATFORM)
                    {
                        break label1;
                    }
                }
                flag = flag1;
                if (isAtLeastJB())
                {
                    flag = flag1;
                    if (NoiseSuppressor.isAvailable())
                    {
                        flag = true;
                        android.media.audiofx.AudioEffect.Descriptor adescriptor[] = AudioEffect.queryEffects();
                        int j = adescriptor.length;
                        for (int i = 0; i < j; i++)
                        {
                            if (adescriptor[i].uuid.equals(SOFTWARE_NOISE_SUPPRESSOR))
                            {
                                flag = false;
                            }
                        }

                    }
                }
            }
            Object obj = Boolean.valueOf(flag);
            _shouldUsePlatformNoiseSuppressor = ((Boolean) (obj));
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(obj).length() + 34)).append("shouldUsePlatformNoiseSuppressor: ").append(((String) (obj)));
        }
        return _shouldUsePlatformNoiseSuppressor.booleanValue();
    }

    public static boolean shouldUseWebRTCAcousticEchoCanceler()
    {
        boolean flag = true;
        assertIsTrue(_isInitialized);
        if (_shouldUseWebRTCAcousticEchoCanceler == null)
        {
            Object obj;
            if (_useAcousticEchoCancelerMode != EFFECT_WEBRTC && (_useAcousticEchoCancelerMode != EFFECT_AUTO || shouldUsePlatformAcousticEchoCanceler()))
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
            _shouldUseWebRTCAcousticEchoCanceler = ((Boolean) (obj));
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(obj).length() + 37)).append("shouldUseWebRTCAcousticEchoCanceler: ").append(((String) (obj)));
        }
        return _shouldUseWebRTCAcousticEchoCanceler.booleanValue();
    }

    public static boolean shouldUseWebRTCAutomaticGainControl()
    {
        boolean flag = true;
        assertIsTrue(_isInitialized);
        if (_shouldUseWebRTCAutomaticGainControl == null)
        {
            Object obj;
            if (_useAutomaticGainControlMode != EFFECT_WEBRTC && (_useAutomaticGainControlMode != EFFECT_AUTO || shouldUsePlatformAutomaticGainControl()))
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
            _shouldUseWebRTCAutomaticGainControl = ((Boolean) (obj));
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(obj).length() + 37)).append("shouldUseWebRTCAutomaticGainControl: ").append(((String) (obj)));
        }
        return _shouldUseWebRTCAutomaticGainControl.booleanValue();
    }

    public static boolean shouldUseWebRTCNoiseSuppressor()
    {
        boolean flag = true;
        assertIsTrue(_isInitialized);
        if (_shouldUseWebRTCNoiseSuppressor == null)
        {
            Object obj;
            if (_useNoiseSuppressorMode != EFFECT_WEBRTC && (_useNoiseSuppressorMode != EFFECT_AUTO || shouldUsePlatformNoiseSuppressor()))
            {
                flag = false;
            }
            obj = Boolean.valueOf(flag);
            _shouldUseWebRTCNoiseSuppressor = ((Boolean) (obj));
            obj = String.valueOf(obj);
            (new StringBuilder(String.valueOf(obj).length() + 32)).append("shouldUseWebRTCNoiseSuppressor: ").append(((String) (obj)));
        }
        return _shouldUseWebRTCNoiseSuppressor.booleanValue();
    }

    public void enable(AudioRecord audiorecord)
    {
        _noiseSuppressor = NoiseSuppressor.create(audiorecord.getAudioSessionId());
        if (_noiseSuppressor == null) goto _L2; else goto _L1
_L1:
        if (!Log.isLoggable("AudioEffectsJB", 2)) goto _L4; else goto _L3
_L3:
        Object obj;
        String s;
        obj = _noiseSuppressor.getDescriptor();
        s = String.valueOf(((android.media.audiofx.AudioEffect.Descriptor) (obj)).name);
        if (s.length() == 0) goto _L6; else goto _L5
_L5:
        "name: ".concat(s);
_L27:
        s = String.valueOf(((android.media.audiofx.AudioEffect.Descriptor) (obj)).implementor);
        if (s.length() == 0) goto _L8; else goto _L7
_L7:
        "implementor: ".concat(s);
_L28:
        obj = String.valueOf(((android.media.audiofx.AudioEffect.Descriptor) (obj)).uuid);
        (new StringBuilder(String.valueOf(obj).length() + 6)).append("UUID: ").append(((String) (obj)));
_L4:
        boolean flag;
        boolean flag1;
        flag = _noiseSuppressor.getEnabled();
        flag1 = shouldUsePlatformNoiseSuppressor();
        if (_noiseSuppressor.setEnabled(flag1) != 0)
        {
            Log.e("AudioEffectsJB", "FAILED: setEnabled did not return AudioEffect.SUCCESS");
        }
          goto _L9
_L33:
        String s1;
        if (_noiseSuppressor.getEnabled())
        {
            s1 = "enabled";
        } else
        {
            s1 = "disabled";
        }
        try
        {
            (new StringBuilder(String.valueOf(obj).length() + 45 + String.valueOf(s).length() + String.valueOf(s1).length())).append("NoiseSuppressor: was ").append(((String) (obj))).append(", isSupported: ").append(s).append(", is now ").append(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("AudioEffectsJB", "NoiseSuppressor effect failed");
            if (_noiseSuppressor != null)
            {
                _noiseSuppressor.release();
            }
            _noiseSuppressor = null;
        }
_L2:
        _echoCanceler = AcousticEchoCanceler.create(audiorecord.getAudioSessionId());
        if (_echoCanceler == null) goto _L11; else goto _L10
_L10:
        if (!Log.isLoggable("AudioEffectsJB", 2)) goto _L13; else goto _L12
_L12:
        obj = _echoCanceler.getDescriptor();
        s = String.valueOf(((android.media.audiofx.AudioEffect.Descriptor) (obj)).name);
        if (s.length() == 0) goto _L15; else goto _L14
_L14:
        "name: ".concat(s);
_L29:
        s = String.valueOf(((android.media.audiofx.AudioEffect.Descriptor) (obj)).implementor);
        if (s.length() == 0) goto _L17; else goto _L16
_L16:
        "implementor: ".concat(s);
_L30:
        obj = String.valueOf(((android.media.audiofx.AudioEffect.Descriptor) (obj)).uuid);
        (new StringBuilder(String.valueOf(obj).length() + 6)).append("UUID: ").append(((String) (obj)));
_L13:
        flag = _echoCanceler.getEnabled();
        flag1 = shouldUsePlatformAcousticEchoCanceler();
        if (_echoCanceler.setEnabled(flag1) != 0)
        {
            Log.e("AudioEffectsJB", "FAILED: setEnabled did not return AudioEffect.SUCCESS");
        }
          goto _L18
_L34:
        if (_echoCanceler.getEnabled())
        {
            s1 = "enabled";
        } else
        {
            s1 = "disabled";
        }
        try
        {
            (new StringBuilder(String.valueOf(obj).length() + 50 + String.valueOf(s).length() + String.valueOf(s1).length())).append("AcousticEchoCanceler: was ").append(((String) (obj))).append(", isSupported: ").append(s).append(", is now ").append(s1);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("AudioEffectsJB", "AcousticEchoCanceler effect failed");
            if (_echoCanceler != null)
            {
                _echoCanceler.release();
            }
            _echoCanceler = null;
        }
_L11:
        _autoGainController = AutomaticGainControl.create(audiorecord.getAudioSessionId());
        if (_autoGainController == null) goto _L20; else goto _L19
_L19:
        if (!Log.isLoggable("AudioEffectsJB", 2)) goto _L22; else goto _L21
_L21:
        audiorecord = _autoGainController.getDescriptor();
        obj = String.valueOf(((android.media.audiofx.AudioEffect.Descriptor) (audiorecord)).name);
        if (((String) (obj)).length() == 0) goto _L24; else goto _L23
_L23:
        "name: ".concat(((String) (obj)));
_L31:
        obj = String.valueOf(((android.media.audiofx.AudioEffect.Descriptor) (audiorecord)).implementor);
        if (((String) (obj)).length() == 0) goto _L26; else goto _L25
_L25:
        "implementor: ".concat(((String) (obj)));
_L32:
        audiorecord = String.valueOf(((android.media.audiofx.AudioEffect.Descriptor) (audiorecord)).uuid);
        (new StringBuilder(String.valueOf(audiorecord).length() + 6)).append("UUID: ").append(audiorecord);
_L22:
        flag = _autoGainController.getEnabled();
        flag1 = shouldUsePlatformAutomaticGainControl();
        if (_autoGainController.setEnabled(flag1) != 0)
        {
            Log.e("AudioEffectsJB", "FAILED: setEnabled did not return AudioEffect.SUCCESS");
        }
        break MISSING_BLOCK_LABEL_934;
_L35:
        if (_autoGainController.getEnabled())
        {
            s = "enabled";
        } else
        {
            s = "disabled";
        }
        (new StringBuilder(String.valueOf(audiorecord).length() + 50 + String.valueOf(obj).length() + String.valueOf(s).length())).append("AutomaticGainControl: was ").append(audiorecord).append(", isSupported: ").append(((String) (obj))).append(", is now ").append(s);
_L20:
        return;
_L6:
        new String("name: ");
          goto _L27
_L8:
        new String("implementor: ");
          goto _L28
_L15:
        new String("name: ");
          goto _L29
_L17:
        new String("implementor: ");
          goto _L30
_L24:
        try
        {
            new String("name: ");
        }
        // Misplaced declaration of an exception variable
        catch (AudioRecord audiorecord)
        {
            Log.e("AudioEffectsJB", "AutomaticGainControl effect failed");
            if (_autoGainController != null)
            {
                _autoGainController.release();
            }
            _autoGainController = null;
            return;
        }
          goto _L31
_L26:
        new String("implementor: ");
          goto _L32
_L9:
        if (flag)
        {
            obj = "enabled";
        } else
        {
            obj = "disabled";
        }
        if (flag1)
        {
            s = "true";
        } else
        {
            s = "false";
        }
          goto _L33
_L18:
        if (flag)
        {
            obj = "enabled";
        } else
        {
            obj = "disabled";
        }
        if (flag1)
        {
            s = "true";
        } else
        {
            s = "false";
        }
          goto _L34
        if (flag)
        {
            audiorecord = "enabled";
        } else
        {
            audiorecord = "disabled";
        }
        if (flag1)
        {
            obj = "true";
        } else
        {
            obj = "false";
        }
          goto _L35
    }

    public void release()
    {
        if (_echoCanceler != null)
        {
            _echoCanceler.release();
            _echoCanceler = null;
        }
        if (_autoGainController != null)
        {
            _autoGainController.release();
            _autoGainController = null;
        }
        if (_noiseSuppressor != null)
        {
            _noiseSuppressor.release();
            _noiseSuppressor = null;
        }
    }

    static 
    {
        EFFECT_AUTO = 0;
        EFFECT_PLATFORM = 1;
        EFFECT_WEBRTC = 2;
        EFFECT_NONE = 3;
    }
}
