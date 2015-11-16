// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class cpg
    implements Iterable
{

    final CharSequence a;
    final cpd b;

    cpg(cpd cpd1, CharSequence charsequence)
    {
        b = cpd1;
        a = charsequence;
        super();
    }

    public Iterator iterator()
    {
        return b.b.a(b, a);
    }
}
