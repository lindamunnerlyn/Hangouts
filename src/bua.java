// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bua
    implements bty, hma, hou, hoy
{

    private final List a = new CopyOnWriteArrayList();
    private final Context b;
    private bvm c;

    bua(Context context, hof hof1)
    {
        b = context;
        hof1.a(this);
    }

    public void G_()
    {
        if (a())
        {
            c.a(g.c(b));
        }
    }

    public bty a(hlp hlp1)
    {
        hlp1.a(bty, this);
        return this;
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        c = (bvm)hlp1.a(bvm);
    }

    public void a(Runnable runnable)
    {
        g.v();
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
        g.v();
        ((AudioManager)b.getSystemService("audio")).setMicrophoneMute(false);
        g.b(2609);
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        a.clear();
    }
}
