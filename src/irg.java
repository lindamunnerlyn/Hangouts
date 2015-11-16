// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class irg extends PhantomReference
    implements Runnable
{

    private static final Set a = Collections.synchronizedSet(new HashSet());
    private final kas b;

    irg(Object obj, ReferenceQueue referencequeue, kas kas)
    {
        super(obj, referencequeue);
        b = kas;
        a.add(kas);
    }

    static Set a()
    {
        return a;
    }

    static kas a(irg irg1)
    {
        return irg1.b;
    }

    public void run()
    {
        a.remove(b);
    }

}
