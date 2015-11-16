// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class bno
    implements gmc
{

    final bnk a;

    bno(bnk bnk1)
    {
        a = bnk1;
        super();
    }

    public void a(gly gly, Set set)
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).a(gly, set)) { }
    }
}
