// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class bnp
    implements bnh
{

    final bnk a;

    bnp(bnk bnk1)
    {
        a = bnk1;
        super();
    }

    public void a(bnf bnf)
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).a(bnf)) { }
    }
}
