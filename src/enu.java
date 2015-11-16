// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.lang.ref.WeakReference;

final class enu extends erc
{

    private final WeakReference a;

    enu(enq enq1)
    {
        a = new WeakReference(enq1);
    }

    public void a(ResolveAccountResponse resolveaccountresponse)
    {
        enq enq1 = (enq)a.get();
        if (enq1 == null)
        {
            return;
        } else
        {
            enq1.a.a(new env(this, enq1, enq1, resolveaccountresponse));
            return;
        }
    }
}
