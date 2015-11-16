// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.animation.Interpolator;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public final class qb
    implements pu
{

    public static qb m;
    public final long A;
    public long B;
    public int C;
    final Toolbar a;
    final Drawable b;
    final CharSequence c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Interpolator h;
    public boolean i;
    public int j;
    public final String k;
    public final int l;
    public final bnd n;
    public final Intent o;
    public final Context p;
    public AlarmManager q;
    public final Random r;
    public int s;
    public boolean t;
    public Set u;
    public final int v;
    public final Class w;
    public final int x;
    public final boolean y;
    public final String z;

    private qb()
    {
    }

    public static PendingIntent a(Intent intent)
    {
        Context context = g.nS;
        Intent intent1 = new Intent("start_next_hangout");
        intent1.setComponent(new ComponentName(context, com/google/android/apps/hangouts/hangout/StressMode$StressReceiver));
        if (intent != null)
        {
            intent1.putExtra("hangout_intent", intent);
        }
        return PendingIntent.getBroadcast(context, eba.a(113), intent1, 0x8000000);
    }

    private int b(Object obj)
    {
        int j1 = 0;
        int l1 = Array.getLength(obj);
        for (int i1 = 0; i1 < l1;)
        {
            int k1 = j1;
            if (Array.get(obj, i1) != null)
            {
                k1 = j1 + c(Array.get(obj, i1));
            }
            i1++;
            j1 = k1;
        }

        return j1;
    }

    private void b(Object obj, fdi fdi1)
    {
        fdi1.d(x);
        v;
        JVM INSTR tableswitch 10 11: default 107
    //                   10 73
    //                   11 98;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(v).toString());
_L2:
        try
        {
            obj = (fdo)obj;
            int i1 = fdq.b(x);
            fdi1.a(((fdo) (obj)));
            fdi1.c(i1, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        fdi1.b((fdo)obj);
        return;
    }

    private int c(Object obj)
    {
        int i1 = fdq.b(x);
        switch (v)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Unknown type ")).append(v).toString());

        case 10: // '\n'
            obj = (fdo)obj;
            return (fdi.c(i1) << 1) + ((fdo) (obj)).g();

        case 11: // '\013'
            return fdi.b(i1, (fdo)obj);
        }
    }

    private void c(Object obj, fdi fdi1)
    {
        int j1 = Array.getLength(obj);
        for (int i1 = 0; i1 < j1; i1++)
        {
            Object obj1 = Array.get(obj, i1);
            if (obj1 != null)
            {
                b(obj1, fdi1);
            }
        }

    }

    private void j()
    {
        if (h != null && f <= 0)
        {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        if (f <= 0)
        {
            throw new IllegalStateException("Scroll duration must be a positive number");
        } else
        {
            return;
        }
    }

    private void k()
    {
        gbh.b(m);
        int i1 = Math.min((int)(Math.abs(r.nextGaussian()) * 10000D), 60000);
        float f1;
        int j1;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            q.setExact(2, SystemClock.elapsedRealtime() + (long)i1, a(o));
        } else
        {
            q.set(2, SystemClock.elapsedRealtime() + (long)i1, a(o));
        }
        j1 = s;
        f1 = (float)i1 / 1000F;
        ebw.a("Babel", (new StringBuilder(49)).append("State change from ").append(j1).append(" in ").append(f1).append("s").toString());
    }

    private void l()
    {
        Intent intent = g.a((boy)o.getParcelableExtra("hangout_room_info"), (ArrayList)o.getSerializableExtra("hangout_invitee_users"), (ArrayList)o.getSerializableExtra("hangout_invitee_circles"), true, 51, SystemClock.elapsedRealtime());
        intent.addFlags(0x10000000);
        p.startActivity(intent);
        s = 1;
        k();
    }

    private void m()
    {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(0x10000000);
        p.startActivity(intent);
        s = 2;
        k();
    }

    public int a(Object obj)
    {
        if (y)
        {
            return b(obj);
        } else
        {
            return c(obj);
        }
    }

    public Drawable a()
    {
        return b;
    }

    public void a(int i1)
    {
        if (i1 == 0)
        {
            a.d(c);
            return;
        } else
        {
            a.d(i1);
            return;
        }
    }

    public void a(Drawable drawable, int i1)
    {
        a.b(drawable);
        a(i1);
    }

    public void a(Object obj, fdi fdi1)
    {
        if (y)
        {
            c(obj, fdi1);
            return;
        } else
        {
            b(obj, fdi1);
            return;
        }
    }

    public void a(String s1)
    {
        Log.println(l, k, s1);
    }

    public void a(yr yr1)
    {
        if (g >= 0)
        {
            int i1 = g;
            g = -1;
            yr.c(yr1, i1);
            i = false;
            return;
        }
        if (i)
        {
            j();
            if (h == null)
            {
                if (f == 0x80000000)
                {
                    yr.t(yr1).b(d, e);
                } else
                {
                    yr.t(yr1).a(d, e, f);
                }
            } else
            {
                yr.t(yr1).a(d, e, f, h);
            }
            j = j + 1;
            if (j > 10)
            {
                Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
            }
            i = false;
            return;
        } else
        {
            j = 0;
            return;
        }
    }

    public Context b()
    {
        return a.getContext();
    }

    public boolean c()
    {
        return true;
    }

    public boolean d()
    {
        return g >= 0;
    }

    public boolean e()
    {
        return Log.isLoggable(k, l);
    }

    public void f()
    {
        gbh.b(m);
        switch (s)
        {
        default:
            return;

        case 0: // '\0'
            l();
            return;

        case 1: // '\001'
            if ((double)r.nextFloat() < 0.29999999999999999D)
            {
                m();
                return;
            }
            if (n.t() == null)
            {
                k();
                return;
            } else
            {
                g();
                return;
            }

        case 2: // '\002'
            break;
        }
        if ((double)r.nextFloat() < 0.5D)
        {
            l();
            return;
        } else
        {
            g();
            return;
        }
    }

    public void g()
    {
        bpd bpd1 = n.t();
        if (bpd1 != null)
        {
            bpd1.c(1004);
        }
    }

    public boolean h()
    {
        return t;
    }

    public Set i()
    {
        return u;
    }
}
