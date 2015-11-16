// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class eer
    implements lg
{

    List a;

    eer()
    {
        a = new ArrayList();
    }

    public void a(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((lg)iterator.next()).a(i)) { }
    }

    public void a(int i, float f, int j)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((lg)iterator.next()).a(i, f, j)) { }
    }

    public void b(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((lg)iterator.next()).b(i)) { }
    }
}
