// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class zq
{

    private static final List m;
    public final View a;
    int b;
    int c;
    long d;
    int e;
    int f;
    zq g;
    zq h;
    List i;
    List j;
    yr k;
    private int l;
    private int n;
    private zj o;
    private int p;

    public zq(View view)
    {
        b = -1;
        c = -1;
        d = -1L;
        e = -1;
        f = -1;
        g = null;
        h = null;
        i = null;
        j = null;
        n = 0;
        o = null;
        p = 0;
        if (view == null)
        {
            throw new IllegalArgumentException("itemView may not be null");
        } else
        {
            a = view;
            return;
        }
    }

    static void a(zq zq1)
    {
        zq1.p = kb.e(zq1.a);
        kb.c(zq1.a, 4);
    }

    static void b(zq zq1)
    {
        kb.c(zq1.a, zq1.p);
        zq1.p = 0;
    }

    static boolean c(zq zq1)
    {
        return (zq1.l & 0x10) == 0 && kb.c(zq1.a);
    }

    static zj d(zq zq1)
    {
        zq1.o = null;
        return null;
    }

    static boolean e(zq zq1)
    {
        return (zq1.l & 0x10) != 0;
    }

    static int f(zq zq1)
    {
        return zq1.l;
    }

    void a()
    {
        c = -1;
        f = -1;
    }

    void a(int i1)
    {
        l = l | i1;
    }

    void a(int i1, int j1)
    {
        l = l & ~j1 | i1 & j1;
    }

    void a(int i1, int j1, boolean flag)
    {
        a(8);
        a(j1, flag);
        b = i1;
    }

    void a(int i1, boolean flag)
    {
        if (c == -1)
        {
            c = b;
        }
        if (f == -1)
        {
            f = b;
        }
        if (flag)
        {
            f = f + i1;
        }
        b = b + i1;
        if (a.getLayoutParams() != null)
        {
            ((zf)a.getLayoutParams()).c = true;
        }
    }

    void a(Object obj)
    {
        if (obj == null)
        {
            a(1024);
        } else
        if ((l & 0x400) == 0)
        {
            if (i == null)
            {
                i = new ArrayList();
                j = Collections.unmodifiableList(i);
            }
            i.add(obj);
            return;
        }
    }

    void a(zj zj1)
    {
        o = zj1;
    }

    public final void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = n - 1;
        } else
        {
            i1 = n + 1;
        }
        n = i1;
        if (n < 0)
        {
            n = 0;
            Log.e("View", (new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ")).append(this).toString());
        } else
        {
            if (!flag && n == 1)
            {
                l = l | 0x10;
                return;
            }
            if (flag && n == 0)
            {
                l = l & 0xffffffef;
                return;
            }
        }
    }

    void b()
    {
        if (c == -1)
        {
            c = b;
        }
    }

    boolean c()
    {
        return (l & 0x80) != 0;
    }

    public final int d()
    {
        if (f == -1)
        {
            return b;
        } else
        {
            return f;
        }
    }

    boolean e()
    {
        return o != null;
    }

    void f()
    {
        o.b(this);
    }

    boolean g()
    {
        return (l & 0x20) != 0;
    }

    void h()
    {
        l = l & 0xffffffdf;
    }

    void i()
    {
        l = l & 0xfffffeff;
    }

    boolean j()
    {
        return (l & 4) != 0;
    }

    boolean k()
    {
        return (l & 2) != 0;
    }

    boolean l()
    {
        return (l & 0x40) != 0;
    }

    boolean m()
    {
        return (l & 1) != 0;
    }

    boolean n()
    {
        return (l & 8) != 0;
    }

    boolean o()
    {
        return (l & 0x4e) != 0;
    }

    boolean p()
    {
        return (l & 0x100) != 0;
    }

    boolean q()
    {
        return (l & 0x200) != 0 || j();
    }

    void r()
    {
        if (i != null)
        {
            i.clear();
        }
        l = l & 0xfffffbff;
    }

    List s()
    {
        if ((l & 0x400) == 0)
        {
            if (i == null || i.size() == 0)
            {
                return m;
            } else
            {
                return j;
            }
        } else
        {
            return m;
        }
    }

    void t()
    {
        l = 0;
        b = -1;
        c = -1;
        d = -1L;
        f = -1;
        n = 0;
        g = null;
        h = null;
        r();
        p = 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((new StringBuilder("ViewHolder{")).append(Integer.toHexString(hashCode())).append(" position=").append(b).append(" id=").append(d).append(", oldPos=").append(c).append(", pLpos:").append(f).toString());
        if (e())
        {
            stringbuilder.append(" scrap");
        }
        if (j())
        {
            stringbuilder.append(" invalid");
        }
        if (!m())
        {
            stringbuilder.append(" unbound");
        }
        if (k())
        {
            stringbuilder.append(" update");
        }
        if (n())
        {
            stringbuilder.append(" removed");
        }
        if (c())
        {
            stringbuilder.append(" ignored");
        }
        if (l())
        {
            stringbuilder.append(" changed");
        }
        if (p())
        {
            stringbuilder.append(" tmpDetached");
        }
        if (!u())
        {
            stringbuilder.append((new StringBuilder(" not recyclable(")).append(n).append(")").toString());
        }
        if (q())
        {
            stringbuilder.append("undefined adapter position");
        }
        if (a.getParent() == null)
        {
            stringbuilder.append(" no parent");
        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public final boolean u()
    {
        return (l & 0x10) == 0 && !kb.c(a);
    }

    static 
    {
        m = Collections.EMPTY_LIST;
    }
}
