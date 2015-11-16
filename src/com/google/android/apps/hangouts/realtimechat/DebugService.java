// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.realtimechat;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import ard;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import dbf;
import dcx;
import dmt;
import ebw;
import g;
import hgx;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package com.google.android.apps.hangouts.realtimechat:
//            RealTimeChatService

public class DebugService extends Service
{

    private static final boolean a = false;
    private static volatile boolean b;

    public DebugService()
    {
    }

    public static void a(Context context)
    {
        boolean flag = true;
        boolean flag1 = g.a(context, "babel_log_dump", false);
        if (a)
        {
            boolean flag2 = b;
            a((new StringBuilder(65)).append("refreshGservices currently enabled: ").append(flag2).append(" captureDebugLogs: ").append(flag1).toString());
        }
        if (flag1 && !b)
        {
            b = true;
        } else
        if (!flag1 && b)
        {
            b = false;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Intent intent = new Intent(context, com/google/android/apps/hangouts/realtimechat/DebugService);
            intent.putExtra("enabled", b);
            if (a)
            {
                a("calling startService");
            }
            context.startService(intent);
        }
    }

    private static void a(String s)
    {
        String s1 = String.valueOf("[DebugService] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        ebw.b("Babel", s);
    }

    protected void dump(FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag8 = true;
        if (as == null) goto _L2; else goto _L1
_L1:
        boolean flag3;
        boolean flag4;
        boolean flag5;
        boolean flag6;
        boolean flag7;
        int j = as.length;
        int i = 0;
        flag8 = true;
        flag3 = true;
        flag5 = true;
        flag4 = true;
        flag6 = true;
        flag7 = true;
        while (i < j) 
        {
            filedescriptor = as[i];
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag9;
            boolean flag10;
            if ("-all".equals(filedescriptor))
            {
                flag = true;
                flag1 = true;
                flag2 = true;
                flag10 = flag4;
                flag9 = flag3;
            } else
            if ("-log".equals(filedescriptor))
            {
                flag2 = true;
                flag9 = flag3;
                flag = flag5;
                flag10 = flag4;
                flag1 = flag6;
            } else
            if ("-nolog".equals(filedescriptor))
            {
                flag2 = false;
                flag9 = flag3;
                flag = flag5;
                flag10 = flag4;
                flag1 = flag6;
            } else
            if ("-watermarks".equals(filedescriptor))
            {
                flag1 = true;
                flag9 = flag3;
                flag = flag5;
                flag10 = flag4;
                flag2 = flag7;
            } else
            if ("-nowatermarks".equals(filedescriptor))
            {
                flag1 = false;
                flag9 = flag3;
                flag = flag5;
                flag10 = flag4;
                flag2 = flag7;
            } else
            if ("-accounts".equals(filedescriptor))
            {
                flag10 = true;
                flag9 = flag3;
                flag = flag5;
                flag1 = flag6;
                flag2 = flag7;
            } else
            if ("-noaccounts".equals(filedescriptor))
            {
                flag10 = false;
                flag9 = flag3;
                flag = flag5;
                flag1 = flag6;
                flag2 = flag7;
            } else
            if ("-nav".equals(filedescriptor))
            {
                flag = true;
                flag9 = flag3;
                flag10 = flag4;
                flag1 = flag6;
                flag2 = flag7;
            } else
            if ("-nonav".equals(filedescriptor))
            {
                flag = false;
                flag9 = flag3;
                flag10 = flag4;
                flag1 = flag6;
                flag2 = flag7;
            } else
            if ("-rtcs".equals(filedescriptor))
            {
                flag9 = true;
                flag = flag5;
                flag10 = flag4;
                flag1 = flag6;
                flag2 = flag7;
            } else
            if ("-nortcs".equals(filedescriptor))
            {
                flag9 = false;
                flag = flag5;
                flag10 = flag4;
                flag1 = flag6;
                flag2 = flag7;
            } else
            if ("-medialoader".equals(filedescriptor))
            {
                flag8 = true;
                flag9 = flag3;
                flag = flag5;
                flag10 = flag4;
                flag1 = flag6;
                flag2 = flag7;
            } else
            {
                flag9 = flag3;
                flag = flag5;
                flag10 = flag4;
                flag1 = flag6;
                flag2 = flag7;
                if ("-nomedialoader".equals(filedescriptor))
                {
                    flag8 = false;
                    flag9 = flag3;
                    flag = flag5;
                    flag10 = flag4;
                    flag1 = flag6;
                    flag2 = flag7;
                }
            }
            i++;
            flag3 = flag9;
            flag5 = flag;
            flag4 = flag10;
            flag6 = flag1;
            flag7 = flag2;
        }
_L4:
        if (flag4)
        {
            dbf.a(printwriter);
            dcx.a(printwriter);
        }
        if (flag6)
        {
            printwriter.println("");
            printwriter.println("----WatermarkTracker-----");
            ((ard)hgx.a(this, ard)).a();
        }
        if (flag7)
        {
            printwriter.println("");
            printwriter.println("------------------------");
            printwriter.println("### Log History ###");
            ebw.a(printwriter);
        }
        if (flag5)
        {
            printwriter.println("");
            printwriter.println("------------------------");
            printwriter.println("### Log Navigations ###");
            BabelHomeActivity.a(printwriter);
        }
        if (flag3)
        {
            printwriter.println("");
            printwriter.println("------------------------");
            printwriter.println("### RTCS intents ###");
            RealTimeChatService.a(printwriter);
        }
        if (flag8)
        {
            printwriter.println("");
            printwriter.println("------------------------");
            printwriter.println("### MediaLoader Requests ###");
            dmt.a(printwriter);
        }
        return;
_L2:
        flag3 = true;
        flag5 = true;
        flag4 = true;
        flag6 = true;
        flag7 = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (a)
        {
            String s = String.valueOf(intent);
            a((new StringBuilder(String.valueOf(s).length() + 15)).append("onStartCommand ").append(s).toString());
        }
        if (intent != null)
        {
            boolean flag = intent.getBooleanExtra("enabled", false);
            if (a)
            {
                a((new StringBuilder(29)).append("onStartCommand enabled: ").append(flag).toString());
            }
            if (!flag)
            {
                stopSelf();
            }
        }
        return 2;
    }

    static 
    {
        hik hik = ebw.n;
    }
}
