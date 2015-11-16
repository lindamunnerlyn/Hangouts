// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class bnh
    implements gja
{

    final bnd a;

    bnh(bnd bnd1)
    {
        a = bnd1;
        super();
    }

    public void a(giw giw, Set set)
    {
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bnk)iterator.next()).a(giw, set)) { }
    }
}
