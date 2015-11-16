// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hfm extends hfa
{

    private List b;
    private boolean c;
    private int d;
    private boolean e;

    public hfm(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = true;
        d = 0;
        e = false;
        b = new ArrayList();
        context = context.obtainStyledAttributes(attributeset, hga.as, i, 0);
        c = context.getBoolean(hga.at, c);
        context.recycle();
    }

    private boolean e(hfa hfa1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        hfa1.E();
        flag = b.remove(hfa1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        hfa1;
        this;
        JVM INSTR monitorexit ;
        throw hfa1;
    }

    public void C()
    {
        super.C();
        e = true;
        int j = c();
        for (int i = 0; i < j; i++)
        {
            a(i).C();
        }

    }

    protected void E()
    {
        super.E();
        e = false;
    }

    public hfa a(int i)
    {
        return (hfa)b.get(i);
    }

    public hfa a(CharSequence charsequence)
    {
        if (TextUtils.equals(r(), charsequence))
        {
            return this;
        }
        int j = c();
        for (int i = 0; i < j; i++)
        {
            hfa hfa1 = a(i);
            String s = hfa1.r();
            if (s != null && s.equals(charsequence))
            {
                return hfa1;
            }
            if (!(hfa1 instanceof hfm))
            {
                continue;
            }
            hfa1 = ((hfm)hfa1).a(charsequence);
            if (hfa1 != null)
            {
                return hfa1;
            }
        }

        return null;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean b(hfa hfa1)
    {
        hfa1.g(D());
        return true;
    }

    public int c()
    {
        return b.size();
    }

    protected void c(Bundle bundle)
    {
        super.c(bundle);
        int j = c();
        for (int i = 0; i < j; i++)
        {
            a(i).c(bundle);
        }

    }

    public boolean c(hfa hfa1)
    {
        int j;
        if (b.contains(hfa1))
        {
            return true;
        }
        if (hfa1.n() == 0x7fffffff)
        {
            if (c)
            {
                int i = d;
                d = i + 1;
                hfa1.f(i);
            }
            if (hfa1 instanceof hfm)
            {
                ((hfm)hfa1).a(c);
            }
        }
        int k = Collections.binarySearch(b, hfa1);
        j = k;
        if (k < 0)
        {
            j = -k - 1;
        }
        if (!b(hfa1))
        {
            return false;
        }
        this;
        JVM INSTR monitorenter ;
        b.add(j, hfa1);
        this;
        JVM INSTR monitorexit ;
        hfa1.a(B());
        if (e)
        {
            hfa1.C();
        }
        A();
        return true;
        hfa1;
        this;
        JVM INSTR monitorexit ;
        throw hfa1;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        int i;
        list = b;
        i = list.size() - 1;
_L2:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        e((hfa)list.get(0));
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        A();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean d(hfa hfa1)
    {
        boolean flag = e(hfa1);
        A();
        return flag;
    }

    protected void e(Bundle bundle)
    {
        super.e(bundle);
        int j = c();
        for (int i = 0; i < j; i++)
        {
            a(i).e(bundle);
        }

    }

    public void e(boolean flag)
    {
        super.e(flag);
        int j = c();
        for (int i = 0; i < j; i++)
        {
            a(i).g(flag);
        }

    }

    public boolean f()
    {
        return true;
    }

    void h()
    {
        this;
        JVM INSTR monitorenter ;
        Collections.sort(b);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
