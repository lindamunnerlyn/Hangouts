// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;

public final class elq
{

    private final elr a;
    private volatile Object b;

    elq(Looper looper, Object obj)
    {
        a = new elr(this, looper);
        b = h.a(obj, "Listener must not be null");
    }

    public void a()
    {
        b = null;
    }

    public void a(els els1)
    {
        h.a(els1, "Notifier must not be null");
        els1 = a.obtainMessage(1, els1);
        a.sendMessage(els1);
    }

    void b(els els1)
    {
        Object obj;
        obj = b;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        els1.a(obj);
        return;
        els1;
        throw els1;
    }
}
