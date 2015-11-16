// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

final class gdg
    implements gdp
{

    final List a = new ArrayList();
    final List b = new ArrayList();
    final Queue c = new ConcurrentLinkedQueue();
    final gdm d = new gdm(this);
    private final gdn e = new gdn(this);

    public gdg()
    {
        e.start();
    }

    public void a()
    {
        e.interrupt();
    }

    public void a(gfo gfo)
    {
        a(((Runnable) (new gdj(this, gfo))));
    }

    public void a(gju gju1)
    {
        a(((Runnable) (new gdi(this, gju1))));
    }

    public void a(gju gju1, gfo gfo)
    {
        if (gju1.b() == 0 || gju1.c() == 0)
        {
            throw new IllegalArgumentException("Invalid surface");
        }
        if (gfo == null)
        {
            throw new NullPointerException("Invalid videoSource");
        }
        if (!gju1.a().isValid())
        {
            gkc.e("vclib", "Asked to add a rendering target for an invalid surface.");
            return;
        } else
        {
            a(((Runnable) (new gdh(this, gju1, gfo))));
            return;
        }
    }

    public void a(Runnable runnable)
    {
        if (e.isInterrupted())
        {
            gkc.d("vclib", "Tried to queue an event on a dead GlManager, ignoring.");
            return;
        } else
        {
            c.add(runnable);
            b();
            return;
        }
    }

    public void b()
    {
        synchronized (e)
        {
            e.notify();
        }
        return;
        exception;
        gdn1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(gfo gfo)
    {
        a(new gdk(this, gfo));
    }
}
