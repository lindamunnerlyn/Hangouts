// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jpn extends jpm
{

    jpn(String s)
    {
        super(s, 0);
    }

    jpw a(jpj jpj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, Object obj, int i)
    {
        if (i == 1)
        {
            return new jpt(obj);
        } else
        {
            return new jqe(obj, i);
        }
    }
}
