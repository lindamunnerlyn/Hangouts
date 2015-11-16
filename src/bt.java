// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class bt
    implements eo, ep
{

    final int a;
    final Bundle b;
    br c;
    em d;
    boolean e;
    boolean f;
    Object g;
    boolean h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    boolean m;
    bt n;
    final bs o;

    public bt(bs bs1, int i1, Bundle bundle, br br1)
    {
        o = bs1;
        super();
        a = i1;
        b = bundle;
        c = br1;
    }

    void a()
    {
        if (i && j)
        {
            h = true;
        } else
        if (!h)
        {
            h = true;
            if (bs.a)
            {
                (new StringBuilder("  Starting: ")).append(this);
            }
            if (d == null && c != null)
            {
                d = c.onCreateLoader(a, b);
            }
            if (d != null)
            {
                if (d.getClass().isMemberClass() && !Modifier.isStatic(d.getClass().getModifiers()))
                {
                    throw new IllegalArgumentException((new StringBuilder("Object returned from onCreateLoader must not be a non-static inner member class: ")).append(d).toString());
                }
                if (!m)
                {
                    d.a(a, this);
                    d.a(this);
                    m = true;
                }
                d.s();
                return;
            }
        }
    }

    public void a(em em1, Object obj)
    {
        if (bs.a)
        {
            (new StringBuilder("onLoadComplete: ")).append(this);
        }
        break MISSING_BLOCK_LABEL_20;
        if (!l && o.b.a(a) == this)
        {
            bt bt1 = n;
            if (bt1 != null)
            {
                if (bs.a)
                {
                    (new StringBuilder("  Switching to pending loader: ")).append(bt1);
                }
                n = null;
                o.b.a(a, null);
                g();
                o.a(bt1);
                return;
            }
            if (g != obj || !e)
            {
                g = obj;
                e = true;
                if (h)
                {
                    b(em1, obj);
                }
            }
            em1 = (bt)o.c.a(a);
            if (em1 != null && em1 != this)
            {
                em1.f = false;
                em1.g();
                o.c.b(a);
            }
            if (o.h != null && !o.a())
            {
                o.h.d.f();
                return;
            }
        }
        return;
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s);
        printwriter.print("mId=");
        printwriter.print(a);
        printwriter.print(" mArgs=");
        printwriter.println(b);
        printwriter.print(s);
        printwriter.print("mCallbacks=");
        printwriter.println(c);
        printwriter.print(s);
        printwriter.print("mLoader=");
        printwriter.println(d);
        if (d != null)
        {
            d.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }
        if (e || f)
        {
            printwriter.print(s);
            printwriter.print("mHaveData=");
            printwriter.print(e);
            printwriter.print("  mDeliveredData=");
            printwriter.println(f);
            printwriter.print(s);
            printwriter.print("mData=");
            printwriter.println(g);
        }
        printwriter.print(s);
        printwriter.print("mStarted=");
        printwriter.print(h);
        printwriter.print(" mReportNextStart=");
        printwriter.print(k);
        printwriter.print(" mDestroyed=");
        printwriter.println(l);
        printwriter.print(s);
        printwriter.print("mRetaining=");
        printwriter.print(i);
        printwriter.print(" mRetainingStarted=");
        printwriter.print(j);
        printwriter.print(" mListenerRegistered=");
        printwriter.println(m);
        if (n != null)
        {
            printwriter.print(s);
            printwriter.println("Pending Loader ");
            printwriter.print(n);
            printwriter.println(":");
            n.a((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
        }
    }

    void b()
    {
        if (bs.a)
        {
            (new StringBuilder("  Retaining: ")).append(this);
        }
        i = true;
        j = h;
        h = false;
        c = null;
    }

    void b(em em1, Object obj)
    {
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        String s;
        if (o.h != null)
        {
            s = o.h.d.u;
            o.h.d.u = "onLoadFinished";
        } else
        {
            s = null;
        }
        if (bs.a)
        {
            (new StringBuilder("  onLoadFinished in ")).append(em1).append(": ").append(em1.c(obj));
        }
        c.onLoadFinished(em1, obj);
        if (o.h != null)
        {
            o.h.d.u = s;
        }
        f = true;
        return;
        em1;
        if (o.h != null)
        {
            o.h.d.u = s;
        }
        throw em1;
    }

    void c()
    {
        if (i)
        {
            if (bs.a)
            {
                (new StringBuilder("  Finished Retaining: ")).append(this);
            }
            i = false;
            if (h != j && !h)
            {
                e();
            }
        }
        if (h && e && !k)
        {
            b(d, g);
        }
    }

    void d()
    {
        if (h && k)
        {
            k = false;
            if (e)
            {
                b(d, g);
            }
        }
    }

    void e()
    {
        if (bs.a)
        {
            (new StringBuilder("  Stopping: ")).append(this);
        }
        h = false;
        if (!i && d != null && m)
        {
            m = false;
            d.a(this);
            d.b(this);
            d.v();
        }
    }

    void f()
    {
        if (bs.a)
        {
            (new StringBuilder("  Canceling: ")).append(this);
        }
        if (h && d != null && m && !d.t())
        {
            h();
        }
    }

    void g()
    {
        if (bs.a)
        {
            (new StringBuilder("  Destroying: ")).append(this);
        }
        l = true;
        boolean flag = f;
        f = false;
        if (c == null || d == null || !e || !flag)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        if (bs.a)
        {
            (new StringBuilder("  Reseting: ")).append(this);
        }
        String s;
        Exception exception;
        if (o.h != null)
        {
            s = o.h.d.u;
            o.h.d.u = "onLoaderReset";
        } else
        {
            s = null;
        }
        c.onLoaderReset(d);
        if (o.h != null)
        {
            o.h.d.u = s;
        }
        c = null;
        g = null;
        e = false;
        if (d != null)
        {
            if (m)
            {
                m = false;
                d.a(this);
                d.b(this);
            }
            d.x();
        }
        if (n != null)
        {
            n.g();
        }
        return;
        exception;
        if (o.h != null)
        {
            o.h.d.u = s;
        }
        throw exception;
    }

    public void h()
    {
        if (bs.a)
        {
            (new StringBuilder("onLoadCanceled: ")).append(this);
        }
        break MISSING_BLOCK_LABEL_21;
        if (!l && o.b.a(a) == this)
        {
            bt bt1 = n;
            if (bt1 != null)
            {
                if (bs.a)
                {
                    (new StringBuilder("  Switching to pending loader: ")).append(bt1);
                }
                n = null;
                o.b.a(a, null);
                g();
                o.a(bt1);
                return;
            }
        }
        return;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        stringbuilder.append("LoaderInfo{");
        stringbuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringbuilder.append(" #");
        stringbuilder.append(a);
        stringbuilder.append(" : ");
        g.a(d, stringbuilder);
        stringbuilder.append("}}");
        return stringbuilder.toString();
    }
}
