// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Set;

final class gjb extends BroadcastReceiver
{

    final gir a;

    gjb(gir gir1)
    {
        a = gir1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (!intent.getAction().equals("android.intent.action.HEADSET_PLUG")) goto _L2; else goto _L1
_L1:
        int i;
        i = intent.getIntExtra("state", 0);
        boolean flag = isInitialStickyBroadcast();
        gkc.b("vclib", (new StringBuilder(81)).append("WiredHeadsetReceiver.onReceive: state=").append(i).append(", isInitialStickyBroadcast=").append(flag).toString());
        i;
        JVM INSTR tableswitch 0 1: default 84
    //                   0 85
    //                   1 179;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        a.i.remove(giv.d);
        if (a.j())
        {
            a.i.add(giv.b);
        }
        a.i.add(giv.a);
        if (a.h == giw.c)
        {
            a.a(a.g);
            return;
        } else
        {
            a.d();
            return;
        }
_L4:
        a.i.add(giv.d);
        a.i.remove(giv.b);
        a.i.remove(giv.a);
        a.a(giv.d);
        return;
    }
}
