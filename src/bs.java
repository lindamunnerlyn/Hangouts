// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public final class bs extends bq
{

    public static boolean a = false;
    final hn b = new hn();
    final hn c = new hn();
    final String d;
    boolean e;
    boolean f;
    boolean g;
    private ao h;

    bs(String s, ao ao1, boolean flag)
    {
        d = s;
        h = ao1;
        e = flag;
    }

    static ao a(bs bs1)
    {
        return bs1.h;
    }

    private bt c(int i, Bundle bundle, br br1)
    {
        bt bt1 = new bt(this, i, bundle, br1);
        bt1.d = br1.onCreateLoader(i, bundle);
        return bt1;
    }

    private bt d(int i, Bundle bundle, br br1)
    {
        g = true;
        bundle = c(i, bundle, br1);
        a(bundle);
        g = false;
        return bundle;
        bundle;
        g = false;
        throw bundle;
    }

    public em a(int i, Bundle bundle, br br1)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        bt bt1 = (bt)b.a(i);
        if (a)
        {
            (new StringBuilder("initLoader in ")).append(this).append(": args=").append(bundle);
        }
        if (bt1 == null)
        {
            br1 = d(i, bundle, br1);
            bundle = br1;
            if (a)
            {
                (new StringBuilder("  Created new loader ")).append(br1);
                bundle = br1;
            }
        } else
        {
            if (a)
            {
                (new StringBuilder("  Re-using existing loader ")).append(bt1);
            }
            bt1.c = br1;
            bundle = bt1;
        }
        if (((bt) (bundle)).e && e)
        {
            bundle.b(((bt) (bundle)).d, ((bt) (bundle)).g);
        }
        return ((bt) (bundle)).d;
    }

    public void a(int i)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (a)
        {
            (new StringBuilder("destroyLoader in ")).append(this).append(" of ").append(i);
        }
        int j = b.f(i);
        if (j >= 0)
        {
            bt bt1 = (bt)b.e(j);
            b.c(j);
            bt1.g();
        }
        i = c.f(i);
        if (i >= 0)
        {
            bt bt2 = (bt)c.e(i);
            c.c(i);
            bt2.g();
        }
        if (h != null && !a())
        {
            h.d.f();
        }
    }

    void a(ao ao1)
    {
        h = ao1;
    }

    void a(bt bt1)
    {
        b.a(bt1.a, bt1);
        if (e)
        {
            bt1.a();
        }
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        boolean flag = false;
        if (b.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Active Loaders:");
            String s1 = (new StringBuilder()).append(s).append("    ").toString();
            for (int i = 0; i < b.a(); i++)
            {
                bt bt1 = (bt)b.e(i);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(b.d(i));
                printwriter.print(": ");
                printwriter.println(bt1.toString());
                bt1.a(s1, filedescriptor, printwriter, as);
            }

        }
        if (c.a() > 0)
        {
            printwriter.print(s);
            printwriter.println("Inactive Loaders:");
            String s2 = (new StringBuilder()).append(s).append("    ").toString();
            for (int j = ((flag) ? 1 : 0); j < c.a(); j++)
            {
                bt bt2 = (bt)c.e(j);
                printwriter.print(s);
                printwriter.print("  #");
                printwriter.print(c.d(j));
                printwriter.print(": ");
                printwriter.println(bt2.toString());
                bt2.a(s2, filedescriptor, printwriter, as);
            }

        }
    }

    public boolean a()
    {
        int j = b.a();
        int i = 0;
        boolean flag1 = false;
        while (i < j) 
        {
            bt bt1 = (bt)b.e(i);
            boolean flag;
            if (bt1.h && !bt1.f)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            i++;
        }
        return flag1;
    }

    public em b(int i)
    {
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        bt bt1 = (bt)b.a(i);
        if (bt1 != null)
        {
            if (bt1.n != null)
            {
                return bt1.n.d;
            } else
            {
                return bt1.d;
            }
        } else
        {
            return null;
        }
    }

    public em b(int i, Bundle bundle, br br1)
    {
        bt bt1;
        if (g)
        {
            throw new IllegalStateException("Called while creating a loader");
        }
        bt1 = (bt)b.a(i);
        if (a)
        {
            (new StringBuilder("restartLoader in ")).append(this).append(": args=").append(bundle);
        }
        if (bt1 == null) goto _L2; else goto _L1
_L1:
        bt bt2 = (bt)c.a(i);
        if (bt2 == null) goto _L4; else goto _L3
_L3:
        if (!bt1.e) goto _L6; else goto _L5
_L5:
        if (a)
        {
            (new StringBuilder("  Removing last inactive loader: ")).append(bt1);
        }
        bt2.f = false;
        bt2.g();
_L9:
        bt1.d.w();
        c.a(i, bt1);
_L2:
        return d(i, bundle, br1).d;
_L6:
        if (bt1.h)
        {
            break; /* Loop/switch isn't completed */
        }
        b.a(i, null);
        bt1.g();
        if (true) goto _L2; else goto _L7
_L7:
        bt1.f();
        if (bt1.n != null)
        {
            if (a)
            {
                (new StringBuilder("  Removing pending loader: ")).append(bt1.n);
            }
            bt1.n.g();
            bt1.n = null;
        }
        bt1.n = c(i, bundle, br1);
        return bt1.n.d;
_L4:
        if (a)
        {
            (new StringBuilder("  Making last loader inactive: ")).append(bt1);
        }
        if (true) goto _L9; else goto _L8
_L8:
    }

    void b()
    {
        if (a)
        {
            (new StringBuilder("Starting in ")).append(this);
        }
        if (e)
        {
            (new RuntimeException("here")).fillInStackTrace();
            (new StringBuilder("Called doStart when already started: ")).append(this);
        } else
        {
            e = true;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                ((bt)b.e(i)).a();
                i--;
            }
        }
    }

    void c()
    {
        if (a)
        {
            (new StringBuilder("Stopping in ")).append(this);
        }
        if (!e)
        {
            (new RuntimeException("here")).fillInStackTrace();
            (new StringBuilder("Called doStop when not started: ")).append(this);
            return;
        }
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((bt)b.e(i)).e();
        }

        e = false;
    }

    void d()
    {
        if (a)
        {
            (new StringBuilder("Retaining in ")).append(this);
        }
        if (!e)
        {
            (new RuntimeException("here")).fillInStackTrace();
            (new StringBuilder("Called doRetain when not started: ")).append(this);
        } else
        {
            f = true;
            e = false;
            int i = b.a() - 1;
            while (i >= 0) 
            {
                ((bt)b.e(i)).b();
                i--;
            }
        }
    }

    void e()
    {
        if (f)
        {
            if (a)
            {
                (new StringBuilder("Finished Retaining in ")).append(this);
            }
            f = false;
            for (int i = b.a() - 1; i >= 0; i--)
            {
                ((bt)b.e(i)).c();
            }

        }
    }

    void f()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((bt)b.e(i)).k = true;
        }

    }

    void g()
    {
        for (int i = b.a() - 1; i >= 0; i--)
        {
            ((bt)b.e(i)).d();
        }

    }

    void h()
    {
        if (!f)
        {
            if (a)
            {
                (new StringBuilder("Destroying Active in ")).append(this);
            }
            for (int i = b.a() - 1; i >= 0; i--)
            {
                ((bt)b.e(i)).g();
            }

            b.b();
        }
        if (a)
        {
            (new StringBuilder("Destroying Inactive in ")).append(this);
        }
        for (int j = c.a() - 1; j >= 0; j--)
        {
            ((bt)c.e(j)).g();
        }

        c.b();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        stringbuilder.append("LoaderManager{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" in ");
        g.a(h, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }

}
