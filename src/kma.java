// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.List;

public abstract class kma extends kli
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public knr b;
    public int c;

    public kma()
    {
        b = knr.a();
        c = -1;
    }

    static kma a(kma kma1, klr klr, klv klv)
    {
        try
        {
            kma1 = (kma)kma1.a(kmj.b, klr, klv);
        }
        // Misplaced declaration of an exception variable
        catch (kma kma1)
        {
            if (kma1.getCause() instanceof kmr)
            {
                throw (kmr)kma1.getCause();
            } else
            {
                throw kma1;
            }
        }
        return kma1;
    }

    public static kmq a(List list)
    {
        return new knd(list);
    }

    protected static final boolean a(kma kma1)
    {
        boolean flag = false;
        if (kma1.a(kmj.a, Boolean.valueOf(false)) != null)
        {
            flag = true;
        }
        return flag;
    }

    public final boolean C_()
    {
        return a(kmj.a, Boolean.TRUE) != null;
    }

    protected Object a(int j)
    {
        return a(j, null, null);
    }

    protected Object a(int j, Object obj)
    {
        return a(j, obj, null);
    }

    public abstract Object a(int j, Object obj, Object obj1);

    public final void a(knr knr1)
    {
        b = knr.a(b, knr1);
    }

    public final knc c()
    {
        return (knc)a(kmj.h);
    }

    public final kma d()
    {
        return (kma)a(kmj.g);
    }

    public final kmc e()
    {
        return (kmc)a(kmj.f);
    }

    public final kmc g()
    {
        kmc kmc1 = (kmc)a(kmj.f);
        kmc1.a(this);
        return kmc1;
    }

    public kmz h()
    {
        return g();
    }

    public kmz i()
    {
        return e();
    }

    protected Object writeReplace()
    {
        return new kmk(this);
    }
}
