// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jpp extends jpm
{

    jpp(String s)
    {
        super(s, 2);
    }

    jpw a(jpj jpj1, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, Object obj, int i)
    {
        if (i == 1)
        {
            return new jqb(jpj1.i, obj, referenceentry);
        } else
        {
            return new jqf(jpj1.i, obj, referenceentry, i);
        }
    }
}
