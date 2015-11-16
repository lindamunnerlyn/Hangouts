// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.internal.ResolveAccountResponse;
import java.lang.ref.WeakReference;

final class ekt extends eoc
{

    private final WeakReference a;

    ekt(ekp ekp1)
    {
        a = new WeakReference(ekp1);
    }

    public void a(ResolveAccountResponse resolveaccountresponse)
    {
        ekp ekp1 = (ekp)a.get();
        if (ekp1 == null)
        {
            return;
        } else
        {
            ekp1.a.a(new eku(this, ekp1, ekp1, resolveaccountresponse));
            return;
        }
    }
}
