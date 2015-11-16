// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Looper;
import java.util.concurrent.Executors;

final class fuq extends emu
{

    fuq()
    {
    }

    public emw a(Context context, Looper looper, epo epo, Object obj, enb enb, end end)
    {
        obj = ftv.a;
        return new fuj(context, looper, false, epo, enb, end, Executors.newSingleThreadExecutor());
    }
}
