// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

final class ilt extends PhantomReference
    implements Runnable
{

    private static final Set a = Collections.synchronizedSet(new HashSet());
    private final jsr b;

    ilt(Object obj, ReferenceQueue referencequeue, jsr jsr)
    {
        super(obj, referencequeue);
        b = jsr;
        a.add(jsr);
    }

    static Set a()
    {
        return a;
    }

    static jsr a(ilt ilt1)
    {
        return ilt1.b;
    }

    public void run()
    {
        a.remove(b);
    }

}
