// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.widget.Toast;
import com.google.android.libraries.quantum.snackbar.Snackbar;
import java.util.PriorityQueue;

final class bvp
    implements bvm, how, hox, hoy
{

    private final Context a;
    private final PriorityQueue b = new PriorityQueue();
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Runnable d = new bvq(this);
    private final Runnable e = new bvr(this);
    private bvt f;
    private bvs g;
    private Snackbar h;
    private Toast i;
    private boolean j;
    private long k;

    bvp(Context context, hof hof1)
    {
        f = new bvt(this);
        k = -1L;
        a = context;
        g = null;
        h = null;
        i = null;
        j = true;
        hof1.a(this);
    }

    public bvm a(hlp hlp1)
    {
        hlp1.a(bvm, this);
        return this;
    }

    public void a(bvk bvk1)
    {
        bvk1 = new bvs(bvk1);
        b.add(bvk1);
        if (g == null || bvk1.a(g) < 0)
        {
            a(c());
        }
    }

    public void a(Snackbar snackbar)
    {
        h = snackbar;
        h.b();
        a(false);
    }

    void a(boolean flag)
    {
        if (!j && h != null)
        {
            g = (bvs)b.poll();
            if (g != null)
            {
                if (flag)
                {
                    c.postDelayed(d, 500L);
                    return;
                } else
                {
                    d();
                    return;
                }
            }
        }
    }

    boolean c()
    {
        if (g != null)
        {
            g = null;
            c.removeCallbacks(d);
            c.removeCallbacks(e);
            if (i != null)
            {
                i.cancel();
                i = null;
                return true;
            }
            if (h.getVisibility() == 0)
            {
                h.b();
                return true;
            }
        }
        return false;
    }

    void d()
    {
        bvk bvk1 = g.b;
        if (bvk1.b)
        {
            gdv.a("Expected null", i);
            i = Toast.makeText(a, bvk1.c, 0);
            i.show();
        } else
        {
            Snackbar snackbar = h;
            android.content.res.ColorStateList colorstatelist;
            if (bvk1.f == null)
            {
                colorstatelist = a.getResources().getColorStateList(g.dA);
            } else
            {
                colorstatelist = bvk1.f;
            }
            snackbar.a(colorstatelist);
            snackbar = h;
            if (bvk1.g == null)
            {
                colorstatelist = a.getResources().getColorStateList(g.dA);
            } else
            {
                colorstatelist = bvk1.g;
            }
            snackbar.b(colorstatelist);
            h.a(bvk1.c, bvk1.e, bvk1.h);
            h.a();
        }
        if (bvk1.d != -1)
        {
            long l = SystemClock.elapsedRealtime();
            if (k == -1L || k + 2000L < l)
            {
                eep.a(bvk1.d);
                k = l;
            }
        }
        c.postDelayed(e, 4000L);
    }

    public void k_()
    {
        j = false;
        a(false);
    }

    public void l_()
    {
        j = true;
        c();
    }
}
