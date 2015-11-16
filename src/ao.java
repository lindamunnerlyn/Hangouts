// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class ao extends am
{

    private final Activity a;
    final Context b;
    final int c;
    final aq d;
    private final Handler e;
    private hm f;
    private bs g;
    private boolean h;
    private boolean i;

    ao(ai ai1)
    {
        this(((Activity) (ai1)), ((Context) (ai1)), ai1.a);
    }

    private ao(Activity activity, Context context, Handler handler)
    {
        d = new aq();
        a = activity;
        b = context;
        e = handler;
        c = 0;
    }

    public View a(int i1)
    {
        return null;
    }

    bs a(String s, boolean flag, boolean flag1)
    {
        if (f == null)
        {
            f = new hm();
        }
        bs bs1 = (bs)f.get(s);
        if (bs1 == null)
        {
            if (flag1)
            {
                bs1 = new bs(s, this, flag);
                f.put(s, bs1);
            }
            return bs1;
        } else
        {
            bs1.a(this);
            return bs1;
        }
    }

    void a(ad ad)
    {
    }

    public void a(ad ad, Intent intent, int i1)
    {
        if (i1 != -1)
        {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        } else
        {
            b.startActivity(intent);
            return;
        }
    }

    public void a(ad ad, String as[], int i1)
    {
    }

    void a(hm hm1)
    {
        f = hm1;
    }

    void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s);
        printwriter.print("mLoadersStarted=");
        printwriter.println(i);
        if (g != null)
        {
            printwriter.print(s);
            printwriter.print("Loader Manager ");
            printwriter.print(Integer.toHexString(System.identityHashCode(g)));
            printwriter.println(":");
            g.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    public void a(String s, PrintWriter printwriter, String as[])
    {
    }

    void a(boolean flag)
    {
        while (g == null || !i) 
        {
            return;
        }
        i = false;
        if (flag)
        {
            g.d();
            return;
        } else
        {
            g.c();
            return;
        }
    }

    public boolean a()
    {
        return true;
    }

    public boolean a(String s)
    {
        return false;
    }

    void b(String s)
    {
        if (f != null)
        {
            bs bs1 = (bs)f.get(s);
            if (bs1 != null && !bs1.f)
            {
                bs1.h();
                f.remove(s);
            }
        }
    }

    public boolean b()
    {
        return true;
    }

    public LayoutInflater c()
    {
        return (LayoutInflater)b.getSystemService("layout_inflater");
    }

    public void d()
    {
    }

    public boolean e()
    {
        return true;
    }

    public int f()
    {
        return c;
    }

    public abstract Object g();

    Activity h()
    {
        return a;
    }

    Context i()
    {
        return b;
    }

    Handler j()
    {
        return e;
    }

    aq k()
    {
        return d;
    }

    bs l()
    {
        if (g != null)
        {
            return g;
        } else
        {
            h = true;
            g = a("(root)", i, true);
            return g;
        }
    }

    void m()
    {
        if (i)
        {
            return;
        }
        i = true;
        if (g == null) goto _L2; else goto _L1
_L1:
        g.b();
_L4:
        h = true;
        return;
_L2:
        if (!h)
        {
            g = a("(root)", i, false);
            if (g != null && !g.e)
            {
                g.b();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void n()
    {
        if (g == null)
        {
            return;
        } else
        {
            g.h();
            return;
        }
    }

    void o()
    {
        if (f != null)
        {
            int k1 = f.size();
            bs abs[] = new bs[k1];
            for (int i1 = k1 - 1; i1 >= 0; i1--)
            {
                abs[i1] = (bs)f.c(i1);
            }

            for (int j1 = 0; j1 < k1; j1++)
            {
                bs bs1 = abs[j1];
                bs1.e();
                bs1.g();
            }

        }
    }

    hm p()
    {
        int j1 = 0;
        boolean flag1;
        if (f != null)
        {
            int k1 = f.size();
            bs abs[] = new bs[k1];
            for (int i1 = k1 - 1; i1 >= 0; i1--)
            {
                abs[i1] = (bs)f.c(i1);
            }

            boolean flag = false;
            do
            {
                flag1 = flag;
                if (j1 >= k1)
                {
                    break;
                }
                bs bs1 = abs[j1];
                if (bs1.f)
                {
                    flag = true;
                } else
                {
                    bs1.h();
                    f.remove(bs1.d);
                }
                j1++;
            } while (true);
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            return f;
        } else
        {
            return null;
        }
    }
}
