// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import gdv;
import gfi;
import ggg;
import giq;
import gmn;
import gne;
import gng;
import gnk;
import java.lang.ref.WeakReference;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            VideoViewRequest

public class Libjingle
{

    private final Context a;
    private final Handler b;
    private boolean c;
    private ggg d;
    private long mNativeContext;

    public Libjingle(Context context, Handler handler, ggg ggg1)
    {
        a = context;
        b = handler;
        d = ggg1;
    }

    private static int a(int i)
    {
        switch (i)
        {
        default:
            return i;

        case 1: // '\001'
        case 2: // '\002'
            return i - 1;
        }
    }

    public static void a()
    {
    }

    private static int d(String s)
    {
        byte byte0 = 2;
        if (Log.isLoggable(s, 2))
        {
            byte0 = 1;
        } else
        if (!Log.isLoggable(s, 3))
        {
            return !Log.isLoggable(s, 4) ? 4 : 3;
        }
        return byte0;
    }

    private static void dispatchNativeEvent(Object obj, int i, int j, int k, Object obj1, Object obj2, Object obj3, Object obj4, 
            Object obj5, Object obj6)
    {
        if (gdv.b && !Thread.currentThread().getName().equals("LibjingleSignalingThread") && !Thread.currentThread().getName().contains("test"))
        {
            obj = String.valueOf(Thread.currentThread());
            throw new AssertionError((new StringBuilder(String.valueOf(obj).length() + 47)).append("Expected Libjingle signaling thread instead of ").append(((String) (obj))).toString());
        }
        obj = (Libjingle)((WeakReference)obj).get();
        if (obj != null && ((Libjingle) (obj)).mNativeContext != 0L)
        {
            obj6 = ((Libjingle) (obj)).b.obtainMessage(i, j, k, obj6);
            Bundle bundle = new Bundle(2);
            bundle.putString("str1", (String)obj1);
            bundle.putString("str2", (String)obj2);
            bundle.putString("str3", (String)obj3);
            bundle.putString("str4", (String)obj4);
            bundle.putString("str5", (String)obj5);
            ((Message) (obj6)).setData(bundle);
            ((Libjingle) (obj)).b.sendMessage(((Message) (obj6)));
        }
    }

    private static final native void nativeAddLogComment(String s);

    private final native void nativeBlockMedia(String s);

    private final native void nativeCallHangout(String s, int i, String s1, byte abyte0[]);

    private final native void nativeCheckConnectivity();

    private final native void nativeEndCall();

    private final native void nativeEndCallAndSignOut();

    private final native void nativeFinalize();

    private static native void nativeInit();

    private final native void nativeInvitePstn(String s, String s1, boolean flag, boolean flag1, boolean flag2, byte abyte0[]);

    private final native void nativeInviteUsers(boolean flag, String as[], String as1[], int i, boolean flag1, boolean flag2, String s);

    private final native void nativePublishAudioMuteState(boolean flag);

    private final native void nativePublishVideoMuteState(boolean flag);

    private final native void nativeRelease();

    private final native void nativeRemoteMute(String s);

    private final native void nativeRequestVideoViews(VideoViewRequest avideoviewrequest[]);

    private final native void nativeSendDtmf(char c1, int i, String s);

    private final native void nativeSetGServicesOverride(String s, String s1);

    private static final native void nativeSetLoggingLevel(int i);

    private final native void nativeSetVideoCallOptions(byte abyte0[]);

    private final native void nativeSetup(Object obj, Object obj1, String s, String s1, String s2, int i, int j, 
            boolean flag);

    private final native void nativeSignIn(String s, String s1, String s2, String s3, String s4, String s5, long l, long l1);

    public void a(char c1, int i, String s)
    {
        if (c)
        {
            nativeSendDtmf(c1, i, s);
            return;
        } else
        {
            gne.a(5, "vclib", "sendDtmf: not initialized");
            return;
        }
    }

