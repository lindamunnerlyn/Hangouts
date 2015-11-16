// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.LinkedHashMap;

final class glu extends LinkedHashMap
{

    final glt a;

    glu(glt glt1, int i)
    {
        a = glt1;
        super(i, 0.75F, true);
    }

    protected boolean removeEldestEntry(java.util.Map.Entry entry)
    {
        return size() > a.a;
    }
}
