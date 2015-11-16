// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class btn
    implements btl, fsn, hhi, hka
{

    private final List a = new CopyOnWriteArrayList();
    private final Context b;
    private buz c;

    btn(Context context, hjm hjm1)
    {
        b = context;
        hjm1.a(this);
    }

    public void E_()
    {
        if (a())
        {
            c.a(g.c(b));
        }
    }

    public btl a(hgx hgx1)
    {
        hgx1.a(btl, this);
        return this;
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        c = (buz)hgx1.a(buz);
    }

    public void a(Runnable runnable)
    {
        g.w();
        if (a())
        {
            a.add(runnable);
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    public boolean a()
    {
        return ((AudioManager)b.getSystemService("audio")).isMicrophoneMute();
    }

    public void c()
    {
        g.w();
        ((AudioManager)b.getSystemService("audio")).setMicrophoneMute(false);
        g.b(2609);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        a.clear();
    }
}
