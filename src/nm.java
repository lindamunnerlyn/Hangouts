// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class nm
{

    private static final np a;
    private final Object b;

    public nm(Object obj)
    {
        b = obj;
    }

    public static nm a()
    {
        return new nm(a.a());
    }

    public void a(int i)
    {
        a.b(b, i);
    }

    public void a(View view)
    {
        a.a(b, view);
    }

    public void a(boolean flag)
    {
        a.a(b, flag);
    }

    public void b(int i)
    {
        a.a(b, i);
    }

    public void c(int i)
    {
        a.c(b, i);
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (nm)obj;
        if (b != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((nm) (obj)).b == null) goto _L1; else goto _L3
_L3:
        return false;
        if (b.equals(((nm) (obj)).b)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.hashCode();
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            a = new nq();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 15)
        {
            a = new no();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            a = new nn();
        } else
        {
            a = new np();
        }
    }
}
