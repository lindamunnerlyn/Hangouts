// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.libraries.hangouts.video.MediaSources;
import com.google.android.libraries.hangouts.video.Stats;

public final class gdv extends Handler
{

    private gdu a;

    public gdv()
    {
    }

    public gdv(Looper looper)
    {
        super(looper);
    }

    static String a(int i)
    {
        switch (i)
        {
        default:
            gbh.a("Unknown type");
            return "Unknown type";

        case 0: // '\0'
            return "CHATROOM_ENTERED";

        case 1: // '\001'
            return "ENDPOINT_ENTERED";

        case 2: // '\002'
            return "ENDPOINT_EXITED";

        case 3: // '\003'
            return "ENDPOINT_CHANGED";

        case 4: // '\004'
            return "ENDPOINT_AUDIO_MUTE_STATE_CHANGED";

        case 5: // '\005'
            return "ENDPOINT_VIDEO_MUTE_STATE_CHANGED";

        case 6: // '\006'
            return "ENDPOINT_MEDIA_BLOCKED";
        }
    }

    public void a(gdu gdu1)
    {
        a = gdu1;
    }

    public void handleMessage(Message message)
    {
        String s = null;
        boolean flag = true;
        if (a == null)
        {
            return;
        }
        Object obj = message.getData();
        switch (message.what)
        {
        default:
            int i = message.what;
            gkc.f("vclib", (new StringBuilder(32)).append("Unknown message type ").append(i).toString());
            return;

        case 0: // '\0'
            if (message.arg1 != 1)
            {
                flag = false;
            }
            a.c(flag);
            return;

        case 14: // '\016'
            String s1 = ((Bundle) (obj)).getString("str2");
            s = ((Bundle) (obj)).getString("str3");
            obj = ((Bundle) (obj)).getString("str4");
            gdu gdu3;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            if ((message.arg1 & 2) != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if ((message.arg1 & 4) != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if ((message.arg1 & 8) != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            gdu3 = a;
            if (TextUtils.isEmpty(s))
            {
                message = null;
            } else
            {
                message = s;
            }
            gdu3.a(message, flag1, ((String) (obj)), flag2, flag3, s1);
            return;

        case 1: // '\001'
            a.a(message.arg1, ((Bundle) (obj)).getString("str1"));
            return;

        case 15: // '\017'
            a.b(message.arg1);
            return;

        case 2: // '\002'
            int j = message.arg1;
            int i1 = message.arg2;
            ((Bundle) (obj)).getString("str1");
            s = ((Bundle) (obj)).getString("str2");
            if (gkc.c())
            {
                message = gcg.e(j);
                message = String.valueOf((new StringBuilder(String.valueOf(s).length() + 62 + String.valueOf(message).length())).append("handleMessage(MEDIA_STATE_CHANGED): for sessionId: ").append(s).append(" new state=").append(message).toString());
                if (message.length() != 0)
                {
                    message = "[LibjingleEventHandler] ".concat(message);
                } else
                {
                    message = new String("[LibjingleEventHandler] ");
                }
                gkc.b("vclib", message);
            }
            a.a(s, j, i1);
            return;

        case 3: // '\003'
            a.a((Stats)message.obj);
            return;

        case 4: // '\004'
            ((Bundle) (obj)).getString("str1");
            int k = message.arg1;
            int j1 = message.arg2;
            s = ((Bundle) (obj)).getString("str2");
            String s2 = ((Bundle) (obj)).getString("str3");
            String s4 = ((Bundle) (obj)).getString("str4");
            obj = ((Bundle) (obj)).getString("str5");
            a.a(s, k, j1, s2, s4, ((String) (obj)), (byte[])message.obj);
            return;

        case 5: // '\005'
            s = ((Bundle) (obj)).getString("str1");
            obj = ((Bundle) (obj)).getString("str2");
            a.a(s, ((String) (obj)), (MediaSources)message.obj);
            return;

        case 6: // '\006'
            s = ((Bundle) (obj)).getString("str1");
            a.a(s, message.arg1);
            return;

        case 7: // '\007'
            int l = message.arg1;
            int k1 = message.arg2;
            message = ((Bundle) (obj)).getString("str1");
            String s3 = ((Bundle) (obj)).getString("str2");
            obj = ((Bundle) (obj)).getString("str3");
            switch (l)
            {
            default:
                return;

            case 0: // '\0'
                obj = a;
                if (TextUtils.isEmpty(message))
                {
                    message = s;
                }
                ((gdu) (obj)).e(message);
                return;

            case 1: // '\001'
                a.a(message, k1, s3, ((String) (obj)));
                return;

            case 2: // '\002'
                a.f(message);
                return;
            }

        case 8: // '\b'
            a.a((com.google.android.libraries.hangouts.video.ConnectivityReporter.NicInfo[])message.obj);
            return;

        case 9: // '\t'
            a.a(Long.parseLong(((Bundle) (obj)).getString("str1")), ((Bundle) (obj)).getString("str2"), (byte[])message.obj, message.arg1);
            return;

        case 10: // '\n'
            ((Bundle) (obj)).getString("str1");
            a.a(message.arg1, message.arg2, (byte[])message.obj);
            return;

        case 11: // '\013'
            a.b(Long.parseLong(((Bundle) (obj)).getString("str1")), ((Bundle) (obj)).getString("str2"), (byte[])message.obj, message.arg1);
            return;

        case 12: // '\f'
            a.a(Long.parseLong(((Bundle) (obj)).getString("str1")), ((Bundle) (obj)).getString("str2"), (byte[])message.obj, Long.parseLong(((Bundle) (obj)).getString("str3")));
            return;

        case 13: // '\r'
            a.a(Long.parseLong(((Bundle) (obj)).getString("str1")));
            return;

        case 16: // '\020'
            gdu gdu1 = a;
            message = ((Message) (message.obj));
            gdu1.d();
            return;

        case 17: // '\021'
            gdu gdu2 = a;
            message = ((Message) (message.obj));
            gdu2.e();
            return;

        case 18: // '\022'
            a.c(message.arg1);
            return;

        case 19: // '\023'
            a.d(message.arg1);
            return;
        }
    }

    static 
    {
        gbh.a(Integer.valueOf(15), Integer.valueOf(15));
        gbh.a(Integer.valueOf(6), Integer.valueOf(6));
    }
}
