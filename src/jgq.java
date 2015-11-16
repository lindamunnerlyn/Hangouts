// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jgq
{

    protected jgq()
    {
    }

    public final int a(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return b(obj);
        }
    }

    public final boolean a(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            return b(obj, obj1);
        }
    }

    protected abstract int b(Object obj);

    protected abstract boolean b(Object obj, Object obj1);
}
