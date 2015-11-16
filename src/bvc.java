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

final class bvc
    implements buz, fsn, hkc, hkd
{

    private final Context a;
    private final PriorityQueue b = new PriorityQueue();
    private final Handler c = new Handler(Looper.getMainLooper());
    private final Runnable d = new bvd(this);
    private final Runnable e = new bve(this);
    private bvg f;
    private bvf g;
    private Snackbar h;
    private Toast i;
    private boolean j;
    private long k;

    bvc(Context context, hjm hjm1)
    {
        f = new bvg(this);
        k = -1L;
        a = context;
        g = null;
        h = null;
        i = null;
        j = true;
        hjm1.a(this);
    }

    static void a(bvc bvc1)
    {
        bvc1.d();
    }

    private void a(boolean flag)
    {
        if (!j && h != null)
        {
            g = (bvf)b.poll();
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

    static boolean b(bvc bvc1)
    {
        return bvc1.c();
    }

    static void c(bvc bvc1)
    {
        bvc1.a(true);
    }

    private boolean c()
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

    private void d()
    {
        bux bux1 = g.b;
        if (bux1.b)
        {
            int l;
            long l1;
            if (bux1.a == 0)
            {
                l = 1;
            } else
            {
                l = 0;
            }
            gbh.a(i);
            i = Toast.makeText(a, bux1.c, l);
            i.show();
        } else
        {
            Snackbar snackbar = h;
            android.content.res.ColorStateList colorstatelist;
            if (bux1.f == null)
            {
                colorstatelist = a.getResources().getColorStateList(g.dB);
            } else
            {
                colorstatelist = bux1.f;
            }
            snackbar.a(colorstatelist);
            snackbar = h;
            if (bux1.g == null)
            {
                colorstatelist = a.getResources().getColorStateList(g.dB);
            } else
            {
                colorstatelist = bux1.g;
            }
            snackbar.b(colorstatelist);
            h.a(bux1.c, bux1.e, bux1.h);
            h.a();
        }
        if (bux1.d != -1)
        {
            l1 = SystemClock.elapsedRealtime();
            if (k == -1L || k + 2000L < l1)
            {
                ebr.a(bux1.d);
                k = l1;
            }
        }
        c.postDelayed(e, 4000L);
    }

    public buz a(hgx hgx1)
    {
        hgx1.a(buz, this);
        return this;
    }

    public void a(bux bux1)
    {
        bux1 = new bvf(bux1);
        b.add(bux1);
        if (g == null || bux1.a(g) < 0)
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

    public void j_()
    {
        j = false;
        a(false);
    }

    public void k_()
    {
        j = true;
        c();
    }
}
