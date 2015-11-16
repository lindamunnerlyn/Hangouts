// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;
import java.util.ArrayList;
import java.util.List;

public final class bfy
    implements android.content.DialogInterface.OnCancelListener
{

    public static final boolean a = false;
    private boolean b;
    private boolean c;
    private volatile boolean d;
    private bgd e;
    private volatile bge f;
    private final List g = new ArrayList();
    private final bgf h = new bfz(this);

    private bfy(bgd bgd1)
    {
        d = false;
        e = bgd1;
        b = false;
        c = true;
        if (e != null)
        {
            e.a(this);
        }
    }

    public static bfy a(bge bge1, bgd bgd1)
    {
        bgd1 = new bfy(bgd1);
        if (bge1 == null)
        {
            ebw.g("Babel", "BlockingChainedExecutor: adding empty request");
            return bgd1;
        } else
        {
            bge1.a(((bfy) (bgd1)).h);
            ((bfy) (bgd1)).g.add(bge1);
            return bgd1;
        }
    }

    private void a(bge bge1, boolean flag)
    {
        if (a && !flag)
        {
            String s = String.valueOf(bge1);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 41)).append("BlockingChainedExecutor: request ").append(s).append(" failed.").toString());
        }
        int i = g.indexOf(bge1);
        if (i < 0)
        {
            if (e != null)
            {
                e.a();
            }
            ebw.g("Babel", "BlockingChainedExecutor: can't find the request!");
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
                    bge1.d();
                    return;
                } else
                {
                    bge1.c();
                    return;
                }
            }
            if (!d && (flag && b || !flag && c))
            {
                f = (bge)g.get(i + 1);
                f.g();
                if (e != null)
                {
                    e.b(f.a());
                }
                if (a)
                {
                    bge1 = String.valueOf(f);
                    ebw.b("Babel", (new StringBuilder(String.valueOf(bge1).length() + 40)).append("BlockingChainedExecutor: handle request ").append(bge1).toString());
                    return;
                }
            }
        }
    }

    public void a()
    {
        if (g.size() <= 0)
        {
            ebw.g("Babel", "BlockingChainedExecutor: make sure you have requests to run!");
        } else
        {
            f = (bge)g.get(0);
            if (e != null)
            {
                e.a(f.a());
            }
            f.g();
            if (a)
            {
                String s = String.valueOf(f);
                ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 40)).append("BlockingChainedExecutor: handle request ").append(s).toString());
                return;
            }
        }
    }

    protected void a(bge bge1)
    {
        a(bge1, true);
    }

    protected void b(bge bge1)
    {
        a(bge1, false);
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        d = true;
        f.h();
    }

    static 
    {
        hik hik = ebw.e;
    }
}
