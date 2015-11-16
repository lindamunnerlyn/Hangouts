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

public class hkd extends hjr
{

    private List a;
    private boolean c;
    private int d;
    private boolean e;

    public hkd(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        c = true;
        d = 0;
        e = false;
        a = new ArrayList();
        context = context.obtainStyledAttributes(attributeset, hkr.as, i, 0);
        c = context.getBoolean(hkr.at, c);
        context.recycle();
    }

    private boolean e(hjr hjr1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        hjr1.E();
        flag = a.remove(hjr1);
        this;
        JVM INSTR monitorexit ;
        return flag;
        hjr1;
        this;
        JVM INSTR monitorexit ;
        throw hjr1;
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

    public hjr a(int i)
    {
        return (hjr)a.get(i);
    }

    public hjr a(CharSequence charsequence)
    {
        if (TextUtils.equals(r(), charsequence))
        {
            return this;
        }
        int j = c();
        for (int i = 0; i < j; i++)
        {
            hjr hjr1 = a(i);
            String s = hjr1.r();
            if (s != null && s.equals(charsequence))
            {
                return hjr1;
            }
            if (!(hjr1 instanceof hkd))
            {
                continue;
            }
            hjr1 = ((hkd)hjr1).a(charsequence);
            if (hjr1 != null)
            {
                return hjr1;
            }
        }

        return null;
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean b(hjr hjr1)
    {
        hjr1.g(D());
        return true;
    }

    public int c()
    {
        return a.size();
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

    public boolean c(hjr hjr1)
    {
        int j;
        if (a.contains(hjr1))
        {
            return true;
        }
        if (hjr1.n() == 0x7fffffff)
        {
            if (c)
            {
                int i = d;
                d = i + 1;
                hjr1.f(i);
            }
            if (hjr1 instanceof hkd)
            {
                ((hkd)hjr1).a(c);
            }
        }
        int k = Collections.binarySearch(a, hjr1);
        j = k;
        if (k < 0)
        {
            j = -k - 1;
        }
        if (!b(hjr1))
        {
            return false;
        }
        this;
        JVM INSTR monitorenter ;
        a.add(j, hjr1);
        this;
        JVM INSTR monitorexit ;
        hjr1.a(B());
        if (e)
        {
            hjr1.C();
        }
        A();
        return true;
        hjr1;
        this;
        JVM INSTR monitorexit ;
        throw hjr1;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        List list;
        int i;
        list = a;
        i = list.size() - 1;
_L2:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        e((hjr)list.get(0));
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

    public boolean d(hjr hjr1)
    {
        boolean flag = e(hjr1);
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
        Collections.sort(a);
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
