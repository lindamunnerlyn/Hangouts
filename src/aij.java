// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class aij
    implements Runnable
{

    final aii a;

    aij(aii aii1)
    {
        a = aii1;
        super();
    }

    public void run()
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((aik)iterator.next()).a()) { }
    }
}