    public void a(gmn gmn1, long l, long l1)
    {
        if (c)
        {
            nativeSignIn(gmn1.a(), gmn1.q(), gmn1.f(), gmn1.p(), gmn1.o(), gmn1.b(), l, l1);
            return;
        } else
        {
            gne.a(5, "vclib", "signIn: not initialized");
            return;
        }
    }

    public void a(gmn gmn1, String s)
    {
        byte byte1 = 0;
        boolean flag;
        byte byte0;
        if (gmn1.t())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (gmn1.v())
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        if (gmn1.w())
        {
            byte1 = 4;
        }
        gdv.a("Expected condition to be true", c);
        nativeCallHangout(s, byte0 | (flag | false) | byte1, gmn1.r(), gmn1.x());
    }

    public void a(String s)
    {
        if (c)
        {
            nativeRemoteMute(s);
            return;
        } else
        {
            gne.a(5, "vclib", "remoteMute: not initialized");
            return;
        }
    }

    public void a(String s, String s1, boolean flag, boolean flag1, boolean flag2, byte abyte0[])
    {
        if (c)
        {
            nativeInvitePstn(s, s1, flag, flag1, flag2, abyte0);
            return;
        } else
        {
            gne.a(5, "vclib", "invitePstn: not initialized");
            return;
        }
    }

