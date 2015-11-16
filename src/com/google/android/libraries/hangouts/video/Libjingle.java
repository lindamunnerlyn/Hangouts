// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import gbh;
import gds;
import gfq;
import gjl;
import gkc;
import gke;
import gki;
import gkj;
import java.lang.ref.WeakReference;
import java.util.Locale;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            VideoViewRequest

public class Libjingle
{

    private final Context a;
    private final Handler b;
    private boolean c;
    private gds d;
    private long mNativeContext;

    public Libjingle(Context context, Handler handler, gds gds1)
    {
        a = context;
        b = handler;
        d = gds1;
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

    private static void dispatchNativeEvent(Object obj, int i, int j, int k, Object obj1, Object obj2, Object obj3, Object obj4, 
            Object obj5, Object obj6)
    {
        gbh.d();
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

    private static int e(String s)
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

    private static final native void nativeAddLogComment(String s);

    private final native void nativeBlockMedia(String s);

    private final native void nativeCallHangout(String s, int i, String s1, byte abyte0[]);

    private final native void nativeCheckConnectivity();

    private final native void nativeEndCall(String s, boolean flag);

    private final native void nativeEndCallAndSignOut(String s);

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

    private final native void nativeSetup(Object obj, Object obj1, String s, String s1, String s2, String s3, int i, 
            int j);

    private final native void nativeSignIn(String s, String s1, String s2, String s3, String s4, String s5, int i, 
            int j);

    public void a(char c1, int i, String s)
    {
        if (c)
        {
            nativeSendDtmf(c1, i, s);
            return;
        } else
        {
            gkc.d("vclib", "sendDtmf: not initialized");
            return;
        }
    }

    public void a(gjl gjl1, int i, int j)
    {
        if (c)
        {
            nativeSignIn(gjl1.a(), gjl1.q(), gjl1.f(), gjl1.p(), gjl1.o(), gjl1.b(), i, j);
            return;
        } else
        {
            gkc.d("vclib", "signIn: not initialized");
            return;
        }
    }

    public void a(gjl gjl1, String s)
    {
        byte byte2 = 0;
        boolean flag;
        byte byte0;
        byte byte1;
        if (gjl1.t())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (gjl1.v())
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        if (gjl1.w())
        {
            byte1 = 4;
        } else
        {
            byte1 = 0;
        }
        if (gjl1.x())
        {
            byte2 = 8;
        }
        gbh.a(c);
        nativeCallHangout(s, byte1 | (flag | false | byte0) | byte2, gjl1.r(), gjl1.y());
    }

    public void a(String s)
    {
        if (c)
        {
            nativeRemoteMute(s);
            return;
        } else
        {
            gkc.d("vclib", "remoteMute: not initialized");
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
            gkc.d("vclib", "invitePstn: not initialized");
            return;
        }
    }

    public void a(String s, String s1, String as[][], String s2)
    {
        if (c)
        {
            gkc.b("vclib", "init: already initialized");
            return;
        }
        c = true;
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String as1[] = as[i];
            String s3 = as1[0];
            String s5 = as1[1];
            if ("USE_DEFAULT_NETWORKS_ONLY".equals(s5))
            {
                int k = d.a(s3, 1);
                if (k == 1 && !gke.a() || k == 2)
                {
                    nativeSetGServicesOverride("USE_DEFAULT_NETWORKS_ONLY", "true");
                }
            } else
            {
                s3 = d.a(s3);
                if (s3 != null)
                {
                    nativeSetGServicesOverride(s5, s3);
                }
            }
            i++;
        }
        as = gfq.a();
        nativeSetGServicesOverride("VIDEO_ENCODE_MAX_WIDTH", Integer.toString(as.c().a));
        nativeSetGServicesOverride("VIDEO_ENCODE_MAX_HEIGHT", Integer.toString(as.c().b));
        nativeSetGServicesOverride("VIDEO_ENCODE_MAX_FRAMERATE", Integer.toString(as.e()));
        nativeSetGServicesOverride("VIDEO_ENCODE_CORES", Integer.toString(gkj.a()));
        as = gfq.a(0);
        nativeSetGServicesOverride("VIDEO_DECODE_MAX_WIDTH", Integer.toString(as.c().a));
        nativeSetGServicesOverride("VIDEO_DECODE_MAX_HEIGHT", Integer.toString(as.c().b));
        nativeSetGServicesOverride("VIDEO_DECODE_MAX_FRAMERATE", Integer.toString(as.e()));
        gkc.b("vclib", "init: call nativeSetup");
        i = a(e("vclib:videoLogging"));
        j = a(e("vclib:audioLogging"));
        String s4 = Locale.getDefault().getLanguage();
        as = s4;
        if (s4 == null)
        {
            as = "en";
        }
        nativeSetup(a, new WeakReference(this), s, s1, as, s2, i, j);
        gkc.b("vclib", "init: nativeSetup returned");
    }

    public void a(String s, boolean flag)
    {
        if (c)
        {
            nativeEndCall(s, flag);
            return;
        } else
        {
            gkc.d("vclib", "terminateCall: not initialized");
            return;
        }
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
        gbh.a(flag3);
        if (c)
        {
            nativeInviteUsers(flag, as, as1, i, flag1, flag2, s);
            return;
        } else
        {
            gkc.d("vclib", "inviteUsers: not initialized");
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
            gkc.d("vclib", "requestVideoViews: not initialized");
            return;
        }
    }

    public void b()
    {
        if (!c)
        {
            gkc.d("vclib", "release: not initialized");
            return;
        } else
        {
            c = false;
            gkc.b("vclib", "Release: call nativeRelease");
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
            gkc.d("vclib", "blockMedia: not initialized");
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
        if (c)
        {
            nativeEndCallAndSignOut(s);
            return;
        } else
        {
            gkc.d("vclib", "endCallAndSignOut: not initialized");
            return;
        }
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

    public void d(String s)
    {
        nativeAddLogComment(s);
    }

    public void d(boolean flag)
    {
        if (c)
        {
            nativePublishAudioMuteState(flag);
            return;
        } else
        {
            gkc.d("vclib", "publishAudioMuteState: not initialized");
            return;
        }
    }

    public void e()
    {
        if (c)
        {
            nativeCheckConnectivity();
            return;
        } else
        {
            gkc.d("vclib", "initiateCheckConnectivity: not initialized");
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
            gkc.d("vclib", "publishVideoMuteState: not initialized");
            return;
        }
    }

    protected void finalize()
    {
        nativeFinalize();
    }

    public final native void handleApiaryResponse(long l, byte abyte0[]);

    public final native void handlePushNotification(byte abyte0[]);

    static 
    {
        int i;
        int j;
        try
        {
            System.loadLibrary("videochat_jni");
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            gkc.a("vclib", "Unable to load videochat_jni.so with error", unsatisfiedlinkerror);
            System.loadLibrary("videochat_jni_symbolized");
        }
        nativeInit();
        j = gkc.a();
        i = j;
        if (j == 4)
        {
            i = 5;
        }
        nativeSetLoggingLevel(i);
    }
}
