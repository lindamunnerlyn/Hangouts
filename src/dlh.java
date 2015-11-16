// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;

final class dlh extends dgp
{

    final dlg a;

    dlh(dlg dlg1)
    {
        a = dlg1;
        super();
    }

    public void a(int i, ani ani, dgu dgu)
    {
        ani = (String)dlg.a(a).remove(Integer.valueOf(i));
        if (ani != null)
        {
            a.d(ani);
        }
        dlg.b(a);
    }
}
