// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.wearable.internal.PutDataResponse;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

final class fvz extends fvv
{

    private final List a;

    fvz(ekm ekm, List list)
    {
        super(ekm);
        a = list;
    }

    public void a(PutDataResponse putdataresponse)
    {
        a(new fsu(g.n(putdataresponse.b), putdataresponse.c));
        if (putdataresponse.b != 0)
        {
            for (putdataresponse = a.iterator(); putdataresponse.hasNext(); ((FutureTask)putdataresponse.next()).cancel(true)) { }
        }
    }
}
