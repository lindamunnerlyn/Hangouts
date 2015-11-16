// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

final class chg extends ResultReceiver
{

    final amf a;
    final chf b;

    chg(chf chf1, Handler handler, amf amf)
    {
        b = chf1;
        a = amf;
        super(handler);
    }

    protected void onReceiveResult(int i, Bundle bundle)
    {
        super.onReceiveResult(i, bundle);
        cgw.a(b.a, a);
    }
}
