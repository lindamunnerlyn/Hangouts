// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jir extends jiq
{

    jir(String s)
    {
        super(s, 0);
    }

    jja a(jin jin, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, Object obj, int i)
    {
        if (i == 1)
        {
            return new jix(obj);
        } else
        {
            return new jji(obj, i);
        }
    }
}
