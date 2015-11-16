// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jpo extends jpm
{

    jpo(String s)
    {
        super(s, 1);
    }

    jpw a(jpj jpj1, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, Object obj, int i)
    {
        if (i == 1)
        {
            return new jpl(jpj1.i, obj, referenceentry);
        } else
        {
            return new jqd(jpj1.i, obj, referenceentry, i);
        }
    }
}
