// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class cno
    implements Iterable
{

    final CharSequence a;
    final cnl b;

    cno(cnl cnl1, CharSequence charsequence)
    {
        b = cnl1;
        a = charsequence;
        super();
    }

    public Iterator iterator()
    {
        return b.b.a(b, a);
    }
}