    public void a(String s, String as[][], String s1)
    {
        boolean flag = false;
        if (c)
        {
            gne.a(3, "vclib", "init: already initialized");
            return;
        }
        c = true;
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String as1[] = as[i];
            String s2 = as1[0];
            String s3 = as1[1];
            if ("USE_DEFAULT_NETWORKS_ONLY".equals(s3))
            {
                int k = d.a(s2, 1);
                if (k == 1 && !gng.a() || k == 2)
                {
                    nativeSetGServicesOverride("USE_DEFAULT_NETWORKS_ONLY", "true");
                }
            } else
            {
                s2 = d.a(s2);
                if (s2 != null)
                {
                    nativeSetGServicesOverride(s3, s2);
                }
            }
            i++;
        }
        as = giq.a();
        nativeSetGServicesOverride("VIDEO_ENCODE_MAX_WIDTH", Integer.toString(as.c().a));
        nativeSetGServicesOverride("VIDEO_ENCODE_MAX_HEIGHT", Integer.toString(as.c().b));
        nativeSetGServicesOverride("VIDEO_ENCODE_MAX_FRAMERATE", Integer.toString(as.e()));
        nativeSetGServicesOverride("VIDEO_ENCODE_CORES", Integer.toString(gfi.a()));
        as = giq.a(0);
        nativeSetGServicesOverride("VIDEO_DECODE_MAX_WIDTH", Integer.toString(as.c().a));
        nativeSetGServicesOverride("VIDEO_DECODE_MAX_HEIGHT", Integer.toString(as.c().b));
        nativeSetGServicesOverride("VIDEO_DECODE_MAX_FRAMERATE", Integer.toString(as.e()));
        gne.a(3, "vclib", "init: call nativeSetup");
        i = a(d("vclib:videoLogging"));
        j = a(d("vclib:audioLogging"));
        Object obj = Locale.getDefault().getLanguage();
        as = ((String [][]) (obj));
        if (obj == null)
        {
            as = "en";
        }
        obj = String.valueOf(Build.PRODUCT);
        WeakReference weakreference;
        if (((String) (obj)).length() != 0)
        {
            obj = "Product: ".concat(((String) (obj)));
        } else
        {
            obj = new String("Product: ");
        }
        gne.a(3, "vclib", ((String) (obj)));
        obj = a;
        weakreference = new WeakReference(this);
        if (Build.PRODUCT.contains("sdk_") || Build.PRODUCT.contains("_sdk"))
        {
            flag = true;
        }
        nativeSetup(obj, weakreference, s, as, s1, i, j, flag);
        gne.a(3, "vclib", "init: nativeSetup returned");
    }

    public void a(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        nativeSetGServicesOverride("ENABLE_NOISE_SUPPRESSION", s);
    }

    public void a(boolean flag, String as[], String as1[], int i, boolean flag1, boolean flag2, String s)
    {
        boolean flag4 = true;
        boolean flag3 = flag4;
        if (i != 0)
        {
            if (i == 1)
            {
                flag3 = flag4;
            } else
            {
                flag3 = false;
            }
        }
        gdv.a("Expected condition to be true", flag3);
        if (c)
        {
            nativeInviteUsers(flag, as, as1, i, flag1, flag2, s);
            return;
        } else
        {
            gne.a(5, "vclib", "inviteUsers: not initialized");
            return;
        }
    }

    public void a(byte abyte0[])
    {
        nativeSetVideoCallOptions(abyte0);
    }

    public void a(VideoViewRequest avideoviewrequest[])
    {
        if (c)
        {
            nativeRequestVideoViews(avideoviewrequest);
            return;
        } else
        {
            gne.a(5, "vclib", "requestVideoViews: not initialized");
            return;
        }
    }

    public void b()
    {
        if (!c)
        {
            gne.a(5, "vclib", "release: not initialized");
            return;
        } else
        {
            c = false;
            gne.a(3, "vclib", "Release: call nativeRelease");
            nativeRelease();
            return;
        }
    }

    public void b(String s)
    {
        if (c)
        {
            nativeBlockMedia(s);
            return;
        } else
        {
            gne.a(5, "vclib", "blockMedia: not initialized");
            return;
        }
    }

    public void b(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        nativeSetGServicesOverride("ENABLE_ECHO_CANCELLATION", s);
    }

    public void c(String s)
    {
        nativeAddLogComment(s);
    }

    public void c(boolean flag)
    {
        String s;
        if (flag)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        nativeSetGServicesOverride("ENABLE_AUTO_GAIN_CONTROL", s);
    }

    public boolean c()
    {
        return c;
    }

    public void d()
    {
        nativeSetGServicesOverride("AUDIO_RECORDING_DEVICE", Integer.toString(7));
    }

    public void d(boolean flag)
    {
        if (c)
        {
            nativePublishAudioMuteState(flag);
            return;
        } else
        {
            gne.a(5, "vclib", "publishAudioMuteState: not initialized");
            return;
        }
    }

    public void e()
    {
        if (c)
        {
            nativeEndCallAndSignOut();
            return;
        } else
        {
            gne.a(5, "vclib", "endCallAndSignOut: not initialized");
            return;
        }
    }

    public void e(boolean flag)
    {
        if (c)
        {
            nativePublishVideoMuteState(flag);
            return;
        } else
        {
            gne.a(5, "vclib", "publishVideoMuteState: not initialized");
            return;
        }
    }

    public void f()
    {
        if (c)
        {
            nativeEndCall();
            return;
        } else
        {
            gne.a(5, "vclib", "terminateCall: not initialized");
            return;
        }
    }

    protected void finalize()
    {
        nativeFinalize();
    }

    public void g()
    {
        if (c)
        {
            nativeCheckConnectivity();
            return;
        } else
        {
            gne.a(5, "vclib", "initiateCheckConnectivity: not initialized");
            return;
        }
    }

    public final native void handleApiaryResponse(long l, byte abyte0[]);

    public final native void handlePushNotification(byte abyte0[]);

    static 
    {
        int i = 5;
        int j;
        try
        {
            System.loadLibrary("videochat_jni");
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            gne.a(5, "vclib", "Unable to load videochat_jni.so with error", unsatisfiedlinkerror);
            System.loadLibrary("videochat_jni_symbolized");
        }
        nativeInit();
        j = gne.b;
        if (j != 4)
        {
            i = j;
        }
        nativeSetLoggingLevel(i);
    }
}
