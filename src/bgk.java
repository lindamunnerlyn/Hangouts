// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.List;

public final class bgk
    implements android.content.DialogInterface.OnCancelListener
{

    public static final boolean a = false;
    private boolean b;
    private boolean c;
    private volatile boolean d;
    private bgp e;
    private volatile bgq f;
    private final List g = new ArrayList();
    private final bgr h = new bgl(this);

    private bgk(bgp bgp1)
    {
        d = false;
        e = bgp1;
        b = false;
        c = true;
        if (e != null)
        {
            e.a(this);
        }
    }

    public static bgk a(bgq bgq1, bgp bgp1)
    {
        bgp1 = new bgk(bgp1);
        if (bgq1 == null)
        {
            eev.g("Babel", "BlockingChainedExecutor: adding empty request");
            return bgp1;
        } else
        {
            bgq1.a(((bgk) (bgp1)).h);
            ((bgk) (bgp1)).g.add(bgq1);
            return bgp1;
        }
    }

    private void a(bgq bgq1, boolean flag)
    {
        if (a && !flag)
        {
            String s = String.valueOf(bgq1);
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 41)).append("BlockingChainedExecutor: request ").append(s).append(" failed.").toString());
        }
        int i = g.indexOf(bgq1);
        if (i < 0)
        {
            if (e != null)
            {
                e.a();
            }
            eev.g("Babel", "BlockingChainedExecutor: can't find the request!");
        } else
        {
            if (i == g.size() - 1)
            {
                if (e != null)
                {
                    e.a();
                }
                if (flag)
                {
                    bgq1.d();
                    return;
                } else
                {
                    bgq1.c();
                    return;
                }
            }
            if (!d && (flag && b || !flag && c))
            {
                f = (bgq)g.get(i + 1);
                f.g();
                if (e != null)
                {
                    e.b(f.a());
                }
                if (a)
                {
                    bgq1 = String.valueOf(f);
                    eev.b("Babel", (new StringBuilder(String.valueOf(bgq1).length() + 40)).append("BlockingChainedExecutor: handle request ").append(bgq1).toString());
                    return;
                }
            }
        }
    }

    public void a()
    {
        if (g.size() <= 0)
        {
            eev.g("Babel", "BlockingChainedExecutor: make sure you have requests to run!");
        } else
        {
            f = (bgq)g.get(0);
            if (e != null)
            {
                e.a(f.a());
            }
            f.g();
            if (a)
            {
                String s = String.valueOf(f);
                eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 40)).append("BlockingChainedExecutor: handle request ").append(s).toString());
                return;
            }
        }
    }

    protected void a(bgq bgq1)
    {
        a(bgq1, true);
    }

    protected void b(bgq bgq1)
    {
        a(bgq1, false);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        d = true;
        f.h();
    }

    static 
    {
        hnc hnc = eev.e;
    }
}
