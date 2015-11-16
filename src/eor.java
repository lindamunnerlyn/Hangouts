// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;

public final class eor
{

    private final eos a;
    private volatile Object b;

    eor(Looper looper, Object obj)
    {
        a = new eos(this, looper);
        b = g.b(obj, "Listener must not be null");
    }

    public void a()
    {
        b = null;
    }

    public void a(eot eot1)
    {
        g.b(eot1, "Notifier must not be null");
        eot1 = a.obtainMessage(1, eot1);
        a.sendMessage(eot1);
    }

    void b(eot eot1)
    {
        Object obj;
        obj = b;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        eot1.a(obj);
        return;
        eot1;
        throw eot1;
    }
}
