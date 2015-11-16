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

public final class ggj extends Handler
{

    private ggi a;

    public ggj()
    {
    }

    public ggj(Looper looper)
    {
        super(looper);
    }

    static String a(int i)
    {
        switch (i)
        {
        default:
            gdv.a("Unknown type");
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

    public void a(ggi ggi1)
    {
        a = ggi1;
    }

    public void handleMessage(Message message)
    {
        String s;
        int i;
        boolean flag2;
        s = null;
        flag2 = false;
        i = 1;
        if (a != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj = message.getData();
        switch (message.what)
        {
        default:
            i = message.what;
            gne.a("vclib", (new StringBuilder(32)).append("Unknown message type ").append(i).toString());
            return;

        case 0: // '\0'
            boolean flag;
            if (message.arg1 == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a.c(flag);
            return;

        case 14: // '\016'
            String s1 = ((Bundle) (obj)).getString("str2");
            s = ((Bundle) (obj)).getString("str3");
            obj = ((Bundle) (obj)).getString("str4");
            ggi ggi1;
            boolean flag1;
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
            }
            ggi1 = a;
            if (TextUtils.isEmpty(s))
            {
                message = null;
            } else
            {
                message = s;
            }
            ggi1.a(message, flag1, ((String) (obj)), flag2, s1);
            return;

        case 1: // '\001'
            a.b(message.arg1, ((Bundle) (obj)).getString("str1"));
            return;

        case 15: // '\017'
            a.b(message.arg1);
            return;

        case 2: // '\002'
            i = message.arg1;
            int l = message.arg2;
            ((Bundle) (obj)).getString("str1");
            s = ((Bundle) (obj)).getString("str2");
            if (gne.a(3))
            {
                message = String.valueOf(geu.e(i));
                message = String.valueOf((new StringBuilder(String.valueOf(s).length() + 62 + String.valueOf(message).length())).append("handleMessage(MEDIA_STATE_CHANGED): for sessionId: ").append(s).append(" new state=").append(message).toString());
                if (message.length() != 0)
                {
                    message = "[LibjingleEventHandler] ".concat(message);
                } else
                {
                    message = new String("[LibjingleEventHandler] ");
                }
                gne.a(3, "vclib", message);
            }
            a.a(s, i, l);
            return;

        case 3: // '\003'
            a.b((Stats)message.obj);
            if (message.arg1 == 0)
            {
                i = 0;
            }
            if (i != 0)
            {
                a.a((Stats)message.obj);
                return;
            }
            break;

        case 4: // '\004'
            ((Bundle) (obj)).getString("str1");
            int j = message.arg1;
            int i1 = message.arg2;
            s = ((Bundle) (obj)).getString("str2");
            String s2 = ((Bundle) (obj)).getString("str3");
            String s4 = ((Bundle) (obj)).getString("str4");
            obj = ((Bundle) (obj)).getString("str5");
            a.a(s, j, i1, s2, s4, ((String) (obj)), (byte[])message.obj);
            return;

        case 5: // '\005'
            s = ((Bundle) (obj)).getString("str1");
            a.a(s, (MediaSources)message.obj);
            return;

        case 6: // '\006'
            s = ((Bundle) (obj)).getString("str1");
            a.a(s, message.arg1);
            return;

        case 7: // '\007'
            int k = message.arg1;
            int j1 = message.arg2;
            message = ((Bundle) (obj)).getString("str1");
            String s3 = ((Bundle) (obj)).getString("str2");
            obj = ((Bundle) (obj)).getString("str3");
            switch (k)
            {
            default:
                return;

            case 0: // '\0'
                obj = a;
                if (TextUtils.isEmpty(message))
                {
                    message = s;
                }
                ((ggi) (obj)).e(message);
                return;

            case 1: // '\001'
                a.a(message, j1, s3, ((String) (obj)));
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
            a.b((byte[])message.obj);
            return;

        case 17: // '\021'
            a.c((byte[])message.obj);
            return;

        case 18: // '\022'
            a.c(message.arg1);
            return;

        case 19: // '\023'
            a.d(message.arg1);
            return;

        case 20: // '\024'
            a.d((byte[])message.obj);
            return;

        case 21: // '\025'
            a.e((byte[])message.obj);
            return;

        case 22: // '\026'
            a.a(message.arg1, ((Bundle) (obj)).getString("str1"));
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static 
    {
        gdv.a(Integer.valueOf(15), Integer.valueOf(15));
        gdv.a(Integer.valueOf(6), Integer.valueOf(6));
    }
}
