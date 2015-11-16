// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class em
{

    int n;
    ep o;
    eo p;
    Context q;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;

    public em(Context context)
    {
        r = false;
        s = false;
        t = true;
        u = false;
        v = false;
        q = context.getApplicationContext();
    }

    public void A()
    {
        if (v)
        {
            u = true;
        }
    }

    public void B()
    {
        if (r)
        {
            u();
            return;
        } else
        {
            u = true;
            return;
        }
    }

    protected void a()
    {
    }

    public void a(int l, ep ep1)
    {
        if (o != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            o = ep1;
            n = l;
            return;
        }
    }

    public void a(eo eo1)
    {
        if (p != null)
        {
            throw new IllegalStateException("There is already a listener registered");
        } else
        {
            p = eo1;
            return;
        }
    }

    public void a(ep ep1)
    {
        if (o == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (o != ep1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            o = null;
            return;
        }
    }

    public void a(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        printwriter.print(s1);
        printwriter.print("mId=");
        printwriter.print(n);
        printwriter.print(" mListener=");
        printwriter.println(o);
        if (r || u || v)
        {
            printwriter.print(s1);
            printwriter.print("mStarted=");
            printwriter.print(r);
            printwriter.print(" mContentChanged=");
            printwriter.print(u);
            printwriter.print(" mProcessingChange=");
            printwriter.println(v);
        }
        if (s || t)
        {
            printwriter.print(s1);
            printwriter.print("mAbandoned=");
            printwriter.print(s);
            printwriter.print(" mReset=");
            printwriter.println(t);
        }
    }

    public void b(eo eo1)
    {
        if (p == null)
        {
            throw new IllegalStateException("No listener register");
        }
        if (p != eo1)
        {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else
        {
            p = null;
            return;
        }
    }

    public void b(Object obj)
    {
        if (o != null)
        {
            o.a(this, obj);
        }
    }

    protected boolean b()
    {
        return false;
    }

    public String c(Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        g.a(obj, stringbuilder);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void i()
    {
    }

    public void j()
    {
    }

    public void k()
    {
    }

    public void m()
    {
        if (p != null)
        {
            p.h();
        }
    }

    public Context n()
    {
        return q;
    }

    public int o()
    {
        return n;
    }

    public boolean p()
    {
        return r;
    }

    public boolean q()
    {
        return s;
    }

    public boolean r()
    {
        return t;
    }

    public final void s()
    {
        r = true;
        t = false;
        s = false;
        i();
    }

    public boolean t()
    {
        return b();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(64);
        g.a(this, stringbuilder);
        stringbuilder.append(" id=");
        stringbuilder.append(n);
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public void u()
    {
        a();
    }

    public void v()
    {
        r = false;
        j();
    }

    public void w()
    {
        s = true;
    }

    public void x()
    {
        k();
        t = true;
        r = false;
        s = false;
        u = false;
        v = false;
    }

    public boolean y()
    {
        boolean flag = u;
        u = false;
        v = v | flag;
        return flag;
    }

    public void z()
    {
        v = false;
    }
}
