// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class aiq
    implements Runnable
{

    final aip a;

    aiq(aip aip1)
    {
        a = aip1;
        super();
    }

    public void run()
    {
        for (Iterator iterator = aip.a(a).iterator(); iterator.hasNext(); ((air)iterator.next()).a()) { }
    }
}
