// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

final class gfu
    implements ggd
{

    final List a = new ArrayList();
    final List b = new ArrayList();
    final Queue c = new ConcurrentLinkedQueue();
    final gga d = new gga(this);
    private final ggb e = new ggb(this);

    public gfu()
    {
        e.start();
    }

    public void a()
    {
        e.interrupt();
    }

    public void a(gio gio)
    {
        a(((Runnable) (new gfx(this, gio))));
    }

    public void a(gmw gmw1)
    {
        a(((Runnable) (new gfw(this, gmw1))));
    }

    public void a(gmw gmw1, gio gio)
    {
        if (gmw1.b() == 0 || gmw1.c() == 0)
        {
            throw new IllegalArgumentException("Invalid surface");
        }
        if (gio == null)
        {
            throw new NullPointerException("Invalid videoSource");
        }
        if (!gmw1.a().isValid())
        {
            gne.a(6, "vclib", "Asked to add a rendering target for an invalid surface.");
            return;
        } else
        {
            a(((Runnable) (new gfv(this, gmw1, gio))));
            return;
        }
    }

    public void a(Runnable runnable)
    {
        if (e.isInterrupted())
        {
            gne.a(5, "vclib", "Tried to queue an event on a dead GlManager, ignoring.");
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
        ggb1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void b(gio gio)
    {
        a(new gfy(this, gio));
    }
}
