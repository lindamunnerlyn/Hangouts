// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dgt
    implements Runnable
{

    final dmf a;
    final aoa b;
    final dcx c;

    public dgt(dmf dmf, aoa aoa, dcx dcx)
    {
        a = dmf;
        b = aoa;
        c = dcx;
        super();
    }

    public void run()
    {
        for (Iterator iterator = RealTimeChatService.p().iterator(); iterator.hasNext(); gdv.b())
        {
            iterator.next();
        }

    }
}
