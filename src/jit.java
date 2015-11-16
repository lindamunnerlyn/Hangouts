// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jit extends jiq
{

    jit(String s)
    {
        super(s, 2);
    }

    jja a(jin jin1, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, Object obj, int i)
    {
        if (i == 1)
        {
            return new jjf(jin1.i, obj, referenceentry);
        } else
        {
            return new jjj(jin1.i, obj, referenceentry, i);
        }
    }
}
