// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jis extends jiq
{

    jis(String s)
    {
        super(s, 1);
    }

    jja a(jin jin1, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, Object obj, int i)
    {
        if (i == 1)
        {
            return new jip(jin1.i, obj, referenceentry);
        } else
        {
            return new jjh(jin1.i, obj, referenceentry, i);
        }
    }
}
